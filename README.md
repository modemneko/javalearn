# Java基础学习笔记汇总

本仓库包含了从Java基础到面向对象编程的完整学习笔记，涵盖所有day模块的Java代码。

---

## 目录导航

| 模块 | 内容 | 笔记链接 |
|------|------|---------|
| day01 | Java基础：HelloWorld、Scanner、变量、数据类型 | [README](day01/README.md) |
| day03 | Java运算符：算术、赋值、比较、逻辑、三元运算符 | [README](day03/README.md) |
| day04 | 流程控制：if语句、switch语句、for循环、while循环 | [README](day04/README.md) |
| day05 | 数组与循环进阶：数组、continue/break、Random | [README](day05/README.md) |
| day06 | 方法：方法定义、参数、返回值、方法重载 | [README](day06/README.md) |
| day07 | 综合练习：机票、验证码、评委打分、数字加密、双色球 | [README](day07/README.md) |
| day09 | 面向对象：类与对象、封装、对象数组 | [README](day09/README.md) |
| day10 | 常用API：String、StringBuilder、StringJoiner | [README](day10/README.md) |
| day11 | 集合：ArrayList、泛型、包装类 | [README](day11/README.md) |
| day12 | 综合案例：学生管理系统（登录、注册、忘记密码） | [README](day12/README.md) |
| day13 | static静态：静态变量、静态方法、工具类设计 | [README](day13/README.md) |
| twodimensionarr | 二维数组：静态/动态初始化、遍历 | [README](twodimensionarr/README.md) |
| oop-code | 面向对象基础：封装、this、构造方法、JavaBean | [README](oop-code/README.md) |
| oop-codeblock | 代码块：构造代码块、静态代码块 | [README](oop-codeblock/README.md) |
| oop-extends | 继承：继承体系、super/this、方法重写 | [README](oop-extends/README.md) |
| oop-final | final关键字：常量、最终方法、最终类 | [README](oop-final/README.md) |
| oop-jurisdiction | 权限修饰符：public、protected、默认、private | [README](oop-jurisdiction/README.md) |
| oop-package | 包：package、import、全限定名 | [README](oop-package/README.md) |
| oop-polymophism | 多态：多态概念、成员访问特点、多态参数 | [README](oop-polymophism/README.md) |

---

## 知识点概览

### 1. Java基础 (day01)

- **HelloWorld**：第一个Java程序
- **Scanner键盘录入**：`import java.util.Scanner;`
- **8种基本数据类型**：byte、short、int、long、float、double、char、boolean
- **变量定义**：`数据类型 变量名 = 数据值;`
- **字符串**：String类型

### 2. 运算符 (day03)

- **算术运算符**：+、-、*、/、%、++、--
- **赋值运算符**：=、+=、-=、*=、/=、%=
- **比较运算符**：==、!=、>、<、>=、<=
- **逻辑运算符**：&、|、^、!、&&、||
- **三元运算符**：`条件 ? 值1 : 值2`

### 3. 流程控制 (day04)

- **if语句**：单分支、双分支、多分支、嵌套
- **switch语句**：case匹配、break、default
- **for循环**：已知循环次数
- **while循环**：未知循环次数

### 4. 数组 (day05)

- **数组定义**：静态初始化、动态初始化
- **数组访问**：`arr[索引]`
- **数组遍历**：for循环、增强for循环
- **常见算法**：求和、求最值、统计、反转、打乱

### 5. 方法 (day06)

- **方法定义**：`public static 返回值类型 方法名(参数列表) {}`
- **方法调用**：直接调用、赋值调用、输出调用
- **方法重载**：方法名相同，参数列表不同
- **参数传递**：基本类型传值，引用类型传地址

### 6. 面向对象基础 (day09, oop-code)

- **类和对象**：类是模板，对象是实例
- **封装**：private + getter/setter
- **构造方法**：无参构造、有参构造
- **this关键字**：代表当前对象
- **JavaBean规范**：公共类、私有属性、构造方法、getter/setter

### 7. 代码块 (oop-codeblock)

- **构造代码块**：写在成员位置，每次创建对象时执行
- **静态代码块**：static {} 定义，类加载时执行，只执行一次
- **执行顺序**：静态代码块 → 构造代码块 → 构造方法

### 8. 继承 (oop-extends)

- **继承概念**：子类继承父类的非私有成员
- **super关键字**：访问父类成员
- **this关键字**：访问本类成员
- **方法重写**：@Override注解，子类重写父类方法
- **构造方法调用**：子类构造默认调用super()
- **继承体系设计**：合理的继承层次结构

### 9. final关键字 (oop-final)

- **修饰变量**：常量，只能赋值一次
- **修饰方法**：最终方法，不能被重写
- **修饰类**：最终类，不能被继承
- **引用数据类型**：地址值不能改变，但内部属性可修改

### 10. 权限修饰符 (oop-jurisdiction)

- **public**：所有位置可访问
- **protected**：同包或子类可访问
- **默认（包私有）**：同包可访问
- **private**：本类可访问

### 11. 包 (oop-package)

- **package**：定义包，对应目录结构
- **import**：导入其他包的类
- **全限定名**：区分同名类

### 12. 多态 (oop-polymophism)

- **前提条件**：继承/实现、方法重写、父类引用指向子类对象
- **成员访问**：编译看左边，运行看右边（方法）；编译运行都看左边（变量）
- **多态参数**：提高代码扩展性
- **多态好处**：提高复用性和可维护性

### 13. 常用API (day10)

- **String**：不可变字符串，equals比较内容
- **StringBuilder**：可变字符串，append、reverse
- **StringJoiner**：自动添加分隔符

### 14. 集合 (day11)

- **ArrayList**：可变长度数组集合
- **泛型**：`<类型>`限定存储类型
- **包装类**：int→Integer, char→Character

### 15. static静态 (day13)

- **静态变量**：属于类，所有对象共享
- **静态方法**：通过类名调用，不能访问非静态成员
- **工具类设计**：构造私有，方法全静态

### 16. 综合案例 (day12)

- **学生管理系统**：登录、注册、忘记密码
- **验证码生成**：随机字符+数字组合
- **信息验证**：用户名、密码、身份证、手机号

### 17. 二维数组 (twodimensionarr)

- **静态初始化**：已知具体值
- **动态初始化**：已知行列数
- **遍历**：双重for循环

---

## 学习路线

```
Java基础 → 运算符 → 流程控制 → 数组 → 方法 → 面向对象 → API → 集合 → 综合案例
         ↓
     面向对象进阶：代码块 → 继承 → final → 权限 → 包 → 多态 → static
```

1. **第一阶段**：day01、day03 - 掌握基础语法和运算符
2. **第二阶段**：day04、day05 - 掌握流程控制和数组
3. **第三阶段**：day06、day07 - 掌握方法和综合练习
4. **第四阶段**：day09、oop-code - 掌握面向对象编程基础
5. **第五阶段**：day10、day11 - 掌握常用API和集合
6. **第六阶段**：day12 - 综合案例实战
7. **第七阶段**：day13、oop-codeblock、oop-extends、oop-final - 面向对象进阶
8. **第八阶段**：oop-jurisdiction、oop-package、oop-polymophism - 面向对象高级特性

---

## 代码规范

### 命名规范
- **类名**：大驼峰，如 `Student`、`HelloWorld`
- **方法名**：小驼峰，如 `getName`、`printInfo`
- **变量名**：小驼峰，如 `studentName`、`age`
- **常量名**：全大写，如 `MAX_VALUE`
- **包名**：全小写，反向域名，如 `com.example.demo`

### 编码规范
- 每条语句以分号结尾
- 使用大括号包围代码块
- 缩进使用4个空格
- 方法之间空一行

---

## 常见问题

1. **String比较**：必须使用`equals()`，不能用`==`
2. **数组索引**：从0开始，最大索引为`length-1`
3. **nextInt范围**：`nextInt(1, 10)`生成1-9，不包含10
4. **构造方法**：写了有参构造后，必须手动写无参构造
5. **封装**：成员变量用private，提供getter/setter
6. **静态方法**：不能访问非静态成员，没有this关键字
7. **继承**：Java只支持单继承，不支持多继承
8. **方法重写**：方法签名必须一致（方法名、参数列表）
9. **多态**：父类引用不能直接调用子类特有方法
10. **final引用**：引用地址不变，但对象内部属性可修改

---

## 更新日志

- 2026-05-10：完成基础模块学习笔记（day01-day11、twodimensionarr、oop-code）
- 2026-06-13：新增day12、day13、oop-codeblock、oop-extends、oop-final、oop-jurisdiction、oop-package、oop-polymophism学习笔记
