# Day09 Java面向对象学习笔记

## 目录
- [1. test1/Role - 角色类](#1-test1role---角色类)
- [2. test1/GameTest - 回合制格斗游戏](#2-test1gametest---回合制格斗游戏)
- [3. test2/Role - 升级版角色类](#3-test2role---升级版角色类)
- [4. test2/GameTest - 升级版格斗游戏](#4-test2gametest---升级版格斗游戏)
- [5. test2/Test - printf格式化输出](#5-test2test---printf格式化输出)
- [6. test3/Goods - 商品类](#6-test3goods---商品类)
- [7. test3/GoodsTest - 商品数组管理](#7-test3goodstest---商品数组管理)
- [8. test4/Car - 汽车类](#8-test4car---汽车类)
- [9. test4/CarTest - 键盘录入汽车信息](#9-test4cartest---键盘录入汽车信息)
- [10. test5/Phone - 手机类](#10-test5phone---手机类)
- [11. test5/PhoneTest - 手机平均价格计算](#11-test5phonetest---手机平均价格计算)
- [12. test6/GirlFriend - 女朋友类](#12-test6girlfriend---女朋友类)
- [13. test6/GirlFriendTest - 女朋友信息管理](#13-test6girlfriendtest---女朋友信息管理)
- [14. test7/Student - 学生类](#14-test7student---学生类)
- [15. test7/StudentTest - 学生信息管理系统](#15-test7studenttest---学生信息管理系统)
- [16. test8/Student - 学生类（重复）](#16-test8student---学生类重复)
- [17. test8/StudentTest2 - 学生信息管理练习](#17-test8studenttest2---学生信息管理练习)

---

## 1. test1/Role - 角色类

### 代码位置
[Role.java](file:///d:/javalearn/day09/src/kru/test1/Role.java)

### 代码内容
```java
package kru.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {}

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getBlood() { return blood; }
    public void setBlood(int blood) { this.blood = blood; }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) - 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了"
                + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBlood + "点血量");
    }
}
```

### 知识点解析

#### 1.1 面向对象基础概念

**封装**：
- 使用`private`修饰成员变量，隐藏内部实现细节
- 提供`getter/setter`方法供外部访问和修改

#### 1.2 构造方法

| 构造方法 | 说明 |
|---------|------|
| `Role()` | 无参构造方法 |
| `Role(String name, int blood)` | 有参构造方法，初始化name和blood |

#### 1.3 this关键字
- `this.name`：表示当前对象的name属性
- 用于区分成员变量和局部变量（参数名相同时）

#### 1.4 attack方法
- 参数：`Role role`（被攻击的目标）
- `this`：方法的调用者（攻击者）
- `role`：参数（被攻击者）
- 伤害计算：随机0-19点伤害
- 血量不能为负数，使用三元运算符保证最小为0

---

## 2. test1/GameTest - 回合制格斗游戏

### 代码位置
[GameTest.java](file:///d:/javalearn/day09/src/kru/test1/GameTest.java)

### 代码内容
```java
package kru.test1;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("耄耄",100);
        Role r2 = new Role("坤坤", 100);

        while(true) {
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O 了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O 了" + r1.getName());
                break;
            }
        }
    }
}
```

### 知识点解析

#### 2.1 对象创建
```java
Role r1 = new Role("耄耄", 100);
Role r2 = new Role("坤坤", 100);
```

#### 2.2 回合制游戏逻辑
1. r1攻击r2
2. 检查r2血量是否为0，如果是则r1获胜
3. r2攻击r1
4. 检查r1血量是否为0，如果是则r2获胜
5. 循环直到一方血量归零

#### 2.3 while(true) + break
- 无限循环模拟持续战斗
- 使用break在满足条件时退出循环

### 运行结果示例
```
耄耄举起拳头，打了坤坤一下，造成了10点伤害，坤坤还剩下了90点血量
坤坤举起拳头，打了耄耄一下，造成了5点伤害，耄耄还剩下了95点血量
...
耄耄K.O 了坤坤
```

---

## 3. test2/Role - 升级版角色类

### 代码位置
[Role.java](file:///d:/javalearn/day09/src/kru/test2/Role.java)

### 代码内容
```java
package kru.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    public Role() {}

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        } else if (gender == '女') {
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        } else {
            this.face = "面目狰狞";
        }
    }

    String[] boyfaces={"风流倜傥","器宇轩昂","相貌英俊","五官端正","面目全非"};
    String[] girlfaces={"美轮美奂","沉鱼落雁","亭亭玉立","惨不忍睹","形貌丑陋"};

    String[] attacks_desc={
        "%s使出一招[背心订],转到对方后面，一掌向%s背心拍去",
        "%s使出了一招[游龙],抓向%s",
        "%s大喝一声，锤向%s"
    };

    String[] hurt_desc={
        "结果%s退了半步，毫发无损",
        "结果给%s造成一处於伤",
        "结果一击命中，%s弯下腰",
        "结果%s痛苦地闷哼一声",
        "结果%s摇摇晃晃",
        "结果%s脸色惨白",
        "结果%s口吐鲜血",
        "结果%s倒了下去"
    };

    public void attack(Role role) {
        Random r = new Random();
        System.out.printf(attacks_desc[r.nextInt(attacks_desc.length)],
                this.getName(), role.getName());
        int hurt = r.nextInt(20) - 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        
        if (remainBlood >= 90 && remainBlood <= 100) {
            System.out.printf(hurt_desc[0], role.getName());
        } else if (remainBlood >= 80 && remainBlood <= 89) {
            System.out.printf(hurt_desc[1], role.getName());
        } // ... 更多血量区间判断
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("面目为：" + getFace());
    }
}
```

### 知识点解析

#### 3.1 新增属性
- `gender`：性别
- `face`：长相（根据性别随机生成）

#### 3.2 数组作为成员变量
```java
String[] boyfaces = {"风流倜傥", "器宇轩昂", ...};
String[] girlfaces = {"美轮美奂", "沉鱼落雁", ...};
```

#### 3.3 随机长相生成
- 根据性别从对应的数组中随机选择一个长相
- 在构造方法中调用`setFace(gender)`初始化

#### 3.4 攻击描述数组
- 使用字符串数组存储多种攻击描述
- 随机选择一种攻击方式

#### 3.5 受伤描述
- 根据剩余血量区间选择不同的受伤描述
- 血量越低，受伤描述越严重

#### 3.6 showRoleInfo方法
- 展示角色完整信息

---

## 4. test2/GameTest - 升级版格斗游戏

### 代码位置
[GameTest.java](file:///d:/javalearn/day09/src/kru/test2/GameTest.java)

### 代码内容
```java
package kru.test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("耄耄",100, '猫');
        Role r2 = new Role("坤坤", 100,'男');

        System.out.println("角色1：");
        r1.showRoleInfo();
        System.out.println("角色2：");
        r2.showRoleInfo();

        while(true) {
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O 了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O 了" + r1.getName());
                break;
            }
        }
    }
}
```

### 知识点解析

#### 4.1 新增功能
- 创建角色时指定性别
- 战斗前展示角色信息
- 战斗过程有更丰富的描述

### 运行结果示例
```
角色1：
姓名为：耄耄
血量为：100
性别为：猫
面目为：面目狰狞
角色2：
姓名为：坤坤
血量为：100
性别为：男
面目为：风流倜傥
耄耄使出一招[背心订],转到对方后面，一掌向坤坤背心拍去
结果坤坤退了半步，毫发无损
...
```

---

## 5. test2/Test - printf格式化输出

### 代码位置
[Test.java](file:///d:/javalearn/day09/src/kru/test2/Test.java)

### 代码内容
```java
package kru.test2;

public class Test {
    public static void main(String[] args) {
        System.out.printf("你好 %s \n", "张三");
        System.out.printf("%s 你好 %s \n", "张三","张三");
    }
}
```

### 知识点解析

#### 5.1 printf格式化输出
- `%s`：字符串占位符
- `\n`：换行符

#### 5.2 常用格式化符号

| 符号 | 类型 | 示例 |
|------|------|------|
| %s | 字符串 | `printf("%s", "hello")` |
| %d | 整数 | `printf("%d", 100)` |
| %f | 浮点数 | `printf("%.2f", 3.14)` |
| %c | 字符 | `printf("%c", 'A')` |
| %n | 换行 | 平台无关的换行符 |

---

## 6. test3/Goods - 商品类

### 代码位置
[Goods.java](file:///d:/javalearn/day09/src/kru/test3/Goods.java)

### 代码内容
```java
package kru.test3;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods() {}

    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // getter/setter方法...
}
```

### 知识点解析

#### 6.1 商品属性
- `id`：商品编号（String）
- `name`：商品名称
- `price`：商品价格（double）
- `count`：库存数量（int）

#### 6.2 标准JavaBean
- 私有成员变量
- 无参构造
- 有参构造
- getter/setter方法

---

## 7. test3/GoodsTest - 商品数组管理

### 代码位置
[GoodsTest.java](file:///d:/javalearn/day09/src/kru/test3/GoodsTest.java)

### 代码内容
```java
package kru.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods G1 = new Goods("001", "华为P40", 5999.0, 100);
        Goods G2 = new Goods("002", "保温杯", 277.0, 50);
        Goods G3 = new Goods("003", "枸杞", 12.7, 70);
        
        arr[0] = G1;
        arr[1] = G2;
        arr[2] = G3;
        
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + 
                    goods.getPrice() + ", " + goods.getCount());
        }
    }
}
```

### 知识点解析

#### 7.1 对象数组
- 数组元素是对象引用
- 先创建对象数组：`Goods[] arr = new Goods[3];`
- 再创建对象并赋值到数组

#### 7.2 遍历对象数组
```java
for (int i = 0; i < arr.length; i++) {
    Goods goods = arr[i];  // 获取当前对象
    // 使用goods访问属性
}
```

### 运行结果
```
001, 华为P40, 5999.0, 100
002, 保温杯, 277.0, 50
003, 枸杞, 12.7, 70
```

---

## 8. test4/Car - 汽车类

### 代码位置
[Car.java](file:///d:/javalearn/day09/src/kru/test4/Car.java)

### 代码内容
```java
package kru.test4;

public class Car {
    private String brand;
    private int price;
    private String color;

    public Car() {}
    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    // getter/setter方法...
}
```

### 知识点解析

#### 8.1 汽车属性
- `brand`：品牌
- `price`：价格
- `color`：颜色

---

## 9. test4/CarTest - 键盘录入汽车信息

### 代码位置
[CarTest.java](file:///d:/javalearn/day09/src/kru/test4/CarTest.java)

### 代码内容
```java
package kru.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.printf("----请输入第%d辆车的信息----\n", i + 1);
            System.out.printf("请输入第%d辆车的汽车品牌：\n", i + 1);
            String br = sc.next();
            c.setBrand(br);
            System.out.printf("请输入第%d辆车的汽车价格：\n", i + 1);
            int pr = sc.nextInt();
            c.setPrice(pr);
            System.out.printf("请输入第%d辆车的汽车颜色：\n", i + 1);
            String cl = sc.next();
            c.setColor(cl);
            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                "品牌：" + arr[i].getBrand() + ", 价格：" + 
                arr[i].getPrice() + ", 颜色：" + arr[i].getColor()
            );
        }
    }
}
```

### 知识点解析

#### 9.1 键盘录入对象属性
- 先创建空对象：`Car c = new Car();`
- 使用setter方法逐个设置属性
- 将对象存入数组

#### 9.2 循环录入
- 使用for循环多次录入
- 每次循环创建新对象

### 运行结果示例
```
----请输入第1辆车的信息----
请输入第1辆车的汽车品牌：
宝马
请输入第1辆车的汽车价格：
500000
请输入第1辆车的汽车颜色：
黑色
...
品牌：宝马, 价格：500000, 颜色：黑色
...
```

---

## 10. test5/Phone - 手机类

### 代码位置
[Phone.java](file:///d:/javalearn/day09/src/kru/test5/Phone.java)

### 代码内容
```java
package kru.test5;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {}
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    // getter/setter方法（带注释）...
}
```

### 知识点解析

#### 10.1 JavaDoc注释
```java
/**
 * 获取
 * @return brand
 */
public String getBrand() { return brand; }
```
- 使用`/** */`格式
- `@return`说明返回值

---

## 11. test5/PhoneTest - 手机平均价格计算

### 代码位置
[PhoneTest.java](file:///d:/javalearn/day09/src/kru/test5/PhoneTest.java)

### 代码内容
```java
package kru.test5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        Phone[] phones = new Phone[3];

        p1.setBrand("小米");
        p1.setPrice(2999.9);
        p1.setColor("白色");
        // ... 设置p2, p3

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        double sum = 0.0;
        for (int i = 0; i < phones.length; i++) {
            System.out.println(
                "品牌：" + phones[i].getBrand() + "价格："+ phones[i].getPrice()+
                " 颜色：" + phones[i].getColor()
            );
            sum =+ phones[i].getPrice() ;  // 注意：此处有误
        }
        double avgResult = sum / phones.length;
        System.out.printf("计算后的手机平均价格：%.2f \n", avgResult);
    }
}
```

### 知识点解析

#### 11.1 代码问题
**注意**：`sum =+ phones[i].getPrice()` 写法错误
- 正确写法：`sum += phones[i].getPrice()`
- `=+` 实际上等同于 `sum = +值`，即赋值而不是累加

#### 11.2 格式化输出浮点数
```java
System.out.printf("计算后的手机平均价格：%.2f \n", avgResult);
```
- `%.2f`：保留两位小数

---

## 12. test6/GirlFriend - 女朋友类

### 代码位置
[GirlFriend.java](file:///d:/javalearn/day09/src/kru/test6/GirlFriend.java)

### 代码内容
```java
package kru.test6;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String Hobby;

    public GirlFriend() {}
    public GirlFriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Hobby = hobby;  // 注意命名规范
    }
    // getter/setter...

    public double Avg(GirlFriend[] girlFriendInfo) {
        double sum = 0.0;
        for (int i = 0; i < girlFriendInfo.length; i++) {
            sum += girlFriendInfo[i].getAge();
        }
        return sum / girlFriendInfo.length;
    }

    public int LowerThanAge(GirlFriend[] girlFriendsInfo, double avgAge) {
        int CountLower = 0;
        for (int i = 0; i < girlFriendsInfo.length; i++) {
            if (girlFriendsInfo[i].getAge() < avgAge) {
                CountLower++;
            }
        }
        return CountLower;
    }

    public void printInfo(GirlFriend[] girlFriendInfo) {
        for (int i = 0; i < girlFriendInfo.length; i++) {
            System.out.println(
                "第" + (i + 1) + "个女朋友  " +
                "姓名：" + girlFriendInfo[i].getName() + "，" +
                "年龄：" + girlFriendInfo[i].getAge() + "，" +
                "性别：" + girlFriendInfo[i].getGender() + "，" +
                "爱好：" + girlFriendInfo[i].getHobby()
            );
        }
    }
}
```

### 知识点解析

#### 12.1 成员方法
- `Avg`：计算平均年龄
- `LowerThanAge`：统计低于平均年龄的人数
- `printInfo`：打印所有信息

#### 12.2 命名规范问题
- `Hobby` 应该小写开头：`hobby`
- 方法名应小驼峰：`avg`、`lowerThanAge`

#### 12.3 方法设计问题
这些方法不应该放在GirlFriend类中，而应该放在测试类或专门的管理类中。

---

## 13. test6/GirlFriendTest - 女朋友信息管理

### 代码位置
[GirlFriendTest.java](file:///d:/javalearn/day09/src/kru/test6/GirlFriendTest.java)

### 代码内容
```java
package kru.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = new GirlFriend("小诗诗", 28, "女", "磨刀");
        GirlFriend g2 = new GirlFriend("乃依", 18, "男", "射箭");
        GirlFriend g3 = new GirlFriend("林尼", 18, "男", "射箭");
        GirlFriend g4 = new GirlFriend("笑面教授", 18, "女", "学习");

        GirlFriend[] arr = new GirlFriend[4];
        arr[0] = g1; arr[1] = g2; arr[2] = g3; arr[3] = g4;

        GirlFriend clcAvg = new GirlFriend();
        double resultAvg = clcAvg.Avg(arr);
        System.out.println(arr.length + "个女朋友的平均年龄为：" + resultAvg);

        GirlFriend countLowerThanAvg = new GirlFriend();
        int resultCount = countLowerThanAvg.LowerThanAge(arr, resultAvg);
        System.out.println("年龄比平均值低的女朋友有 " + resultCount + "个");

        GirlFriend printInfo = new GirlFriend();
        printInfo.printInfo(arr);
    }
}
```

### 知识点解析

#### 13.1 设计问题
- 创建无意义的对象来调用方法
- 应该将这些方法声明为`static`或者放在单独的管理类中
- `new GirlFriend()`调用无参构造创建对象只是为了调用方法，不符合面向对象思想

#### 13.2 改进建议
```java
// 方法应该声明为static
public static double Avg(GirlFriend[] arr) { ... }
// 或者放在专门的管理类中
public class GirlFriendManager {
    public double calculateAvg(GirlFriend[] arr) { ... }
}
```

---

## 14. test7/Student - 学生类

### 代码位置
[Student.java](file:///d:/javalearn/day09/src/kru/test7/Student.java)

### 代码内容
```java
package kru.test7;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {}
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // getter/setter...
}
```

### 知识点解析

#### 14.1 学生属性
- `id`：学号
- `name`：姓名
- `age`：年龄

---

## 15. test7/StudentTest - 学生信息管理系统

### 代码位置
[StudentTest.java](file:///d:/javalearn/day09/src/kru/test7/StudentTest.java)

### 代码内容
```java
package kru.test7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[4];
        Student s1 = new Student(1,"小张",19);
        Student s2 = new Student(2,"李四",24);
        Student s3 = new Student(3,"王五",25);
        arr[0] = s1; arr[1] = s2; arr[2] = s3;

        Student s4 = new Student(4,"王五",25);
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            if (getCount(arr) == arr.length) {
                Student[] newArr = createNewArr(arr);
                newArr[getCount(arr)] = s4;
            } else {
                arr[getCount(arr)] = s4;
            }
        }
        printInfo(arr);
        deleteInfo(arr, 3);
        printInfo(arr);
        heimaplusAge(arr, "heima002");
    }

    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) { count++; }
        }
        return count;
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void deleteInfo(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
                    System.out.println("Id为" + id + "的学生信息，删除成功！");
                }
            } else {
                System.out.println("删除失败！Id" + id + "不存在！");
            }
        }
    }

    public static void printInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(
                    students[i].getId() + " " + students[i].getName() + 
                    " " + students[i].getAge()
                );
            }
        }
    }
}
```

### 知识点解析

#### 15.1 CRUD操作

| 操作 | 方法 | 说明 |
|------|------|------|
| Create | 添加学生 | 检查ID唯一性，数组扩容 |
| Read | printInfo | 遍历打印非空学生 |
| Update | heimaplusAge | 根据姓名修改年龄 |
| Delete | deleteInfo | 根据ID删除学生 |

#### 15.2 唯一性判断
```java
public static boolean contains(Student[] students, int id)
```
- 遍历数组，检查ID是否已存在
- 需要非空判断

#### 15.3 动态数组扩容
```java
public static Student[] createNewArr(Student[] arr)
```
- 创建更大的新数组
- 将旧数组元素复制到新数组
- 返回新数组

#### 15.4 统计非空元素个数
```java
public static int getCount(Student[] arr)
```
- 遍历数组统计非null的元素个数

#### 15.5 字符串比较问题
```java
if (students[i].getName() == name)  // 错误！
```
- **应该使用`equals()`**：`students[i].getName().equals(name)`
- `==`比较的是地址，`equals()`比较的是内容

---

## 16. test8/Student - 学生类（重复）

### 代码位置
[Student.java](file:///d:/javalearn/day09/src/kru/test8/Student.java)

### 说明
与test7中的Student类相同。

---

## 17. test8/StudentTest2 - 学生信息管理练习

### 代码位置
[StudentTest2.java](file:///d:/javalearn/day09/src/kru/test8/StudentTest2.java)

### 代码内容
```java
package kru.test8;

import kru.test7.Student;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "小王", 18);
        Student stu2 = new Student(2, "小琴", 19);
        Student stu3 = new Student(3, "小银", 20);
        arr[0] = stu1; arr[1] = stu2; arr[2] = stu3;

        deleteInfo(arr, 1);
        printInfo(arr);
        alterAge(arr, 2);
        printInfo(arr);
    }

    public static void alterAge(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    int age = students[i].getAge();
                    students[i].setAge(age + 1);
                    System.out.println("+1 岁的操作 成功！");
                }
            }
        }
    }

    public static void deleteInfo(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("id： "+ id +" 学生信息，删除成功！");
            }
        }
    }

    public static void printInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("id: " + students[i].getId() + 
                    " name：" + students[i].getName() + 
                    " age: " + students[i].getAge());
            }
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) { return i; }
            }
        }
        return -1;
    }

    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) { return true; }
            }
        }
        return false;
    }
}
```

### 知识点解析

#### 17.1 跨包导入
```java
import kru.test7.Student;
```
- 使用其他包的类需要import

#### 17.2 getIndex方法
- 查找元素在数组中的索引
- 找不到返回-1

#### 17.3 删除操作的空指针问题
```java
if (students[i].getId() == id)  // 可能空指针
```
- 应该先判断`students[i] != null`

### 运行结果
```
id： 1 学生信息，删除成功！
id: 2 name：小琴 age: 19
id: 3 name：小银 age: 20
+1 岁的操作 成功！
id: 2 name：小琴 age: 20
id: 3 name：小银 age: 20
```

---

## Day09 总结

### 核心知识点

1. **面向对象基础**
   - 类和对象的概念
   - 封装：private + getter/setter
   - 构造方法：无参和有参
   - this关键字

2. **对象数组**
   - 数组存储对象引用
   - 遍历对象数组
   - 对象数组的CRUD操作

3. **键盘录入对象**
   - 创建空对象
   - 使用setter设置属性
   - 存入数组

4. **数组管理**
   - 唯一性判断
   - 数组扩容
   - 非空统计
   - 增删改查

5. **随机数应用**
   - Random类生成随机值
   - 从数组中随机选取元素
   - 随机伤害、随机描述

### 常见问题

1. **字符串比较**：使用`equals()`而非`==`
2. **空指针异常**：操作前检查null
3. **方法归属**：管理类方法不应放在实体类中
4. **命名规范**：变量小驼峰，类名大驼峰
5. **=+ 与 +=**：`=+`是赋值，`+=`是累加
