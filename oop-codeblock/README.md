# 面向对象 - 代码块

## 模块概述

本模块学习 Java 中的**代码块（Code Block）**，主要包括两种类型：

- **构造代码块（实例代码块）**：在类中以 `{ }` 形式定义在成员位置的代码块，每次创建对象时都会先于构造方法执行。
- **静态代码块**：使用 `static { }` 定义的代码块，随着类的加载而加载，并且只执行一次。

理解代码块的**定义位置**和**执行时机**是掌握本模块的核心。

---

## 代码学习

### 1. 构造代码块

#### 代码内容

**`codeblockdemo1/Student.java`**

```java
package kru.codeblockdemo1;

public class Student {
    private String name;
    private int age;

    // 构造代码块：
    // 1. 写在成员位置的代码块
    // 2. 作用：可以把多个构造方法中重复的代码抽取出来
    // 3. 执行时机：我们在创建本类对象的时候会先执行构造代码再执行构造方法
    // 渐渐的淘汰了

    {
        System.out.println("开始创建对象了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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

**`codeblockdemo1/CodeBlockDemo1.java`**

```java
package kru.codeblockdemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        /*{
            int a = 10;
        }// 因为当代码执行到这里时，变量a就从内存中消失了

        // System.out.println(a);*/

        // 创建对象
        Student s = new Student();

        Student s2 = new Student("张三", 19);
    }
}
```

#### 运行结果

```
开始创建对象了
空参构造
开始创建对象了
有参构造
```

#### 知识点解析

- **构造代码块**：写在类的成员位置（方法外），用 `{ }` 包裹的代码块，也称为实例代码块。
- **作用**：可以把多个构造方法中重复的代码抽取出来，避免代码冗余。
- **执行时机**：创建本类对象时会**先执行构造代码块**，再执行构造方法。
- **每次创建对象**：只要创建一个新的对象，构造代码块就会执行一次。
- **现状**：在现代 Java 开发中，构造代码块逐渐被淘汰，较少使用。更推荐使用构造方法或工厂方法来完成初始化逻辑。

---

### 2. 静态代码块

#### 代码内容

**`codeblockdemo2/Student.java`**

```java
package kru.codeblockdemo2;

public class Student {
    private String name;
    private int age;

    // 执行时机：
    // 随着类的加载而加载的，并且只执行一次
    static {
        System.out.println("静态代码块执行了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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

**`codeblockdemo2/Test.java`**

```java
package kru.codeblockdemo2;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("zhangsan", 23);
    }
}
```

#### 运行结果

```
静态代码块执行了
空参构造
有参构造
```

#### 知识点解析

- **静态代码块**：使用 `static { }` 定义的代码块，属于类级别的初始化块。
- **执行时机**：随着**类的加载**而执行，并且在整个程序运行期间**只执行一次**。
- **优先于构造代码块和构造方法**：无论创建多少个对象，静态代码块都只在类首次被加载时执行一次。
- **用途**：
  - 类的初始化工作
  - 加载配置文件
  - 加载数据库驱动（如 `Class.forName("com.mysql.jdbc.Driver")`）
  - 初始化静态资源

---

## 代码块执行顺序总结

当同时存在静态代码块、构造代码块和构造方法时，执行顺序如下：

| 序号 | 代码块类型   | 执行时机                     | 执行次数       |
|------|--------------|------------------------------|----------------|
| 1    | 静态代码块   | 类加载时执行                 | 只执行一次     |
| 2    | 构造代码块   | 每次创建对象时执行           | 每次创建对象时 |
| 3    | 构造方法     | 每次创建对象时执行           | 每次创建对象时 |

**完整示例演示**：

```java
public class Demo {
    // 静态代码块
    static {
        System.out.println("1. 静态代码块执行了");
    }

    // 构造代码块
    {
        System.out.println("2. 构造代码块执行了");
    }

    // 构造方法
    public Demo() {
        System.out.println("3. 构造方法执行了");
    }

    public static void main(String[] args) {
        new Demo();
        System.out.println("-----");
        new Demo();
    }
}
```

**输出结果**：

```
1. 静态代码块执行了
2. 构造代码块执行了
3. 构造方法执行了
-----
2. 构造代码块执行了
3. 构造方法执行了
```

---

## 常见问题

### 1. 构造代码块和构造方法有什么区别？

| 对比项     | 构造代码块               | 构造方法           |
|------------|--------------------------|--------------------|
| 定义方式   | `{ }` 包裹的代码块       | 与类同名的方法     |
| 执行顺序   | 先于构造方法执行         | 在构造代码块后执行 |
| 参数       | 不能接收参数             | 可以接收参数       |
| 使用频率   | 较少使用                 | 常用               |

### 2. 静态代码块可以访问实例变量吗？

**不可以。** 静态代码块在类加载时执行，此时对象尚未创建，因此静态代码块中只能访问静态成员（静态变量和静态方法），不能直接访问非静态的成员变量和成员方法。

### 3. 静态代码块会执行多次吗？

**不会。** 静态代码块随着类的加载而执行，而类在 JVM 中只会被加载一次，因此静态代码块在整个程序运行期间只会执行一次。

### 4. 构造代码块会被继承吗？

**不会。** 构造代码块不属于继承的范畴。子类创建对象时，会先执行父类的构造代码块和构造方法，再执行子类的构造代码块和构造方法。

### 5. 为什么构造代码块逐渐被淘汰？

- 可读性较差，不如直接在构造方法中编写初始化逻辑直观。
- 无法接收参数，灵活性不如构造方法。
- 现代 IDE 和语言特性（如方法重载、默认参数、Builder 模式等）提供了更好的替代方案。

### 6. 静态代码块中可以抛出异常吗？

可以，但如果静态代码块抛出异常且未捕获，会导致类加载失败，后续使用该类的任何操作都会抛出 `ExceptionInInitializerError`。
