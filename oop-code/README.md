# oop-code Java面向对象进阶学习笔记

## 目录
- [1. test1/Phone - 手机类（基础版）](#1-test1phone---手机类基础版)
- [2. test1/PhoneTest - 手机对象使用](#2-test1phonetest---手机对象使用)
- [3. test2/GirlFriend - 女朋友类（基础版）](#3-test2girlfriend---女朋友类基础版)
- [4. test2/GirlFriendTest - 女朋友对象使用](#4-test2girlfriendtest---女朋友对象使用)
- [5. test2/StringTest - String类方法练习](#5-test2stringtest---string类方法练习)
- [6. test3/GirlFriend - 女朋友类（封装版）](#6-test3girlfriend---女朋友类封装版)
- [7. test3/GirlFriendTest - 封装后使用](#7-test3girlfriendtest---封装后使用)
- [8. test3/StringTest - String类方法练习（重复）](#8-test3stringtest---string类方法练习重复)
- [9. test4/GirlFriend - this关键字演示](#9-test4girlfriend---this关键字演示)
- [10. test4/GirlFriendTest - 就近原则测试](#10-test4girlfriendtest---就近原则测试)
- [11. test4/StringTest - String类方法练习（重复）](#11-test4stringtest---string类方法练习重复)
- [12. test5/Student - 学生类（构造方法）](#12-test5student---学生类构造方法)
- [13. test5/StudentTest - 构造方法调用](#13-test5studenttest---构造方法调用)
- [14. test6/User - 完整JavaBean示例](#14-test6user---完整javabean示例)

---

## 1. test1/Phone - 手机类（基础版）

### 代码位置
[Phone.java](file:///d:/javalearn/oop-code/src/kru/test1/Phone.java)

### 代码内容
```java
package kru.test1;

public class Phone {
    // 属性
    String brand;
    double price;

    // 行为
    public void call() {
        System.out.println("手机在打电话");
    }
    public void playGame() {
        System.out.println("手机在玩游戏");
    }
}
```

### 知识点解析

#### 1.1 类的组成
- **属性（成员变量）**：描述事物的特征
  - `brand`：品牌
  - `price`：价格
- **行为（成员方法）**：描述事物的功能
  - `call()`：打电话
  - `playGame()`：玩游戏

#### 1.2 成员变量默认值

| 类型 | 默认值 |
|------|--------|
| String | null |
| double | 0.0 |
| int | 0 |
| boolean | false |

---

## 2. test1/PhoneTest - 手机对象使用

### 代码位置
[PhoneTest.java](file:///d:/javalearn/oop-code/src/kru/test1/PhoneTest.java)

### 代码内容
```java
package kru.test1;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone p = new Phone();

        // 给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        // 获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用手机中的方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.playGame();
    }
}
```

### 知识点解析

#### 2.1 创建对象
```java
Phone p = new Phone();
```
- `new`关键字创建对象
- 调用无参构造方法

#### 2.2 访问属性
```java
p.brand = "小米";  // 赋值
System.out.println(p.brand);  // 取值
```

#### 2.3 调用方法
```java
p.call();
p.playGame();
```

#### 2.4 多个对象
- 每个对象有独立的内存空间
- 修改一个对象的属性不影响另一个

### 运行结果
```
小米
1999.98
手机在打电话
手机在玩游戏
苹果
8999
手机在打电话
手机在玩游戏
```

---

## 3. test2/GirlFriend - 女朋友类（基础版）

### 代码位置
[GirlFriend.java](file:///d:/javalearn/oop-code/src/kru/test2/GirlFriend.java)

### 代码内容
```java
package kru.test2;

public class GirlFriend {
    // 属性
    String name;
    int age;
    String gender;

    // 行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
```

### 知识点解析

#### 3.1 成员变量
- `name`：姓名
- `age`：年龄
- `gender`：性别

---

## 4. test2/GirlFriendTest - 女朋友对象使用

### 代码位置
[GirlFriendTest.java](file:///d:/javalearn/oop-code/src/kru/test2/GirlFriendTest.java)

### 代码内容
```java
package kru.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "小诗诗";
        gf1.age = 18;
        gf1.gender = "萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.println("========================");

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "小丹丹";
        gf2.age = 19;
        gf2.gender = "萌妹子";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();
    }
}
```

### 知识点解析

#### 4.1 直接访问属性
- 此版本未封装，属性可直接访问
- 不符合面向对象封装原则

---

## 5. test2/StringTest - String类方法练习

### 代码位置
[StringTest.java](file:///d:/javalearn/oop-code/src/kru/test2/StringTest.java)

### 代码内容
```java
package kru.test2;

public class StringTest {
    public static void main(String[] args) {
        String s = "wefidfjqiowdjiowjdoi";

        int len = s.length();
        System.out.println(len);

        String ss = s.toUpperCase();
        System.out.println(ss);
    }
}
```

### 知识点解析

#### 5.1 String常用方法

| 方法 | 说明 | 示例 |
|------|------|------|
| `length()` | 获取字符串长度 | `"abc".length()` → 3 |
| `toUpperCase()` | 转换为大写 | `"abc".toUpperCase()` → "ABC" |
| `toLowerCase()` | 转换为小写 | `"ABC".toLowerCase()` → "abc" |

---

## 6. test3/GirlFriend - 女朋友类（封装版）

### 代码位置
[GirlFriend.java](file:///d:/javalearn/oop-code/src/kru/test3/GirlFriend.java)

### 代码内容
```java
package kru.test3;

public class GirlFriend {
    // 属性
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 10 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
```

### 知识点解析

#### 6.1 封装
- 使用`private`修饰成员变量
- 提供`getter/setter`方法访问

#### 6.2 数据校验
```java
public void setAge(int age) {
    if (age >= 10 && age <= 50) {
        this.age = age;
    } else {
        System.out.println("非法参数");
    }
}
```
- 在setter中添加逻辑判断
- 防止非法数据

#### 6.3 封装的好处
1. 隐藏实现细节
2. 提高代码安全性
3. 便于修改和维护

---

## 7. test3/GirlFriendTest - 封装后使用

### 代码位置
[GirlFriendTest.java](file:///d:/javalearn/oop-code/src/kru/test3/GirlFriendTest.java)

### 代码内容
```java
package kru.test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
```

### 知识点解析

#### 7.1 使用封装后的类
- 通过setter设置属性
- 通过getter获取属性
- 不能直接访问私有成员

---

## 9. test4/GirlFriend - this关键字演示

### 代码位置
[GirlFriend.java](file:///d:/javalearn/oop-code/src/kru/test4/GirlFriend.java)

### 代码内容
```java
package kru.test4;

public class GirlFriend {
    // 属性
    private int age;

    // 就近原则
    public void method() {
        // int age = 10;
        // 谁离我近，我就用谁
        System.out.println(age);
        System.out.println(this.age);
    }
}
```

### 知识点解析

#### 9.1 this关键字
- `this`代表当前对象
- `this.age`：明确指代成员变量

#### 9.2 就近原则
- 当局部变量和成员变量同名时
- 直接写变量名使用的是局部变量
- 使用`this.变量名`访问成员变量

---

## 10. test4/GirlFriendTest - 就近原则测试

### 代码位置
[GirlFriendTest.java](file:///d:/javalearn/oop-code/src/kru/test4/GirlFriendTest.java)

### 代码内容
```java
package kru.test4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.method();
    }
}
```

---

## 12. test5/Student - 学生类（构造方法）

### 代码位置
[Student.java](file:///d:/javalearn/oop-code/src/kru/test5/Student.java)

### 代码内容
```java
package kru.test5;

public class Student {
    private String name;
    private int age;

    // 如果我们自己没有写任何的构造方法
    // 那么虚拟机会给我们加一个空参构造的方法
    public Student() {
        System.out.println("看看我执行了吗？");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### 知识点解析

#### 12.1 构造方法
- 方法名与类名相同
- 没有返回值类型
- 用于创建对象时初始化

#### 12.2 两种构造方法

| 构造方法 | 说明 |
|---------|------|
| `Student()` | 无参构造 |
| `Student(String name, int age)` | 有参构造 |

#### 12.3 默认构造方法
- 如果不写任何构造方法，JVM会自动添加无参构造
- 如果写了有参构造，JVM不再自动添加无参构造
- **建议**：永远手动写无参构造

---

## 13. test5/StudentTest - 构造方法调用

### 代码位置
[StudentTest.java](file:///d:/javalearn/oop-code/src/kru/test5/StudentTest.java)

### 代码内容
```java
package kru.test5;

public class StudentTest {
    public static void main(String[] args) {
        // 调用的空参构造
        Student s = new Student();

        // 有参构造
        Student ss = new Student("张三", 19);

        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
```

### 知识点解析

#### 13.1 调用构造方法
```java
new Student();           // 调用无参构造
new Student("张三", 19); // 调用有参构造
```

#### 13.2 根据参数匹配
- JVM根据传入的参数类型和个数匹配构造方法

### 运行结果
```
看看我执行了吗？
张三
19
```

---

## 14. test6/User - 完整JavaBean示例

### 代码位置
[User.java](file:///d:/javalearn/oop-code/src/kru/test6/User.java)

### 代码内容
```java
package kru.test6;

public class User {
    // 属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User() {}

    //带全部参数的构造
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    // ... 其他getter/setter
}
```

### 知识点解析

#### 14.1 标准JavaBean规范
1. 类必须使用`public`修饰
2. 成员变量使用`private`修饰
3. 提供空参构造方法
4. 提供全参构造方法
5. 提供getter/setter方法

#### 14.2 JavaDoc注释
```java
/**
 * 获取
 * @return username
 */
```
- 使用`/** */`格式
- `@return`说明返回值
- `@param`说明参数

#### 14.3 快捷键
- `Alt + Insert`：生成getter/setter/构造方法
- 插件PTG：快速生成标准JavaBean

---

## oop-code 总结

### 核心知识点

1. **类和对象**
   - 类是模板，对象是实例
   - 使用`new`关键字创建对象

2. **成员变量和成员方法**
   - 属性描述特征
   - 方法描述行为

3. **封装**
   - `private`隐藏成员变量
   - `getter/setter`提供访问

4. **this关键字**
   - 代表当前对象
   - 区分成员变量和局部变量

5. **构造方法**
   - 无参构造和有参构造
   - 用于初始化对象
   - 建议永远手动写无参构造

6. **JavaBean规范**
   - 公共类
   - 私有属性
   - 空参构造
   - 全参构造
   - getter/setter
