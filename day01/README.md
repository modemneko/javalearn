# Day01 Java基础学习笔记

## 目录
- [1. HelloWorld - 第一个Java程序](#1-helloworld---第一个java程序)
- [2. ScannerDemo1 - 键盘录入整数](#2-scannerdemo1---键盘录入整数)
- [3. ScannerDemo2 - 键盘录入两个整数求和](#3-scannerdemo2---键盘录入两个整数求和)
- [4. ValueDemo1 - 数据字面量](#4-valuedemo1---数据字面量)
- [5. ValueDemo2 - 制表符的使用](#5-valuedemo2---制表符的使用)
- [6. VariableDemo1 - 变量定义](#6-Variabledemo1---变量定义)
- [7. VariableDemo2 - 变量基本用法](#7-variabledemo2---变量基本用法)
- [8. VariableDemo3 - 八种基本数据类型](#8-variabledemo3---八种基本数据类型)
- [9. VariableTest - 变量练习：公交车乘客](#9-variabletest---变量练习公交车乘客)
- [10. VariableTest2 - 变量练习：个人信息](#10-variabletest2---变量练习个人信息)
- [11. VariableTest3 - 变量练习：电影信息](#11-variabletest3---变量练习电影信息)

---

## 1. HelloWorld - 第一个Java程序

### 代码位置
[HelloWorld.java](file:///d:/javalearn/day01/HelloWorld.java)

### 代码内容
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 知识点解析

#### 1.1 类定义
- `public class HelloWorld`：定义一个公开的类，类名为HelloWorld
- 类名必须与文件名一致
- 类名采用大驼峰命名法（每个单词首字母大写）

#### 1.2 main方法
- `public static void main(String[] args)`：Java程序的主入口
- `public`：公开访问修饰符
- `static`：静态修饰符，表示该方法属于类而非实例
- `void`：返回值类型，表示该方法不返回任何值
- `main`：方法名，Java程序的固定入口方法名
- `String[] args`：命令行参数数组

#### 1.3 输出语句
- `System.out.println()`：打印内容并换行
- `"Hello, World!"`：字符串字面量，用双引号包围
- 每条语句必须以分号`;`结尾

### 运行结果
```
Hello, World!
```

---

## 2. ScannerDemo1 - 键盘录入整数

### 代码位置
[ScannerDemo1.java](file:///d:/javalearn/day01/ScannerDemo1.java)

### 代码内容
```java
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入一个整数：");
        int i = sc.nextInt();
        System.out.println("你输入的数据是："+i);
    }
}
```

### 知识点解析

#### 2.1 导包
- `import java.util.Scanner;`：导入Scanner类
- 导包语句必须写在类定义的上方
- `java.util`是Scanner类所在的包

#### 2.2 创建Scanner对象
- `Scanner sc = new Scanner(System.in);`
- `new`关键字用于创建对象
- `System.in`表示标准输入流（键盘输入）
- `sc`是Scanner对象的变量名，可以自定义

#### 2.3 接收键盘输入
- `sc.nextInt()`：读取键盘输入的整数
- `nextInt()`：nextInt方法，用于接收int类型的整数
- 变量`i`记录了键盘录入的数据

#### 2.4 字符串拼接
- `"你输入的数据是："+i`：使用`+`号进行字符串拼接
- 当字符串与其他类型数据用`+`连接时，会自动转换为字符串

### 运行结果示例
```
请你输入一个整数：
666
你输入的数据是：666
```

---

## 3. ScannerDemo2 - 键盘录入两个整数求和

### 代码位置
[ScannerDemo2.java](file:///d:/javalearn/day01/ScannerDemo2.java)

### 代码内容
```java
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请你输入第二个整数：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("求和的值是："+sum);
    }
}
```

### 知识点解析

#### 3.1 多次键盘录入
- 可以多次调用`sc.nextInt()`接收多个输入
- 每次调用会等待用户输入并按回车确认

#### 3.2 变量参与运算
- `int sum = a + b;`：将两个变量相加的结果赋值给sum
- 变量可以直接参与算术运算

#### 3.3 程序执行流程
1. 提示用户输入第一个整数
2. 接收并存储到变量a
3. 提示用户输入第二个整数
4. 接收并存储到变量b
5. 计算a+b的和，存储到变量sum
6. 输出求和结果

### 运行结果示例
```
请你输入第一个整数：
10
请你输入第二个整数：
20
求和的值是：30
```

---

## 4. ValueDemo1 - 数据字面量

### 代码位置
[ValueDemo1.java](file:///d:/javalearn/day01/ValueDemo1.java)

### 代码内容
```java
public class ValueDemo1 {
    public static void main(String[] args) {
        // 整数
        System.out.println(666);
        System.out.println(-777);

        // 小数
        System.out.println(1.93);
        System.out.println(-3.71);

        // 字符串
        System.out.println("你好世界");
        System.out.println("田所浩二");

        // 字符
        System.out.println('男');
        System.out.println('女');

        // 布尔类型
        System.out.println(true);
        System.out.println(false);

        // 空
        System.out.println("null");
    }
}
```

### 知识点解析

#### 4.1 整数字面量
- 直接写的整数，如：`666`、`-777`
- 可以是正数或负数
- 默认类型是int

#### 4.2 小数字面量
- 直接写的小数，如：`1.93`、`-3.71`
- 可以是正数或负数
- 默认类型是double

#### 4.3 字符串字面量
- 用双引号`""`包围的文本
- 可以包含中文、英文、数字等任意字符
- 如：`"你好世界"`、`"田所浩二"`

#### 4.4 字符字面量
- 用单引号`''`包围的单个字符
- 如：`'男'`、`'女'`
- 只能包含一个字符

#### 4.5 布尔字面量
- 只有两个值：`true`（真）和`false`（假）
- 用于表示逻辑判断的结果

#### 4.6 空值null
- `null`表示空值，不能直接打印
- 需要用字符串形式`"null"`来打印

### 运行结果
```
666
-777
1.93
-3.71
你好世界
田所浩二
男
女
true
false
null
```

---

## 5. ValueDemo2 - 制表符的使用

### 代码位置
[ValueDemo2.java](file:///d:/javalearn/day01/ValueDemo2.java)

### 代码内容
```java
public class ValueDemo2 {
    public static void main(String[] args) {
        System.out.println("name"+"\t"+"age");
        System.out.println("tom"+"\t"+"23");
    }
}
```

### 知识点解析

#### 5.1 制表符\t
- `\t`是转义字符，表示制表符（Tab键）
- 用于对齐输出，相当于多个空格
- 可以使输出更加整齐美观

#### 5.2 字符串拼接
- 使用`+`号将多个字符串连接起来
- `"name"+"\t"+"age"` 拼接结果为 `name\tage`

### 运行结果
```
name	age
tom	23
```

---

## 6. VariableDemo1 - 变量定义

### 代码位置
[VariableDemo1.java](file:///d:/javalearn/day01/VariableDemo1.java)

### 代码内容
```java
public class VariableDemo1 {
    public static void main(String[] args) {
        // 定义变量
        // 数据类型 变量名 = 数据值;
        // 数据类型：限定了变量能存储数据的类型
        //int（整数）double（小数）
        
        int a = 10;
        System.out.println(a);  // 10
    }
}
```

### 知识点解析

#### 6.1 变量定义格式
- 格式：`数据类型 变量名 = 数据值;`
- 三要素：数据类型、变量名、数据值

#### 6.2 数据类型的作用
- 限定了变量能存储数据的类型
- `int`：用于存储整数
- `double`：用于存储小数

#### 6.3 变量的本质
- 变量是内存中的一块空间
- 用于存储数据
- 可以通过变量名访问和修改数据

### 运行结果
```
10
```

---

## 7. VariableDemo2 - 变量基本用法

### 代码位置
[VariableDemo2.java](file:///d:/javalearn/day01/VariableDemo2.java)

### 代码内容
```java
public class VariableDemo2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);// 10
        System.out.println(a);// 10
        System.out.println(a);// 10

        int b = 20;
        int c = 30;
        System.out.println(b + c);

        a = 50;
        System.out.println(a);// 50

        System.out.println("------------------");

        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int g;
        g = 500;
        System.out.println(g);
    }
}
```

### 知识点解析

#### 7.1 变量可重复使用
- 变量定义后，可以多次使用
- `System.out.println(a);`可以多次输出同一个变量

#### 7.2 变量参与计算
- `System.out.println(b + c);`：变量可以直接参与运算
- 运算时使用的是变量存储的值

#### 7.3 修改变量的值
- `a = 50;`：可以修改变量记录的值
- 修改时不需要再写数据类型
- 变量只能存储一个值，新值会覆盖旧值

#### 7.4 一条语句定义多个变量
- `int d = 100, e = 200, f = 300;`
- 同类型的变量可以在一条语句中定义
- 用逗号`,`分隔多个变量定义

#### 7.5 变量必须先赋值后使用
- `int g;`：先定义变量
- `g = 500;`：后赋值
- 变量在使用之前必须要赋值，否则会编译错误

### 运行结果
```
10
10
10
50
------------------
100
200
300
500
```

---

## 8. VariableDemo3 - 八种基本数据类型

### 代码位置
[VariableDemo3.java](file:///d:/javalearn/day01/VariableDemo3.java)

### 代码内容
```java
public class VariableDemo3 {
    public static void main(String[] args) {
        // byte
        byte b = 10;
        System.out.println(b);// 10
        // short
        short s = 20;
        System.out.println(s);// 20
        // int
        int i = 30;
        System.out.println(i);// 30
        // long
        long n = 9999999999L;
        System.out.println(n);

        // float
        float f = 10.1F;
        System.out.println(f);

        // double
        double d = 20.2;
        System.out.println(d);

        // char
        char c = '中';
        System.out.println(c);

        // boolean
        boolean o = true;
        System.out.println(o);
    }
}
```

### 知识点解析

#### 8.1 整数类型

| 类型 | 占用内存 | 取值范围 | 示例 |
|------|---------|---------|------|
| byte | 1字节 | -128 ~ 127 | `byte b = 10;` |
| short | 2字节 | -32768 ~ 32767 | `short s = 20;` |
| int | 4字节 | -2³¹ ~ 2³¹-1 | `int i = 30;` |
| long | 8字节 | -2⁶³ ~ 2⁶³-1 | `long n = 9999999999L;` |

**long类型注意事项：**
- 数据值后面需要加`L`作为后缀
- `L`可以是大写或小写
- 建议使用大写`L`，避免与数字`1`混淆

#### 8.2 浮点类型（小数类型）

| 类型 | 占用内存 | 精度 | 示例 |
|------|---------|------|------|
| float | 4字节 | 单精度 | `float f = 10.1F;` |
| double | 8字节 | 双精度 | `double d = 20.2;` |

**float类型注意事项：**
- 数据值需要加`F`作为后缀
- 不加F会被默认为double类型

#### 8.3 字符类型
- `char`：占用2字节（支持Unicode字符）
- 用单引号`''`包围
- 可以存储一个中文字符
- 示例：`char c = '中';`

#### 8.4 布尔类型
- `boolean`：只有两个值`true`和`false`
- 用于表示逻辑判断的结果
- 示例：`boolean o = true;`

### 运行结果
```
10
20
30
9999999999
10.1
20.2
中
true
```

---

## 9. VariableTest - 变量练习：公交车乘客

### 代码位置
[VariableTest.java](file:///d:/javalearn/day01/VariableTest.java)

### 代码内容
```java
public class VariableTest {
    public static void main(String[] args) {
        int count = 0;
        count += 1;
        count += 2;
        count -= 1;
        count += 2;
        count -= 1;
        count -= 1;
        count += 1;
        System.out.println(count);
    }
}
```

### 知识点解析

#### 9.1 复合赋值运算符
- `+=`：加后赋值，`count += 1` 等同于 `count = count + 1`
- `-=`：减后赋值，`count -= 1` 等同于 `count = count - 1`

#### 9.2 题目分析

| 站点 | 操作 | 计算过程 | 结果 |
|------|------|---------|------|
| 初始 | 无乘客 | count = 0 | 0 |
| 第一站 | 上去1位 | count += 1 | 1 |
| 第二站 | 上去2位，下来1位 | count += 2, count -= 1 | 2 |
| 第三站 | 上去2位，下来1位 | count += 2, count -= 1 | 3 |
| 第四站 | 下来1位 | count -= 1 | 2 |
| 第五站 | 上去1位 | count += 1 | 3 |

### 运行结果
```
3
```

---

## 10. VariableTest2 - 变量练习：个人信息

### 代码位置
[VariableTest2.java](file:///d:/javalearn/day01/VariableTest2.java)

### 代码内容
```java
public class VariableTest2 {
    public static void main(String[] args) {
        String name = "黑马谢广坤";
        int age = 18;
        char gender = '男';
        double height = 180.1;
        boolean flag = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);
    }
}
```

### 知识点解析

#### 10.1 引用数据类型String
- `String`：字符串类型，属于引用数据类型
- 用双引号`""`包围
- 可以存储任意长度的文本

#### 10.2 不同数据类型的应用场景

| 数据类型 | 变量名 | 值 | 说明 |
|---------|--------|-----|------|
| String | name | "黑马谢广坤" | 存储姓名（文本） |
| int | age | 18 | 存储年龄（整数） |
| char | gender | '男' | 存储性别（单个字符） |
| double | height | 180.1 | 存储身高（小数） |
| boolean | flag | true | 存储是否单身（布尔值） |

#### 10.3 变量命名规范
- 采用小驼峰命名法（第一个单词小写，后续单词首字母大写）
- 变量名要有意义，能够表达其存储的内容
- 不能使用Java关键字

### 运行结果
```
黑马谢广坤
18
男
180.1
true
```

---

## 11. VariableTest3 - 变量练习：电影信息

### 代码位置
[VariableTest3.java](file:///d:/javalearn/day01/VariableTest3.java)

### 代码内容
```java
public class VariableTest3 {
    public static void main(String[] args) {
        String movieName = "送初恋回家";
        String actor = "张子枫";
        String director = "刘若英";
        String type = "爱情/喜剧";
        int year = 2021;
        double score = 7.5;
        System.out.println(movieName);
        System.out.println("主演："+actor);
        System.out.println("导演："+director);
        System.out.println("类型："+type); 
        System.out.println("年份："+year);
        System.out.println("评分："+score);
    }
}
```

### 知识点解析

#### 11.1 多个String类型变量
- 可以定义多个String类型变量存储文本信息
- 电影名称、演员、导演、类型都可以用String存储

#### 11.2 字符串拼接输出
- `"主演："+actor`：将提示文字与变量值拼接
- 使输出结果更加清晰易读
- 可以使用`+`号将字符串与任意类型数据拼接

#### 11.3 综合应用
- 结合多种数据类型（String、int、double）
- 模拟实际应用场景（电影信息展示）
- 练习变量的定义、赋值和输出

### 运行结果
```
送初恋回家
主演：张子枫
导演：刘若英
类型：爱情/喜剧
年份：2021
评分：7.5
```

---

## Day01 总结

### 核心知识点

1. **Java程序基本结构**
   - 类定义：`public class 类名`
   - main方法：程序的入口
   - 输出语句：`System.out.println()`

2. **Scanner键盘录入**
   - 导包：`import java.util.Scanner;`
   - 创建对象：`Scanner sc = new Scanner(System.in);`
   - 接收数据：`sc.nextInt()`

3. **数据类型**
   - 8种基本数据类型：byte、short、int、long、float、double、char、boolean
   - 引用数据类型：String

4. **变量**
   - 定义格式：`数据类型 变量名 = 数据值;`
   - 变量必须先赋值后使用
   - 变量的值可以被修改

5. **运算符**
   - 赋值运算符：`=`
   - 复合赋值运算符：`+=`、`-=`
   - 字符串拼接：`+`

### 注意事项

1. long类型数据值后面要加`L`后缀
2. float类型数据值后面要加`F`后缀
3. 字符串用双引号`""`，字符用单引号`''`
4. 变量命名采用小驼峰命名法
5. 每条语句必须以分号`;`结尾
