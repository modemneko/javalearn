# Day13 - static静态关键字

## 模块概述
本模块学习 Java 中 `static` 关键字的使用，包括静态变量、静态方法、静态工具类的设计原则，以及静态成员的访问限制。通过多个案例深入理解 `static` 修饰符在面向对象编程中的核心作用。

## 代码学习

### 1. static静态变量
#### 代码内容

**Student.java**
```java
package kru.a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }
}
```

**StudentTest.java**
```java
package kru.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";
        // 创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
//        s1.teacherName = "阿伟老师";

        s1.study();
        s1.show();

        // 创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");
//        s2.teacherName = "阿伟老师";

        s2.study();
        s2.show();
    }
}
```

#### 知识点解析
- `static` 修饰的成员变量属于**类**，不属于对象
- 所有对象共享同一个静态变量，修改一个对象的静态变量会影响所有对象
- 推荐通过 `类名.变量名` 访问静态变量（如 `Student.teacherName`），不建议通过对象引用访问
- 静态变量在**类加载时**初始化，早于对象创建
- 实例变量（`name`, `age`, `gender`）每个对象各自一份；静态变量（`teacherName`）所有对象共用一份

---

### 2. 静态工具类设计
#### 代码内容

**ArrayUtil.java**
```java
package kru.a01staticdemo2;

public class ArrayUtil {
    /* 定义数组工具类
    ●提供一个工具类方法printArr，用于返回整数数组的内容。
    返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
    ●提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
    ●定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/

    private ArrayUtil() {}

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] arr) {
        double max = 0.0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        double result = max / arr.length;
        return result;
    }
}
```

**TestDemo.java**
```java
package kru.a01staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        /* 定义数组工具类
        ●提供一个工具类方法printArr，用于返回整数数组的内容。
        返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
        ●提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
        ●定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/
        int[] numArr = {1,2,3,4,5,6};

        System.out.println(ArrayUtil.printArr(numArr));

        double[] dArr = {1.2, 3.3, 4.4, 6.6, 7.7};

        System.out.println(ArrayUtil.getAerage(dArr));
    }
}
```

#### 知识点解析
- 工具类的构造方法**私有化**（`private ArrayUtil() {}`），防止外部通过 `new` 实例化
- 工具方法使用 `static` 修饰，直接通过 `类名.方法名()` 调用，无需创建对象
- `StringBuilder` 用于高效字符串拼接，避免频繁创建 `String` 对象
- 工具类通常只包含静态方法，不维护实例状态
- 注意：`getAerage` 方法名拼写有误（应为 `getAverage`），实际开发中应注意命名规范

---

### 3. 静态方法操作集合
#### 代码内容

**Student.java**
```java
package kru.a03staticdemo3;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
```

**StudentUtil.java**
```java
package kru.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaximumAge(ArrayList<Student> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAge() > max) {
                max = arr.get(i).getAge();
            }
        }
        return max;
    }
}
```

**TestDemo.java**
```java
package kru.a03staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> studentArr = new ArrayList<>();

        studentArr.add(new Student("张三",18,"男"));
        studentArr.add(new Student("李四",20,"女"));
        studentArr.add(new Student("王五",19,"女"));

        int maximumAge = StudentUtil.getMaximumAge(studentArr);
        System.out.println(maximumAge);
    }
}
```

#### 知识点解析
- 静态方法可以接收 `ArrayList` 等集合作为参数
- 遍历集合获取最大值是常见算法模式：初始化 `max = 0`（或第一个元素值），遍历比较更新
- 工具类方法通过泛型参数操作集合中的对象，调用对象的 `getter` 方法获取数据
- 注意：当前 `max = 0` 的初始值假设年龄都为正数，更健壮的做法是用列表中第一个元素的值初始化

---

### 4. 静态方法访问限制
#### 代码内容

**Student.java**
```java
package kru.a04staticdemo4;

/*
总结：
静态方法中没有this关键字
静态方法中，只能访问静态。
非静态方法可以访问所有。
静态方法不能访问非静态的东西*/

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1(Student this) {
        System.out.println("this: " + this);
        System.out.println(this.name + ", " + this.age +
                ", " + teacherName);

        this.show2();
    }

    public void show2() {
        System.out.println("show2");
    }

    public static void method() {
        System.out.println("静态方法");
    }
}
```

**StudentTest.java**
```java
package kru.a04staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";

        Student s1 = new Student();
        System.out.println("s1: " + s1);
        s1.name = "张三";
        s1.age = 19;
        s1.show1();

        System.out.println("==================");

        Student s2 = new Student();
        System.out.println("s2: " + s2);
        s2.name = "lisi";
        s2.age = 24;
        s2.show1();
    }
}
```

#### 知识点解析
- **静态方法中没有 `this` 关键字**——因为静态方法属于类，不属于某个具体对象
- **静态方法只能访问静态成员**（静态变量、静态方法），不能直接访问非静态成员
- **非静态方法（实例方法）可以访问所有成员**——包括静态和非静态的
- 静态方法不能访问非静态的东西（变量和方法）
- `show1(Student this)` 中显式写出了 `this` 参数，这是 Java 中实例方法隐式参数的显式写法
- 静态方法 `method()` 中如果尝试访问 `name` 或 `age` 会产生编译错误

---

### 5. main方法的参数
#### 代码内容

**Test.java**
```java
package kru.a05staticdemo5;

public class Test {
    public static void main(String[] args) {
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
```

#### 知识点解析
- `main` 方法是 Java 程序的入口点，必须是 `public static void`
- `String[] args` 参数用于接收命令行传入的参数
- `args.length` 表示传入参数的个数
- 可以通过索引 `args[i]` 访问每个参数
- 运行方式：`java kru.a05staticdemo5.Test 参数1 参数2 参数3`
- `main` 方法本身就是一个静态方法，所以 JVM 可以直接通过类名调用它，无需创建对象

## 知识点总结

| 特性 | 静态成员（static） | 非静态成员（实例成员） |
|------|-------------------|---------------------|
| 归属 | 属于类 | 属于对象 |
| 内存分配 | 类加载时分配 | 创建对象时分配 |
| 访问方式 | 类名.成员名 / 对象.成员名 | 对象.成员名 |
| this关键字 | 无 | 有 |
| 共享性 | 所有对象共享 | 每个对象独立一份 |

### static 核心要点
1. **静态变量**：所有对象共享，适合存储公共数据（如班级老师名）
2. **静态方法**：不需要创建对象即可调用，适合工具方法
3. **静态代码块**：类加载时执行，用于初始化静态资源
4. **工具类设计**：私有构造 + 全部静态方法
5. **访问限制**：静态只能访问静态，非静态可以访问所有

## 常见问题

1. **什么时候使用 static？**
   - 当成员变量被所有对象共享时
   - 当方法不依赖对象状态（不需要访问实例变量）时
   - 设计工具类时

2. **静态方法能调用非静态方法吗？**
   - 不能直接调用。需要先创建对象，然后通过对象调用

3. **为什么工具类的构造方法要私有化？**
   - 防止外部通过 `new` 创建实例，工具类只需要静态方法即可使用

4. **静态变量和实例变量的区别？**
   - 实例变量：每个对象独立存储，互不影响
   - 静态变量：所有对象共享同一份，修改会影响所有对象

5. **`main` 方法为什么是 static？**
   - 因为 JVM 启动时需要直接调用 `main` 方法，此时还没有任何对象存在，所以必须是静态的

6. **注意事项**
   - 推荐通过 `类名.静态成员` 方式访问静态成员，提高代码可读性
   - 工具类方法名要规范命名（如 `getAverage` 而非 `getAerage`）
   - 求最大值时，初始值应该考虑数据范围，最好用第一个元素初始化
