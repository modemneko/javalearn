# Day04 Java流程控制语句学习笔记

## 目录
- [1. IfDemo1 - if语句第一种格式](#1-ifdemo1---if语句第一种格式)
- [2. IfDemo2 - if语句的注意点](#2-ifdemo2---if语句的注意点)
- [3. ForDemo1 - for循环基本使用](#3-fordemo1---for循环基本使用)
- [4. OrderDemo - 顺序结构](#4-orderdemo---顺序结构)
- [5. SwitchDemo1 - switch语句基本使用](#5-switchdemo1---switch语句基本使用)
- [6. SwitchDemo2 - default的位置和省略](#6-switchdemo2---default的位置和省略)
- [7. SwitchDemo3 - case穿透现象](#7-switchdemo3---case穿透现象)
- [8. SwitchDemo4 - 空文件](#8-switchdemo4---空文件)
- [9. SwitchDemo5 - 空文件](#9-switchdemo5---空文件)
- [10. Test1 - if练习：考试奖励](#10-test1---if练习考试奖励)
- [11. Test2 - if-else if练习：红绿灯](#11-test2---if-else-if练习红绿灯)
- [12. Test3 - if-else练习：吃饭选择](#12-test3---if-else练习吃饭选择)
- [13. Test4 - if-else练习：付款判断](#13-test4---if-else练习付款判断)
- [14. Test5 - if嵌套练习：电影院选座](#14-test5---if嵌套练习电影院选座)
- [15. Test6 - if-else if多分支练习：分数礼物](#15-test6---if-else-if多分支练习分数礼物)
- [16. Test7 - if-else if练习：VIP会员折扣](#16-test7---if-else-if练习vip会员折扣)
- [17. Test8 - if-else if练习：红绿灯（重复）](#17-test8---if-else-if练习红绿灯重复)
- [18. Test9 - switch练习：运动计划](#18-test9---switch练习运动计划)
- [19. Test12 - for循环：正序和倒序打印](#19-test12---for循环正序和倒序打印)
- [20. Test13 - for循环：断线重连](#20-test13---for循环断线重连)
- [21. Test14 - for循环：累加求和](#21-test14---for循环累加求和)
- [22. Test15 - for循环：偶数和](#22-test15---for循环偶数和)
- [23. Test16 - for循环：统计整除个数](#23-test16---for循环统计整除个数)
- [24. Test17 - while循环：纸张折叠](#24-test17---while循环纸张折叠)
- [25. Test18 - while循环：回文数判断](#25-test18---while循环回文数判断)
- [26. Test19 - while循环：不使用除法求商和余数](#26-test19---while循环不使用除法求商和余数)

---

## 1. IfDemo1 - if语句第一种格式

### 代码位置
[IfDemo1.java](file:///d:/javalearn/day04/src/kru/ifdemo/IfDemo1.java)

### 代码内容
```java
package kru.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        // 需求：键盘录入女婿酒量，如果大于 2 斤，老丈人给出回应，反之不回应

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        if (wine > 2) {
            System.out.println("小伙子，不错哟！");
        }
    }
}
```

### 知识点解析

#### 1.1 if语句第一种格式
```java
if (关系表达式) {
    语句体;
}
```

#### 1.2 执行流程
1. 计算关系表达式的值（boolean类型）
2. 如果为true，执行语句体
3. 如果为false，不执行语句体

#### 1.3 应用场景
- 适用于"如果...就..."的场景
- 只有一种情况需要处理

### 运行结果示例
```
请输入女婿的酒量
3
小伙子，不错哟！
```

---

## 2. IfDemo2 - if语句的注意点

### 代码位置
[IfDemo2.java](file:///d:/javalearn/day04/src/kru/ifdemo/IfDemo2.java)

### 代码内容
```java
package kru.ifdemo;

public class IfDemo2 {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag) {
            System.out.println("flag的值为true");
        }
    }
}
```

### 知识点解析

#### 2.1 if语句的注意点

**1. 大括号的位置**
- 可以另起一行书写
- 建议写在第一行的末尾（Java编码规范）

**2. 大括号的省略**
- 如果语句体只有一句代码，大括号可以省略
- **建议**：不要省略大括号，保持代码可读性

**3. boolean变量的判断**
- 不要使用`==`号判断boolean变量
- 错误写法：`if (flag == true)`
- 正确写法：`if (flag)` 或 `if (!flag)`

### 运行结果
```
flag的值为true
```

---

## 3. ForDemo1 - for循环基本使用

### 代码位置
[ForDemo1.java](file:///d:/javalearn/day04/src/kru/loopdemo/ForDemo1.java)

### 代码内容
```java
package kru.loopdemo;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }
    }
}
```

### 知识点解析

#### 3.1 for循环格式
```java
for (初始化语句; 条件判断; 条件控制) {
    循环体;
}
```

#### 3.2 执行流程
1. 执行初始化语句：`int i = 1`
2. 判断条件：`i <= 5`
3. 如果为true，执行循环体
4. 执行条件控制：`i++`
5. 回到第2步继续判断
6. 如果条件为false，结束循环

#### 3.3 示例分析
- 初始化：`i = 1`
- 条件：`i <= 5`
- 变化：`i++`（每次加1）
- 循环次数：5次（i = 1, 2, 3, 4, 5）

### 运行结果
```
Hello World
Hello World
Hello World
Hello World
Hello World
```

---

## 4. OrderDemo - 顺序结构

### 代码位置
[OrderDemo.java](file:///d:/javalearn/day04/src/kru/orderdemo/OrderDemo.java)

### 代码内容
```java
package kru.orderdemo;

public class OrderDemo {
    public static void main(String[] args) {
        System.out.println("努力做主人喜欢的事");
        System.out.println("大小姐驾到！通通闪开！");
        System.out.println("凛冬已至，故乡的梅花开了吗");
        System.out.println("心怀不惧，方能翱翔于天际");
    }
}
```

### 知识点解析

#### 4.1 顺序结构
- Java程序的基本执行流程
- 代码从上到下依次执行
- 每条语句按顺序执行一次

#### 4.2 特点
- 最简单、最基本的结构
- 没有分支、没有循环
- 每条语句都会被执行

### 运行结果
```
努力做主人喜欢的事
大小姐驾到！通通闪开！
凛冬已至，故乡的梅花开了吗
心怀不惧，方能翱翔于天际
```

---

## 5. SwitchDemo1 - switch语句基本使用

### 代码位置
[SwitchDemo1.java](file:///d:/javalearn/day04/src/kru/switchdemo/SwitchDemo1.java)

### 代码内容
```java
package kru.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 兰州拉面、武汉热干面、北京炸酱面、陕西油泼面

        String noodles = "陕西油泼面";

        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
```

### 知识点解析

#### 5.1 switch语句格式
```java
switch (表达式) {
    case 值1:
        语句体1;
        break;
    case 值2:
        语句体2;
        break;
    ...
    default:
        语句体n+1;
        break;
}
```

#### 5.2 执行流程
1. 计算表达式的值
2. 与每个case的值进行比较
3. 如果匹配成功，执行对应的语句体
4. 遇到break，结束switch语句
5. 如果没有匹配，执行default

#### 5.3 switch支持的表达式类型
- byte、short、int、char
- String（JDK7开始支持）
- 枚举类型

#### 5.4 break的作用
- 结束switch语句
- 防止case穿透
- 每个case后都应该加break

### 运行结果
```
吃陕西油泼面
```

---

## 6. SwitchDemo2 - default的位置和省略

### 代码位置
[SwitchDemo2.java](file:///d:/javalearn/day04/src/kru/switchdemo/SwitchDemo2.java)

### 代码内容
```java
package kru.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 100;
        switch (number) {
            default:
                System.out.println("number的值不是1,10，或者20");
                break;
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
        }
    }
}
```

### 知识点解析

#### 6.1 default的位置
- default不一定写在最下面
- 可以写在任意位置
- **习惯**：写在最下面

#### 6.2 default的省略
- default可以省略
- 语法不会有问题
- **建议**：不要省略，保留default处理异常情况

#### 6.3 执行过程
1. `number = 100`
2. 与case 1、10、20都不匹配
3. 执行default语句
4. 输出：`number的值不是1,10，或者20`

### 运行结果
```
number的值不是1,10，或者20
```

---

## 7. SwitchDemo3 - case穿透现象

### 代码位置
[SwitchDemo3.java](file:///d:/javalearn/day04/src/kru/switchdemo/SwitchDemo3.java)

### 代码内容
```java
package kru.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
//                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10，或者20");
//                break;
        }
    }
}
```

### 知识点解析

#### 7.1 case穿透现象
**定义**：语句体没有写break导致的现象

**执行流程**：
1. 首先拿着小括号中表达式的值跟下面每一个case进行匹配
2. 如果匹配上了，执行对应的语句体
3. 如果此时发现了break，结束整个switch语句
4. 如果没有发现break，程序会继续执行下一个case的语句体，直到遇到break或右大括号

#### 7.2 示例分析
```java
int number = 10;
```
1. 匹配到`case 10:`
2. 输出：`number的值为10`
3. 没有break，发生穿透
4. 继续执行`case 20:`的语句体
5. 输出：`number的值为20`
6. 遇到break，结束switch

#### 7.3 case穿透的应用场景
- 如果多个case的语句体重复，可以利用case穿透简化代码
- 例如：月份天数判断（多个月份天数相同）

### 运行结果
```
number的值为10
number的值为20
```

---

## 8. SwitchDemo4 - 空文件

### 代码位置
[SwitchDemo4.java](file:///d:/javalearn/day04/src/kru/switchdemo/SwitchDemo4.java)

### 说明
此文件为空文件，无实际内容。

---

## 9. SwitchDemo5 - 空文件

### 代码位置
[SwitchDemo5.java](file:///d:/javalearn/day04/src/kru/switchdemo/SwitchDemo5.java)

### 说明
此文件为空文件，无实际内容。

---

## 10. Test1 - if练习：考试奖励

### 代码位置
[Test1.java](file:///d:/javalearn/day04/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

public class Test1 {
    public static void main(String[] args) {
        // 小红：如果你这次考试全班第一，我就做你女朋友
        int ranking = 1;

        if (ranking == 1) {
            System.out.println("小红成为了小明的女朋友");
        }
    }
}
```

### 知识点解析

#### 10.1 if语句第一种格式的应用
- 判断条件：`ranking == 1`
- 条件成立时执行奖励语句

#### 10.2 应用场景
- 单一条件判断
- 满足条件时执行特定操作

### 运行结果
```
小红成为了小明的女朋友
```

---

## 11. Test2 - if-else if练习：红绿灯

### 代码位置
[Test2.java](file:///d:/javalearn/day04/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

public class Test2 {
    public static void main(String[] args) {
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        if(isLightGreen){
            System.out.println("gogogo!");
        } else if (isLightYellow) {
            System.out.println("slow!");
        } else if (isLightRed) {
            System.out.println("stop!");
        }
    }
}
```

### 知识点解析

#### 11.1 if-else if格式
```java
if (条件1) {
    语句体1;
} else if (条件2) {
    语句体2;
} else if (条件3) {
    语句体3;
}
```

#### 11.2 执行流程
1. 判断条件1，如果为true，执行语句体1，结束
2. 如果为false，判断条件2
3. 如果条件2为true，执行语句体2，结束
4. 如果为false，判断条件3
5. 依此类推...

#### 11.3 应用场景
- 多种情况，但只会执行其中一种
- 互斥条件的判断

### 运行结果
```
gogogo!
```

---

## 12. Test3 - if-else练习：吃饭选择

### 代码位置
[Test3.java](file:///d:/javalearn/day04/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入身上的钱：");
        int money = input.nextInt();

        if (money >= 100) {
            System.out.println("钱大于等于100块，吃网红餐厅");
        } else {
            System.out.println("钱不够，吃经济实惠的沙县小吃");
        }
    }
}
```

### 知识点解析

#### 12.1 if-else格式
```java
if (关系表达式) {
    语句体1;
} else {
    语句体2;
}
```

#### 12.2 执行流程
1. 计算关系表达式的值
2. 如果为true，执行语句体1
3. 如果为false，执行语句体2

#### 12.3 应用场景
- 二选一的情况
- 非此即彼的场景

### 运行结果示例
```
请输入身上的钱：
150
钱大于等于100块，吃网红餐厅
```

---

## 13. Test4 - if-else练习：付款判断

### 代码位置
[Test4.java](file:///d:/javalearn/day04/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户实际支付的钱：");
        int money = sc.nextInt();

        if (money >= 600) {
            System.out.println("付款成功！");
        } else {
            System.out.println("付款失败！");
        }
    }
}
```

### 知识点解析

#### 13.1 实际应用场景
- 超市付款判断
- 根据支付金额判断是否成功

#### 13.2 程序流程
1. 输入支付金额
2. 判断是否大于等于600
3. 输出相应的提示信息

### 运行结果示例
```
请输入用户实际支付的钱：
700
付款成功！
```

---

## 14. Test5 - if嵌套练习：电影院选座

### 代码位置
[Test5.java](file:///d:/javalearn/day04/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的票号：");
        int n = sc.nextInt();

        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("坐左边");
            }  else {
                System.out.println("坐右边");
            }
        } else {
            System.out.println("输入超过范围！");
        }
    }
}
```

### 知识点解析

#### 14.1 if嵌套格式
```java
if (条件1) {
    if (条件2) {
        语句体1;
    } else {
        语句体2;
    }
} else {
    语句体3;
}
```

#### 14.2 程序逻辑
1. 先判断票号是否在1~100范围内
2. 如果在范围内，再判断奇偶性
3. 奇数票号坐左边
4. 偶数票号坐右边
5. 如果不在范围内，输出错误提示

#### 14.3 应用场景
- 多层条件判断
- 先判断大范围，再判断小范围

### 运行结果示例
```
请输入你的票号：
35
坐左边
```

---

## 15. Test6 - if-else if多分支练习：分数礼物

### 代码位置
[Test6.java](file:///d:/javalearn/day04/src/kru/test/Test6.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("送自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一天");
        } else if (score >= 81 && score <= 89) {
            System.out.println("送变形金刚一个");
        } else if (score >= 0 && score <= 80) {
            System.out.println("揍一顿");
        } else {
            System.out.println("数值超出范围！");
        }
    }
}
```

### 知识点解析

#### 15.1 多分支if-else if格式
```java
if (条件1) {
    语句体1;
} else if (条件2) {
    语句体2;
} else if (条件3) {
    语句体3;
} else {
    语句体n;
}
```

#### 15.2 分数区间判断

| 分数范围 | 礼物 |
|---------|------|
| 95~100 | 自行车一辆 |
| 90~94 | 游乐场玩一天 |
| 81~89 | 变形金刚一个 |
| 0~80 | 揍一顿 |
| 其他 | 数值超出范围 |

#### 15.3 区间判断的写法
- `score >= 95 && score <= 100`：判断分数在95到100之间
- 需要使用逻辑与`&&`连接两个条件

### 运行结果示例
```
请输入分数：
96
送自行车一辆
```

---

## 16. Test7 - if-else if练习：VIP会员折扣

### 代码位置
[Test7.java](file:///d:/javalearn/day04/src/kru/test/Test7.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int price = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入会员等级：");
        int vip = sc.nextInt();

        if (vip == 1) {
            System.out.println("1级会员，打9折，实际支付金额：" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("2级会员，打8折，实际支付金额：" + (price * 0.8));
        } else if (vip == 3) {
            System.out.println("3级会员，打7折，实际支付金额：" + (price * 0.7));
        } else if (vip != (1 | 2 | 3)) {
            System.out.println("非会员，实际支付金额：" + (price));
        }
    }
}
```

### 知识点解析

#### 16.1 VIP会员折扣表

| 会员等级 | 折扣 | 实际支付 |
|---------|------|---------|
| 1级 | 9折 | 1000 * 0.9 = 900 |
| 2级 | 8折 | 1000 * 0.8 = 800 |
| 3级 | 7折 | 1000 * 0.7 = 700 |
| 非会员 | 不打折 | 1000 |

#### 16.2 字符串拼接中的计算
- `"实际支付金额：" + (price * 0.9)`
- 需要使用括号`()`将计算部分括起来
- 否则会被当作字符串拼接

#### 16.3 注意点
- 代码中的`vip != (1 | 2 | 3)`写法不规范
- 应该使用`else`代替最后一个`else if`

### 运行结果示例
```
请输入会员等级：
1
1级会员，打9折，实际支付金额：900.0
```

---

## 17. Test8 - if-else if练习：红绿灯（重复）

### 代码位置
[Test8.java](file:///d:/javalearn/day04/src/kru/test/Test8.java)

### 代码内容
```java
package kru.test;

public class Test8 {
    public static void main(String[] args) {
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        if(isLightGreen){
            System.out.println("GoGoGo!");
        } else if (isLightYellow) {
            System.out.println("slow!");
        } else if (isLightRed) {
            System.out.println("stop!");
        }
    }
}
```

### 说明
此文件与Test2内容基本相同，仅输出大小写有差异。

### 运行结果
```
GoGoGo!
```

---

## 18. Test9 - switch练习：运动计划

### 代码位置
[Test9.java](file:///d:/javalearn/day04/src/kru/test/Test9.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入星期数，显示今天的减肥活动：");

        int weekend = sc.nextInt();

        switch (weekend) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("数字超出范围！");
                break;
        }
    }
}
```

### 知识点解析

#### 18.1 运动计划表

| 星期 | 运动项目 |
|------|---------|
| 周一 | 跑步 |
| 周二 | 游泳 |
| 周三 | 慢走 |
| 周四 | 动感单车 |
| 周五 | 拳击 |
| 周六 | 爬山 |
| 周日 | 好好吃一顿 |

#### 18.2 switch语句的典型应用
- 固定值的匹配
- 多个分支选择
- 比if-else if更简洁清晰

### 运行结果示例
```
请输入星期数，显示今天的减肥活动：
1
跑步
```

---

## 19. Test12 - for循环：正序和倒序打印

### 代码位置
[Test12.java](file:///d:/javalearn/day04/src/kru/test/Test12.java)

### 代码内容
```java
package kru.test;

public class Test12 {
    public static void main(String[] args) {
        // 需求1：打印1-5
        // 需求2：打印5-1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int j = 5; j >= 1; j--) {
            System.out.println(j);
        }
    }
}
```

### 知识点解析

#### 19.1 正序打印
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
- 初始化：`i = 1`
- 条件：`i <= 5`
- 变化：`i++`（递增）
- 输出：1, 2, 3, 4, 5

#### 19.2 倒序打印
```java
for (int j = 5; j >= 1; j--) {
    System.out.println(j);
}
```
- 初始化：`j = 5`
- 条件：`j >= 1`
- 变化：`j--`（递减）
- 输出：5, 4, 3, 2, 1

#### 19.3 循环变量的变化方式
- 可以递增：`i++`
- 可以递减：`i--`
- 可以是任意步长：`i += 2`

### 运行结果
```
1
2
3
4
5
5
4
3
2
1
```

---

## 20. Test13 - for循环：断线重连

### 代码位置
[Test13.java](file:///d:/javalearn/day04/src/kru/test/Test13.java)

### 代码内容
```java
package kru.test;

public class Test13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i +"执行断线重连的业务逻辑");
        }
    }
}
```

### 知识点解析

#### 20.1 实际开发中的应用
- 游戏断线重连
- 网络请求重试
- 最多重试次数限制

#### 20.2 循环变量在输出中的使用
- `"第" + i +"执行断线重连的业务逻辑"`
- 将循环变量i拼接到字符串中
- 可以显示当前是第几次执行

### 运行结果
```
第1执行断线重连的业务逻辑
第2执行断线重连的业务逻辑
第3执行断线重连的业务逻辑
第4执行断线重连的业务逻辑
第5执行断线重连的业务逻辑
```

---

## 21. Test14 - for循环：累加求和

### 代码位置
[Test14.java](file:///d:/javalearn/day04/src/kru/test/Test14.java)

### 代码内容
```java
package kru.test;

public class Test14 {
    public static void main(String[] args) {
        // 用for循环求1~5之间的和
        // 用来进行累加的
        int sum = 0;
        // 求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
        for (int i = 1; i <= 100; i++) {
            // 可以把得到的每一个数字累加到变量sum当中
            sum += i;
        }
        System.out.println(sum);
    }
}
```

### 知识点解析

#### 21.1 累加求和思想
```java
int sum = 0;  // 累加器，初始值为0
for (int i = 1; i <= 100; i++) {
    sum += i;  // 将i累加到sum中
}
```

#### 21.2 变量作用域
- **求和的变量不能定义在循环里面**
- 变量只在所属的大括号中有效
- 如果定义在循环内，每次循环都会重新初始化

#### 21.3 累加过程

| 循环次数 | i的值 | sum的值 |
|---------|-------|---------|
| 初始 | - | 0 |
| 第1次 | 1 | 1 |
| 第2次 | 2 | 3 |
| 第3次 | 3 | 6 |
| ... | ... | ... |
| 第100次 | 100 | 5050 |

#### 21.4 数学公式验证
- 1到100的和 = (1 + 100) * 100 / 2 = 5050

### 运行结果
```
5050
```

---

## 22. Test15 - for循环：偶数和

### 代码位置
[Test15.java](file:///d:/javalearn/day04/src/kru/test/Test15.java)

### 代码内容
```java
package kru.test;

public class Test15 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1-100之间的偶数和为：" + sum);
    }
}
```

### 知识点解析

#### 22.1 代码问题
**注意**：代码注释说是求偶数和，但实际代码有误：
- `for (int i = 1; i <= 100; i += 2)` 是从1开始，每次加2
- 这样得到的是奇数：1, 3, 5, 7, ..., 99
- 所以实际计算的是**奇数和**，不是偶数和

#### 22.2 正确的偶数和求法

**方法1：步长为2，从2开始**
```java
for (int i = 2; i <= 100; i += 2) {
    sum += i;
}
```

**方法2：使用if判断（注释掉的方法）**
```java
for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        sum += i;  // 注意：原代码写成了sum += 1，也是错误的
    }
}
```

#### 22.3 优化思路
- 方法1更高效（不需要if判断）
- 直接遍历偶数，减少循环次数

#### 22.4 数学计算
- 偶数和：2 + 4 + 6 + ... + 100 = (2 + 100) * 50 / 2 = 2550
- 奇数和：1 + 3 + 5 + ... + 99 = (1 + 99) * 50 / 2 = 2500

### 运行结果（实际是奇数和）
```
1-100之间的偶数和为：2500
```

---

## 23. Test16 - for循环：统计整除个数

### 代码位置
[Test16.java](file:///d:/javalearn/day04/src/kru/test/Test16.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入范围");
        System.out.println("先输入数字范围开始：");
        int start = input.nextInt();
        System.out.println("再输入数字范围结束：");
        int end = input.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println("输入的范围既能被3整除，又能被5整除的数字有" + count + "个");
    }
}
```

### 知识点解析

#### 23.1 统计个数的思想
```java
int count = 0;  // 计数器，初始值为0
for (...) {
    if (符合条件) {
        count += 1;  // 符合条件时计数器加1
    }
}
```

#### 23.2 同时被3和5整除
- `i % 3 == 0 && i % 5 == 0`
- 能被3整除：`i % 3 == 0`
- 能被5整除：`i % 5 == 0`
- 同时满足：使用逻辑与`&&`

#### 23.3 数学等价
- 同时被3和5整除 = 能被15整除
- 可以简化为：`i % 15 == 0`

#### 23.4 计数器 vs 累加器
- **计数器**：统计符合条件的个数，每次加1
- **累加器**：累加数值，每次加i

### 运行结果示例
```
请输入范围
先输入数字范围开始：
1
再输入数字范围结束：
100
输入的范围既能被3整除，又能被5整除的数字有6个
```

---

## 24. Test17 - while循环：纸张折叠

### 代码位置
[Test17.java](file:///d:/javalearn/day04/src/kru/test/Test17.java)

### 代码内容
```java
package kru.test;

public class Test17 {
    public static void main(String[] args) {
        double paper = 0.1;
        int count = 0;

        while(paper < 8844430){
            paper = paper * 2;
            count++;
        }
        System.out.println("需要折叠" + count + "次，可以折成珠穆朗玛峰的高度");
    }
}
```

### 知识点解析

#### 24.1 while循环格式
```java
while (条件判断) {
    循环体;
    条件控制;
}
```

#### 24.2 执行流程
1. 判断条件
2. 如果为true，执行循环体
3. 执行条件控制
4. 回到第1步继续判断
5. 如果为false，结束循环

#### 24.3 题目分析

| 变量 | 含义 | 初始值 |
|------|------|--------|
| paper | 纸张厚度（毫米） | 0.1 |
| count | 折叠次数 | 0 |
| 珠峰高度 | 8844430毫米 | - |

#### 24.4 执行过程（部分）

| 折叠次数 | 纸张厚度 |
|---------|---------|
| 0 | 0.1 |
| 1 | 0.2 |
| 2 | 0.4 |
| 3 | 0.8 |
| ... | ... |
| 27 | 13421772.8 |

#### 24.5 for vs while
- **for循环**：已知循环次数
- **while循环**：未知循环次数，只知道结束条件

### 运行结果
```
需要折叠27次，可以折成珠穆朗玛峰的高度
```

---

## 25. Test18 - while循环：回文数判断

### 代码位置
[Test18.java](file:///d:/javalearn/day04/src/kru/test/Test18.java)

### 代码内容
```java
package kru.test;

public class Test18 {
    public static void main(String[] args) {
        // 定义数字
        int x = 12321;
        // 定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;
        int num = 0;

        while (x != 0) {
            // 从右往左获取每一位数字
            int ge = x % 10;
            // 修改一下x记录的值
            x = x / 10; // 1234 / 10 = 123
            // 把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num == temp);
    }
}
```

### 知识点解析

#### 25.1 回文数定义
- 正序和倒序读都是一样的整数
- 例如：121、12321、1221

#### 25.2 算法思想
**数字反转法**：
1. 保存原始值：`temp = x`
2. 逐位取出并反转：
   - 取个位：`ge = x % 10`
   - 去掉个位：`x = x / 10`
   - 拼接：`num = num * 10 + ge`
3. 比较反转后的数与原数：`num == temp`

#### 25.3 执行过程（以12321为例）

| 循环次数 | x | ge | num |
|---------|---|-----|-----|
| 初始 | 12321 | - | 0 |
| 第1次 | 1232 | 1 | 1 |
| 第2次 | 123 | 2 | 12 |
| 第3次 | 12 | 3 | 123 |
| 第4次 | 1 | 2 | 1232 |
| 第5次 | 0 | 1 | 12321 |

最后比较：`num (12321) == temp (12321)` → `true`

#### 25.4 关键公式
- **取个位**：`数字 % 10`
- **去掉个位**：`数字 / 10`
- **拼接数字**：`num = num * 10 + 新数字`

### 运行结果
```
true
```

---

## 26. Test19 - while循环：不使用除法求商和余数

### 代码位置
[Test19.java](file:///d:/javalearn/day04/src/kru/test/Test19.java)

### 代码内容
```java
package kru.test;

public class Test19 {
    public static void main(String[] args) {
        // 被除数
        int a = 10;
        // 除数
        int b = 3;
        // 统计相减了多少次
        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }
        // 当a<b时，a就是余数
        System.out.println("余数：" + a);
        // 当循环结束之后，count记录的值就是商
        System.out.println("商：" + count);
    }
}
```

### 知识点解析

#### 26.1 高精度除法思想
- 不使用乘法、除法、取模运算符
- 用减法模拟除法运算

#### 26.2 算法原理
**连续减法求商和余数**：
- 被除数不断减去除数
- 减的次数就是商
- 最后剩下的数就是余数

#### 26.3 执行过程（10 ÷ 3）

| 循环次数 | a（被除数） | count（商） | 说明 |
|---------|-----------|-----------|------|
| 初始 | 10 | 0 | - |
| 第1次 | 7 | 1 | 10 - 3 = 7 |
| 第2次 | 4 | 2 | 7 - 3 = 4 |
| 第3次 | 1 | 3 | 4 - 3 = 1 |
| 结束 | 1 | 3 | a < b，循环结束 |

结果：商 = 3，余数 = 1

#### 26.4 验证
- 商 × 除数 + 余数 = 被除数
- 3 × 3 + 1 = 10 ✓

#### 26.5 循环结束条件
- `while (a >= b)`
- 当a < b时，说明不能再减了
- 此时a就是余数

### 运行结果
```
余数：1
商：3
```

---

## Day04 总结

### 核心知识点

1. **顺序结构**
   - 代码从上到下依次执行
   - 最基本的执行流程

2. **if条件语句**
   - 第一种格式：`if (条件) { 语句体 }`
   - 第二种格式：`if-else`
   - 第三种格式：`if-else if-else`
   - 嵌套格式：if语句中包含if语句

3. **switch语句**
   - 用于固定值的匹配
   - 支持byte、short、int、char、String
   - 注意break防止case穿透
   - default可以写在任意位置，建议写在最后

4. **for循环**
   - 格式：`for (初始化; 条件; 变化) { 循环体 }`
   - 适用于已知循环次数的场景

5. **while循环**
   - 格式：`while (条件) { 循环体; 变化; }`
   - 适用于未知循环次数的场景

6. **累加器和计数器**
   - 累加器：`sum += i`
   - 计数器：`count += 1`
   - 变量必须定义在循环外部

### if vs switch

| 特性 | if | switch |
|------|-----|--------|
| 适用场景 | 区间判断、复杂条件 | 固定值匹配 |
| 效率 | 较低（逐个判断） | 较高（直接匹配） |
| 灵活性 | 高 | 低 |
| 代码简洁度 | 较差 | 较好 |

### for vs while

| 特性 | for | while |
|------|-----|-------|
| 循环次数 | 已知 | 未知 |
| 变量作用域 | 循环变量只在循环内有效 | 循环变量可以在循环外 |
| 代码结构 | 更紧凑 | 更灵活 |

### 常见问题

1. **if语句大括号省略**：不建议省略
2. **boolean变量判断**：不要用`==`，直接写变量名
3. **case穿透**：忘记写break会导致穿透
4. **循环变量作用域**：累加器必须定义在循环外
5. **while循环死循环**：忘记写条件控制会导致死循环
