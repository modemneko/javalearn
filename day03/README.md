# Day03 Java运算符学习笔记

## 目录
- [1. ArithmeticoperatorDemo1 - 加减乘运算](#1-arithmeticoperatordemo1---加减乘运算)
- [2. ArithmeticoperatorDemo2 - 除法和取模运算](#2-arithmeticoperatordemo2---除法和取模运算)
- [3. ArithmeticoperatorDemo3 - 类型转换](#3-arithmeticoperatordemo3---类型转换)
- [4. ArithmeticoperatorDemo4 - char类型的ASCII码](#4-arithmeticoperatordemo4---char类型的ascii码)
- [5. ArithmeticoperatorDemo5 - 自增自减运算](#5-arithmeticoperatordemo5---自增自减运算)
- [6. ArithmeticoperatorDemo6 - 自增运算的先用后加和先加后用](#6-arithmeticoperatordemo6---自增运算的先用后加和先加后用)
- [7. AssingingoperatorDemo1 - 赋值运算符](#7-assingingoperatordemo1---赋值运算符)
- [8. CompareoperatorDemo1 - 比较运算符](#8-compareoperatordemo1---比较运算符)
- [9. LogicoperatorDemo1 - 逻辑与和逻辑或](#9-logicoperatordemo1---逻辑与和逻辑或)
- [10. LogicoperatorDemo2 - 异或和逻辑非](#10-logicoperatordemo2---异或和逻辑非)
- [11. LogicoperatorDemo3 - 短路逻辑运算符](#11-logicoperatordemo3---短路逻辑运算符)
- [12. TernaryoperatorDemo1 - 三元运算符](#12-ternaryoperatordemo1---三元运算符)
- [13. Test1 - 练习：获取三位数的个十百位](#13-test1---练习获取三位数的个十百位)
- [14. Test2 - 练习：相亲时髦度比较](#14-test2---练习相亲时髦度比较)
- [15. Test3 - 练习：数字6的伟大判断](#15-test3---练习数字6的伟大判断)
- [16. Test4 - 练习：老虎体重比较](#16-test4---练习老虎体重比较)
- [17. Test5 - 练习：三个和尚最高身高](#17-test5---练习三个和尚最高身高)

---

## 1. ArithmeticoperatorDemo1 - 加减乘运算

### 代码位置
[ArithmeticoperatorDemo1.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo1.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2); // 5
        // -
        System.out.println(5 - 1); // 4
        // *
        System.out.println(3 * 3); // 9

        // 如果在计算的时候有小数参与
        // 结论：在代码中，如果有小数参与计算，结果有可能不精确的
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
```

### 知识点解析

#### 1.1 基本算术运算符

| 运算符 | 含义 | 示例 | 结果 |
|--------|------|------|------|
| + | 加法 | 3 + 2 | 5 |
| - | 减法 | 5 - 1 | 4 |
| * | 乘法 | 3 * 3 | 9 |

#### 1.2 小数计算的精度问题
- **重要结论**：在代码中，如果有小数参与计算，结果有可能不精确
- 原因：浮点数在计算机中使用二进制存储，某些十进制小数无法精确表示
- 示例：`1.1 + 1.01 = 2.1100000000000003`（不是精确的2.11）
- 解决方案：在需要精确计算的场景（如金融计算），使用`BigDecimal`类

### 运行结果
```
5
4
9
2.2
2.1100000000000003
0.09000000000000009
1.1110000000000001
```

---

## 2. ArithmeticoperatorDemo2 - 除法和取模运算

### 代码位置
[ArithmeticoperatorDemo2.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo2.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        // 除法
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333…

        // 取模、取余，实际上也是做除法运算，只不过得到的是余数而已
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1

        // 应用场景
        // 可以用取模来判断，A是否可以被B整除
        // A % B
        // 判断A是否为偶数
        // A % 2 如果结果为0,那么证明A是一个偶数,如果结果为1,那么证明A是一个奇数
    }
}
```

### 知识点解析

#### 2.1 除法运算规则
1. **整数参与计算，结果只能得到整数**
   - `10 / 2 = 5`
   - `10 / 3 = 3`（不是3.333，而是直接截断小数部分）

2. **小数参与计算，结果才有可能得到小数**
   - `10.0 / 3 = 3.3333...`
   - 只要有一个操作数是小数，结果就是小数

#### 2.2 取模运算（取余）
- `%`：取模运算符，得到除法的余数
- `10 % 2 = 0`（10除以2余0）
- `10 % 3 = 1`（10除以3余1）

#### 2.3 取模运算的应用场景

**1. 判断整除**
- `A % B == 0` 表示A可以被B整除

**2. 判断奇偶数**
- `A % 2 == 0` 表示A是偶数
- `A % 2 == 1` 表示A是奇数

**3. 斗地主发牌应用**
- 三个玩家，把每一张牌定义一个序号
- 序号 % 3 = 1，发给第一个玩家
- 序号 % 3 = 2，发给第二个玩家
- 序号 % 3 = 0，发给第三个玩家

### 运行结果
```
5
3
3.3333333333333335
0
1
```

---

## 3. ArithmeticoperatorDemo3 - 类型转换

### 代码位置
[ArithmeticoperatorDemo3.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo3.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 10;
        // 我们现在要强转的是b1 + b2计算后的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result); // 20
        // 如果要转换的数据过大，将会发生错误
    }
}
```

### 知识点解析

#### 3.1 类型提升规则
- 当byte、short、char类型参与运算时，会先提升为int类型
- `b1 + b2` 的结果是int类型，不是byte类型

#### 3.2 强制类型转换
- 格式：`(目标类型) 表达式`
- 示例：`(byte)(b1 + b2)`
- 注意：必须用括号将整个表达式括起来

#### 3.3 数据溢出问题
- 如果要转换的数据超过了目标类型的取值范围，会发生数据溢出错误
- byte的范围：-128 ~ 127
- 如果计算结果超过127，会出现错误

### 运行结果
```
20
```

---

## 4. ArithmeticoperatorDemo4 - char类型的ASCII码

### 代码位置
[ArithmeticoperatorDemo4.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo4.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo4 {
    public static void main(String[] args) {
        char c = 'a';
        int result = c + 0;
        System.out.println(result); // 97
    }
}
```

### 知识点解析

#### 4.1 char类型的底层存储
- char类型在底层存储的是ASCII码值（整数）
- 字符`'a'`的ASCII码值是97
- 字符`'A'`的ASCII码值是65
- 字符`'0'`的ASCII码值是48

#### 4.2 char参与算术运算
- 当char类型与int类型进行运算时，char会自动转换为对应的ASCII码值
- `'a' + 0 = 97 + 0 = 97`

#### 4.3 常用ASCII码值

| 字符 | ASCII码值 |
|------|-----------|
| '0' | 48 |
| 'A' | 65 |
| 'a' | 97 |

### 运行结果
```
97
```

---

## 5. ArithmeticoperatorDemo5 - 自增自减运算

### 代码位置
[ArithmeticoperatorDemo5.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo5.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo5 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a); // 11
        ++a;
        System.out.println(a); // 12
        a--;
        System.out.println(a); // 11
        --a;
        System.out.println(a); // 10
    }
}
```

### 知识点解析

#### 5.1 自增运算符 ++
- `a++`：将变量a的值加1
- `++a`：将变量a的值加1
- **单独使用时，a++和++a效果相同**

#### 5.2 自减运算符 --
- `a--`：将变量a的值减1
- `--a`：将变量a的值减1
- **单独使用时，a--和--a效果相同**

#### 5.3 执行过程
1. `int a = 10;` → a = 10
2. `a++;` → a = 11
3. `++a;` → a = 12
4. `a--;` → a = 11
5. `--a;` → a = 10

### 运行结果
```
11
12
11
10
```

---

## 6. ArithmeticoperatorDemo6 - 自增运算的先用后加和先加后用

### 代码位置
[ArithmeticoperatorDemo6.java](file:///d:/javalearn/day03/src/kru/arithmeticoperator/ArithmeticoperatorDemo6.java)

### 代码内容
```java
package kru.arithmeticoperator;

public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        // 先用后加：先赋值给y，再进行自增
        int y = x++; // y = 10 x = 11
        // 先加后用：先进行自增，再把自增后的结果赋值给z
        int z = ++x; // x = 12 z = 12
        System.out.println("x:" + x); // 12
        System.out.println("y:" + y); // 10
        System.out.println("z:" + z); // 12
    }
}
```

### 知识点解析

#### 6.1 先用后加（后缀形式：x++）
- **规则**：先使用变量的当前值，然后再进行自增
- `int y = x++;`
  1. 先将x的当前值（10）赋值给y
  2. 然后x自增为11
- 结果：`y = 10`, `x = 11`

#### 6.2 先加后用（前缀形式：++x）
- **规则**：先进行自增，然后再使用自增后的值
- `int z = ++x;`
  1. 先将x自增为12
  2. 然后将x的新值（12）赋值给z
- 结果：`x = 12`, `z = 12`

#### 6.3 记忆口诀
- **变量在左边（x++）：先用后加**
- **符号在左边（++x）：先加后用**

### 运行结果
```
x:12
y:10
z:12
```

---

## 7. AssingingoperatorDemo1 - 赋值运算符

### 代码位置
[AssingingoperatorDemo1.java](file:///d:/javalearn/day03/src/kru/assigningoperator/AssingingoperatorDemo1.java)

### 代码内容
```java
package kru.assigningoperator;

public class AssingingoperatorDemo1 {
    public static void main(String[] args) {
        // +=
        //规则：将左边和右边进行相加，然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        a += b; // a = (int)(a + b); 根据等号前面的类型
        System.out.println(a); // 30
        System.out.println(b); // 20

        // 细节
        // +=, -=, *=, /=, %= 底层都隐藏了一个强制类型转换
        short s = 1;
        // s + 1 之后再赋值给 s
        s += 1; // s = (short)(s + 1)

        System.out.println(s); // 2
    }
}
```

### 知识点解析

#### 7.1 复合赋值运算符

| 运算符 | 含义 | 示例 | 等价于 |
|--------|------|------|--------|
| += | 加后赋值 | a += b | a = (int)(a + b) |
| -= | 减后赋值 | a -= b | a = (int)(a - b) |
| *= | 乘后赋值 | a *= b | a = (int)(a * b) |
| /= | 除后赋值 | a /= b | a = (int)(a / b) |
| %= | 取模后赋值 | a %= b | a = (int)(a % b) |

#### 7.2 重要细节
**复合赋值运算符底层隐藏了一个强制类型转换**

- `a += b;` 实际上等价于 `a = (int)(a + b);`
- 根据等号左边变量的类型进行强制转换
- `s += 1;` 等价于 `s = (short)(s + 1);`
- 所以不会报编译错误

#### 7.3 与普通赋值的区别
- `s = s + 1;` 会报错（因为s+1结果是int类型，不能直接赋值给short）
- `s += 1;` 不会报错（底层自动进行了强制类型转换）

### 运行结果
```
30
20
2
```

---

## 8. CompareoperatorDemo1 - 比较运算符

### 代码位置
[CompareoperatorDemo1.java](file:///d:/javalearn/day03/src/kru/compareoperator/CompareoperatorDemo1.java)

### 代码内容
```java
package kru.compareoperator;

public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        // 1. == 判断左右两边是否 相等
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
```

### 知识点解析

#### 8.1 比较运算符

| 运算符 | 含义 | 示例 | 结果 |
|--------|------|------|------|
| == | 等于 | a == b | 判断左右两边是否相等 |
| != | 不等于 | a != b | 判断左右两边是否不相等 |
| > | 大于 | a > b | 判断左边是否大于右边 |
| < | 小于 | a < b | 判断左边是否小于右边 |
| >= | 大于等于 | a >= b | 判断左边是否大于等于右边 |
| <= | 小于等于 | a <= b | 判断左边是否小于等于右边 |

#### 8.2 比较运算符的特点
1. 比较运算符的结果一定是**boolean类型**（true或false）
2. `==` 用于判断相等，不要与赋值运算符`=`混淆
3. 示例：
   - `a == b` → `10 == 10` → `true`
   - `a == c` → `10 == 20` → `false`

### 运行结果
```
true
false
```

---

## 9. LogicoperatorDemo1 - 逻辑与和逻辑或

### 代码位置
[LogicoperatorDemo1.java](file:///d:/javalearn/day03/src/kru/logicoperator/LogicoperatorDemo1.java)

### 代码内容
```java
package kru.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        // & 并且
        // 两边都为真，结果才是真
        System.out.println(true & true); // true
        System.out.println(false & false); // false
        System.out.println(true & false); // false
        System.out.println(false & true); // false

        // | 或者
        // 两边都为假，结果才是假
        System.out.println(true | true); // true
        System.out.println(false | false); // false
        System.out.println(true | false); // true
        System.out.println(false | true); // true
    }
}
```

### 知识点解析

#### 9.1 逻辑与 &
- **规则**：两边都为真，结果才是真
- 类似"并且"的关系

| A | B | A & B |
|---|---|-------|
| true | true | **true** |
| false | false | false |
| true | false | false |
| false | true | false |

#### 9.2 逻辑或 |
- **规则**：两边都为假，结果才是假
- 只要有一个为真，结果就为真
- 类似"或者"的关系

| A | B | A \| B |
|---|---|--------|
| true | true | **true** |
| false | false | **false** |
| true | false | true |
| false | true | true |

### 运行结果
```
true
false
false
false
true
false
true
true
```

---

## 10. LogicoperatorDemo2 - 异或和逻辑非

### 代码位置
[LogicoperatorDemo2.java](file:///d:/javalearn/day03/src/kru/logicoperator/LogicoperatorDemo2.java)

### 代码内容
```java
package kru.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^ 异或
        // 相同为false，不同为true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true

        // ! 逻辑非 取反
        // 提示：
        // 取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false); // true
        System.out.println(!true); // false
    }
}
```

### 知识点解析

#### 10.1 异或 ^
- **规则**：相同为false，不同为true
- 两边值相同，结果为false
- 两边值不同，结果为true

| A | B | A ^ B |
|---|---|-------|
| true | true | **false** |
| false | false | **false** |
| true | false | **true** |
| false | true | **true** |

#### 10.2 逻辑非 !
- **规则**：取反
- `!true` → `false`
- `!false` → `true`

#### 10.3 注意事项
- 取反的感叹号不要写多次
- 要么不写，要么只写一次
- `!!true` 虽然语法正确，但不推荐

### 运行结果
```
false
false
true
true
true
false
```

---

## 11. LogicoperatorDemo3 - 短路逻辑运算符

### 代码位置
[LogicoperatorDemo3.java](file:///d:/javalearn/day03/src/kru/logicoperator/LogicoperatorDemo3.java)

### 代码内容
```java
package kru.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // &&
        // 运行结果和单个&是一样的
        // 表示两边都为真，结果才是真
        System.out.println(true && true); // true
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && false); // false

        // ||
        // 运行结果跟单个|是一样的
        // 表示两边都为假，结果才是假
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println(true || false); // true

        // 短路逻辑运算符具有短路效果
        // 简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
```

### 知识点解析

#### 11.1 短路逻辑与 &&
- 运行结果和单个`&`相同
- **区别**：具有短路效果

| A | B | A && B |
|---|---|--------|
| true | true | **true** |
| false | false | false |
| false | true | false |
| true | false | false |

#### 11.2 短路逻辑或 ||
- 运行结果和单个`|`相同
- **区别**：具有短路效果

| A | B | A \|\| B |
|---|---|----------|
| true | true | **true** |
| false | false | **false** |
| false | true | true |
| true | false | true |

#### 11.3 短路效果

**&& 的短路效果：**
- 当左边为false时，整个表达式必定为false
- 右边不会再被执行

**|| 的短路效果：**
- 当左边为true时，整个表达式必定为true
- 右边不会再被执行

#### 11.4 示例分析
```java
int a = 10;
int b = 10;
boolean result = ++a < 5 && ++b < 5;
```

执行过程：
1. `++a` → a = 11
2. `11 < 5` → false
3. 左边已经是false，右边`++b < 5`不会被执行
4. 结果：`result = false`, `a = 11`, `b = 10`（b没有自增）

#### 11.5 短路运算符 vs 非短路运算符

| 特性 | && / || | & / | |
|------|---------|-------|
| 短路效果 | 有 | 无 |
| 右边是否执行 | 可能不执行 | 一定执行 |
| 性能 | 更高 | 较低 |
| 推荐使用 | **推荐** | 不推荐 |

### 运行结果
```
true
false
false
false
true
false
true
true
false
11
10
```

---

## 12. TernaryoperatorDemo1 - 三元运算符

### 代码位置
[TernaryoperatorDemo1.java](file:///d:/javalearn/day03/src/kru/ternaryoperator/TernaryoperatorDemo1.java)

### 代码内容
```java
package kru.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        // 需求：使用三元运算符，获取两个数的较大值

        int a = 10;
        int b = 6;

        // 使用三元运算符获取两个整数的较大值
        // 三元运算符的结果必须要被使用
        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println("最大值是: " + (a > b ? a : b));
    }
}
```

### 知识点解析

#### 12.1 三元运算符格式
```
条件表达式 ? 值1 : 值2
```

#### 12.2 执行流程
1. 计算条件表达式的值（必须是boolean类型）
2. 如果条件为true，返回值1
3. 如果条件为false，返回值2

#### 12.3 示例分析
```java
int max = a > b ? a : b;
```
- 条件：`a > b`（10 > 6，结果为true）
- 因为条件为true，所以返回a的值（10）
- `max = 10`

#### 12.4 注意事项
- **三元运算符的结果必须要被使用**
- 可以赋值给变量
- 可以直接输出
- 可以参与其他运算
- 输出时注意加括号：`(a > b ? a : b)`

### 运行结果
```
10
最大值是: 10
```

---

## 13. Test1 - 练习：获取三位数的个十百位

### 代码位置
[Test1.java](file:///d:/javalearn/day03/src/kru/test/Test1.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位，十位，百位

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int number = sc.nextInt();

        // 获取个位，十位，百位
        // 公式：
        // 个位：数字 % 10
        // 十位：数字 / 10 % 10
        // 百位：数字 / 10 / 10 % 10
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
    }
}
```

### 知识点解析

#### 13.1 公式总结

| 位数 | 公式 | 以386为例 |
|------|------|-----------|
| 个位 | 数字 % 10 | 386 % 10 = 6 |
| 十位 | 数字 / 10 % 10 | 386 / 10 = 38, 38 % 10 = 8 |
| 百位 | 数字 / 100 % 10 | 386 / 100 = 3, 3 % 10 = 3 |
| 千位 | 数字 / 1000 % 10 | ... |

#### 13.2 通用公式
- **第n位（从右往左，从1开始）：数字 / 10^(n-1) % 10**

#### 13.3 运行示例
输入：386
- 个位：386 % 10 = 6
- 十位：386 / 10 = 38, 38 % 10 = 8
- 百位：386 / 100 = 3, 3 % 10 = 3

### 运行结果示例
```
请输入整数：
386
个位数是：6
十位数是：8
百位数是：3
```

---

## 14. Test2 - 练习：相亲时髦度比较

### 代码位置
[Test2.java](file:///d:/javalearn/day03/src/kru/test/Test2.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的衣服的时髦度(0~10)：");
        int a = input.nextInt();
        System.out.println("请输入相亲对象的衣服的时髦度(0~10)：");
        int b = input.nextInt();
        if ((a >= 0 && a <= 10) && (b >= 0 && b <= 10)) {
            boolean result = a > b;
            System.out.println(result);
        } else {
            System.out.println("输入的值超出范围或者有其他字符！");
        }
    }
}
```

### 知识点解析

#### 14.1 逻辑与&&的综合应用
- `(a >= 0 && a <= 10)`：判断a是否在0~10范围内
- `(b >= 0 && b <= 10)`：判断b是否在0~10范围内
- 整体：`((a >= 0 && a <= 10) && (b >= 0 && b <= 10))`

#### 14.2 if条件判断
- 使用if语句验证输入范围
- 如果输入合法，进行比较
- 如果输入不合法，输出错误提示

#### 14.3 比较运算的结果
- `boolean result = a > b;`
- 比较结果直接赋值给boolean变量
- 如果a > b，则result = true（相亲成功）
- 否则result = false（相亲失败）

### 运行结果示例
```
请输入你的衣服的时髦度(0~10)：
8
请输入相亲对象的衣服的时髦度(0~10)：
6
true
```

---

## 15. Test3 - 练习：数字6的伟大判断

### 代码位置
[Test3.java](file:///d:/javalearn/day03/src/kru/test/Test3.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = input.nextInt();
        System.out.println("请输入第二个数：");
        int b = input.nextInt();

        boolean result = a == 6 || b == 6 || ((a + b) == 6);

        System.out.println(result);
    }
}
```

### 知识点解析

#### 15.1 三元运算符的应用

| 条件 | 判断方式 | 说明 |
|------|---------|------|
| 其中一个为6 | `a == 6 || b == 6` | 使用逻辑或判断 |
| 和为6的倍数 | `(a + b) % 6 == 0` | 使用取模判断整除 |
| 其他情况 | - | 输出false |

#### 15.2 逻辑或||的链式使用
- 可以连续使用多个`||`
- `a == 6 || b == 6 || ((a + b) % 6 == 0)`
- 只要有一个条件成立，结果就为true

#### 15.3 注释掉的代码
- 原始代码使用`if-else`语句
- 优化后直接使用三元运算符
- 代码更简洁

### 运行结果示例
```
请输入第一个数：
6
请输入第二个数：
10
true
```

---

## 16. Test4 - 练习：老虎体重比较

### 代码位置
[Test4.java](file:///d:/javalearn/day03/src/kru/test/Test4.java)

### 代码内容
```java
package kru.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一支老虎的体重：");
        int a = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int b = sc.nextInt();

        String result = a == b ? "相同" : "不同";
        System.out.println(result);
    }
}
```

### 知识点解析

#### 16.1 三元运算符返回字符串
- 三元运算符可以返回任意类型的值
- 不仅可以返回数字，还可以返回字符串
- `a == b ? "相同" : "不同"`

#### 16.2 程序流程
1. 录入第一只老虎体重
2. 录入第二只老虎体重
3. 使用三元运算符比较体重
4. 输出比较结果

### 运行结果示例
```
请输入第一支老虎的体重：
150
请输入第二只老虎的体重：
150
相同
```

---

## 17. Test5 - 练习：三个和尚最高身高

### 代码位置
[Test5.java](file:///d:/javalearn/day03/src/kru/test/Test5.java)

### 代码内容
```java
package kru.test;

public class Test5 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;

        int t1 = a > b ? a : b;
        int t2 = c > t1 ? c : t1;

        System.out.println("三个和尚的最高身高是：" + t2);
    }
}
```

### 知识点解析

#### 17.1 求多个数最大值的思路
**使用三元运算符两两比较**

1. 先比较前两个数，得到较大值
   - `int t1 = a > b ? a : b;`
   - t1 = 150 > 210 ? 150 : 210 = 210

2. 再用第三个数与前一步的较大值比较
   - `int t2 = c > t1 ? c : t1;`
   - t2 = 165 > 210 ? 165 : 210 = 210

3. t2就是三个数中的最大值

#### 17.2 扩展：求n个数的最大值
- 可以使用循环结构（后面会学习）
- 或者继续使用两两比较的方式

### 运行结果
```
三个和尚的最高身高是：210
```

---

## Day03 总结

### 核心知识点

1. **算术运算符**
   - 加减乘除：`+`、`-`、`*`、`/`
   - 取模：`%`
   - 自增自减：`++`、`--`
   - 注意：整数除法只能得到整数，小数计算可能不精确

2. **赋值运算符**
   - 基本赋值：`=`
   - 复合赋值：`+=`、`-=`、`*=`、`/=`、`%=`
   - 复合赋值底层隐藏了强制类型转换

3. **比较运算符**
   - `==`、`!=`、`>`、`<`、`>=`、`<=`
   - 结果一定是boolean类型

4. **逻辑运算符**
   - 逻辑与：`&`（两边都为真才为真）
   - 逻辑或：`|`（有一个为真就为真）
   - 异或：`^`（相同为假，不同为真）
   - 逻辑非：`!`（取反）
   - 短路逻辑：`&&`、`||`（推荐使用）

5. **三元运算符**
   - 格式：`条件 ? 值1 : 值2`
   - 条件为true返回值1，为false返回值2
   - 结果必须被使用

### 运算符优先级（从高到低）

1. `()` 括号
2. `++`、`--` 自增自减
3. `*`、`/`、`%` 乘除取模
4. `+`、`-` 加减
5. `>`、`<`、`>=`、`<=` 比较
6. `==`、`!=` 等于
7. `&`、`^`、`|` 逻辑运算
8. `&&`、`||` 短路逻辑
9. `=`、`+=`、`-=` 等 赋值运算

### 常见问题

1. **小数计算不精确**：使用BigDecimal进行精确计算
2. **类型提升**：byte、short、char运算时先提升为int
3. **短路效果**：`&&`和`||`有短路效果，推荐使用
4. **自增前后缀**：`x++`先用后加，`++x`先加后用
5. **三元运算符**：结果必须被使用
