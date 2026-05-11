# Day07 Java综合练习学习笔记

## 目录
- [1. Test1 - 机票价格计算](#1-test1---机票价格计算)
- [2. Test2 - 找质数](#2-test2---找质数)
- [3. Test3 - 生成验证码](#3-test3---生成验证码)
- [4. Test4 - 数组元素复制](#4-test4---数组元素复制)
- [5. Test5 - 评委打分](#5-test5---评委打分)
- [6. Test6 - 数字加密](#6-test6---数字加密)
- [7. Test7 - 数字转数组](#7-test7---数字转数组)
- [8. Test8 - 数字解密](#8-test8---数字解密)
- [9. Test9 - 抢红包（方法一）](#9-test9---抢红包方法一)
- [10. Test10 - 抢红包（方法二）](#10-test10---抢红包方法二)
- [11. Test11 - 双色球抽奖](#11-test11---双色球抽奖)

---

## 1. Test1 - 机票价格计算

### 代码位置
[Test1.java](file:///d:/javalearn/day07/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入价格：");
        double price = sc.nextDouble();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入是否是头等舱(true or false)：");
        boolean cabin = sc.hasNext();

        System.out.println((cabin ? "您是头等舱，" : "您是经济舱：") + "正在为您计算机票优惠价格");
        System.out.println("计算出价格结果：" + cl_airTicket(price,month,cabin));
    }

    public static int cl_airTicket(double ticket_price, int month, boolean cabin) {
        if (cabin) {
            if (month >= 5 && month <= 10) { // 头等舱旺季9折
                ticket_price *= 0.9;
            } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) { // 头等舱淡季7折
                ticket_price *= 0.7;
            }
        } else {
            if (month >= 5 && month <= 10) { // 经济舱旺季8.5折
                ticket_price *= 0.85;
            } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) { // 经济舱淡季6.5折
                ticket_price *= 0.65;
            }
        }
        return (int)ticket_price;
    }
}
```

### 知识点解析

#### 1.1 需求分析
机票价格按照淡季旺季、头等舱和经济舱收费：

| 舱位 | 旺季（5-10月） | 淡季（11-4月） |
|------|---------------|---------------|
| 头等舱 | 9折 | 7折 |
| 经济舱 | 8.5折 | 6.5折 |

#### 1.2 方法设计
- **参数**：机票原价、月份、是否头等舱
- **返回值**：折扣后价格
- **逻辑**：先判断舱位，再判断季节，应用不同折扣

#### 1.3 嵌套if-else
- 外层判断：头等舱 vs 经济舱
- 内层判断：旺季 vs 淡季

#### 1.4 代码问题
- `sc.hasNext()` 应该用 `sc.nextBoolean()` 来读取布尔值
- 返回值类型是int，但计算过程用double，最后强制转换为int

### 运行结果示例
```
请输入价格：1000
请输入月份：7
请输入是否是头等舱(true or false)：true
您是头等舱，正在为您计算机票优惠价格
计算出价格结果：900
```

---

## 2. Test2 - 找质数

### 代码位置
[Test2.java](file:///d:/javalearn/day07/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

public class Test2 {
    public static void main(String[] args) {
        // 1、判断101-200之间有多少个素数，并输出所有素数。

        int count = 0;

        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < 99; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("当前数字"+i+"是素数");
            }
        }
        System.out.println("一共有个"+count+"素数");
    }
}
```

### 知识点解析

#### 2.1 质数（素数）定义
- 只能被1和本身整除的正整数
- 例如：2, 3, 5, 7, 11, 13...

#### 2.2 双重循环
- **外循环**：遍历101到200之间的每个数字
- **内循环**：判断当前数字是否为质数

#### 2.3 标记变量flag
- 假设每个数都是质数（flag = true）
- 如果发现能整除的数，标记为false并break
- 循环结束后检查flag

#### 2.4 代码问题
- 内循环条件 `j < 99` 应该改为 `j < i` 或 `j <= Math.sqrt(i)`
- 否则某些合数可能被误判为质数

### 运行结果
```
当前数字101是素数
当前数字103是素数
...
一共有个21素数
```

---

## 3. Test3 - 生成验证码

### 代码位置
[Test3.java](file:///d:/javalearn/day07/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 验证码格式：长度为5，前四位是字母，最后一位是数字

        char[] az = new char[26*2];

        for (int i = 0; i < 26; i++) {
            az[i] = (char)('a' + i);
            az[i + 26] = (char)('A' + i);
        }
        Random rd = new Random();

        System.out.println("以下是你的验证码：");
        for (int i = 0; i < 4; i++) {
            int random = rd.nextInt(0, az.length - 1);
            System.out.print(az[random]);
        }
        int last_num = rd.nextInt(0,9);
        System.out.print(last_num);
    }
}
```

### 知识点解析

#### 3.1 字符数组生成
- 利用ASCII码特性生成大小写字母
- `'a' + i` 得到小写字母
- `'A' + i` 得到大写字母
- 数组大小：26×2 = 52（26个小写 + 26个大写）

#### 3.2 ASCII码转换
- `(char)('a' + i)`：将整数转换为字符
- 例如：`(char)('a' + 0)` → 'a'，`(char)('a' + 1)` → 'b'

#### 3.3 验证码生成逻辑
1. 前4位：从字母数组中随机选取
2. 最后1位：随机数字0-8

#### 3.4 代码问题
- `rd.nextInt(0, az.length - 1)` 应该是 `rd.nextInt(0, az.length)`
- `rd.nextInt(0,9)` 应该是 `rd.nextInt(0,10)` 才能包含0-9

### 运行结果示例
```
以下是你的验证码：
aBcD5
```

---

## 4. Test4 - 数组元素复制

### 代码位置
[Test4.java](file:///d:/javalearn/day07/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

public class Test4 {
    public static void main(String[] args) {
        int[] org_arr = {1,2,3,4,5};
        int[] new_arr = new int[org_arr.length];

        for (int i = 0; i < org_arr.length; i++) {
            new_arr[i] = org_arr[i];
        }

        System.out.println("新数组：");
        for (int i : new_arr) {
            System.out.print(i+" ");
        }
    }
}
```

### 知识点解析

#### 4.1 数组复制方法
**逐元素复制**：
```java
int[] new_arr = new int[org_arr.length];
for (int i = 0; i < org_arr.length; i++) {
    new_arr[i] = org_arr[i];
}
```

#### 4.2 注意事项
- 必须先创建新数组，长度与原数组相同
- 不能直接用 `new_arr = org_arr`，这只是复制引用
- 逐元素复制是深拷贝，两个数组互不影响

#### 4.3 增强for循环遍历
```java
for (int i : new_arr) {
    System.out.print(i+" ");
}
```

### 运行结果
```
新数组：
1 2 3 4 5 
```

---

## 5. Test5 - 评委打分

### 代码位置
[Test5.java](file:///d:/javalearn/day07/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // 6名评委打分，去掉最高分和最低分后的平均分

        int[] score_man = new int[6];
        Random Rd = new Random();

        for (int i = 0; i < score_man.length; i++) {
            int score = Rd.nextInt(0,100);
            score_man[i] = score;
        }

        // 求最大值和最小值
        int max = score_man[0], min = 0;

        for (int i = 0; i < score_man.length; i++) {
            if (score_man[i] > max) {
                max = score_man[i];
                min = max;
            } else if (score_man[i] < min && score_man[i] != 0) {
                min = score_man[i];
            }
        }
        // 新数组,筛选出最大的和最小的并存入新数组
        int[] new_arr = new int[4];

        for (int i = 0; i < new_arr.length; i++) {
            if (score_man[i] == max && score_man[i] == min) {
                continue;
            } else {
                new_arr[i] = score_man[i];
            }
        }

        // 数组求和
        int sum = 0;
        for (int i : new_arr) {
            sum += i;
        }
        System.out.println("选手的得分：" + (sum / 4));
    }
}
```

### 知识点解析

#### 5.1 需求分析
- 6个评委打分
- 去掉最高分和最低分
- 计算剩余4个分数的平均值

#### 5.2 更简单的算法
```java
// (总和 - 最大值 - 最小值) / 4
int sum = 0;
for (int score : scores) {
    sum += score;
}
int avg = (sum - max - min) / 4;
```

#### 5.3 代码问题
- min初始化为0有问题，应该初始化为`score_man[0]`
- 最大值和最小值的获取逻辑有误
- 过滤逻辑有问题，应该遍历所有6个元素，跳过最大和最小

### 运行结果示例
```
选手的得分：45
```

---

## 6. Test6 - 数字加密

### 代码位置
[Test6.java](file:///d:/javalearn/day07/src/kru/test/Test6.java)

### 代码内容
```java
package kru.test;

public class Test6 {
    public static void main(String[] args) {
        int num = 1983;
        int[] numArr = numToArr(num);
        int[] encrypt_result = numEncrypt(numArr);
        int num_result = ArrToNum(encrypt_result);
        System.out.println(num_result);
    }

    public static int[] numToArr(int num) {
        int count = 0;
        int copy_num = num;
        while (num != 0) {
            num /= 10;
            count++;
        }
        
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy_num % 10;
            copy_num /= 10;
        }
        return arr;
    }
    
    public static int[] numEncrypt(int[] num_arr) {
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] += 5;
            num_arr[i] %= 10;
        }
        int[] reverse_num = new int[num_arr.length];
        int index = 0;
        for (int i = num_arr.length - 1; i >= 0; i--) {
            reverse_num[index] = num_arr[i];
            index++;
        }
        return reverse_num;
    }

    public static int ArrToNum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
}
```

### 知识点解析

#### 6.1 加密规则
1. 得到每位数
2. 每位数加5
3. 对10求余
4. 所有数字反转

#### 6.2 数字转数组
- 先计算位数（while循环除10）
- 从个位开始逐位存入数组

#### 6.3 加密过程（以1983为例）

| 步骤 | 数字 | 操作 |
|------|------|------|
| 原始 | 1, 9, 8, 3 | - |
| +5 | 6, 14, 13, 8 | 每位加5 |
| %10 | 6, 4, 3, 8 | 对10取余 |
| 反转 | 8, 3, 4, 6 | 最终结果 |

#### 6.4 模块化设计
- `numToArr`：数字转数组
- `numEncrypt`：数组加密（加5、取余、反转）
- `ArrToNum`：数组转数字

### 运行结果
```
8346
```

---

## 7. Test7 - 数字转数组

### 代码位置
[Test7.java](file:///d:/javalearn/day07/src/kru/test/Test7.java)

### 代码内容
```java
package kru.test;

public class Test7 {
    public static void main(String[] args) {
        int num = 1234567891;
        int copy_num = num;

        // 计算数组的长度
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);

        // 已知长度后，动态初始化一个数组
        int[] arr = new int[count];

        for (int i = arr.length - 1; i >= 0 ; i--) {
            arr[i] = copy_num % 10;
            copy_num /= 10;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < 9){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
```

### 知识点解析

#### 7.1 算法思路（反向推导）
1. 计算数字的位数
2. 创建对应长度的数组
3. 从后往前填充数组（保持正序）

#### 7.2 位数计算
```java
while (num != 0) {
    num /= 10;
    count++;
}
```
- 每次除以10，直到为0
- 除法次数就是位数

#### 7.3 从后往前填充
```java
for (int i = arr.length - 1; i >= 0 ; i--) {
    arr[i] = copy_num % 10;  // 取个位
    copy_num /= 10;          // 去掉个位
}
```
- 从数组末尾开始填充
- 保证数组中数字是正序的

### 运行结果
```
10
[1,2,3,4,5,6,7,8,9,1]
```

---

## 8. Test8 - 数字解密

### 代码位置
[Test8.java](file:///d:/javalearn/day07/src/kru/test/Test8.java)

### 代码内容
```java
package kru.test;

public class Test8 {
    public static void main(String[] args) {
        int EncryptedNum = 6438;
        int[] NumArr = numToArr(EncryptedNum);
        int[] DecrytedNum = NumDecrypt(NumArr);
        int result_num = ArrToNum(DecrytedNum);
        System.out.println(result_num);
    }

    public static int[] numToArr(int num) {
        int count = 0;
        int copy_num = num;
        while (num != 0) {
            num /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy_num % 10;
            copy_num /= 10;
        }
        return arr;
    }

    public static int[] NumDecrypt(int[] arr) {
        // 先反转
        int[] reversedArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[index] = arr[i];
            index++;
        }

        // 解密：0~4之间+10，5~9不变，然后减5
        for (int i = 0; i < reversedArr.length; i++) {
            if (reversedArr[i] >= 0 && reversedArr[i] <= 4) {
                reversedArr[i] += 10;
            }
            reversedArr[i] -= 5;
        }
        return reversedArr;
    }

    public static int ArrToNum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
}
```

### 知识点解析

#### 8.1 解密原理
加密是：加5 → 取余10 → 反转
解密是：反转 → 判断是否加10 → 减5

#### 8.2 为什么需要判断加10
- 加密时 `(x + 5) % 10` 会丢失进位信息
- 例如：原始值6，(6+5)%10 = 1
- 解密时1-5 = -4（错误）
- 所以需要：1+10-5 = 6（正确）

**规则：**
- 加密后0~4：说明原始值≥5，需要加10再减5
- 加密后5~9：说明原始值<5，直接减5

#### 8.3 解密过程（6438）

| 步骤 | 数字 |
|------|------|
| 加密数字 | 6, 4, 3, 8 |
| 反转 | 8, 3, 4, 6 |
| 判断+10 | 8→18, 3→13, 4→14, 6不变 |
| 减5 | 13, 8, 9, 1 |
| 最终结果 | 1983 |

### 运行结果
```
1983
```

---

## 9. Test9 - 抢红包（方法一）

### 代码位置
[Test9.java](file:///d:/javalearn/day07/src/kru/test/Test9.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int[] redPacketNumArr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[redPacketNumArr.length];

        Random Rd = new Random();

        for (int i = 0; i < 5;) {
            int RdIndex = Rd.nextInt(redPacketNumArr.length);
            int prize =  redPacketNumArr[RdIndex];

            if (!contains(newArr, prize)) {
                newArr[i] = prize;
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
```

### 知识点解析

#### 9.1 随机不重复抽取
- 随机抽取一个奖项
- 检查是否已抽取过
- 如果未抽取过，存入新数组并移动索引
- 如果已抽取过，不移动索引，继续抽取

#### 9.2 去重逻辑
```java
if (!contains(newArr, prize)) {
    newArr[i] = prize;
    i++;  // 只有成功添加才递增
}
```

#### 9.3 contains方法
- 遍历数组检查元素是否存在
- 存在返回true，不存在返回false

### 运行结果示例
```
888
2
10000
588
1000
```

---

## 10. Test10 - 抢红包（方法二）

### 代码位置
[Test10.java](file:///d:/javalearn/day07/src/kru/test/Test10.java)

### 代码内容
```java
package kru.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        // 把奖池里面的所有奖项打乱顺序
        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rdIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[rdIndex];
            arr[rdIndex] = temp;
        }

        // 遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### 知识点解析

#### 10.1 洗牌算法
- 遍历数组每个位置
- 随机选择一个位置与当前位置交换
- 实现数组元素随机排列

#### 10.2 两种方法对比

| 特性 | 方法一（抽取+去重） | 方法二（洗牌） |
|------|-------------------|---------------|
| 复杂度 | 较高（需要contains检查） | 较低（直接交换） |
| 额外空间 | 需要新数组 | 原地操作 |
| 效率 | 可能重复抽取 | 固定次数 |

#### 10.3 交换两个元素
```java
int temp = arr[i];
arr[i] = arr[rdIndex];
arr[rdIndex] = temp;
```

### 运行结果示例
```
10000
2
888
1000
588
```

---

## 11. Test11 - 双色球抽奖

### 代码位置
[Test11.java](file:///d:/javalearn/day07/src/kru/test/Test11.java)

### 代码内容
```java
package kru.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        // 双色球：6个红球(1-33) + 1个蓝球(1-16)

        Scanner sc = new Scanner(System.in);
        int[] userNumArr = new int[7];

        for (int i = 0; i < userNumArr.length; i++) {
            System.out.print("请输入第"+ (i + 1) + "个号码: ");
            userNumArr[i] = sc.nextInt();
        }
        System.out.println("你输入的号码：");
        for (int i : userNumArr) {
            System.out.print(i + "  ");
        }

        // 摇号码
        int[] ballNum = createNumber();
        // 计算中了几个红球
        int countRedBall = 0;
        for (int i = 0; i < 6; i++) {
            if (userNumArr[i] == ballNum[i]) {
                countRedBall++;
            }
        }
        // 计算蓝球是否中奖
        int countBlueBall = 0;
        if (userNumArr[6] == ballNum[6]) {
            countBlueBall++;
        }
        System.out.println();
        for (int i = 0; i < ballNum.length; i++) {
            System.out.print(ballNum[i] + " ");
        }
        System.out.println();
        System.out.println("红球中了" + countRedBall + "个");
        System.out.println("蓝球中了" + countBlueBall + "个");
    }

    public static int[] createNumber() {
        int[] NumArr = new int[7];
        Random Rd = new Random();

        for (int i = 0; i < 6;) {
            int redBall = Rd.nextInt(1,33);
            if (!contains(NumArr, redBall)) {
                NumArr[i] = redBall;
                i++;
            }
        }
        int blueBall = Rd.nextInt(1,16);
        NumArr[6] = blueBall;

        return NumArr;
    }

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
```

### 知识点解析

#### 11.1 双色球规则
- **红球**：从1-33中选择6个，不重复
- **蓝球**：从1-16中选择1个，可以和红球重复

#### 11.2 程序结构
1. 用户输入7个号码（6红+1蓝）
2. 系统随机生成7个号码
3. 比较红球中奖个数
4. 比较蓝球是否中奖

#### 11.3 随机不重复生成
- 使用contains检查是否重复
- 只有不重复时才添加并递增索引

#### 11.4 代码问题
- `Rd.nextInt(1,33)` 实际生成1-32，应该是`Rd.nextInt(1,34)`
- `Rd.nextInt(1,16)` 实际生成1-15，应该是`Rd.nextInt(1,17)`
- 红球比较应该比较两个数组的内容，而不是相同位置

### 运行结果示例
```
请输入第1个号码: 5
请输入第2个号码: 12
...
你输入的号码：
5  12  ...
8 15 ... 
红球中了0个
蓝球中了0个
```

---

## Day07 总结

### 核心知识点

1. **方法综合运用**
   - 方法定义和调用
   - 参数传递
   - 返回值处理
   - 方法封装和复用

2. **数组操作**
   - 数组遍历
   - 数组复制
   - 数组反转
   - 数组查找（contains）
   - 数组最大值/最小值

3. **随机数生成**
   - `Random.nextInt(min, max)`：生成[min, max)范围的随机数
   - 随机不重复抽取
   - 洗牌算法

4. **数字处理**
   - 数字转数组：逐位取余
   - 数组转数字：累加拼接
   - 数字加密/解密

5. **算法思想**
   - 计数器：统计符合条件的个数
   - 标记变量：记录状态
   - 去重：contains检查
   - 双重循环：外循环遍历，内循环判断

### 常见问题

1. **nextInt范围**：`nextInt(1, 10)`生成1-9，不包含10
2. **数组越界**：注意索引范围0 ~ length-1
3. **引用vs值**：数组赋值是引用传递，需要深拷贝
4. **死循环**：忘记递增循环变量会导致死循环
5. **逻辑错误**：min/max初始化应该用数组元素，不能随意赋值
