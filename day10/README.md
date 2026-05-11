# Day10 Java常用API学习笔记

## 目录
- [1. ScannerDemo1 - Random类](#1-scannerdemo1---random类)
- [2. StringBuilderDemo1 - StringBuilder概述](#2-stringbuilderdemo1---stringbuilder概述)
- [3. StringBuilderDemo2 - StringBuilder构造方法](#3-stringbuilderdemo2---stringbuilder构造方法)
- [4. StringBuilderDemo3 - StringBuilder常用方法](#4-stringbuilderdemo3---stringbuilder常用方法)
- [5. StringBuilderDemo4 - StringBuilder链式编程](#5-stringbuilderdemo4---stringbuilder链式编程)
- [6. StringBuilderDemo5 - StringBuilder反转](#6-stringbuilderdemo5---stringbuilder反转)
- [7. StringBuilderDemo6 - StringBuilder长度和容量](#7-stringbuilderdemo6---stringbuilder长度和容量)
- [8. StringBuilderDemo7 - 数字字母混合验证码](#8-stringbuilderdemo7---数字字母混合验证码)
- [9. StringDemo1 - String概述](#9-stringdemo1---string概述)
- [10. StringDemo2 - String构造方法](#10-stringdemo2---string构造方法)
- [11. StringDemo3 - String创建对象区别](#11-stringdemo3---string创建对象区别)
- [12. StringDemo4 - String创建对象数量](#12-stringdemo4---string创建对象数量)
- [13. StringDemo5 - 字符串比较](#13-stringdemo5---字符串比较)
- [14. StringDemo6 - 用户登录练习](#14-stringdemo6---用户登录练习)
- [15. StringDemo7 - 遍历字符串](#15-stringdemo7---遍历字符串)
- [16. StringDemo8 - 统计字符个数](#16-stringdemo8---统计字符个数)
- [17. StringDemo9 - 拼接字符串](#17-stringdemo9---拼接字符串)
- [18. StringDemo10 - String常用方法](#18-stringdemo10---string常用方法)
- [19. StringDemo11 - 字符串截取](#19-stringdemo11---字符串截取)
- [20. StringDemo12 - 字符串替换](#20-stringdemo12---字符串替换)
- [21. StringJoinerDemo1 - StringJoiner概述](#21-stringjoinerdemo1---stringjoiner概述)
- [22. StringJoinerDemo2 - StringJoiner练习](#22-stringjoinerdemo2---stringjoiner练习)
- [23. Test1 - 身份证号隐藏](#23-test1---身份证号隐藏)
- [24. Test2 - 敏感词替换](#24-test2---敏感词替换)
- [25. Test3 - 字符串打乱](#25-test3---字符串打乱)
- [26. Test4 - StringBuilder容量和长度](#26-test4---stringbuilder容量和长度)
- [27. Test5 - 验证码生成](#27-test5---验证码生成)

---

## 1. ScannerDemo1 - Random类

### 代码位置
[ScannerDemo1.java](file:///d:/javalearn/day10/src/kru/apidemo/ScannerDemo1.java)

### 代码内容
```java
package kru.apidemo;

import java.util.Random;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
```

### 知识点解析

#### 1.1 Random类概述
- 用于生成随机数
- 位于`java.util`包中

#### 1.2 Random使用步骤
1. 导包：`import java.util.Random;`
2. 创建对象：`Random r = new Random();`
3. 生成随机数：`r.nextInt(范围)`

#### 1.3 nextInt方法
- `nextInt(n)`：生成[0, n)范围的随机整数
- `nextInt(10)`：生成0-9的随机数

### 运行结果
```
随机生成十个数字：
7
3
...
```

---

## 2. StringBuilderDemo1 - StringBuilder概述

### 代码位置
[StringBuilderDemo1.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo1.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        System.out.println(sb); // abc
    }
}
```

### 知识点解析

#### 2.1 StringBuilder概述
- 可变的字符串缓冲区
- 用于频繁修改字符串的场景
- 比String更高效

#### 2.2 String vs StringBuilder

| 特性 | String | StringBuilder |
|------|--------|---------------|
| 可变性 | 不可变 | 可变 |
| 效率 | 低（每次创建新对象） | 高（在原有对象上修改） |
| 适用场景 | 少量字符串操作 | 频繁字符串操作 |

---

## 3. StringBuilderDemo2 - StringBuilder构造方法

### 代码位置
[StringBuilderDemo2.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo2.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 创建一个空的缓冲区
        StringBuilder sb = new StringBuilder();

        // 在创建缓冲区的对象的时候，直接添加字符串内容
        StringBuilder sb2 = new StringBuilder("abc");

        System.out.println(sb);
        System.out.println(sb2);
    }
}
```

### 知识点解析

#### 3.1 构造方法

| 构造方法 | 说明 |
|---------|------|
| `new StringBuilder()` | 创建空的缓冲区，默认容量16 |
| `new StringBuilder(String str)` | 创建包含指定字符串的缓冲区 |

---

## 4. StringBuilderDemo3 - StringBuilder常用方法

### 代码位置
[StringBuilderDemo3.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo3.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 添加
        StringBuilder sb2 = sb.append("aaa");
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb == sb2); // true，同一个对象

        // 反转
        sb.reverse();
        System.out.println(sb);

        // 长度
        System.out.println(sb.length());

        // 转成String
        String str1 = sb.toString();
        System.out.println(str1);
    }
}
```

### 知识点解析

#### 4.1 常用方法

| 方法 | 说明 | 返回值 |
|------|------|--------|
| `append()` | 添加内容 | StringBuilder自身 |
| `reverse()` | 反转字符串 | StringBuilder自身 |
| `length()` | 获取长度 | int |
| `toString()` | 转换为String | String |

#### 4.2 append方法特点
- 返回的是调用者自身（this）
- `sb == sb2`为true，证明是同一个对象
- 支持链式调用

---

## 5. StringBuilderDemo4 - StringBuilder链式编程

### 代码位置
[StringBuilderDemo4.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo4.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc").reverse();
        System.out.println(sb); // cccbbbaaa
    }
}
```

### 知识点解析

#### 5.1 链式编程
- 因为append返回自身对象（this）
- 所以可以连续调用多个方法
- 代码更简洁

#### 5.2 执行过程
1. `append("aaa")` → "aaa"，返回sb
2. `.append("bbb")` → "aaabbb"，返回sb
3. `.append("ccc")` → "aaabbbccc"，返回sb
4. `.reverse()` → "cccbbbaaa"

---

## 6. StringBuilderDemo5 - StringBuilder反转

### 代码位置
[StringBuilderDemo5.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo5.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        StringBuilder result = sb.reverse();
        System.out.println(result); // 321
    }
}
```

### 知识点解析

#### 6.1 reverse方法
- 将字符串内容反转
- 返回反转后的StringBuilder对象

---

## 7. StringBuilderDemo6 - StringBuilder长度和容量

### 代码位置
[StringBuilderDemo6.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo6.java)

### 代码内容
```java
package kru.stringbuilderdemo;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0
    }
}
```

### 知识点解析

#### 7.1 容量 vs 长度

| 概念 | 方法 | 说明 |
|------|------|------|
| 容量 | `capacity()` | 最多能装多少字符 |
| 长度 | `length()` | 已经装了多少字符 |

#### 7.2 默认容量
- 默认容量：16
- 当超出容量时，自动扩容

---

## 8. StringBuilderDemo7 - 数字字母混合验证码

### 代码位置
[StringBuilderDemo7.java](file:///d:/javalearn/day10/src/kru/stringbuilderdemo/StringBuilderDemo7.java)

### 代码内容
```java
package kru.stringbuilderdemo;

import java.util.Random;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] azArr = new char[52];

        for (int i = 0; i < 26; i++) {
            azArr[i] = (char) ('A' + i);
            azArr[26 + i] = (char) ('a' + i);
        }

        Random rd = new Random();
        // 先添加四个随机字母
        for (int i = 0; i < 4; i++) {
            char c = azArr[rd.nextInt(azArr.length)];
            sb.append(c);
        }

        // 再添加一位随机数字
        int randomNum = rd.nextInt(10);
        sb.append(randomNum);

        // 打乱顺序
        for (int i = 0; i < sb.length(); i++) {
            int randomIndex = rd.nextInt(sb.length());
            char c = sb.charAt(randomIndex);
            sb.setCharAt(randomIndex, sb.charAt(i));
            sb.setCharAt(i, c);
        }

        System.out.println(sb);
    }
}
```

### 知识点解析

#### 8.1 StringBuilder其他方法

| 方法 | 说明 |
|------|------|
| `charAt(index)` | 获取指定位置的字符 |
| `setCharAt(index, ch)` | 设置指定位置的字符 |

#### 8.2 验证码生成步骤
1. 生成大小写字母数组（52个）
2. 随机选4个字母添加到sb中
3. 添加1个随机数字
4. 随机打乱顺序

---

## 9. StringDemo1 - String概述

### 代码位置
[StringDemo1.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo1.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s);
    }
}
```

### 知识点解析

#### 9.1 String概述
- String类代表字符串
- Java程序中所有字符串字面值都作为String类的实例实现
- 字符串是常量，创建后值不能更改
- 内部使用final修饰的字符数组（Java 9之后使用byte数组）

#### 9.2 String特点
- **不可变性**：一旦创建，内容无法修改
- **共享性**：相同字符串共享同一个对象（常量池）

---

## 10. StringDemo2 - String构造方法

### 代码位置
[StringDemo2.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo2.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        // 创建一个空白字符串对象
        String s1 = new String();
        System.out.println("字符串1:" + s1);

        // 根据字符数组的内容，来创建对应的字符串对象
        char[] c1 = {'a','b','c'};
        String s2 = new String(c1);
        System.out.println("字符串2:" + s2);

        // 根据字节数组的内容，来创建对应的字符串
        byte[] b1 = {97,98,99};
        String s3 = new String(b1);
        System.out.println("字符串3:" + s3);

        // 直接赋值创建
        String s4 = "abc";
        System.out.println("字符串4:" + s4);
    }
}
```

### 知识点解析

#### 10.1 String构造方法

| 构造方法 | 说明 | 示例 |
|---------|------|------|
| `new String()` | 创建空白字符串 | `""` |
| `new String(char[])` | 根据字符数组创建 | `new String({'a','b'})` → `"ab"` |
| `new String(byte[])` | 根据字节数组创建 | `new String({97,98})` → `"ab"` |
| 直接赋值 | 最常用方式 | `String s = "abc";` |

#### 10.2 字节与字符
- ASCII码：97→'a', 98→'b', 99→'c'

### 运行结果
```
字符串1:
字符串2:abc
字符串3:abc
字符串4:abc
```

---

## 11. StringDemo3 - String创建对象区别

### 代码位置
[StringDemo3.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo3.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2); // false
    }
}
```

### 知识点解析

#### 11.1 两种创建方式的区别

| 方式 | 代码 | 内存位置 | 说明 |
|------|------|---------|------|
| new创建 | `new String("abc")` | 堆内存 | 每次创建新对象 |
| 直接赋值 | `"abc"` | 常量池 | 复用已有对象 |

#### 11.2 字符串常量池
- 位于方法区
- 存储字符串常量
- 相同内容的字符串共享同一个对象

#### 11.3 == vs equals
- `==`：比较地址值
- `equals()`：比较内容

---

## 12. StringDemo4 - String创建对象数量

### 代码位置
[StringDemo4.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo4.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 == s2); // false
    }
}
```

### 知识点解析

#### 12.1 对象数量分析
```java
String s1 = new String("abc");
String s2 = new String("abc");
```
- 创建**3个对象**：
  1. 常量池中的"abc"
  2. 堆内存中s1指向的对象
  3. 堆内存中s2指向的对象

- `s1 == s2`为false，因为地址值不同

---

## 13. StringDemo5 - 字符串比较

### 代码位置
[StringDemo5.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo5.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        // == 比较地址值
        System.out.println(s1 == s2);

        // equals 比较内容，区分大小写
        System.out.println(s1.equals(s2));

        // equalsIgnoreCase 比较内容，不区分大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
```

### 知识点解析

#### 13.1 字符串比较方法

| 方法 | 说明 | 示例 |
|------|------|------|
| `==` | 比较地址值 | `s1 == s2` |
| `equals()` | 比较内容，区分大小写 | `"abc".equals("ABC")` → false |
| `equalsIgnoreCase()` | 比较内容，不区分大小写 | `"abc".equalsIgnoreCase("ABC")` → true |

---

## 14. StringDemo6 - 用户登录练习

### 代码位置
[StringDemo6.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo6.java)

### 代码内容
```java
package kru.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        String username = "zhangsan";
        String password = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String name = sc.next();
            System.out.print("请输入密码：");
            String pwd = sc.next();

            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的次数已用完");
                } else {
                    System.out.println("登录失败，用户名或密码错误，还剩" + (2 - i) + "次机会");
                }
            }
        }
    }
}
```

### 知识点解析

#### 14.1 字符串比较
- 必须使用`equals()`比较内容
- 不能用`==`，比较的是地址

#### 14.2 登录逻辑
1. 预设正确的用户名和密码
2. 最多允许3次尝试
3. 每次比较用户名和密码
4. 成功则break，失败则提示剩余次数

---

## 15. StringDemo7 - 遍历字符串

### 代码位置
[StringDemo7.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo7.java)

### 代码内容
```java
package kru.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String line = sc.next();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
```

### 知识点解析

#### 15.1 charAt方法
- `charAt(index)`：获取指定索引的字符
- 索引范围：0 ~ length()-1

#### 15.2 遍历字符串
```java
for (int i = 0; i < line.length(); i++) {
    char c = line.charAt(i);
}
```

---

## 16. StringDemo8 - 统计字符个数

### 代码位置
[StringDemo8.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo8.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "Hello 12345 World";
        int bignumCount = 0;
        int smallCount = 0;
        int numCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bignumCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println(bignumCount);
        System.out.println(smallCount);
        System.out.println(numCount);
    }
}
```

### 知识点解析

#### 16.1 字符判断
- 大写字母：`c >= 'A' && c <= 'Z'`
- 小写字母：`c >= 'a' && c <= 'z'`
- 数字：`c >= '0' && c <= '9'`

#### 16.2 计数器思想
- 定义三个计数器变量
- 遍历字符串，根据字符类型递增对应计数器

### 运行结果
```
2（大写字母：H, W）
8（小写字母：e,l,l,o,o,r,l,d）
5（数字：1,2,3,4,5）
```

---

## 17. StringDemo9 - 拼接字符串

### 代码位置
[StringDemo9.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo9.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += (arr[i] + "@");
            }
        }
        System.out.println(s); // 1@2@3
    }
}
```

### 知识点解析

#### 17.1 字符串拼接
- `+=`：拼接并赋值
- 格式化输出：用`@`分隔元素

#### 17.2 性能问题
- String频繁拼接效率低
- 大量拼接应使用StringBuilder

---

## 18. StringDemo10 - String常用方法

### 代码位置
[StringDemo10.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo10.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        String str = "Hello";

        // 截取
        System.out.println(str.substring(1)); // "ello"
        System.out.println(str.substring(1, 3)); // "el"

        // 替换
        System.out.println(str.replace("l", "L")); // "HeLLo"
    }
}
```

### 知识点解析

#### 18.1 常用方法

| 方法 | 说明 | 示例 |
|------|------|------|
| `substring(beginIndex)` | 从指定位置截取到末尾 | `"Hello".substring(1)` → "ello" |
| `substring(begin, end)` | 截取指定范围（左闭右开） | `"Hello".substring(1, 3)` → "el" |
| `replace(old, new)` | 替换字符/字符串 | `"Hello".replace("l", "L")` → "HeLLo" |

---

## 19. StringDemo11 - 字符串截取

### 代码位置
[StringDemo11.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo11.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        String str = "hello";
        String result = str.substring(1, 3);
        System.out.println(result); // "el"
    }
}
```

### 知识点解析

#### 19.1 substring范围
- **左闭右开**：包含起始位置，不包含结束位置
- `substring(1, 3)`：截取索引1和2的字符

---

## 20. StringDemo12 - 字符串替换

### 代码位置
[StringDemo12.java](file:///d:/javalearn/day10/src/kru/stringdemo/StringDemo12.java)

### 代码内容
```java
package kru.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        String str = "hello";
        String result = str.replace("ll", "aa");
        System.out.println(result); // "heaao"
    }
}
```

### 知识点解析

#### 20.1 replace方法
- 可以替换单个字符
- 也可以替换字符串
- 返回新字符串，原字符串不变

---

## 21. StringJoinerDemo1 - StringJoiner概述

### 代码位置
[StringJoinerDemo1.java](file:///d:/javalearn/day10/src/kru/stringjoinerdemo/StringJoinerDemo1.java)

### 代码内容
```java
package kru.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj); // "aaa,bbb,ccc"
    }
}
```

### 知识点解析

#### 21.1 StringJoiner概述
- 用于拼接字符串，并自动添加分隔符
- 位于`java.util`包中

#### 21.2 使用步骤
1. 导包：`import java.util.StringJoiner;`
2. 创建：`new StringJoiner(分隔符)`
3. 添加：`sj.add(内容)`
4. 输出：自动以分隔符连接

---

## 22. StringJoinerDemo2 - StringJoiner练习

### 代码位置
[StringJoinerDemo2.java](file:///d:/javalearn/day10/src/kru/stringjoinerdemo/StringJoinerDemo2.java)

### 代码内容
```java
package kru.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        System.out.println(sj); // [1, 2, 3, 4]
    }
}
```

### 知识点解析

#### 22.1 StringJoiner完整构造
```java
new StringJoiner(分隔符, 前缀, 后缀)
```

#### 22.2 示例
- 分隔符：`, `（逗号加空格）
- 前缀：`[`
- 后缀：`]`
- 结果：`[1, 2, 3, 4]`

---

## 23. Test1 - 身份证号隐藏

### 代码位置
[Test1.java](file:///d:/javalearn/day10/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

public class Test1 {
    public static void main(String[] args) {
        String IDnum = "123456199901011234";
        String str1 = IDnum.substring(0, 6);
        String str2 = IDnum.substring(14, IDnum.length());
        System.out.println(str1 + "********" + str2);
    }
}
```

### 知识点解析

#### 23.1 身份证号格式
- 前6位：地区码
- 中间8位：出生日期
- 后4位：顺序码

#### 23.2 隐藏中间位
- 截取前6位
- 截取后4位
- 中间用`********`代替

### 运行结果
```
123456********1234
```

---

## 24. Test2 - 敏感词替换

### 代码位置
[Test2.java](file:///d:/javalearn/day10/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

public class Test2 {
    public static void main(String[] args) {
        String comment = "你是傻逼吗？你个大SB、脑瘫，你他妈的蠢货";
        String[] arr = {"傻逼", "SB", "脑瘫", "他妈的", "蠢货"};
        for (int i = 0; i < arr.length; i++) {
            comment = comment.replace(arr[i], "***");
        }
        System.out.println(comment);
    }
}
```

### 知识点解析

#### 24.1 敏感词过滤
- 定义敏感词数组
- 遍历替换每个敏感词为`***`

### 运行结果
```
你是***吗？你个大***、***，你***的***
```

---

## 25. Test3 - 字符串打乱

### 代码位置
[Test3.java](file:///d:/javalearn/day10/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            Random rd = new Random();
            int random_index = rd.nextInt(0, arr.length - 1);
            char temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
```

### 知识点解析

#### 25.1 toCharArray方法
- `str.toCharArray()`：将字符串转换为字符数组

#### 25.2 洗牌算法
- 转换为数组
- 随机交换元素
- 重新拼接为字符串

---

## 26. Test4 - StringBuilder容量和长度

### 代码位置
[Test4.java](file:///d:/javalearn/day10/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 26
    }
}
```

### 知识点解析

#### 26.1 自动扩容
- 初始容量：16
- 添加26个字符后，容量自动扩展到34
- 扩容规则：`新容量 = 原容量 * 2 + 2`

---

## 27. Test5 - 验证码生成

### 代码位置
[Test5.java](file:///d:/javalearn/day10/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
        char[] code = new char[5];

        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('A' + i);
            arr[26 + i] = (char)('a' + i);
        }

        Random sc = new Random();

        // 生成5位随机数
        for (int i = 0; i < 5; i++) {
            code[i] = arr[sc.nextInt(0,arr.length)];
        }

        // 用1位随机数字替换其中1位
        code[sc.nextInt(0, code.length)] = numArr[sc.nextInt(0, numArr.length)];

        for (char c : code) {
            System.out.print(c);
        }
    }
}
```

### 知识点解析

#### 27.1 验证码规则
- 长度为5
- 4位字母（大小写均可）
- 1位数字，出现在任意位置

#### 27.2 生成步骤
1. 生成字母数组（52个大小写字母）
2. 随机选5个字母存入code数组
3. 随机选一个位置用数字替换
4. 输出验证码

### 运行结果示例
```
aB3Cd
```

---

## Day10 总结

### 核心知识点

1. **Random类**
   - 生成随机数：`nextInt(n)`

2. **String类**
   - 不可变字符串
   - 创建方式：new、直接赋值
   - 比较：equals、equalsIgnoreCase
   - 常用方法：substring、replace、charAt、length、toCharArray

3. **StringBuilder类**
   - 可变字符串
   - 常用方法：append、reverse、toString、charAt、setCharAt
   - 链式编程：方法返回自身对象
   - 容量和长度：capacity、length

4. **StringJoiner类**
   - 自动添加分隔符
   - 可设置前缀和后缀

### String vs StringBuilder vs StringJoiner

| 特性 | String | StringBuilder | StringJoiner |
|------|--------|---------------|--------------|
| 可变性 | 不可变 | 可变 | 可变 |
| 拼接效率 | 低 | 高 | 高 |
| 分隔符 | 手动添加 | 手动添加 | 自动添加 |
| 适用场景 | 少量操作 | 频繁修改 | 格式化拼接 |

### 常见问题

1. **字符串比较**：必须用equals，不能用==
2. **频繁拼接**：使用StringBuilder而非String
3. **容量扩容**：新容量 = 原容量 * 2 + 2
4. **链式调用**：方法必须返回this
5. **索引范围**：左闭右开，注意边界
