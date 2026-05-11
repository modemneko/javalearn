# Day05 Java数组与循环进阶学习笔记

## 目录
- [1. ArrayDemo1 - 数组静态初始化](#1-arraydemo1---数组静态初始化)
- [2. ArrayDemo2 - 数组索引访问](#2-arraydemo2---数组索引访问)
- [3. ArrayDemo3 - 数组遍历](#3-arraydemo3---数组遍历)
- [4. ArrayDemo4 - 数组动态初始化](#4-arraydemo4---数组动态初始化)
- [5. ArrayDemo5 - 数组索引越界](#5-arraydemo5---数组索引越界)
- [6. InfiniteloopDemo1 - 无限循环](#6-infiniteloopdemo1---无限循环)
- [7. SkipLoopDemo1 - continue跳过循环](#7-skiploopdemo1---continue跳过循环)
- [8. SkipLoopDemo2 - break结束循环](#8-skiploopdemo2---break结束循环)
- [9. ArrTest - 随机数数组练习](#9-arrtest---随机数数组练习)
- [10. ArrTest1 - 数组求和](#10-arrtest1---数组求和)
- [11. ArrTest2 - 数组统计整除个数](#11-arrtest2---数组统计整除个数)
- [12. ArrTest3 - 数组元素修改](#12-arrtest3---数组元素修改)
- [13. ArrTest4 - 数组求最大值最小值](#13-arrtest4---数组求最大值最小值)
- [14. ArrTest5 - 随机数数组综合练习](#14-arrtest5---随机数数组综合练习)
- [15. ArrTest6 - 数组反转](#15-arrtest6---数组反转)
- [16. ArrTest9 - 数组打乱顺序](#16-arrtest9---数组打乱顺序)
- [17. LoopTest1 - 逢7过游戏](#17-looptest1---逢7过游戏)
- [18. LoopTest2 - 求平方根](#18-looptest2---求平方根)
- [19. LoopTest3 - 质数判断](#19-looptest3---质数判断)
- [20. LoopTest4 - 质数判断优化思路](#20-looptest4---质数判断优化思路)
- [21. LoopTest5 - 猜数字游戏（未完成）](#21-looptest5---猜数字游戏未完成)
- [22. LoopTest7 - 猜数字游戏完整版](#22-looptest7---猜数字游戏完整版)

---

## 1. ArrayDemo1 - 数组静态初始化

### 代码位置
[ArrayDemo1.java](file:///d:/javalearn/day05/src/kru/arraydemo/ArrayDemo1.java)

### 代码内容
```java
package kru.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 格式：
        // 静态初始化
        // 完整格式：
        // 数据类型 [] 数组名 = new 数据类型[]{元素1,元素2...};
        // 简化格式：
        // 数据类型 [] 数组名 = {元素1, 元素2....};

        // 定义数组存储5个学生的年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        System.out.println(arr1); // [I@b4c966a
    }
}
```

### 知识点解析

#### 1.1 数组的概念
- 数组是一种容器，可以存储多个相同类型的数据
- 数组一旦创建，长度不可改变

#### 1.2 静态初始化的两种格式

**完整格式：**
```java
数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, ...};
```
示例：`int[] arr1 = new int[]{11, 12, 13, 14, 15};`

**简化格式：**
```java
数据类型[] 数组名 = {元素1, 元素2, ...};
```
示例：`int[] arr2 = {11, 12, 13, 14};`

#### 1.3 不同类型数组示例

```java
// 存储学生年龄（整数）
int[] arr1 = new int[]{11,12,13,14,15};

// 存储学生姓名（字符串）
String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};

// 存储学生身高（小数）
double[] arr5 = new double[]{1.93,1.75,1.73,1.81};
```

#### 1.4 数组地址值说明

直接打印数组会得到地址值，如：`[I@b4c966a`

**地址值格式解析：**
- `[`：表示当前是一个数组
- `I`：表示数组元素是int类型（D表示double，S表示String等）
- `@`：分隔符（固定格式）
- `b4c966a`：数组真正的地址值（十六进制）

### 运行结果
```
[I@b4c966a
```

---

## 2. ArrayDemo2 - 数组索引访问

### 代码位置
[ArrayDemo2.java](file:///d:/javalearn/day05/src/kru/arraydemo/ArrayDemo2.java)

### 代码内容
```java
package kru.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 利用索引对数组中的元素进行访问
        // 1.获取数组里面的要元素
        // 数组名[索引]

        int[] arr = {1,2,3,4,5};
        // 获取数组中的第一个元素
        // 其实就是0索引上对应的元素
        //int number = arr[0];
        //System.out.println(number);//1

        // 获取数组中1索引上对应的数据，并直接打印出来
        //System.out.println(arr[1]);//2

        // 2.把数据存到数组当中
        //格式：数组名[索引] = 具体数据/变量;
        //细节：一旦覆盖了之后，原来的数据就不存在了
        arr[0] = 100;

        System.out.println(arr[0]);//100
    }
}
```

### 知识点解析

#### 2.1 数组索引
- 索引：数组中每个元素的位置编号
- **索引从0开始**
- 最大索引 = 数组长度 - 1

#### 2.2 获取数组元素
```java
数组名[索引]
```
示例：
- `arr[0]`：获取第一个元素
- `arr[1]`：获取第二个元素

#### 2.3 修改数组元素
```java
数组名[索引] = 新值;
```
示例：`arr[0] = 100;`

#### 2.4 注意事项
- 一旦覆盖后，原来的数据就不存在了
- 索引必须是整数
- 索引不能超过数组的最大索引

### 运行结果
```
100
```

---

## 3. ArrayDemo3 - 数组遍历

### 代码位置
[ArrayDemo3.java](file:///d:/javalearn/day05/src/kru/arraydemo/ArrayDemo3.java)

### 代码内容
```java
package kru.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1, 2, 3, 4, 5};
        // 获取数组里面所有的元素
        // 格式：数组名[索引]

        // 利用循环改进代码
        // 开始条件：0
        // 结束条件：数组的长度 - 1（最大索引）
        
        // 在Java当中，关于数组的一个长度属性，length
        // 调用方式：数组名.length
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            //i: 0 1 2 3 4
            System.out.println(arr[i]);
        }
    }
}
```

### 知识点解析

#### 3.1 数组遍历
- 遍历：依次访问数组中的每个元素
- 使用for循环配合索引遍历

#### 3.2 数组长度属性
```java
数组名.length
```
- 获取数组的长度（元素个数）
- 是数组的属性，不是方法（不需要括号）

#### 3.3 遍历数组的标准写法
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

**参数说明：**
- 初始化：`i = 0`（从第一个索引开始）
- 条件：`i < arr.length`（到最后一个索引结束）
- 变化：`i++`（每次递增1）

#### 3.4 为什么不用`i <= arr.length - 1`
- 虽然等价，但`i < arr.length`更简洁
- 是Java编程的标准写法

### 运行结果
```
1
2
3
4
5
```

---

## 4. ArrayDemo4 - 数组动态初始化

### 代码位置
[ArrayDemo4.java](file:///d:/javalearn/day05/src/kru/arraydemo/ArrayDemo4.java)

### 代码内容
```java
package kru.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*定义一个数组，用来存班级中50个学生的姓名
        姓名未知，等学生报道之后，再进行添加*/

        // 格式：
        // 数据类型[] 数组名 = new 数据类型[数组长度];
        // 在创建的时候，由我们自己制定数组的长度，由虚拟机给出默认的初始化值

        String[] arr = new String[50];
        //添加学生
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印出来的时候默认初始化值null

        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'\u0000' 空格
        //布尔类型：默认初始化值false
        //引用数据类型：默认初始化值 null
        int[] arr2 = new int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
    }
}
```

### 知识点解析

#### 4.1 动态初始化格式
```java
数据类型[] 数组名 = new 数据类型[数组长度];
```
示例：`String[] arr = new String[50];`

#### 4.2 动态初始化的特点
- 只指定数组长度，不指定初始值
- 由虚拟机给出默认初始化值
- 适用于事先不知道具体值的场景

#### 4.3 默认初始化值规则

| 数据类型 | 默认初始化值 | 示例 |
|---------|-------------|------|
| 整数类型（byte, short, int, long） | 0 | `int[] arr = new int[3];` → `[0, 0, 0]` |
| 小数类型（float, double） | 0.0 | `double[] arr = new double[2];` → `[0.0, 0.0]` |
| 字符类型（char） | '\u0000' | 空字符 |
| 布尔类型（boolean） | false | `boolean[] arr = new boolean[2];` → `[false, false]` |
| 引用数据类型（String等） | null | `String[] arr = new String[2];` → `[null, null]` |

#### 4.4 静态初始化 vs 动态初始化

| 特性 | 静态初始化 | 动态初始化 |
|------|-----------|-----------|
| 格式 | `int[] arr = {1, 2, 3};` | `int[] arr = new int[3];` |
| 适用场景 | 已知具体值 | 只知道长度 |
| 初始值 | 手动指定 | 系统默认 |

### 运行结果
```
zhangsan
lisi
null
0
0
0
```

---

## 5. ArrayDemo5 - 数组索引越界

### 代码位置
[ArrayDemo5.java](file:///d:/javalearn/day05/src/kru/arraydemo/ArrayDemo5.java)

### 代码内容
```java
package kru.arraydemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5};
        //长度：5
        //最小索引：0
        //最大索引：4（数组的长度 - 1）
        System.out.println(arr[2]);

        //小结：
        //索引越界异常
        //原因：访问了不存在的索引
        //避免：索引的范围

    }
}
```

### 知识点解析

#### 5.1 数组索引范围
- **最小索引**：0
- **最大索引**：数组长度 - 1
- **有效索引范围**：0 ~ 数组长度-1

#### 5.2 示例分析
```java
int[] arr = {1,2,3,4,5};
```
- 长度：5
- 最小索引：0
- 最大索引：4
- 有效索引：0, 1, 2, 3, 4

#### 5.3 索引越界异常
**异常名称**：`ArrayIndexOutOfBoundsException`

**产生原因**：
- 访问了不存在的索引
- 例如：`arr[5]`、`arr[-1]`

**避免方法**：
- 确保索引在有效范围内
- 使用`arr.length`控制循环边界

### 运行结果
```
3
```

---

## 6. InfiniteloopDemo1 - 无限循环

### 代码位置
[InfiniteloopDemo1.java](file:///d:/javalearn/day05/src/kru/infiniteloop/InfiniteloopDemo1.java)

### 代码内容
```java
package kru.infiniteloop;

public class InfiniteloopDemo1 {
    public static void main(String[] args) {
        // for格式的无限循环
        /* for (;;) {
            System.out.println("学习");
        }*/
        // while格式的无限循环
        /*while (true) {
            System.out.println("学习");
        }*/
        // 无限循环的下面不能再写其他代码了，因为循环永远停不下来，那么下面的代码永远执行不到
        while (true) {
            System.out.println("给女神表白");
        }
        // System.out.println("女神答应我了");
    }
}
```

### 知识点解析

#### 6.1 无限循环的两种格式

**for格式：**
```java
for (;;) {
    循环体;
}
```

**while格式：**
```java
while (true) {
    循环体;
}
```

#### 6.2 无限循环的特点
- 条件永远为true
- 循环永远不会停止
- **无限循环下面不能再写其他代码**（永远执行不到）

#### 6.3 应用场景
- 服务器监听
- 游戏主循环
- 需要手动break退出的场景

#### 6.4 注意事项
- 无限循环必须配合break使用
- 否则程序会一直运行下去

---

## 7. SkipLoopDemo1 - continue跳过循环

### 代码位置
[SkipLoopDemo1.java](file:///d:/javalearn/day05/src/kru/skiploop/SkipLoopDemo1.java)

### 代码内容
```java
package kru.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        // 跳过某一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 结束本次循环，继续下次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
```

### 知识点解析

#### 7.1 continue关键字
- **作用**：结束本次循环，继续下一次循环
- **不影响循环次数**

#### 7.2 执行流程
1. i = 1：输出"小老虎在吃第1个包子"
2. i = 2：输出"小老虎在吃第2个包子"
3. i = 3：执行continue，跳过本次循环
4. i = 4：输出"小老虎在吃第4个包子"
5. i = 5：输出"小老虎在吃第5个包子"

#### 7.3 continue vs break

| 关键字 | 作用 | 循环次数 |
|--------|------|---------|
| continue | 跳过本次循环 | 不减少 |
| break | 结束整个循环 | 减少 |

### 运行结果
```
小老虎在吃第1个包子
小老虎在吃第2个包子
小老虎在吃第4个包子
小老虎在吃第5个包子
```

---

## 8. SkipLoopDemo2 - break结束循环

### 代码位置
[SkipLoopDemo2.java](file:///d:/javalearn/day05/src/kru/skiploop/SkipLoopDemo2.java)

### 代码内容
```java
package kru.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        // 结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                // 结束整个循环
                break;
            }
        }
    }
}
```

### 知识点解析

#### 8.1 break关键字
- **作用**：结束整个循环
- **循环提前结束**

#### 8.2 执行流程
1. i = 1：输出"小老虎在吃第1个包子"
2. i = 2：输出"小老虎在吃第2个包子"
3. i = 3：输出"小老虎在吃第3个包子"，然后执行break
4. 循环结束，i = 4和i = 5不会执行

#### 8.3 break的位置
- break通常在if语句内部
- 满足某个条件时才结束循环

### 运行结果
```
小老虎在吃第1个包子
小老虎在吃第2个包子
小老虎在吃第3个包子
```

---

## 9. ArrTest - 随机数数组练习

### 代码位置
[ArrTest.java](file:///d:/javalearn/day05/src/kru/test/ArrTest.java)

### 代码内容
```java
package kru.test;

import java.util.ArrayList;
import java.util.Random;

public class ArrTest {
    public static Ar ar = new Ar(1);
    public static void main(String[] args) {
        /* 遍历数组求和
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/

        // 定义数组
        int[] arr = new int[10];
        // 把随机数存入到数组当中
        Random r = new Random();

        for (int i : arr) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(1, 100);
            // 把随机数存入到数组当中
            // 数组名[索引] = 数据;
            arr[i] = number;
        }
        int he = 0;
        for (int i =0 ; i < arr.length ; i++) {
            he += arr[i];
        }
        float average = he / arr.length;
        for (int i =0 ; i < arr.length ; i++) {
            if (arr[i] < average) ar.add(arr[i]);
        }
    }

    static class Ar{
        public float[] items;
        public int size;

        public Ar(int size){
            this.size = size;
            items = new float[size];
        }

        public void add(float value){
            if (size == items.length){
                float[] newitem = new float[size*2];
                System.arraycopy(items,0,newitem,0,Math.min(size,size*2));
                this.items = newitem;
            }
            items[size++] = value;
        }
    }
}
```

### 知识点解析

#### 9.1 Random类的使用
```java
Random r = new Random();
int number = r.nextInt(1, 100);  // 生成1~99之间的随机数
```

#### 9.2 代码问题
**注意**：此代码存在bug
- `for (int i : arr)` 是增强for循环
- `i`得到的是数组元素的值，不是索引
- 应该使用普通for循环：`for (int i = 0; i < arr.length; i++)`

#### 9.3 正确的实现思路
1. 定义数组
2. 生成随机数存入数组
3. 遍历求和
4. 计算平均值
5. 统计比平均值小的个数

### 说明
此代码包含自定义的可变数组类Ar，实际应使用ArrayList。

---

## 10. ArrTest1 - 数组求和

### 代码位置
[ArrTest1.java](file:///d:/javalearn/day05/src/kru/test/ArrTest1.java)

### 代码内容
```java
package kru.test;

public class ArrTest1 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5
        遍历数组得到每一个元素，求数组里面所有数据和*/

        int[] arr1 = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            // i 表示数组里面的每一个索引
            sum += arr1[i];
        }

        System.out.println("数组里面所有数据和：" + sum);
    }
}
```

### 知识点解析

#### 10.1 数组求和思想
```java
int sum = 0;  // 累加器
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];  // 累加每个元素
}
```

#### 10.2 执行过程

| 循环次数 | i | arr[i] | sum |
|---------|---|--------|-----|
| 初始 | - | - | 0 |
| 第1次 | 0 | 1 | 1 |
| 第2次 | 1 | 2 | 3 |
| 第3次 | 2 | 3 | 6 |
| 第4次 | 3 | 4 | 10 |
| 第5次 | 4 | 5 | 15 |

### 运行结果
```
数组里面所有数据和：15
```

---

## 11. ArrTest2 - 数组统计整除个数

### 代码位置
[ArrTest2.java](file:///d:/javalearn/day05/src/kru/test/ArrTest2.java)

### 代码内容
```java
package kru.test;

public class ArrTest2 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                count += 1;
            }
        }
        System.out.println("数组里面一共有" + count + "个能被3整除的数字");
    }
}
```

### 知识点解析

#### 11.1 计数器思想
```java
int count = 0;  // 计数器
for (int i = 0; i < arr.length; i++) {
    if (符合条件) {
        count += 1;  // 符合条件时计数器加1
    }
}
```

#### 11.2 判断整除
- `arr1[i] % 3 == 0`：判断是否能被3整除
- 取模结果为0表示能整除

#### 11.3 符合条件的数字
- 数组：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
- 能被3整除：3, 6, 9
- 共3个

### 运行结果
```
数组里面一共有3个能被3整除的数字
```

---

## 12. ArrTest3 - 数组元素修改

### 代码位置
[ArrTest3.java](file:///d:/javalearn/day05/src/kru/test/ArrTest3.java)

### 代码内容
```java
package kru.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素。
        要求：
        1，如果是奇数，则将当前数字扩大两倍
        2，如果是偶数，则将当前数字变成二分之一*/
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }

        //遍历数组
        //一个循环进来只做一件事情。
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### 知识点解析

#### 12.1 修改数组元素
```java
arr[i] /= 2;  // 等价于 arr[i] = arr[i] / 2;
arr[i] *= 2;  // 等价于 arr[i] = arr[i] * 2;
```

#### 12.2 奇偶判断
- `arr[i] % 2 == 0`：偶数
- `arr[i] % 2 != 0`：奇数

#### 12.3 处理结果

| 原值 | 奇偶 | 操作 | 结果 |
|------|------|------|------|
| 1 | 奇数 | ×2 | 2 |
| 2 | 偶数 | ÷2 | 1 |
| 3 | 奇数 | ×2 | 6 |
| 4 | 偶数 | ÷2 | 2 |
| 5 | 奇数 | ×2 | 10 |
| 6 | 偶数 | ÷2 | 3 |
| 7 | 奇数 | ×2 | 14 |
| 8 | 偶数 | ÷2 | 4 |
| 9 | 奇数 | ×2 | 18 |
| 10 | 偶数 | ÷2 | 5 |

#### 12.4 编程原则
- **一个循环只做一件事情**
- 修改数据和遍历输出应该分开两个循环

### 运行结果
```
2
1
6
2
10
3
14
4
18
5
```

---

## 13. ArrTest4 - 数组求最大值最小值

### 代码位置
[ArrTest4.java](file:///d:/javalearn/day05/src/kru/test/ArrTest4.java)

### 代码内容
```java
package kru.test;

public class ArrTest4 {
    public static void main(String[] args) {
        // 定义数组求最大值：33,5,22,44,55

        //定义数组
        int[] arr = {33,5,22,44,55};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);

        //最小值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("最小值是：" + max);
    }
}
```

### 知识点解析

#### 13.1 求最大值思想
```java
int max = arr[0];  // 假设第一个元素是最大值
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];  // 更新最大值
    }
}
```

#### 13.2 执行过程（求最大值）

| 循环次数 | i | arr[i] | max | 说明 |
|---------|---|--------|-----|------|
| 初始 | - | - | 33 | 假设arr[0]最大 |
| 第1次 | 0 | 33 | 33 | 33不大于33 |
| 第2次 | 1 | 5 | 33 | 5不大于33 |
| 第3次 | 2 | 22 | 33 | 22不大于33 |
| 第4次 | 3 | 44 | 44 | 44>33，更新max |
| 第5次 | 4 | 55 | 55 | 55>44，更新max |

#### 13.3 为什么max初始化为arr[0]
- 不能初始化为0
- 如果数组全是负数，结果会是0，这是错误的
- 应该初始化为数组中的某个元素

#### 13.4 代码问题
求最小值时使用了同一个变量max，这是错误的
应该使用单独的min变量

### 运行结果
```
最大值是：55
最小值是：5
```

---

## 14. ArrTest5 - 随机数数组综合练习

### 代码位置
[ArrTest5.java](file:///d:/javalearn/day05/src/kru/test/ArrTest5.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /* 遍历数组求和
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/

        // 定义数组
        int[] arr = new int[10];
        // 把随机数存入到数组当中
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
           // 每循环1此就会生成一个新的随机数
           int number = r.nextInt(1,100);
           // 把生成的随机数添加到数组当中
            //数组名[索引] = 数据;
            arr[i] = number;
        }

        // 遍历数组
        int sum = 0;
        // 求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组所有数据的和为"+sum);

        // 求平均数
        int arange = sum / arr.length;
        System.out.println("平均数" + arange);

        // 统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arange>arr[i]) {
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均值小");

        // 遍历数组，验证答案
        // 验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### 知识点解析

#### 14.1 综合练习流程
1. **生成随机数**：使用Random类
2. **存入数组**：`arr[i] = number`
3. **求和**：遍历累加
4. **求平均值**：`sum / arr.length`
5. **统计**：遍历比较

#### 14.2 Random类
```java
Random r = new Random();
int number = r.nextInt(1, 100);  // 生成[1, 100)范围的随机数
```

#### 14.3 整数除法
- `int arange = sum / arr.length;`
- 整数除法会舍去小数部分
- 如果需要精确平均值，使用double类型

#### 14.4 编程建议
- 每个功能独立成一个循环
- 最后遍历验证结果

### 运行结果示例
```
数组所有数据的和为523
平均数52
有5个数据比平均值小
45
67
23
...
```

---

## 15. ArrTest6 - 数组反转

### 代码位置
[ArrTest6.java](file:///d:/javalearn/day05/src/kru/test/ArrTest6.java)

### 代码内容
```java
package kru.test;

public class ArrTest6 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
        交换前：1,2,3,4,5
        交换后：5,2,3,4,1*/

        int[] arr1 = {1,2,3,4,5};
        // 利用循环去交换数据
        for (int i = 0,j = arr1.length - 1; i < j; i++,j--) {
            // 交换变量i和变量j指向的元素
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        // 当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}
```

### 知识点解析

#### 15.1 数组反转算法
**双指针法**：
- 一个指针从头部开始（i = 0）
- 一个指针从尾部开始（j = length-1）
- 两个指针向中间移动，交换元素

#### 15.2 交换两个变量的值
```java
int temp = arr1[i];    // 临时保存arr1[i]
arr1[i] = arr1[j];     // 将arr1[j]赋值给arr1[i]
arr1[j] = temp;        // 将临时保存的值赋给arr1[j]
```

#### 15.3 循环条件
```java
for (int i = 0, j = arr1.length - 1; i < j; i++, j--)
```
- 初始化：i从0开始，j从最大索引开始
- 条件：`i < j`（当i >= j时说明已经交换完毕）
- 变化：i递增，j递减

#### 15.4 执行过程

| 循环次数 | i | j | 交换前 | 交换后 |
|---------|---|---|--------|--------|
| 第1次 | 0 | 4 | [1,2,3,4,5] | [5,2,3,4,1] |
| 第2次 | 1 | 3 | [5,2,3,4,1] | [5,4,3,2,1] |
| 结束 | 2 | 2 | i不小于j，循环结束 |

### 运行结果
```
54321
```

---

## 16. ArrTest9 - 数组打乱顺序

### 代码位置
[ArrTest9.java](file:///d:/javalearn/day05/src/kru/test/ArrTest9.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        // 定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
        // 难点：如何获取数组中的随机索引
        int[] arr = {1,2,3,4,5};
        // 索引范围：0 1 2 3 4
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            // 生成随机索引
            int random_index = r.nextInt(0, arr.length);
            // 拿着随机索引指向的元素 跟 i 指向那个的元素进行交换
            int temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        // 当循环结束之后，那么数组当中的所有的数据已经打乱顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
```

### 知识点解析

#### 16.1 打乱数组算法
**随机交换法**：
1. 遍历数组每个位置
2. 生成一个随机索引
3. 将当前位置元素与随机索引位置的元素交换

#### 16.2 随机索引生成
```java
int random_index = r.nextInt(0, arr.length);
```
- 生成[0, arr.length)范围的随机索引

#### 16.3 应用场景
- 扑克牌洗牌
- 随机播放音乐
- 抽奖程序

### 运行结果示例
```
31524
```

---

## 17. LoopTest1 - 逢7过游戏

### 代码位置
[LoopTest1.java](file:///d:/javalearn/day05/src/kru/test/LoopTest1.java)

### 代码内容
```java
package kru.test;

public class LoopTest1 {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏：逢7过
        游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过
        需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/

        // 个位7 || 十位7 || 7倍数

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
```

### 知识点解析

#### 17.1 逢7过规则
需要说"过"的情况：
1. **个位是7**：`i % 10 == 7`
2. **十位是7**：`i / 10 % 10 == 7`
3. **7的倍数**：`i % 7 == 0`

#### 17.2 判断条件

| 条件 | 代码 | 示例 |
|------|------|------|
| 个位是7 | `i % 10 == 7` | 7, 17, 27, 37... |
| 十位是7 | `i / 10 % 10 == 7` | 70, 71, 72, 73... |
| 7的倍数 | `i % 7 == 0` | 7, 14, 21, 28... |

#### 17.3 continue的使用
- 满足条件时输出"过"
- 使用continue跳过后续代码
- 不满足条件才输出数字

### 运行结果（部分）
```
1
2
3
4
5
6
过
8
9
10
...
```

---

## 18. LoopTest2 - 求平方根

### 代码位置
[LoopTest2.java](file:///d:/javalearn/day05/src/kru/test/LoopTest2.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数×，计算并返回x的平方根。
        结果只保留整数部分，小数部分将被舍去。*/

        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个大于等于2的整数：");
        int number = sc.nextInt();

        // 开始：1 结束：小于number
        for (int i = 1; i < number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                // 一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "的平方根的整数部分");
                break;
            }
        }
    }
}
```

### 知识点解析

#### 18.1 算法思路
从1开始循环，拿着数字的平方跟原来的数字进行比较：
- 如果`i * i == number`：找到了精确的平方根
- 如果`i * i > number`：前一个数字`(i-1)`就是平方根的整数部分

#### 18.2 示例分析（number = 10）

| i | i*i | 比较结果 | 说明 |
|---|-----|---------|------|
| 1 | 1 | < 10 | 继续 |
| 2 | 4 | < 10 | 继续 |
| 3 | 9 | < 10 | 继续 |
| 4 | 16 | > 10 | 3是平方根的整数部分 |

#### 18.3 示例分析（number = 16）

| i | i*i | 比较结果 | 说明 |
|---|-----|---------|------|
| 1 | 1 | < 16 | 继续 |
| 2 | 4 | < 16 | 继续 |
| 3 | 9 | < 16 | 继续 |
| 4 | 16 | == 16 | 4就是平方根 |

#### 18.4 break优化效率
- 一旦找到结果就break退出
- 避免不必要的循环
- 提高代码运行效率

### 运行结果示例
```
请输入一个大于等于2的整数：10
3就是10的平方根的整数部分
```

---

## 19. LoopTest3 - 质数判断

### 代码位置
[LoopTest3.java](file:///d:/javalearn/day05/src/kru/test/LoopTest3.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        // 需求：键盘录入一个正整数 x，判断该数是否为一个质数

        //质数：
        //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        // 定义一个变量，表示标记
        // 标记着number是否为一个质数
        // true 是一个质数
        // false 不是一个质数
        boolean flag = true;

        // 判断
        // 写一个循环，从2开始判断：已知判断到number-1为止
        // 看这个范围之内，有没有数字可以被number整除

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        // 只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        // 此时才能判定number是一个质数
        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
    }
}
```

### 知识点解析

#### 19.1 质数定义
- 只能被1和本身整除的正整数
- 例如：2, 3, 5, 7, 11, 13...
- 1既不是质数也不是合数

#### 19.2 标记变量（flag）思想
```java
boolean flag = true;  // 假设是质数
for (int i = 2; i < number; i++) {
    if (number % i == 0) {
        flag = false;  // 发现能整除，标记为false
        break;         // 找到证据后无需继续判断
    }
}
```

#### 19.3 判断流程
1. 假设number是质数（flag = true）
2. 从2开始到number-1，逐个判断是否能整除
3. 如果发现能整除，标记flag = false，并break
4. 循环结束后，根据flag的值判断结果

#### 19.4 为什么从2开始
- 所有数都能被1整除
- 不需要判断1
- 从2开始判断即可

### 运行结果示例
```
请输入一个正整数：7
7是一个质数
```

---

## 20. LoopTest4 - 质数判断优化思路

### 代码位置
[LoopTest4.java](file:///d:/javalearn/day05/src/kru/test/LoopTest4.java)

### 代码内容
```java
package kru.test;

public class LoopTest4 {
    public static void main(String[] args) {
        // 推荐一个简化的思路
        // 81
        // 1 * 81
        // 3 * 27
        // 9 * 9

        //以81的平方根9为中心
        //而且假设a*b =81
        //那么a和b中，其中有一个必定是小于等于9的。
        //另一个是大于等于9的。
        //其中一个数字一定是小于等于平方根
        //另外一个数字一定是大于等于平方根

        int number = 100;
        //如果这个范围之内，所有的数字都不能被number整除
        //那么number就一定是一个质数。
        /*for (int i = 2; i < number的平方根; i++) {
            
        }*/
    }
}
```

### 知识点解析

#### 20.1 优化思路
**只需要判断到平方根即可**

以81为例：
- 1 × 81 = 81
- 3 × 27 = 81
- 9 × 9 = 81

#### 20.2 数学原理
- 如果number = a × b
- 那么a和b中，必定有一个小于等于√number
- 所以只需要判断到√number即可

#### 20.3 效率对比

| number | 原始方法循环次数 | 优化方法循环次数 |
|--------|----------------|----------------|
| 100 | 98次 | 9次 |
| 10000 | 9998次 | 99次 |
| 100000 | 99998次 | 316次 |

#### 20.4 优化代码
```java
for (int i = 2; i <= Math.sqrt(number); i++) {
    if (number % i == 0) {
        flag = false;
        break;
    }
}
```

---

## 21. LoopTest5 - 猜数字游戏（未完成）

### 代码位置
[LoopTest5.java](file:///d:/javalearn/day05/src/kru/test/LoopTest5.java)

### 代码内容
```java
package kru.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        // 先获取一个随机数
        // 范围：0~10

        // 创建对象
        Random r = new Random();

        // 生成随机数
        int number = r.nextInt(1,101);

        Scanner input = new Scanner(System.in);
        System.out.printf("请输入一个数字来玩猜数字：");
        int sc = input.nextInt();
    }
}
```

### 说明
此文件是猜数字游戏的未完成版本，缺少循环和判断逻辑。

---

## 22. LoopTest7 - 猜数字游戏完整版

### 代码位置
[LoopTest7.java](file:///d:/javalearn/day05/src/kru/test/LoopTest7.java)

### 代码内容
```java
package kru.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        // 程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少？

        int count = 0;

        // 生成一个1~100之间的随机数字
        Random r = new Random();
        // 注意：这个生成随机数的代码是不能写在循环里的，否则每次都会产生新的随机数
        int number = r.nextInt(1,101);

        // 猜这个数字是多少
        Scanner sc = new Scanner(System.in);

        // 判断两个数字给出不同的提示

        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
```

### 知识点解析

#### 22.1 游戏流程
1. 生成随机数（在循环外）
2. 用户输入猜测数字
3. 比较并给出提示
4. 猜中或达到次数限制时退出

#### 22.2 关键注意点
- **随机数生成必须在循环外**
- 否则每次循环都会生成新的随机数
- 游戏无法进行

#### 22.3 判断逻辑

| 情况 | 提示 |
|------|------|
| guessNumber > number | "大了" |
| guessNumber < number | "小了" |
| guessNumber == number | "猜中了" |

#### 22.4 次数限制
- `count`记录猜测次数
- 达到3次自动退出
- 模拟游戏的保底机制

### 运行结果示例
```
请输入你要猜的数字：
50
大了
请输入你要猜的数字：
25
小了
请输入你要猜的数字：
37
猜中了
```

---

## Day05 总结

### 核心知识点

1. **数组**
   - 静态初始化：`int[] arr = {1, 2, 3};`
   - 动态初始化：`int[] arr = new int[5];`
   - 索引访问：`arr[0]`
   - 数组长度：`arr.length`
   - 默认初始化值：整数0、小数0.0、布尔false、引用null

2. **循环控制**
   - continue：跳过本次循环
   - break：结束整个循环
   - 无限循环：`while(true)` 或 `for(;;)`

3. **数组常见算法**
   - 求和：累加器
   - 求最大值：假设第一个最大，逐个比较
   - 求最小值：假设第一个最小，逐个比较
   - 统计个数：计数器
   - 数组反转：双指针法
   - 数组打乱：随机交换法

4. **Random类**
   - 生成随机数：`r.nextInt(min, max)`
   - 随机数生成不能在循环内（如果需要固定随机数）

5. **标记变量思想**
   - 使用boolean变量标记状态
   - 循环结束后根据标记判断结果

### 常见问题

1. **索引越界**：确保索引在0 ~ length-1范围内
2. **增强for循环**：`for(int i : arr)`得到的是值不是索引
3. **随机数位置**：需要固定随机数时，生成代码写在循环外
4. **循环只做一件事**：修改数据和输出应该分开循环
5. **求最值初始化**：应该初始化为数组元素，不能初始化为0
