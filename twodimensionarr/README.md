# twodimensionarr 二维数组学习笔记

## 目录
- [1. TwoDimensionDemo1 - 二维数组静态初始化](#1-twodimensiondemo1---二维数组静态初始化)
- [2. TwoDimensionDemo2 - 二维数组动态初始化](#2-twodimensiondemo2---二维数组动态初始化)
- [3. Test1 - 季度营业额统计](#3-test1---季度营业额统计)

---

## 1. TwoDimensionDemo1 - 二维数组静态初始化

### 代码位置
[TwoDimensionDemo1.java](file:///d:/javalearn/twodimensionarr/src/kru/twodimension/TwoDimensionDemo1.java)

### 代码内容
```java
package kru.twodimension;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*
        二维数组静态初始化格式：
            数据类型[][] 数组名 = new 数据类型[][]{{元素1，元素2},{元素1，元素2}};
        简化格式：
            数据类型[][] 数组名 = {{元素1，元素2},{元素1，元素2}};
        元素访问：
            数组名[索引][索引];
        二维数组遍历：
            先得到一维数组，再遍历一维数组获取元素*/

        // 静态初始化格式
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr2 = {{1,2,3},{4,5,6,7,8}};
        
        // 以后建议这样定义，把每一个一维数组，单独写成一行
        int[][] arr3 = {
                {1,2,3},
                {4,5,6,7,8}
        };

        // 获取元素
        // System.out.println(arr3[0][0]);

        // 遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### 知识点解析

#### 1.1 二维数组概述
- 二维数组本质上是"数组的数组"
- 每个元素都是一个一维数组
- 可以存储表格型数据

#### 1.2 静态初始化格式

**完整格式：**
```java
数据类型[][] 数组名 = new 数据类型[][]{{元素1, 元素2}, {元素1, 元素2}};
```

**简化格式：**
```java
数据类型[][] 数组名 = {{元素1, 元素2}, {元素1, 元素2}};
```

**推荐格式：**
```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6, 7, 8}
};
```

#### 1.3 元素访问
```java
数组名[行索引][列索引]
```
- `arr3[0][0]`：第1行第1列的元素
- `arr3[1][4]`：第2行第5列的元素

#### 1.4 二维数组遍历
```java
// 外循环：遍历二维数组，得到每一个一维数组
for (int i = 0; i < arr3.length; i++) {
    // 内循环：遍历一维数组，获取每个元素
    for (int j = 0; j < arr3[i].length; j++) {
        System.out.print(arr3[i][j] + " ");
    }
    System.out.println();
}
```

#### 1.5 不规则二维数组
- 每个一维数组的长度可以不同
- `arr3[0]`长度为3，`arr3[1]`长度为5

---

## 2. TwoDimensionDemo2 - 二维数组动态初始化

### 代码位置
[TwoDimensionDemo2.java](file:///d:/javalearn/twodimensionarr/src/kru/twodimension/TwoDimensionDemo2.java)

### 代码内容
```java
package kru.twodimension;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        二维数组动态初始化格式：
        数据类型[][]数组名=new数据类型[m][n];
        m表示这个二维数组，可以存放多少个一维数组
        n表示每一个一维数组，可以存放多少个元素*/

        // 创建二维数组
        // 3行一维数组，一维数组长度为5
        int[][] arr = new int[3][5];

        arr[0][0] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### 知识点解析

#### 2.1 动态初始化格式
```java
数据类型[][] 数组名 = new 数据类型[m][n];
```
- `m`：二维数组中一维数组的个数（行数）
- `n`：每个一维数组的长度（列数）

#### 2.2 默认初始化值
- 整数类型：0
- 小数类型：0.0
- 布尔类型：false
- 引用类型：null

#### 2.3 示例分析
```java
int[][] arr = new int[3][5];
```
- 3行5列的二维数组
- 共15个元素，全部初始化为0

---

## 3. Test1 - 季度营业额统计

### 代码位置
[Test1.java](file:///d:/javalearn/twodimensionarr/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

public class Test1 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99
        要求计算出每个季度的总营业额和全年的总营业额*/

        int[][] YearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        for (int j = 0; j < 4; j++) {
            System.out.print("第"+ (j + 1) +"季度" + "\t");
        }
        System.out.print("全年 \t");
        System.out.println();
        
        int yearSum = 0;
        for (int i = 0; i < YearArrArr.length; i++) {
            System.out.print(getSum(YearArrArr[i]) + "\t    ");
            yearSum += getSum(YearArrArr[i]);
        }
        System.out.println(yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

### 知识点解析

#### 3.1 二维数组应用
- 每个季度的营业额存储为一维数组
- 二维数组存储四个季度的数据

#### 3.2 模块化设计
- 将求和功能抽取为方法`getSum(int[] arr)`
- 复用性强，代码简洁

#### 3.3 计算过程

| 季度 | 数据 | 季度总和 |
|------|------|---------|
| Q1 | 22, 66, 44 | 132 |
| Q2 | 77, 33, 88 | 198 |
| Q3 | 25, 45, 65 | 135 |
| Q4 | 11, 66, 99 | 176 |
| 全年 | - | 641 |

### 运行结果
```
第1季度	第2季度	第3季度	第4季度	全年 	
132	    198	    135	    176	    641
```

---

## twodimensionarr 总结

### 核心知识点

1. **二维数组概念**
   - 数组的数组
   - 存储表格型数据

2. **初始化方式**
   - 静态初始化：已知具体值
   - 动态初始化：已知行列数

3. **遍历方法**
   - 双重for循环
   - 外循环遍历行
   - 内循环遍历列

4. **元素访问**
   - `arr[行索引][列索引]`
   - 索引从0开始

### 常见问题

1. **不规则数组**：每行长度可以不同
2. **索引越界**：确保行列索引合法
3. **length属性**：`arr.length`是行数，`arr[i].length`是第i行的列数
