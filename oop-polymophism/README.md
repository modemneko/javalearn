# Java 多态 (Polymorphism) 学习笔记

## 目录

- [1. 多态的概念](#1-多态的概念)
  - [1.1 什么是多态](#11-什么是多态)
  - [1.2 多态的前提条件](#12-多态的前提条件)
- [2. 多态的基本使用](#2-多态的基本使用)
- [3. 多态中成员的访问特点](#3-多态中成员的访问特点)
  - [3.1 成员变量](#31-成员变量)
  - [3.2 成员方法](#32-成员方法)
  - [3.3 总结口诀](#33-总结口诀)
- [4. 多态的好处](#4-多态的好处)
  - [4.1 提高代码的扩展性](#41-提高代码的扩展性)
  - [4.2 提高代码的复用性](#42-提高代码的复用性)
- [5. 多态作为方法参数的实际应用](#5-多态作为方法参数的实际应用)
  - [5.1 场景：养宠物](#51-场景养宠物)

---

## 1. 多态的概念

### 1.1 什么是多态

**多态**是指同一个行为具有多个不同表现形式或形态的能力。在 Java 中，多态意味着**父类引用可以指向子类对象**，并且在运行时会根据实际对象的类型调用相应的方法。

简单来说：**同一个方法调用，由于对象不同，会产生不同的行为。**

### 1.2 多态的前提条件

多态的实现需要满足以下 **三个前提条件**：

| 序号 | 前提条件 | 说明 |
|:---:|---------|------|
| 1 | **继承或实现关系** | 子类继承父类，或实现接口 |
| 2 | **方法重写** | 子类对父类的方法进行重写（Override） |
| 3 | **父类引用指向子类对象** | 如 `Fu f = new Zi();` |

```java
// 格式：父类类型 变量名 = new 子类类型();
Animal a = new Dog();   // 多态写法
Animal b = new Cat();   // 多态写法
```

---

## 2. 多态的基本使用

**示例场景：** 学校系统中，不同角色（学生、老师、管理员）都有展示信息的需求，但展示格式不同。

### 父类：Person

```java
// Person.java
public class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter ...

    public void show() {
        System.out.println(this.name + ", " + this.getName());
    }
}
```

### 子类：Student / Teacher / Administrator

```java
// Student.java
public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生的信息为：" + getName() + "，" + getAge());
    }
}

// Teacher.java
public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + ", " + getAge());
    }
}

// Administrator.java
public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + ", " + getAge());
    }
}
```

### 测试类：利用多态统一处理

```java
// Test.java
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(19);
        register(student);          // 传入 Student 对象

        Teacher teacher = new Teacher();
        teacher.setName("刘老师");
        teacher.setAge(35);
        register(teacher);          // 传入 Teacher 对象

        Administrator administrator = new Administrator();
        administrator.setName("Admin");
        administrator.setAge(25);
        register(administrator);    // 传入 Administrator 对象
    }

    // 方法参数使用父类类型，接收任意子类对象
    public static void register(Person s) {
        s.show();
    }
}
```

**运行结果：**

```
学生的信息为：张三，19
老师的信息为：刘老师, 35
管理员的信息为：Admin, 25
```

> **核心思想：** `register(Person s)` 方法只写一次，就能处理所有 `Person` 的子类对象，无需为每个子类单独写方法。

---

## 3. 多态中成员的访问特点

### 3.1 成员变量

> **编译看左边，运行也看左边**

多态方式访问成员变量时，**编译和运行都看父类**。即获取的是父类中成员变量的值。

```java
class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal show方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog show方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat show方法");
    }
}
```

```java
// 测试
Animal a = new Dog();
System.out.println(a.name);   // 输出: 动物
```

**解释：** `a` 的编译类型是 `Animal`，所以 `a.name` 访问的是 `Animal` 类中的 `name` 变量，值为 `"动物"`。

### 3.2 成员方法

> **编译看左边，运行看右边**

多态方式调用成员方法时，**编译看父类有没有该方法，运行时实际执行的是子类重写后的方法**。

```java
// 测试
Animal a = new Dog();
a.show();   // 输出: Dog show方法
```

**解释：**
- **编译阶段**：检查 `Animal` 类中是否有 `show()` 方法 → 有，编译通过
- **运行阶段**：实际对象的类型是 `Dog`，所以调用的是 `Dog` 类中重写后的 `show()` 方法

### 3.3 总结口诀

| 成员类型 | 编译看 | 运行看 | 说明 |
|---------|:-----:|:-----:|------|
| **成员变量** | 左边（父类） | 左边（父类） | 获取父类变量的值 |
| **成员方法** | 左边（父类） | 右边（子类） | 调用子类重写的方法 |

```
Animal a = new Dog();
     ↑          ↑
   左边        右边

a.name    → 编译看左边（Animal 有没有 name 属性），运行看左边（取 Animal 中 name 的值）
a.show()  → 编译看左边（Animal 有没有 show 方法），运行看右边（执行 Dog 的 show 方法）
```

---

## 4. 多态的好处

### 4.1 提高代码的扩展性

当需要新增子类时，**无需修改已有的方法代码**。只要新类继承了父类并重写了方法，就能直接使用父类引用调用。

```java
// 新增一个 Bird 子类
class Bird extends Animal {
    String name = "鸟";

    @Override
    public void show() {
        System.out.println("Bird show方法");
    }
}

// 无需修改 register() 方法，直接传入新类型
Animal c = new Bird();
register(c);   // 自动调用 Bird 的 show()
```

### 4.2 提高代码的复用性

使用父类类型作为方法参数或返回值，可以接收/返回任意子类对象，避免为每个子类编写重复代码。

```java
// 一个方法处理所有子类
public static void register(Person s) {
    s.show();   // 根据实际对象类型，自动调用对应子类的方法
}
```

---

## 5. 多态作为方法参数的实际应用

### 5.1 场景：养宠物

一个人可以养不同的宠物（猫、狗等），每种宠物吃东西的方式不同。通过多态，用统一的方法处理不同宠物。

### 动物父类：Animal

```java
public class Animal {
    public String name;
    public int age;
    public String color;

    public Animal() {}

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter / setter ...

    public void eat(String something) {
        System.out.println("动物在吃");
    }
}
```

### 子类：Cat

```java
public class Cat extends Animal {
    public Cat() {}

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛侧着头吃" + something);
    }

    // Cat 特有的方法，多态引用无法直接调用
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
```

### 子类：Dog

```java
public class Dog extends Animal {
    public Dog() {}

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    // Dog 特有的方法，多态引用无法直接调用
    public void lookHome() {
        System.out.println("看家");
    }
}
```

### 人类：Person（使用多态参数）

```java
public class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter ...

    /**
     * 养宠物方法 —— 参数 Animal 使用多态
     * 可以接收 Cat、Dog 等任意 Animal 子类对象
     */
    public void keepPet(Animal animal, String something) {
        System.out.println("年龄为" +
                this.age + "岁的" +
                this.name + "养了一只" +
                animal.color + "颜色的" +
                animal.age + "岁的" + something
        );
        animal.eat(something);
    }
}
```

### 测试类

```java
public class Test {
    public static void main(String[] args) {
        // 场景一：老王养狗
        Person p1 = new Person();
        Dog dog = new Dog();
        dog.setName("狗");
        dog.setAge(2);
        dog.setColor("黑");
        p1.setName("老王");
        p1.setAge(30);
        p1.keepPet(dog, "骨头");

        // 场景二：老李养猫
        Person p2 = new Person();
        Cat cat = new Cat();
        cat.setName("猫");
        cat.setAge(3);
        cat.setColor("灰");
        p2.setName("老李");
        p2.setAge(25);
        p2.keepPet(cat, "鱼");
    }
}
```

**运行结果：**

```
年龄为30岁的老王养了一只黑颜色的2岁的骨头
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
-------------------------
年龄为25岁的老李养了一只灰颜色的3岁的鱼
3岁的灰的猫眯着眼睛侧着头吃鱼
```

> **关键点：** `keepPet(Animal animal, String something)` 方法的第一个参数是 `Animal` 类型，实际传入的是 `Dog` 或 `Cat` 对象。方法内部调用 `animal.eat(something)` 时，会根据实际对象类型分别执行 `Dog` 或 `Cat` 的 `eat()` 方法，这就是多态的威力。

---

## 总结

| 知识点 | 内容 |
|-------|------|
| **多态前提** | 继承/实现 + 方法重写 + 父类引用指向子类对象 |
| **变量访问** | 编译看左边，运行看左边 |
| **方法访问** | 编译看左边，运行看右边 |
| **核心好处** | 提高代码的扩展性和复用性 |
| **典型应用** | 将父类类型作为方法参数，接收任意子类对象 |
