# Java 包（Package）学习笔记

## 1. 什么是包？

包（Package）是 Java 中用于组织和管理类的一种机制，本质上就是一个**文件夹**。它的主要作用包括：

- **避免命名冲突**：不同包中可以存在同名的类，通过包名加以区分。
- **分类管理代码**：将功能相关的类放在同一个包中，提高代码的可读性和可维护性。
- **控制访问权限**：配合 `public`、默认（包私有）等修饰符，控制类、方法、字段的可见范围。

## 2. 包的定义语法

使用 `package` 关键字在源文件的**第一行**声明类所属的包：

```java
package kru.domain1;

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

> **注意**：`package` 语句必须是源文件中除注释外的**第一条语句**。

包对应的目录结构为：

```
oop-package/
├── kru/
│   ├── domain1/
│   │   └── Teacher.java       ← package kru.domain1;
│   ├── domain2/
│   │   └── Teacher.java       ← package kru.domain2;
│   └── test/
│       ├── Student.java       ← package kru.test;
│       └── Test.java          ← package kru.test;
```

## 3. 导入包（import 关键字）

使用 `import` 关键字可以在当前类中引用其他包的类，避免每次写完整包名。

### 3.1 导入单个类

```java
import kru.domain1.Teacher;   // 导入 kru.domain1 包中的 Teacher 类

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张老师", 30);  // 直接使用类名
        System.out.println(t.getName());
    }
}
```

### 3.2 导入整个包（通配符 *）

```java
import kru.domain1.*;   // 导入 kru.domain1 包下的所有类
```

### 3.3 import 语法要点

| 语法 | 说明 |
|------|------|
| `import 包名.类名;` | 导入指定的单个类 |
| `import 包名.*;` | 导入指定包下的所有类 |
| 位置 | `package` 语句之后、类定义之前 |
| 默认导入 | `java.lang.*` 包下的类无需 import 即可使用（如 `String`、`System`） |

## 4. 同名类的区分 — 全限定名

当项目中存在**同名但不同包**的类时，`import` 只能导入其中一个，另一个必须使用**全限定名**（包名 + 类名）来引用。

### 完整示例

```java
package kru.test;

import kru.domain1.Teacher;  // 导入 domain1 的 Teacher

public class Test {
    public static void main(String[] args) {
        // 方式一：使用 import 导入的类，直接写类名
        Teacher t1 = new Teacher("王老师", 28);
        System.out.println("t1: " + t1.getName() + ", " + t1.getAge());

        // 方式二：使用全限定名引用另一个同名类
        kru.domain2.Teacher t2 = new kru.domain2.Teacher("李老师", 35);
        System.out.println("t2: " + t2.getName() + ", " + t2.getAge());
    }
}
```

### 全限定名的使用场景

1. **同名类共存**：不同包中存在同名类，只能 import 一个，其余用全限定名。
2. **提高代码可读性**：在复杂项目中，使用全限定名可以明确类的来源。
3. **避免歧义**：当多个包导入的类名冲突时，全限定名是唯一解决方案。

## 5. 包命名规范

Java 社区普遍遵循以下包命名约定：

| 规则 | 说明 | 示例 |
|------|------|------|
| **全部小写** | 避免大小写在不同操作系统下的歧义 | `kru.domain1` ✅  `kru.Domain1` ❌ |
| **反向域名** | 使用公司/组织的倒置域名作为前缀，保证唯一性 | `com.example.project` |
| **见名知意** | 包名应反映其功能或模块 | `domain`、`service`、`util` |
| **使用点号分隔** | 多级包用 `.` 分隔，对应多级目录 | `kru.test` → `kru/test/` |
| **避免关键字** | 不要使用 Java 关键字作为包名 | `com.example.int` ❌ |

### 常见项目包结构示例

```
com.example.project/
├── domain/          # 领域模型（实体类）
├── service/         # 业务逻辑层
├── controller/      # 控制器层
├── repository/      # 数据访问层
├── util/            # 工具类
└── config/          # 配置类
```

## 6. 代码示例汇总

### kru/domain1/Teacher.java

```java
package kru.domain1;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {}

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

### kru/domain2/Teacher.java

```java
package kru.domain2;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {}

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

### kru/test/Student.java

```java
package kru.test;

public class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

### kru/test/Test.java

```java
package kru.test;

import kru.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        // 使用 import 导入的 Teacher（domain1）
        Teacher t1 = new Teacher("王老师", 28);
        System.out.println("domain1.Teacher: " + t1.getName() + ", 年龄: " + t1.getAge());

        // 使用全限定名的 Teacher（domain2）
        kru.domain2.Teacher t2 = new kru.domain2.Teacher("李老师", 35);
        System.out.println("domain2.Teacher: " + t2.getName() + ", 年龄: " + t2.getAge());
    }
}
```

## 7. 小结

| 关键字 | 作用 | 位置 |
|--------|------|------|
| `package` | 声明当前类所属的包 | 源文件第一行 |
| `import`   | 导入其他包中的类 | package 之后、类定义之前 |
| 全限定名 | 明确指定类所在的包 | 需要时使用 |

理解包机制是编写可维护 Java 代码的基础，合理分包能让项目结构更清晰、协作更高效。
