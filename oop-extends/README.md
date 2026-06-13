# Java 继承（extends）学习笔记

> 本模块系统学习 Java 面向对象编程中的继承机制，涵盖继承体系设计、super/this 关键字、方法重写、构造方法调用顺序、内存分析等核心概念。

---

## 目录

1. [a01 - 继承体系设计：动物](#1-a01---继承体系设计动物)
2. [a02 - 继承中构造方法的执行顺序](#2-a02---继承中构造方法的执行顺序)
3. [a05 - this 和 super 关键字](#3-a05---this-和-super-关键字)
4. [a06 - 方法重写（Override）](#4-a06---方法重写override)
5. [a07 - 方法重写应用：狗](#5-a07---方法重写应用狗)
6. [a08 - 子类构造方法调用父类构造](#6-a08---子类构造方法调用父类构造)
7. [a09 - 内存分析：局部变量 vs 成员变量](#7-a09---内存分析局部变量-vs-成员变量)
8. [a10 - 员工管理系统](#8-a10---员工管理系统)
9. [a11 - 公司员工继承体系](#9-a11---公司员工继承体系)

---

## 核心概念速览

| 概念 | 说明 |
|------|------|
| `extends` | 继承关键字，子类自动获得父类的非私有成员 |
| `super` | 引用父类成员（变量、方法、构造方法） |
| `this` | 引用当前类成员（变量、方法、构造方法） |
| `@Override` | 标注方法重写，编译器会检查重写是否合法 |
| `super()` | 调用父类构造方法，子类构造方法首行默认隐含调用 |

---

## 1. a01 - 继承体系设计：动物

**设计目标：** 为四种动物（布偶猫、中国狸花猫、哈士奇、泰迪）设计合理的继承体系。

### 1.1 继承结构

```
Animal（动物父类）
├── Cat（猫中间层）
│   ├── Ragdoll（布偶猫）
│   └── Lihua（中国狸花猫）
└── Dog（狗中间层）
    ├── Husky（哈士奇）
    └── Taddy（泰迪）
```

**设计思路：** 提取共性行为到父类：
- 所有动物都有 `eat()`、`drink()`
- 猫特有行为 `catchFat()` 放入 Cat 类
- 狗特有行为 `lookupHome()` 放入 Dog 类
- 哈士奇特有 `BreakHome()`、泰迪特有 `cengceng()` 各自实现

### 1.2 父类 Animal

```java
package kru.a01oopextendsdemo1;

public class Animal {
    // 权限修饰符说明：
    // private：子类无法访问，只能在本类中访问
    // 子类只能访问父类中非私有的成员

    private String name;
    private int kilogram;
    private String gender;

    public Animal() {}

    public Animal(String name, int kilogram, String gender) {
        this.name = name;
        this.kilogram = kilogram;
        this.gender = gender;
    }

    // getter/setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getKilogram() { return kilogram; }
    public void setKilogram(int kilogram) { this.kilogram = kilogram; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    // 公共行为
    public void showInfo() {
        System.out.println("属性：" + this.getName() + " " + this.getKilogram() + " " + this.getGender());
    }

    public void eat() { System.out.println("吃东西"); }
    public void drink() { System.out.println("喝水"); }
    public void catchFat() { System.out.println("抓老鼠"); }
    public void lookupHome() { System.out.println("看家"); }
}
```

### 1.3 中间层 Cat

```java
package kru.a01oopextendsdemo1;

public class Cat extends Animal {
    public Cat() {}

    public Cat(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }

    @Override
    public void eat() { super.eat(); }
    @Override
    public void drink() { super.drink(); }
    @Override
    public void catchFat() { super.catchFat(); }
}
```

### 1.4 中间层 Dog

```java
package kru.a01oopextendsdemo1;

public class Dog extends Animal {
    public Dog() {}

    public Dog(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }

    @Override
    public void eat() { super.eat(); }
    @Override
    public void drink() { super.drink(); }
    @Override
    public void lookupHome() { super.lookupHome(); }
}
```

### 1.5 具体子类

```java
// Ragdoll（布偶猫）
public class Ragdoll extends Cat {
    public Ragdoll() {}
    public Ragdoll(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }
}

// Lihua（狸花猫）
public class Lihua extends Cat {
    public Lihua() {}
    public Lihua(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }
}

// Husky（哈士奇）
public class Husky extends Dog {
    public Husky() {}
    public Husky(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }
    public void BreakHome() {
        System.out.println("哈士奇在拆家");
    }
}

// Taddy（泰迪）
public class Taddy extends Dog {
    public Taddy() {}
    public Taddy(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }
    public void cengceng() {
        System.out.println("泰迪在蹭蹭");
    }
}
```

### 1.6 测试类

```java
public class AnimalTest {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll("小布偶", 5, "公的");
        rd.eat();       // 吃东西
        rd.drink();     // 喝水
        rd.catchFat();  // 抓老鼠
        rd.showInfo();  // 属性：小布偶 5 公的

        // ========================================
        Lihua lh = new Lihua("小狸花", 6, "母的");
        lh.eat();       // 吃东西
        lh.drink();     // 喝水
        lh.catchFat();  // 抓老鼠
        lh.showInfo();  // 属性：小狸花 6 母的

        // ========================================
        Husky hs = new Husky("破坏王", 8, "母的");
        hs.eat();       // 吃东西
        hs.drink();     // 喝水
        hs.lookupHome();// 看家
        hs.BreakHome(); // 哈士奇在拆家
        hs.showInfo();  // 属性：破坏王 8 母的

        // ========================================
        Taddy td = new Taddy("卷毛", 6, "母的");
        td.eat();       // 吃东西
        td.drink();     // 喝水
        td.lookupHome();// 看家
        td.cengceng();  // 泰迪在蹭蹭
        td.showInfo();  // 属性：卷毛 6 母的
    }
}
```

### 1.7 知识点总结

- **继承的本质**：子类自动获得父类的非私有成员（属性、方法），实现代码复用
- **继承体系设计原则**：将共性的东西向上提取到父类，特殊的东西留在子类
- **访问权限**：`private` 成员子类无法直接访问，需通过 getter/setter 间接访问

---

## 2. a02 - 继承中构造方法的执行顺序

**学习目标：** 理解创建子类对象时，父类构造方法的调用时机。

### 2.1 完整代码

```java
package kru.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi zi = new Zi();

        // 利用带参构造创建子类对象
        Zi z2 = new Zi("张三", 23);
    }
}

class Fu {
    private int a = 0x111;
    int b = 0x222;
    String name;
    int age;

    public Fu() {}

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    int c = 0x333;

    public Zi() {}

    public Zi(String 张三, int i) {}
}
```

### 2.2 构造方法调用规则

**核心规则：子类构造方法的第一行默认隐含 `super()`，即自动调用父类无参构造。**

调用顺序：
1. 父类成员变量初始化
2. 父类构造方法执行
3. 子类成员变量初始化
4. 子类构造方法执行

```
new Zi()
  → super() （隐式调用 Fu()）
    → Fu 的成员变量初始化
    → Fu 构造方法体
  → Zi 的成员变量初始化（c = 0x333）
  → Zi 构造方法体
```

### 2.3 注意事项

- 如果父类没有无参构造，子类必须在构造方法第一行显式调用 `super(参数)`
- 子类的带参构造 `Zi(String, int)` 中没有使用传入的参数给父类赋值，name/age 仍为默认值 null/0
- 成员变量的十六进制赋值 `0x111 = 273`, `0x222 = 546`, `0x333 = 819`

---

## 3. a05 - this 和 super 关键字

**学习目标：** 掌握 `this` 和 `super` 在访问同名变量时的区别。

### 3.1 完整代码

```java
package kru.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";  // 与父类同名
    String game = "吃鸡";

    public void ziShow() {
        // 打印 Zi.name
        // System.out.println(name);     // Zi
        // System.out.println(this.name); // Zi

        // 打印 Fu.name
        // System.out.println(super.name); // Fu

        // 打印父类的 hobby（子类没有覆盖）
        System.out.println(hobby);        // 喝茶
        System.out.println(this.hobby);   // 喝茶
        System.out.println(super.hobby);  // 喝茶

        // 打印子类特有的 game
        System.out.println(game);         // 吃鸡
        System.out.println(this.game);    // 吃鸡
    }
}
```

### 3.2 this vs super 对比

| 表达式 | 含义 | 示例结果 |
|--------|------|---------|
| `name` | 就近原则，优先找当前类 | `this.name` → "Zi" |
| `this.name` | 当前类的 name | "Zi" |
| `super.name` | 父类的 name | "Fu" |
| `hobby` | 子类没有则向上查找 | 找到 Fu.hobby → "喝茶" |
| `super.hobby` | 明确指定父类的 hobby | "喝茶" |
| `game` | 子类特有属性 | "吃鸡" |

### 3.3 查找优先级（就近原则）

```
局部方法内的变量
    ↓ （找不到则）
this.当前类成员
    ↓ （找不到则）
super.父类成员
    ↓ （找不到则）
继续向上查找祖父类...
```

---

## 4. a06 - 方法重写（Override）

**学习目标：** 理解方法重写的概念、语法和应用场景。

### 4.1 完整代码

```java
package kru.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        OverseasStudent s = new OverseasStudent();
        s.lunch();
    }
}

class Person {
    public void eat() { System.out.println("吃米饭，吃菜"); }
    public void drink() { System.out.println("喝开水"); }
}

// 留学生
class OverseasStudent extends Person {
    @Override
    public void eat() { System.out.println("吃意大利面"); }

    @Override
    public void drink() { System.out.println("喝凉水"); }

    public void lunch() {
        this.eat();    // 吃意大利面（调用子类重写的方法）
        this.drink();  // 喝凉水（调用子类重写的方法）

        super.eat();   // 吃米饭，吃菜（调用父类原始方法）
        super.drink(); // 喝开水（调用父类原始方法）
    }
}

class Student extends Person {
    public void lunch() {
        // 子类没有重写 eat/drink，调用的是从父类继承的方法
        this.eat();    // 吃米饭，吃菜
        this.drink();  // 喝开水
    }
}

// 动物类（继承结构示例）
class Animal {}
class Dog extends Animal {}
class Cat {}  // 未继承，示例类
```

### 4.2 方法重写的应用场景

> **当父类中的方法不能满足子类现在的需求时，就需要对这个方法进行重写。**

### 4.3 this vs super 调用重写方法的区别

| 调用方式 | 调用的方法 |
|---------|-----------|
| `this.eat()` | 调用子类重写后的 eat() |
| `super.eat()` | 调用父类原始的 eat() |

### 4.4 方法重写的规则

1. 方法名、参数列表必须完全相同
2. 返回类型必须相同或是其子类型（协变返回）
3. 访问修饰符不能比父类更严格
4. 使用 `@Override` 注解标记，编译器会自动检查重写是否合法

---

## 5. a07 - 方法重写应用：狗

**设计目标：** 为三种狗（哈士奇、沙皮狗、中华田园犬）设计继承结构，通过方法重写实现不同行为。

### 5.1 继承结构

```
Dog（狗父类）
├── Husky（哈士奇）
├── Sapi（沙皮狗）
└── TuGou（中华田园犬）
```

### 5.2 父类 Dog

```java
package kru.a07oopextendsdemo7;

public class Dog {
    public void eat() { System.out.println("吃饭"); }
    public void drink() { System.out.println("喝水"); }
    public void lookHome() { System.out.println("看家"); }
}
```

### 5.3 子类实现

```java
// 哈士奇
public class Husky extends Dog {
    @Override
    public void eat() {
        super.eat();     // 吃饭
        eatDogFood();    // 吃狗粮
    }
    public void eatDogFood() { System.out.println("吃狗粮"); }
    public void breakHome() { System.out.println("拆家"); }
}

// 沙皮狗
public class Sapi extends Dog {
    @Override
    public void eat() {
        super.eat();     // 吃饭
        Husky husky = new Husky();
        husky.eatDogFood(); // 吃狗粮
        eatBone();       // 吃骨头
    }
    public void eatBone() { System.out.println("吃骨头"); }
}

// 中华田园犬
public class TuGou extends Dog {
    @Override
    public void eat() {
        super.eat();      // 吃饭
        eatOldFood();     // 吃剩饭
    }
    public void eatOldFood() { System.out.println("吃剩饭"); }
}
```

### 5.4 测试输出

```java
public class TestDog {
    public static void main(String[] args) {
        Husky husky = new Husky();
        System.out.println("哈士奇：");
        husky.eat();      // 吃饭 → 吃狗粮
        husky.drink();    // 喝水
        husky.lookHome(); // 看家
        husky.breakHome();// 拆家

        Sapi sapi = new Sapi();
        System.out.println("沙皮狗：");
        sapi.eat();       // 吃饭 → 吃狗粮 → 吃骨头
        sapi.drink();     // 喝水
        sapi.lookHome();  // 看家

        TuGou tuGou = new TuGou();
        System.out.println("中华田园犬：");
        tuGou.eat();      // 吃饭 → 吃剩饭
        tuGou.drink();    // 喝水
        tuGou.lookHome(); // 看家
    }
}
```

### 5.5 设计模式要点

- 父类定义通用行为模板
- 子类通过 `super.方法()` 保留父类行为
- 子类追加自己特有的行为
- 体现了**代码复用**和**行为扩展**的思想

---

## 6. a08 - 子类构造方法调用父类构造

**学习目标：** 掌握子类构造方法中如何通过 `super()` 显式调用父类构造。

### 6.1 完整代码

```java
package kru.a08oopextendsdemo8;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Student extends Person {
    public Student() {
        // 子类构造方法中隐藏的 super() 去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {
        super(name, age);  // 显式调用父类带参构造
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 23);
        System.out.println(s.name + ", " + s.age);
        // 输出：张三, 23
    }
}
```

### 6.2 super() 调用规则

| 场景 | 行为 |
|------|------|
| 子类无参构造 | 第一行隐含 `super()` 调用父类无参构造 |
| 子类带参构造 | 可显式写 `super(参数)` 调用父类对应构造 |
| `super()` 位置 | **必须在构造方法第一行** |

### 6.3 执行流程

```
new Student("张三", 23)
  → super("张三", 23)
    → Person 成员变量初始化
    → Person(String, int) 构造执行：name="张三", age=23
  → Student 成员变量初始化
  → Student 构造方法体
  → s.name = "张三", s.age = 23
```

---

## 7. a09 - 内存分析：局部变量 vs 成员变量

**学习目标：** 理解方法中局部变量和类成员变量在内存中的区别。

### 7.1 完整代码

```java
package kru.a09oopextendsdemo9;

public class Student {
    String name;    // 成员变量：存储在堆内存对象中
    int age;        // 成员变量：存储在堆内存对象中

    public void show() {
        int a = 10;  // 局部变量：存储在栈内存方法帧中
        int b = 20;  // 局部变量：随方法调用而创建
        int c = 30;  // 局部变量：随方法结束而销毁
        System.out.println(name + ", " + age);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 23;
        s.show();  // 输出：张三, 23
    }
}
```

### 7.2 内存对比

| 特性 | 成员变量 | 局部变量 |
|------|---------|---------|
| **存储位置** | 堆内存（Heap） | 栈内存（Stack） |
| **生命周期** | 随对象创建而存在，随对象被垃圾回收而销毁 | 随方法调用而创建，随方法结束而销毁 |
| **默认值** | 有默认值（引用类型=null，数值类型=0，boolean=false） | 无默认值，必须显式初始化 |
| **访问范围** | 类内方法均可访问 | 仅所在方法内可访问 |

### 7.3 内存示意图

```
栈（Stack）                    堆（Heap）
┌──────────────┐              ┌─────────────────┐
│ main 方法帧   │              │ Student 对象      │
│ s ──────────→│─────────────→│ name = "张三"     │
└──────────────┘              │ age = 23        │
                              └─────────────────┘

┌──────────────┐
│ show 方法帧   │
│ a = 10       │
│ b = 20       │
│ c = 30       │  ← 方法返回后这些变量被销毁
└──────────────┘
```

---

## 8. a10 - 员工管理系统

**学习目标：** 综合运用继承和方法重写，实现员工管理系统。

### 8.1 继承结构

```
Employee（员工父类）
├── Manager（经理）
└── Chef（厨师）
```

### 8.2 父类 Employee

```java
package kru.a10oopextendsdemo10;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter / setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void work() { System.out.println("正在工作"); }
    public void eat() { System.out.println("正在吃饭"); }
    public void show() { System.out.println(id + ", " + name + ", " + salary); }
}
```

### 8.3 子类 Manager

```java
package kru.a10oopextendsdemo10;

public class Manager extends Employee {
    private double managementBonus;

    public Manager(String id, String name, double salary, double managementBonus) {
        super(id, name, salary);
        this.managementBonus = managementBonus;
    }

    public double getManagementBonus() { return managementBonus; }
    public void setManagementBonus(double managementBonus) { this.managementBonus = managementBonus; }

    @Override
    public void work() {
        super.work();
        Management();
    }
    public void Management() { System.out.println("正在管理其他人"); }

    @Override
    public void eat() {
        super.eat();
        eatRice();
    }
    public void eatRice() { System.out.println("吃米饭"); }

    @Override
    public void show() {
        super.show();
        System.out.println(getManagementBonus());
    }
}
```

### 8.4 子类 Chef

```java
package kru.a10oopextendsdemo10;

public class Chef extends Employee {
    public Chef() {}

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        cook();
    }
    public void cook() { System.out.println("正在炒菜"); }

    @Override
    public void eat() {
        super.eat();
        eatRice();
    }
    public void eatRice() { System.out.println("吃米饭"); }
}
```

### 8.5 测试

```java
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("1001", "张经理", 8000.00, 10000.00);
        manager.work();  // 正在工作 → 正在管理其他人
        manager.eat();   // 正在吃饭 → 吃米饭
        manager.show();  // 1001, 张经理, 8000.0 → 10000.0

        Chef chef = new Chef("1001", "王主厨", 8888);
        chef.work();     // 正在工作 → 正在炒菜
        chef.eat();      // 正在吃饭 → 吃米饭
        chef.show();     // 1001, 王主厨, 8888.0
    }
}
```

---

## 9. a11 - 公司员工继承体系

**学习目标：** 设计多层级的公司人员继承体系，体现"按工作内容分类"的设计思想。

### 9.1 继承结构

```
Employee（员工父类）
├── Teacher（教研部）
│   ├── Lecturer（讲师）
│   └── Tutor（助教）
└── AdminStaff（行政部）
```

### 9.2 父类 Employee

```java
package kru.a11oopextendstest11;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String WorkContent;

    public Employee() {}

    public Employee(String id, String name, int age, String workContent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.WorkContent = workContent;
    }

    // getter / setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getWorkContent() { return WorkContent; }
    public void setWorkContent(String workContent) { WorkContent = workContent; }

    public void show() {
        System.out.println(this.id + ", " + this.name + ", " + this.age + ", " + this.WorkContent);
    }

    public void work() { System.out.println("正在工作"); }
}
```

### 9.3 子类实现

```java
// 教师（教研部）
public class Teacher extends Employee {
    public Teacher() {}

    public Teacher(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("正在教研");
    }
}

// 讲师
public class Lecturer extends Employee {
    public Lecturer() {}

    public Lecturer(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("正在讲课");
    }
}

// 助教
public class Tutor extends Employee {
    public Tutor() {}

    public Tutor(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("正在助教");
    }
}

// 行政
public class AdminStaff extends Employee {
    @Override
    public void work() {
        super.work();
        System.out.println("正在处理行政事务");
    }

    public AdminStaff() {}

    public AdminStaff(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }
}
```

### 9.4 设计特点

- 标准 JavaBean 规范：私有属性 + getter/setter + 无参构造 + 带参构造
- 所有子类通过 `super(work)` 保留父类行为后追加特定行为
- 按部门（教研/行政）和工作方式（讲课/助教）进行分层设计

---

## 继承知识总结

### 继承的核心要点

1. **代码复用**：子类自动获得父类非私有成员，避免重复编写相同代码
2. **扩展性**：子类可在父类基础上添加新属性、新方法，或重写已有方法
3. **is-a 关系**：继承表达"是一种"的关系，如 `Husky is a Dog`、`Dog is an Animal`
4. **单继承**：Java 中一个类只能直接继承一个父类，但可以多层继承
5. **构造方法不继承**：子类不会继承父类的构造方法，但会通过 `super()` 调用

### super 和 this 对比

| 特性 | `this` | `super` |
|------|--------|---------|
| 引用对象 | 当前对象 | 父类部分 |
| 访问变量 | `this.name` 访问本类变量 | `super.name` 访问父类变量 |
| 调用方法 | `this.eat()` 调用本类方法 | `super.eat()` 调用父类方法 |
| 调用构造 | `this(参数)` 调用本类其他构造 | `super(参数)` 调用父类构造 |
| 位置要求 | 构造方法中必须在第一行 | 构造方法中必须在第一行 |
| 共存 | 不能同时出现在同一构造方法的第一行 | 不能同时出现在同一构造方法的第一行 |

### 方法重写三要素

1. **方法签名一致**：方法名、参数列表完全相同
2. **访问权限不缩小**：子类重写方法的访问修饰符 ≥ 父类
3. **返回类型兼容**：返回值类型相同或是其子类（协变返回类型）
