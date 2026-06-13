# Java 访问权限修饰符学习笔记

> 本模块通过实际代码演示 Java 中四种访问权限修饰符的使用规则，涵盖同一包内访问、跨包访问以及继承关系中的访问控制。

---

## 一、四种权限修饰符简介

Java 提供了四种访问权限修饰符，用于控制类、方法、字段等成员的可见范围：

| 修饰符 | 关键字 | 说明 |
|--------|--------|------|
| **public** | `public` | 公开的，任何地方都可以访问 |
| **protected** | `protected` | 受保护的，同包内或不同包的子类可以访问 |
| **默认（包私有）** | 无修饰符 | 包级私有，只有同一个包内的类可以访问 |
| **private** | `private` | 私有的，只有本类内部可以访问 |

---

## 二、同一包内的访问规则

**规则：** 在同一个包内，除了 `private` 修饰的成员外，其他成员都可以被包内的类访问。

### 示例代码

**Animal.java**（`kru.demo1` 包）

```java
package kru.demo1;

public class Animal {
    public String name;

    public void show() {
        System.out.println(name);
    }
}
```

**Test.java**（`kru.demo1` 包）

```java
package kru.demo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);  // ✅ 同一包内，可以直接访问 public 成员
    }
}
```

### 访问结果

| 成员修饰符 | 同一包内是否可访问 |
|------------|-------------------|
| `public` | ✅ 可以 |
| `protected` | ✅ 可以 |
| 默认（无修饰符） | ✅ 可以 |
| `private` | ❌ 不可以 |

---

## 三、不同包间的访问规则

**规则：** 在不同包中，只能访问 `public` 修饰的成员。

### 示例代码

**Dog.java**（`kru.demo2` 包，继承 `kru.demo1.Animal`）

```java
package kru.demo2;

import kru.demo1.Animal;

public class Dog extends Animal {

    public void show() {
        System.out.println(name);  // ✅ 子类可以访问父类的 public 成员
    }
}
```

**Test.java**（`kru.demo2` 包）

```java
package kru.demo2;

import kru.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();

        System.out.println(a.name);  // ✅ 跨包访问 public 成员
    }
}
```

### 访问结果

| 成员修饰符 | 不同包是否可访问 |
|------------|-----------------|
| `public` | ✅ 可以 |
| `protected` | ❌ 不可以（除非是子类） |
| 默认（无修饰符） | ❌ 不可以 |
| `private` | ❌ 不可以 |

---

## 四、继承关系中的访问规则

**规则：** 子类可以访问父类中 `public` 和 `protected` 修饰的成员，但无法访问 `private` 和默认（包私有）修饰的成员（跨包情况下）。

### 场景分析

| 场景 | 子类访问 `public` | 子类访问 `protected` | 子类访问 默认 | 子类访问 `private` |
|------|------------------|---------------------|--------------|-------------------|
| **同一包内继承** | ✅ | ✅ | ✅ | ❌ |
| **不同包继承** | ✅ | ✅ | ❌ | ❌ |

### 代码演示

```java
// Dog.java 在 kru.demo2 包中，继承 kru.demo1.Animal
public class Dog extends Animal {
    public void show() {
        System.out.println(name);  // ✅ 跨包子类可以访问父类的 public 成员
    }
}
```

> **注意：** 如果 `name` 改为 `protected`，跨包子类依然可以访问；如果改为默认（无修饰符），跨包子类则无法访问。

---

## 五、访问权限修饰符完整对照表

| 修饰符 | 同一类 | 同一包 | 不同包的子类 | 不同包的非子类 |
|--------|:------:|:------:|:------------:|:--------------:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| 默认（无修饰符） | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

---

## 六、最佳实践建议

1. **尽量缩小访问范围**：优先使用 `private`，只在必要时扩大权限
2. **封装字段**：将字段设为 `private`，通过 `public` 的 getter/setter 方法访问
3. **合理使用 protected**：仅在明确需要子类扩展时使用
4. **避免默认修饰符**：除非明确希望限制在包内访问，否则建议显式声明修饰符

---

## 七、项目结构

```
oop-jurisdiction/
└── src/
    └── kru/
        ├── demo1/
        │   ├── Animal.java      # 父类，定义 public 成员
        │   └── Test.java        # 同一包内测试访问
        └── demo2/
            ├── Dog.java         # 跨包子类，演示继承访问
            └── Test.java        # 跨包测试访问
```

---

## 八、总结

- **`public`**：最宽松，任何地方都可以访问
- **`protected`**：同包 + 跨包子类可以访问
- **默认（无修饰符）**：只有同包可以访问
- **`private`**：最严格，只有本类可以访问

> 💡 **口诀：** 公开（public）→ 保护（protected）→ 包私有（默认）→ 私有（private），范围依次缩小。
