# Day06 Java方法学习笔记

## 目录
- [1. MethodDemo1 - 方法的定义和调用](#1-methoddemo1---方法的定义和调用)
- [2. MethodDemo2 - 方法练习：打印信息](#2-methoddemo2---方法练习打印信息)
- [3. MethodDemo3 - 方法内部变量](#3-methoddemo3---方法内部变量)
- [4. MethodDemo4 - 带参数的方法](#4-methoddemo4---带参数的方法)
- [5. MethodDemo5 - 带返回值的方法](#5-methoddemo5---带返回值的方法)
- [6. Test1 - 方法练习：长方形周长](#6-test1---方法练习长方形周长)
- [7. Test2 - 方法练习：圆的面积](#7-test2---方法练习圆的面积)
- [8. Test3 - 方法练习：比较长方形面积](#8-test3---方法练习比较长方形面积)
- [9. Test4 - 方法重载](#9-test4---方法重载)
- [10. Test5 - 方法练习：数组遍历](#10-test5---方法练习数组遍历)
- [11. Test6 - 方法练习：数组最大值](#11-test6---方法练习数组最大值)
- [12. Test7 - 方法练习：判断元素是否存在](#12-test7---方法练习判断元素是否存在)
- [13. Test8 - 方法练习：复制数组](#13-test8---方法练习复制数组)
- [14. Test9 - 方法参数传递](#14-test9---方法参数传递)

---

## 1. MethodDemo1 - 方法的定义和调用

### 代码位置
[MethodDemo1.java](file:///d:/javalearn/day06/src/kru/methoddemo/MethodDemo1.java)

### 代码内容
```java
package kru.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //调用方法
        playGame();
        playGame();
    }
    // 定义一个方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开始");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}
```

### 知识点解析

#### 1.1 方法的概念
- 方法是一段可重复使用的代码块
- 可以多次调用，避免代码重复

#### 1.2 方法定义格式（最简单）
```java
public static void 方法名() {
    方法体;
}
```

#### 1.3 方法调用格式
```java
方法名();
```

#### 1.4 方法的好处
- 代码复用：写一次，多次调用
- 提高代码可读性
- 便于维护和修改

### 运行结果
```
选人物
准备开始
对线
崩盘
骂队友
送人头
GG
选人物
准备开始
对线
崩盘
骂队友
送人头
GG
```

---

## 2. MethodDemo2 - 方法练习：打印信息

### 代码位置
[MethodDemo2.java](file:///d:/javalearn/day06/src/kru/methoddemo/MethodDemo2.java)

### 代码内容
```java
package kru.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 调用方法
        printGFInfo();
    }

    public static void printGFInfo() {
        System.out.println("小惠惠");
        System.out.println("萌妹子");
        System.out.println("18岁");
    }
}
```

### 知识点解析

#### 2.1 方法命名规范
- 采用小驼峰命名法
- 方法名应该表达方法的功能
- `printGFInfo`：打印女朋友信息

#### 2.2 方法的执行流程
1. 程序从main方法开始执行
2. 调用`printGFInfo()`方法
3. 跳转到方法体执行
4. 方法执行完毕后回到main方法

---

## 3. MethodDemo3 - 方法内部变量

### 代码位置
[MethodDemo3.java](file:///d:/javalearn/day06/src/kru/methoddemo/MethodDemo3.java)

### 代码内容
```java
package kru.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 需求：定义一个方法，在方法内部定义两个变量
        // 求出他们的和并进行打印
        getSum();
    }
    public static void getSum() {
        int a = 10;
        int b = 20;

        int result = a + b;
        System.out.println(result);
    }
}
```

### 知识点解析

#### 3.1 方法内部变量
- 变量定义在方法内部
- 只能在当前方法中使用
- 方法执行完毕后变量被销毁

#### 3.2 局限性
- 数据写死在方法内部
- 不够灵活，无法处理不同数据

### 运行结果
```
30
```

---

## 4. MethodDemo4 - 带参数的方法

### 代码位置
[MethodDemo4.java](file:///d:/javalearn/day06/src/kru/methoddemo/MethodDemo4.java)

### 代码内容
```java
package kru.methoddemo;

public class MethodDemo4 {

    public static void main(String[] args) {
        // 目标：掌握带参数方法定义的格式和调用的格式

        getSum(10,30);
    }

    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
```

### 知识点解析

#### 4.1 带参数方法定义格式
```java
public static void 方法名(参数类型 参数名1, 参数类型 参数名2) {
    方法体;
}
```

#### 4.2 带参数方法调用格式
```java
方法名(实际参数1, 实际参数2);
```

#### 4.3 形参 vs 实参
- **形参**：方法定义时的参数（形式参数）
- **实参**：方法调用时传入的参数（实际参数）

#### 4.4 参数传递过程
1. 调用方法时传入实参
2. 实参的值赋给形参
3. 方法体中使用形参进行计算

### 运行结果
```
40
```

---

## 5. MethodDemo5 - 带返回值的方法

### 代码位置
[MethodDemo5.java](file:///d:/javalearn/day06/src/kru/methoddemo/MethodDemo5.java)

### 代码内容
```java
package kru.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 赋值调用
        int sum1 = getSum(10,20,30);
        int sum2 = getSum(20,30,40);
        int sum3 = getSum(20,30,40);
        int sum4 = getSum(20,30,40);

        // 求全年的总营业额
        int sum = sum1 + sum2 + sum3 + sum4;

        System.out.println(sum);
    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;  // 返回给方法的调用处
    }
}
```

### 知识点解析

#### 5.1 带返回值方法定义格式
```java
public static 返回值类型 方法名(参数列表) {
    方法体;
    return 返回值;
}
```

#### 5.2 方法调用的三种方式

| 调用方式 | 格式 | 说明 |
|---------|------|------|
| 直接调用 | `getSum(10,20,30);` | 不使用返回值 |
| 赋值调用 | `int sum = getSum(10,20,30);` | 将返回值赋给变量 |
| 输出调用 | `System.out.println(getSum(10,20,30));` | 直接输出返回值 |

#### 5.3 return关键字
- 将结果返回给方法调用处
- 方法执行到return语句后结束
- return后面的代码不会执行

#### 5.4 实际应用示例
- 计算四个季度的营业额
- 每个季度调用同一个方法
- 最后累加得到全年总营业额

### 运行结果
```
240
```

---

## 6. Test1 - 方法练习：长方形周长

### 代码位置
[Test1.java](file:///d:/javalearn/day06/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

public class Test1 {
    public static void main(String[] args) {
        // 调用方法
        getLength(5.2, 1.3);
    }

    // 1我要干嘛？求长方形的周长
    // 2我干这件事情，需要什么才能完成？长 宽

    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
```

### 知识点解析

#### 6.1 方法设计思路
1. **我要干嘛？** 求长方形的周长
2. **需要什么？** 长和宽
3. **是否需要返回结果？** 不需要（直接打印）

#### 6.2 长方形周长公式
```
周长 = (长 + 宽) × 2
```

#### 6.3 参数类型选择
- 长和宽可能是小数，所以使用`double`类型

### 运行结果
```
13.0
```

---

## 7. Test2 - 方法练习：圆的面积

### 代码位置
[Test2.java](file:///d:/javalearn/day06/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

public class Test2 {
    public static void main(String[] args) {
        getArea(1.5);
    }

    // 公式：半径的平方 * π
    public static void getArea(double radius) {
        double result = radius * radius + 3.14;
        System.out.println(result);
    }
}
```

### 知识点解析

#### 7.1 圆的面积公式
**正确公式**：`面积 = 半径² × π`

#### 7.2 代码问题
**注意**：代码中的公式有误
- 错误写法：`radius * radius + 3.14`（加法）
- 正确写法：`radius * radius * 3.14`（乘法）

#### 7.3 Math.PI
- Java提供了更精确的π值：`Math.PI`
- 建议使用`Math.PI`代替`3.14`

### 运行结果（错误公式）
```
5.39
```

---

## 8. Test3 - 方法练习：比较长方形面积

### 代码位置
[Test3.java](file:///d:/javalearn/day06/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

public class Test3 {
    public static void main(String[] args) {
        // 调用方法获取长方形的面积，再进行比较
        double area1 = getArea(5.3,1.7);
        double area2 = getArea(2.4,2.7);

        if (area1 > area2) {
            System.out.println("第一个长方形更大");
        } else {
            System.out.println("第二个长方形更大");
        }
    }

    public static double getArea(double len , double width) {
        return len * width;
    }
}
```

### 知识点解析

#### 8.1 返回值方法的应用
- 方法返回面积值
- 调用处接收返回值后进行比较
- 体现了返回值的重要性

#### 8.2 方法复用
- 同一个方法可以多次调用
- 传入不同参数得到不同结果

#### 8.3 实际开发原则
- 把重复的代码或具有独立功能的代码抽取到方法中
- 提高代码复用性和可维护性

### 运行结果
```
第一个长方形更大
```

---

## 9. Test4 - 方法重载

### 代码位置
[Test4.java](file:///d:/javalearn/day06/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

public class Test4 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        compare(b1,b2);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2) {
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long n1, long n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
```

### 知识点解析

#### 9.1 方法重载的概念
- 在同一个类中，方法名相同，参数列表不同
- 与返回值无关

#### 9.2 方法重载的条件

| 条件 | 说明 |
|------|------|
| 同一个类 | 必须在同一个类中 |
| 方法名相同 | 方法名称必须一致 |
| 参数列表不同 | 参数类型、个数、顺序至少有一个不同 |

#### 9.3 本例中的重载
- 方法名都是`compare`
- 参数类型不同：byte、short、int、long
- 调用时根据参数类型自动匹配对应的方法

#### 9.4 方法重载的好处
- 功能相同的方法可以使用同一个方法名
- 调用方法时不需要记忆多个方法名
- 提高代码可读性

### 运行结果
```
byte
false
```

---

## 10. Test5 - 方法练习：数组遍历

### 代码位置
[Test5.java](file:///d:/javalearn/day06/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
```

### 知识点解析

#### 10.1 数组作为方法参数
- 数组可以作为参数传递给方法
- 方法接收数组参数进行遍历

#### 10.2 格式化输出
```java
[11,22,33,44,55]
```
- 第一个元素前输出`[`
- 最后一个元素后输出`]`
- 中间元素用`,`分隔

#### 10.3 判断最后一个元素
```java
if (i == arr.length - 1) {
    System.out.print(arr[i]);  // 最后一个元素不加逗号
} else {
    System.out.print(arr[i] + ",");  // 其他元素加逗号
}
```

### 运行结果
```
[11,22,33,44,55]
```

---

## 11. Test6 - 方法练习：数组最大值

### 代码位置
[Test6.java](file:///d:/javalearn/day06/src/kru/test/Test6.java)

### 代码内容
```java
package kru.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        System.out.println("数组的最大值是：" + getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
```

### 知识点解析

#### 11.1 增强for循环
```java
for (int i : arr) {
    // i 表示数组中的每个元素值
}
```
- 直接获取元素值，不需要索引
- 适用于只需要元素值的场景

#### 11.2 求最大值算法
1. 假设第一个元素是最大值
2. 遍历数组，逐个比较
3. 发现更大的值就更新max
4. 返回最大值

### 运行结果
```
数组的最大值是：55
```

---

## 12. Test7 - 方法练习：判断元素是否存在

### 代码位置
[Test7.java](file:///d:/javalearn/day06/src/kru/test/Test7.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,12,56,89,67};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int number = sc.nextInt();

        if (contains(arr, number)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    public static boolean contains(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
```

### 知识点解析

#### 12.1 boolean返回值方法
- 方法返回true或false
- 适用于判断类型的场景

#### 12.2 查找算法
```java
for (int i : arr) {
    if (i == number) {
        return true;  // 找到就立即返回
    }
}
return false;  // 遍历完都没找到
```

#### 12.3 提前返回
- 找到元素后使用`return true`立即结束方法
- 不需要继续遍历后面的元素
- 提高代码效率

### 运行结果示例
```
请输入一个数：5
存在
```

---

## 13. Test8 - 方法练习：复制数组

### 代码位置
[Test8.java](file:///d:/javalearn/day06/src/kru/test/Test8.java)

### 代码内容
```java
package kru.test;

public class Test8 {
    public static void main(String[] args) {
        // 原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 调用方法拷贝数据
        int[] copyArr = copyOfRange(arr, 3, 7);

        // 遍历
        for (int j : copyArr) {
            System.out.print(j);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        // form 开头 to 结尾
        // 动态数组，长度：to - from
        int[] newArr = new int[to - from];

        // 伪造索引思想
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
```

### 知识点解析

#### 13.1 数组复制算法
**copyOfRange**：复制数组的指定范围

- `from`：起始索引（包含）
- `to`：结束索引（不包含）
- 新数组长度：`to - from`

#### 13.2 伪索引思想
```java
int index = 0;  // 新数组的索引
for (int i = from; i < to; i++) {
    newArr[index] = arr[i];
    index++;
}
```
- 原数组使用`i`作为索引（从from到to）
- 新数组使用`index`作为索引（从0开始）

#### 13.3 示例分析
```java
copyOfRange(arr, 3, 7)
```
- 复制索引3到索引7（不包含7）的元素
- 即：索引3, 4, 5, 6的元素
- 原数组：[1, 2, 3, 4, 5, 6, 7, 8, 9]
- 复制结果：[4, 5, 6, 7]

#### 13.4 返回数组
- 方法可以返回数组类型
- 返回的是数组的引用

### 运行结果
```
4567
```

---

## 14. Test9 - 方法参数传递

### 代码位置
[Test9.java](file:///d:/javalearn/day06/src/kru/test/Test9.java)

### 代码内容
```java
package kru.test;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number); // 100
        number = change(number);
        System.out.println("调用change方法后：" + number);
    }

    public static int change (int number) {
        number = 200;
        return number;
    }
}
```

### 知识点解析

#### 14.1 基本数据类型的参数传递
- 基本数据类型传递的是**值**
- 方法内部修改参数不会影响原变量
- 需要通过返回值接收修改后的值

#### 14.2 执行流程

| 步骤 | number（main方法） | number（change方法） |
|------|-------------------|---------------------|
| 1. 定义 | 100 | - |
| 2. 调用方法 | 100 | 100（复制值） |
| 3. 方法内部修改 | 100 | 200 |
| 4. 返回 | 100 | 返回200 |
| 5. 赋值接收 | 200 | - |

#### 14.3 参数传递规则

| 数据类型 | 传递内容 | 修改影响 |
|---------|---------|---------|
| 基本数据类型 | 值 | 不影响原变量 |
| 引用数据类型 | 地址值 | 会影响原数组/对象 |

### 运行结果
```
调用change方法前：100
调用change方法后：200
```

---

## Day06 总结

### 核心知识点

1. **方法的定义和调用**
   - 最简单格式：`public static void 方法名() {}`
   - 调用格式：`方法名();`

2. **带参数的方法**
   - 定义：`public static void 方法名(参数类型 参数名) {}`
   - 调用：`方法名(实际参数);`
   - 形参：方法定义时的参数
   - 实参：方法调用时传入的参数

3. **带返回值的方法**
   - 定义：`public static 返回值类型 方法名(参数列表) { return 值; }`
   - 三种调用方式：直接调用、赋值调用、输出调用
   - return将结果返回给调用处

4. **方法重载**
   - 同一个类中，方法名相同，参数列表不同
   - 与返回值无关
   - 调用时根据参数自动匹配

5. **数组作为方法参数**
   - 数组可以作为参数传递
   - 方法可以返回数组

6. **参数传递**
   - 基本数据类型：传递值，不影响原变量
   - 引用数据类型：传递地址值，影响原数据

### 方法设计步骤

1. **我要干嘛？** 确定方法功能
2. **需要什么？** 确定参数列表
3. **是否需要返回结果？** 确定返回值类型

### 常见问题

1. **方法写在哪里？** 类里面，main方法外面
2. **方法不调用不执行**：定义的方法必须调用才会执行
3. **方法之间是平级关系**：不能嵌套定义
4. **返回值类型**：如果有返回值，必须声明返回值类型
5. **return**：有返回值的方法必须有return语句
