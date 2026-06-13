# Day12 - 学生管理系统综合案例

## 模块概述
本模块通过一个完整的学生管理系统案例，综合运用了Java面向对象编程的核心知识。系统包含用户注册、登录、验证码校验、忘记密码等功能，采用 `ArrayList<User>` 作为内存数据存储，不涉及数据库。通过本模块可以学习到实体类的设计规范、输入验证逻辑、循环与分支结构的综合应用等。

---

## 代码学习

### 1. User.java - 用户实体类
**代码路径**: `src/kru/studentsystem/User.java`

#### 代码内容
```java
package kru.studentsystem;

public class User {
    private String username;
    private String password;
    private String identify;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String identify, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.identify = identify;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
```

#### 知识点解析

1. **封装（Encapsulation）**
   - 所有属性均使用 `private` 修饰，外部无法直接访问，必须通过 getter/setter 方法操作
   - 这是Java面向对象三大特性之一，核心目的是保护数据安全性

2. **无参构造方法**
   - `public User() {}` 是一个空的无参构造
   - 当手动定义了有参构造后，Java **不会自动提供**无参构造，需要显式写出
   - 某些框架（如JSON序列化）依赖无参构造来创建对象

3. **全参构造方法**
   - 接收全部四个属性值，一次性完成对象初始化
   - `this.username = username` 中 `this` 关键字用于区分成员变量和局部变量（参数名与成员变量同名时）

4. **Getter / Setter 方法**
   - 命名规范：`getXxx()` 用于获取，`setXxx()` 用于设置
   - 对于 `boolean` 类型的属性，getter 通常命名为 `isXxx()`

5. **属性设计**
   - `username`：用户名
   - `password`：密码
   - `identify`：身份证号（字符串类型，因为可能包含 'x'/'X'）
   - `phoneNumber`：手机号（字符串类型，因为不需要做数值计算）

---

### 2. Student.java - 学生实体类
**代码路径**: `src/kru/studentsystem/Student.java`

#### 代码内容
```java
package kru.studentsystem;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;


}
```

#### 知识点解析

1. **类的骨架定义**
   - 这是一个学生实体类的初始框架，目前只定义了私有属性，尚未添加构造方法和 getter/setter
   - 后续需要补充完整的封装结构（参考 User.java 的模式）

2. **属性说明**
   - `id`（String）：学号，使用字符串而非数字，因为学号可能有前导零或字母
   - `name`（String）：学生姓名
   - `age`（int）：年龄，使用基本数据类型 `int`，因为年龄一定是数值且需要计算
   - `address`（String）：家庭地址

3. **为什么 age 用 int 而不用 String？**
   - 年龄涉及数值比较（如筛选18岁以上学生），使用 `int` 可以直接运算
   - 而学号、手机号、身份证号虽然由数字组成，但不参与数学运算，所以用 `String`

4. **后续需要补充的内容**
   - 无参构造方法
   - 全参构造方法
   - 每个属性的 getter 和 setter 方法

---

### 3. StudentSystem.java - 学生管理系统类
**代码路径**: `src/kru/studentsystem/StudentSystem.java`

#### 代码内容
```java
package kru.studentsystem;

public class StudentSystem {
}
```

#### 知识点解析

1. **空类的意义**
   - 当前仅定义了类的骨架，预留了后续实现学生管理系统核心逻辑的空间
   - 预期功能：增删改查学生信息、展示学生列表等

2. **与 App.java 的职责划分**
   - `App.java`：负责用户认证（登录、注册、忘记密码）等入口功能
   - `StudentSystem.java`：预计负责学生数据的 CRUD 操作，是系统的核心业务类

3. **后续开发建议**
   - 使用 `ArrayList<Student>` 存储学生数据
   - 实现添加学生、删除学生、修改学生、查询学生等方法
   - 每个方法应包含输入验证逻辑
   - 可以仿照 `register()` 方法的验证思路来处理学生信息的校验

---

### 4. App.java - 主程序
**代码路径**: `src/kru/studentsystem/App.java`

#### 代码内容
```java
package kru.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作\n1、登陆 2、注册 3、忘记密码 4、退出");

            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgotPassword(list);
                case "4" -> {
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        // 1. 用户名
        System.out.print("请输入用户名：");
        String username = sc.next();
        // 检查存在性
        for (User u : list) {
            if (u.getUsername().equals(username)) {
                System.out.println("该用户已经存在！");
                return;
            }
        }
        // 长度
        if (username.length() < 3) {
            System.out.println("用户名长度不能低于3");
            return;
        }
        if (username.length() > 15) {
            System.out.println("用户名长度不能超过15");
            return;
        }
        // 字母+数字组合，不能纯数字
        int digitCount = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("用户名只能包含字母和数字");
                return;
            }
            if (Character.isDigit(c)) digitCount++;
        }
        if (digitCount == username.length()) {
            System.out.println("用户名不能是纯数字！");
            return;
        }

        // 2. 密码
        System.out.print("请输入密码：");
        String password = sc.next();
        System.out.print("再次输入密码：");
        String twicePwd = sc.next();
        if (!password.equals(twicePwd)) {
            System.out.println("两次输入的密码不一致");
            return;
        }

        // 3. 身份证
        System.out.print("请输入身份证号码：");
        String id = sc.next();
        if (id.length() != 18) {
            System.out.println("身份证必须为18位");
            return;
        }
        if (id.charAt(0) == '0') {
            System.out.println("身份证不能以0开头");
            return;
        }
        // 前17位必须为数字
        for (int i = 0; i < 17; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                System.out.println("身份证前17位必须为数字");
                return;
            }
        }
        // 最后一位可为数字或x/X
        char last = id.charAt(17);
        if (!(Character.isDigit(last) || last == 'x' || last == 'X')) {
            System.out.println("身份证最后一位只能是数字或x/X");
            return;
        }

        // 4. 手机号
        System.out.print("请输入手机号码：");
        String phone = sc.next();
        if (phone.length() != 11) {
            System.out.println("手机号必须为11位");
        }
        if (phone.charAt(0) == '0') {
            System.out.println("手机号第一位不能为0");
            return;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("手机号只能包含数字");
                return;
            }
        }

        // 所有验证通过，添加用户
        list.add(new User(username, password, id, phone));
        System.out.println("注册成功！");
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        // 验证码（允许3次机会，正确则跳出）
        int codeTry = 0;
        boolean codeOk = false;
        while (codeTry < 3) {
            String temp = checkCode();
            System.out.print("请输入验证码(" + temp + ")：");
            String code = sc.next();
            if (code.equals(temp)) {
                codeOk = true;
                break;
            } else {
                codeTry++;
                System.out.println("验证码错误，剩余尝试次数：" + (3 - codeTry));
            }
        }
        if (!codeOk) {
            System.out.println("验证码错误次数过多，请稍后重试");
            return;
        }

        // 登录（最多3次机会）
        int loginTry = 0;
        while (loginTry < 3) {
            System.out.print("请输入用户名：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();

            // 查找用户
            User found = null;
            for (User u : list) {
                if (u.getUsername().equals(username)) {
                    found = u;
                    break;
                }
            }
            if (found == null) {
                System.out.println("用户名未注册");
                loginTry++;
                continue;
            }
            if (found.getPassword().equals(password)) {
                System.out.println("登录成功！");
                return;
            } else {
                System.out.println("密码错误");
                loginTry++;
            }
        }
        System.out.println("登录失败次数过多，请稍后再试");
    }

    public static String checkCode() {
        char[] arr = new char[52];
        char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
        char[] code = new char[5];

        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('A' + i);
            arr[26 + i] = (char)('a' + i);
        }

        Random sc = new Random();

        // 生成5位随机数，存储到code中
        for (int i = 0; i < 5; i++) {
            code[i] = arr[sc.nextInt(0,arr.length)];
        }

        // 用1位随机数字替换code中的其中1位（随机位置）
        code[sc.nextInt(0, code.length)] = numArr[sc.nextInt(0, numArr.length)];

        String result = "";
        for (int i = 0; i < code.length; i++) {
            result += code[i];
        }
        return result;
    }

    public static void forgotPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = sc.next();

        // 查找用户
        User target = null;
        for (User u : list) {
            if (u.getUsername().equals(name)) {
                target = u;
                break;
            }
        }
        if (target == null) {
            System.out.println("用户名未注册");
            return;
        }

        System.out.print("请输入身份证号码：");
        String id = sc.next();
        System.out.print("请输入手机号码：");
        String phone = sc.next();

        if (target.getIdentify().equals(id) && target.getPhoneNumber().equals(phone)) {
            System.out.print("请输入新的密码：");
            String newPwd = sc.next();
            // 修改密码
            target.setPassword(newPwd);
            System.out.println("修改成功！");
        } else {
            System.out.println("账号信息不匹配，修改失败");
        }
    }
}
```

#### 知识点解析

##### 4.1 main 方法 - 程序入口与菜单系统

```java
ArrayList<User> list = new ArrayList<>();
```
- 使用 `ArrayList<User>` 作为用户数据的内存存储容器
- `ArrayList` 是 Java 集合框架中最常用的动态数组，大小可变
- `<>` 是 JDK7+ 的钻石操作符，编译器自动推断泛型类型

```java
while (true) { ... }
```
- 无限循环实现主菜单的持续显示，直到用户选择退出
- `case "4" -> { return; }` 通过 `return` 跳出 main 方法，结束程序

```java
switch (sc.next()) { case "1" -> login(list); ... }
```
- 使用了 Java 14+ 的 **增强版 switch 表达式**（箭头语法）
- 相比传统 switch，不需要 `break`，不会出现 case 穿透问题
- `sc.next()` 读取用户输入的一个字符串（以空白符分隔）

##### 4.2 register 方法 - 用户注册

**注册流程**：输入用户名 → 输入密码 → 输入身份证 → 输入手机号 → 验证全部通过 → 创建 User 对象并添加到 list

**用户名验证**（多层校验）：
1. **唯一性检查**：遍历 list，用 `equals()` 比较用户名，已存在则拒绝注册
2. **长度限制**：3~15个字符
3. **字符合法性**：使用 `Character.isLetterOrDigit(c)` 检查每个字符是否仅包含字母和数字
4. **不能纯数字**：统计数字个数，若等于总长度则为纯数字

**密码验证**：
- 两次密码输入一致性校验：`password.equals(twicePwd)`

**身份证验证**：
1. **长度必须为18位**
2. **首位不能为0**
3. **前17位必须为数字**：逐字符检查 `Character.isDigit()`
4. **第18位可为数字或 x/X**：`Character.isDigit(last) || last == 'x' || last == 'X'`

**手机号验证**：
1. **长度必须为11位**
2. **首位不能为0**
3. **全部位必须为数字**

##### 4.3 login 方法 - 用户登录

**验证码环节**：
- 最多 3 次输入验证码的机会
- 每次调用 `checkCode()` 生成新的验证码
- 验证码不区分大小写？**注意**：当前代码使用 `equals()` 比较，是**区分大小写**的
- 3次错误后直接 return，阻止继续登录

**登录验证环节**：
- 最多 3 次登录尝试
- 先遍历查找用户是否存在（用户名匹配）
- 若用户存在，再验证密码是否匹配
- 用户名不存在和密码错误都会消耗一次尝试机会
- 密码匹配成功则直接 return 结束方法

##### 4.4 checkCode 方法 - 验证码生成

**生成逻辑**：
1. 创建包含 26个大写字母 + 26个小写字母 = 52个字符的字符数组
2. 先生成 5 位随机字母（从 52 个字母中随机选取）
3. 随机选择其中 1 位，用 0-9 的数字替换
4. 将字符数组拼接为字符串返回

**知识点**：
- `char` 类型可以参与算术运算：`(char)('A' + i)` 将字符的 ASCII 码加 i 后转回 char
- `Random.nextInt(bound)` 生成 `[0, bound)` 范围的随机整数
- `Random.nextInt(origin, bound)` 生成 `[origin, bound)` 范围的随机整数
- **字符串拼接性能问题**：使用 `+=` 在循环中拼接字符串会创建大量临时对象，生产环境应使用 `StringBuilder`

**验证码特点**：
- 长度为 5 位
- 至少包含 1 位数字（第 3 步强制替换）
- 其余位为大小写字母

##### 4.5 forgotPassword 方法 - 忘记密码

**流程**：
1. 输入用户名，查找对应 User 对象
2. 输入身份证号和手机号进行身份验证
3. 两者都匹配则允许设置新密码
4. 通过 setter 方法直接修改对象的 password 属性

**知识点**：
- **引用传递**：ArrayList 中存储的是对象引用，`target.setPassword()` 直接修改了原对象，无需重新添加到 list
- 注释中提到的替代方案 `list.set(list.indexOf(target), new User(...))` 也可以，但不如直接修改属性高效
- 身份验证同时校验身份证号和手机号，提高了安全性

---

## 知识点总结

| 知识点 | 说明 |
|--------|------|
| **封装** | private 属性 + 构造方法 + getter/setter |
| **ArrayList** | 动态数组集合，用于内存数据存储 |
| **字符串比较** | 必须使用 `.equals()`，不能用 `==` |
| **字符判断** | `Character.isDigit()`, `Character.isLetterOrDigit()` |
| **输入验证** | 多层校验：存在性 → 长度 → 格式 → 内容 |
| **循环控制** | `break` 跳出循环，`return` 结束方法，`continue` 跳过本次 |
| **增强 switch** | Java 14+ 的 `case X ->` 语法，无需 break |
| **Random** | `nextInt(origin, bound)` 生成指定范围的随机整数 |
| **对象引用** | ArrayList 存储对象引用，修改引用指向的对象属性会直接影响原数据 |
| **Scanner** | `next()` 读取以空白符分隔的字符串 |

---

## 常见问题

### 1. 字符串比较为什么不能用 `==`？
- `==` 比较的是两个字符串的**内存地址**是否相同
- `.equals()` 比较的是两个字符串的**内容**是否相同
- 对于用户输入和构造的字符串，必须使用 `.equals()`

### 2. 为什么每次循环内部都 `new Scanner(System.in)`？
- 代码中 `register()`、`login()`、`forgotPassword()` 各自创建了 Scanner
- **最佳实践**：Scanner 应该在 main 方法中创建一次，作为参数传递，避免资源浪费
- 虽然 `System.in` 不会被重复关闭导致问题，但这是不良习惯

### 3. 验证码是否区分大小写？
- 当前代码使用 `code.equals(temp)` 进行精确匹配，**区分大小写**
- 实际应用中验证码通常不区分大小写，可以改为 `code.equalsIgnoreCase(temp)`

### 4. 数据在程序重启后会丢失？
- 是的。`ArrayList<User>` 是内存存储，程序结束后数据消失
- 持久化方案：使用文件（IO流）、数据库（JDBC）、或序列化

### 5. 为什么身份证号和手机号用 String 而不是 long？
- 身份证号最后一位可能是 'x' 或 'X'，无法用数值类型存储
- 手机号虽然全是数字，但不需要数学运算，且可能涉及前导零
- 身份证号有 18 位，超出 `int` 范围，用 `long` 虽然可以但不合适

### 6. 注册时各验证条件的顺序可以调换吗？
- 建议顺序：**存在性检查 → 轻量级检查（长度） → 重量级检查（逐字符验证）**
- 将最可能失败的、计算成本最低的校验放在前面，提高用户体验

### 7. 如何防止空指针异常？
- `sc.next()` 如果用户直接回车会阻塞等待，不会返回 null
- 但 `u.getUsername().equals(username)` 中，如果用户名可能为 null，应改为 `username.equals(u.getUsername())` 或使用 `Objects.equals()`

### 8. Scanner 的 `next()` 和 `nextLine()` 有什么区别？
- `next()`：读取到空白符（空格、换行、制表符）为止
- `nextLine()`：读取到换行符为止，返回整行内容
- 本代码使用 `next()`，因此用户名/密码中不能包含空格
