# Java基础学习笔记汇总

本仓库包含了从Java基础到面向对象编程的完整学习笔记，涵盖所有day模块的Java代码。

---

## 目录导航

| 模块 | 内容 | 笔记链接 |
|------|------|---------|
| day01 | Java基础：HelloWorld、Scanner、变量、数据类型 | [README](day01/README.md) |
| day03 | Java运算符：算术、赋值、比较、逻辑、三元运算符 | [README](day03/README.md) |
| day04 | 流程控制：if语句、switch语句、for循环、while循环 | [README](day04/README.md) |
| day05 | 数组与循环进阶：数组、continue/break、Random | [README](day05/README.md) |
| day06 | 方法：方法定义、参数、返回值、方法重载 | [README](day06/README.md) |
| day07 | 综合练习：机票、验证码、评委打分、数字加密、双色球 | [README](day07/README.md) |
| day09 | 面向对象：类与对象、封装、对象数组 | [README](day09/README.md) |
| day10 | 常用API：String、StringBuilder、StringJoiner | [README](day10/README.md) |
| day11 | 集合：ArrayList、泛型、包装类 | [README](day11/README.md) |
| twodimensionarr | 二维数组：静态/动态初始化、遍历 | [README](twodimensionarr/README.md) |
| oop-code | 面向对象进阶：封装、this、构造方法、JavaBean | [README](oop-code/README.md) |

---

## 知识点概览

### 1. Java基础 (day01)

- **HelloWorld**：第一个Java程序
- **Scanner键盘录入**：`import java.util.Scanner;`
- **8种基本数据类型**：byte、short、int、long、float、double、char、boolean
- **变量定义**：`数据类型 变量名 = 数据值;`
- **字符串**：String类型

### 2. 运算符 (day03)

- **算术运算符**：+、-、*、/、%、++、--
- **赋值运算符**：=、+=、-=、*=、/=、%=
- **比较运算符**：==、!=、>、<、>=、<=
- **逻辑运算符**：&、|、^、!、&&、||
- **三元运算符**：`条件 ? 值1 : 值2`

### 3. 流程控制 (day04)

- **if语句**：单分支、双分支、多分支、嵌套
- **switch语句**：case匹配、break、default
- **for循环**：已知循环次数
- **while循环**：未知循环次数

### 4. 数组 (day05)

- **数组定义**：静态初始化、动态初始化
- **数组访问**：`arr[索引]`
- **数组遍历**：for循环、增强for循环
- **常见算法**：求和、求最值、统计、反转、打乱

### 5. 方法 (day06)

- **方法定义**：`public static 返回值类型 方法名(参数列表) {}`
- **方法调用**：直接调用、赋值调用、输出调用
- **方法重载**：方法名相同，参数列表不同
- **参数传递**：基本类型传值，引用类型传地址

### 6. 面向对象 (day09, oop-code)

- **类和对象**：类是模板，对象是实例
- **封装**：private + getter/setter
- **构造方法**：无参构造、有参构造
- **this关键字**：代表当前对象
- **JavaBean规范**：公共类、私有属性、构造方法、getter/setter

### 7. 常用API (day10)

- **String**：不可变字符串，equals比较内容
- **StringBuilder**：可变字符串，append、reverse
- **StringJoiner**：自动添加分隔符

### 8. 集合 (day11)

- **ArrayList**：可变长度数组集合
- **泛型**：`<类型>`限定存储类型
- **包装类**：int→Integer, char→Character

### 9. 二维数组 (twodimensionarr)

- **静态初始化**：已知具体值
- **动态初始化**：已知行列数
- **遍历**：双重for循环

---

## 学习路线

```
Java基础 → 运算符 → 流程控制 → 数组 → 方法 → 面向对象 → API → 集合
```

1. **第一阶段**：day01、day03 - 掌握基础语法和运算符
2. **第二阶段**：day04、day05 - 掌握流程控制和数组
3. **第三阶段**：day06、day07 - 掌握方法和综合练习
4. **第四阶段**：day09、oop-code - 掌握面向对象编程
5. **第五阶段**：day10、day11 - 掌握常用API和集合

---

## 代码规范

### 命名规范
- **类名**：大驼峰，如 `Student`、`HelloWorld`
- **方法名**：小驼峰，如 `getName`、`printInfo`
- **变量名**：小驼峰，如 `studentName`、`age`
- **常量名**：全大写，如 `MAX_VALUE`

### 编码规范
- 每条语句以分号结尾
- 使用大括号包围代码块
- 缩进使用4个空格
- 方法之间空一行

---

## 常见问题

1. **String比较**：必须使用`equals()`，不能用`==`
2. **数组索引**：从0开始，最大索引为`length-1`
3. **nextInt范围**：`nextInt(1, 10)`生成1-9，不包含10
4. **构造方法**：写了有参构造后，必须手动写无参构造
5. **封装**：成员变量用private，提供getter/setter

---

## 更新日志

- 2026-05-10：完成所有模块学习笔记
