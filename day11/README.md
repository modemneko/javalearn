# Day11 Java集合学习笔记

## 目录
- [1. ArrayListDemo1 - ArrayList集合概述](#1-arraylistdemo1---arraylist集合概述)
- [2. ArrayListDemo2 - ArrayList常用方法](#2-arraylistdemo2---arraylist常用方法)
- [3. Test1 - 字符串集合遍历](#3-test1---字符串集合遍历)
- [4. Test2 - 整数集合遍历](#4-test2---整数集合遍历)
- [5. Test3 - 字符集合](#5-test3---字符集合)
- [6. Test4 - 对象集合遍历](#6-test4---对象集合遍历)
- [7. Test5 - 键盘录入学生信息](#7-test5---键盘录入学生信息)
- [8. Test6 - 根据ID查找用户](#8-test6---根据id查找用户)
- [9. Test7 - 根据ID查找索引](#9-test7---根据id查找索引)
- [10. Test8 - 筛选低价手机](#10-test8---筛选低价手机)
- [11. StringTest - 字符串公共前缀](#11-stringtest---字符串公共前缀)

---

## 1. ArrayListDemo1 - ArrayList集合概述

### 代码位置
[ArrayListDemo1.java](file:///d:/javalearn/day11/src/kru/listdemo/ArrayListDemo1.java)

### 代码内容
```java
package kru.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛型：限定集合中存储数据的类型
        // ArrayList<String> list = new ArrayList<String>();
        // JDK7:
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
```

### 知识点解析

#### 1.1 ArrayList概述
- ArrayList是一个可变的数组集合
- 位于`java.util`包中
- 底层使用数组实现
- 长度可自动增长

#### 1.2 泛型
- `<String>`：限定集合只能存储String类型
- 提高类型安全性
- JDK7之后右侧可以省略类型（钻石运算符`<>`）

#### 1.3 打印特点
- 打印集合对象不是地址值
- 显示集合中的数据内容
- 用`[]`包裹所有数据

---

## 2. ArrayListDemo2 - ArrayList常用方法

### 代码位置
[ArrayListDemo2.java](file:///d:/javalearn/day11/src/kru/listdemo/ArrayListDemo2.java)

### 代码内容
```java
package kru.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 删除元素
        // boolean result1 = list.remove("aaa");
        // String result = list.remove(2);

        // 修改元素
        // String result = list.set(1,"ddd");

        // 查询元素
        // String s = list.get(0);

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
```

### 知识点解析

#### 2.1 ArrayList常用方法

| 方法 | 返回值 | 说明 |
|------|--------|------|
| `add(E e)` | boolean | 添加元素 |
| `remove(E e)` | boolean | 删除指定元素 |
| `remove(int index)` | E | 删除指定索引的元素，返回被删除的元素 |
| `set(int index, E e)` | E | 修改指定索引的元素，返回原元素 |
| `get(int index)` | E | 查询指定索引的元素 |
| `size()` | int | 获取集合长度 |

#### 2.2 遍历集合
```java
for (int i = 0; i < list.size(); i++) {
    String str = list.get(i);
    System.out.println(str);
}
```
- `i`：索引
- `list.get(i)`：元素

---

## 3. Test1 - 字符串集合遍历

### 代码位置
[Test1.java](file:///d:/javalearn/day11/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
```

### 知识点解析

#### 3.1 格式化输出
- 格式：`[元素1, 元素2, 元素3]`
- 第一个元素前加`[`
- 最后一个元素后加`]`
- 中间元素用`, `分隔

---

## 4. Test2 - 整数集合遍历

### 代码位置
[Test2.java](file:///d:/javalearn/day11/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
```

### 知识点解析

#### 4.1 基本数据类型与包装类
- ArrayList只能存储对象，不能存储基本数据类型
- **自动装箱**：`int` → `Integer`
- JDK5以后int和Integer之间可以互相转换

#### 4.2 常用包装类

| 基本类型 | 包装类 |
|---------|--------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

## 5. Test3 - 字符集合

### 代码位置
[Test3.java](file:///d:/javalearn/day11/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.add('a');
        list.add('b');
        list.add('c');

        System.out.println(list);
    }
}
```

### 知识点解析

#### 5.1 字符包装类
- `char`的包装类是`Character`
- 使用大写字母开头

---

## 6. Test4 - 对象集合遍历

### 代码位置
[Test4.java](file:///d:/javalearn/day11/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 18);
        Student stu3 = new Student("野兽", 24);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
```

### 知识点解析

#### 6.1 存储对象
- ArrayList可以存储任意类型的对象
- `ArrayList<Student>`：存储Student对象

#### 6.2 访问对象属性
```java
list.get(i).getName()  // 先获取对象，再调用方法
```

---

## 7. Test5 - 键盘录入学生信息

### 代码位置
[Test5.java](file:///d:/javalearn/day11/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入学生的年龄：");
            int age = sc.nextInt();

            list.add(i, new Student(name, age));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
```

### 知识点解析

#### 7.1 add方法指定索引
```java
list.add(i, new Student(name, age));
```
- `add(index, element)`：在指定索引处添加元素
- 索引必须合法

#### 7.2 录入流程
1. 循环5次
2. 每次录入姓名和年龄
3. 创建Student对象并添加到集合
4. 最后遍历输出

---

## 8. Test6 - 根据ID查找用户

### 代码位置
[Test6.java](file:///d:/javalearn/day11/src/kru/test/Test6.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User(1, "zhangsan", "12345678"));
        list.add(new User(2, "lisi", "12345678"));
        list.add(new User(3, "wangwu", "12345678"));

        int id = 3;

        if (search(list, id)) {
            System.out.println("用户id为" + id + "存在");
        } else {
            System.out.println("用户id为" + id + "不存在");
        }
    }

    public static boolean search(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
```

### 知识点解析

#### 8.1 查找算法
```java
public static boolean search(ArrayList<User> list, int id)
```
- 遍历集合
- 比较每个用户的id
- 找到则返回true
- 遍历完没找到返回false

---

## 9. Test7 - 根据ID查找索引

### 代码位置
[Test7.java](file:///d:/javalearn/day11/src/kru/test/Test7.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User(1, "zhangsan", "12345678"));
        list.add(new User(2, "lisi", "12345678"));
        list.add(new User(3, "wangwu", "12345678"));

        System.out.println(search(list, 3));
    }

    public static int search(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
```

### 知识点解析

#### 9.1 查找索引
- 找到返回索引
- 找不到返回-1
- 这是Java集合中`indexOf`方法的思想

---

## 10. Test8 - 筛选低价手机

### 代码位置
[Test8.java](file:///d:/javalearn/day11/src/kru/test/Test8.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        list.add(new Phone("小米",1000));
        list.add(new Phone("苹果",8000));
        list.add(new Phone("锤子",2999));

        for (int i = 0; i < getInfo(list).size(); i++) {
            System.out.println(getInfo(list).get(i).getBrand() + " " + getInfo(list).get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
```

### 知识点解析

#### 10.1 筛选算法
1. 创建新集合存储结果
2. 遍历原集合
3. 判断条件（价格<3000）
4. 符合条件的添加到新集合
5. 返回新集合

#### 10.2 代码问题
- 循环中多次调用`getInfo(list)`效率低
- 应该先调用一次，将结果存到变量中

---

## 11. StringTest - 字符串公共前缀

### 代码位置
[StringTest.java](file:///d:/javalearn/day11/src/kru/test/StringTest.java)

### 代码内容
```java
package kru.test;

public class StringTest {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String temp = str[0].substring(0,2);

        boolean flag = true;

        for (int i = 0; i < str.length; i++) {
            String str01 = str[i].substring(0,2);
            if (temp.equals(str01)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println(temp);
        } else {
            System.out.println(" ");
        }
    }
}
```

### 知识点解析

#### 11.1 公共前缀问题
- 找出字符串数组的最长公共前缀
- 此代码只比较了前2个字符

#### 11.2 代码问题
- 逻辑不够严谨
- 应该逐字符比较，直到出现不同

---

## Day11 总结

### 核心知识点

1. **ArrayList集合**
   - 可变长度的数组集合
   - 位于`java.util`包
   - 底层使用数组实现

2. **泛型**
   - `<类型>`：限定集合存储类型
   - 提高类型安全性
   - JDK7后可省略右侧类型

3. **常用方法**
   - `add()`：添加
   - `remove()`：删除
   - `set()`：修改
   - `get()`：查询
   - `size()`：获取长度

4. **包装类**
   - int → Integer
   - char → Character
   - 自动装箱和拆箱

### 数组 vs ArrayList

| 特性 | 数组 | ArrayList |
|------|------|-----------|
| 长度 | 固定 | 可变 |
| 类型 | 基本类型+对象 | 只能存对象 |
| 效率 | 高 | 略低 |
| 灵活性 | 低 | 高 |

### 常见问题

1. **泛型不能用基本类型**：必须用包装类
2. **索引越界**：确保索引在0~size()-1范围内
3. **多次调用方法**：应将结果存到变量中
4. **删除元素**：注意删除后索引会变化
