# Java `final` 修饰符学习笔记

## 目录

1. [final 修饰变量（常量）](#1-final-修饰变量常量)
2. [final 修饰方法](#2-final-修饰方法)
3. [final 修饰类](#3-final-修饰类)
4. [final 修饰基本数据类型 vs 引用数据类型](#4-final-修饰基本数据类型-vs-引用数据类型)
5. [字符串的不可变性](#5-字符串的不可变性)

---

## 1. final 修饰变量（常量）

### 概念

被 `final` 修饰的变量称为**常量**，其核心特性是：**只能被赋值一次，赋值后不可改变**。

### 示例

```java
final int a = 10;
System.out.println(a); // 输出: 10
// a = 20;  // 编译错误！final 变量不能被重新赋值
```

### 注意事项

- `final` 变量必须在声明时赋值，或者在构造器/初始化块中赋值
- 常量名通常使用**大写字母 + 下划线**的命名规范（如 `PI`、`MAX_VALUE`）
- `final` 修饰的变量一旦被初始化，就不能再指向其他值或其他对象

---

## 2. final 修饰方法

### 概念

被 `final` 修饰的方法称为**最终方法**，其核心特性是：**不能被子类重写（Override）**。

### 示例

```java
class Fu {
    public final void show() {
        System.out.println("父类的show方法");
    }
}

// 子类无法重写 final 方法
class Zi extends Fu {
    // @Override
    // public void show() { }  // 编译错误！不能重写 final 方法
}
```

### 使用场景

- 当某个方法的实现逻辑已经确定，不希望子类修改其行为时使用
- 确保核心业务逻辑不被意外覆盖

---

## 3. final 修饰类

### 概念

被 `final` 修饰的类称为**最终类**，其核心特性是：**不能被继承**。

### 示例

```java
final class FinalClass {
    // 类的内容
}

// class SubClass extends FinalClass { }  // 编译错误！不能继承 final 类
```

### 常见例子

Java 标准库中的经典 final 类：

| 类名 | 说明 |
|------|------|
| `String` | 字符串类 |
| `Integer` | 整型包装类 |
| `Math` | 数学工具类 |
| `System` | 系统工具类 |

这些类被设计为 final，是为了保证它们的行为稳定性和安全性。

---

## 4. final 修饰基本数据类型 vs 引用数据类型

### 4.1 修饰基本数据类型

**规则：值不能发生改变。**

```java
final double PI = 3.14;
// PI = 3.14159;  // 编译错误！基本数据类型的值不能被修改
```

### 4.2 修饰引用数据类型

**规则：引用的地址值不能发生改变，但对象内部的属性可以修改。**

```java
// --- Student 类定义 ---
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

// --- 测试 ---
final Student S = new Student("zhangsan", 23);

// ✅ 可以修改对象内部属性
S.setName("李四");
S.setAge(24);
System.out.println(S.getName() + ", " + S.getAge()); // 输出: 李四, 24

// ❌ 不能改变引用指向
// S = new Student("wangwu", 25);  // 编译错误！引用地址不能改变
```

### 4.3 final 修饰数组

数组是引用数据类型，规则同上：

```java
final int[] ARR = {1, 2, 3, 4, 5};

// ✅ 可以修改数组元素
ARR[0] = 10;
ARR[1] = 20;
for (int i = 0; i < ARR.length; i++) {
    System.out.print(ARR[i] + " ");  // 输出: 10 20 3 4 5
}

// ❌ 不能改变数组引用
// ARR = new int[10];  // 编译错误！数组引用地址不能改变
```

### 对比总结

| 修饰对象 | final 约束的内容 | 什么可以改变 | 什么不能改变 |
|----------|-----------------|-------------|-------------|
| 基本数据类型 | 变量的值 | — | 值本身 |
| 引用数据类型（对象） | 引用的地址 | 对象的内部属性 | 引用的指向 |
| 引用数据类型（数组） | 数组的引用地址 | 数组元素的值 | 数组的引用指向 |

---

## 5. 字符串的不可变性

### String 为什么是不可变的？

在 Java 中，`String` 类本身被 `final` 修饰（不能被继承），并且其内部存储字符的数组也是 `private final` 的。这意味着：

1. **String 类不能被继承**
2. **内部字符数组不能被替换**
3. **String 一旦创建，其内容就不能被修改**

### 示例

```java
String str = "hello";
str = str + " world";

// 这并不会修改原来的 "hello" 字符串
// 而是创建了一个新的字符串 "hello world"，然后让 str 引用指向它
// 原来的 "hello" 仍然存在于内存中（直到被垃圾回收）
```

### 不可变性的好处

| 优点 | 说明 |
|------|------|
| **线程安全** | 多个线程可以安全地共享同一个 String 对象 |
| **缓存友好** | 字符串常量池可以复用相同的字符串，节省内存 |
| **安全性** | 用作 HashMap 的 key 时，hashCode 不会改变 |
| **Class 加载安全** | 类名等关键信息不会被篡改 |

---

## 总结

| final 修饰目标 | 含义 | 关键特性 |
|---------------|------|---------|
| 变量 | 常量 | 只能赋值一次 |
| 方法 | 最终方法 | 不能被子类重写 |
| 类 | 最终类 | 不能被继承 |
| 基本数据类型变量 | 值不可变 | 值本身不能改变 |
| 引用数据类型变量 | 引用不可变 | 地址不能改变，但对象内部属性可变 |
