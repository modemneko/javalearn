package kru.test4;

public class GirlFriend {
    // 属性
    private String name;
    private int age;
    private String gender;

    // 针对于每一个私有化的成员变量，都要提供get和set方法

    // 作用：给成员变量name进行赋值的
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    // age
    // setAge: 给成员变量age进行赋值
    // getAge： 对外提供成员变量age的值
    public void setAge(int a) {
        if (a >= 10 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }

    // 行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
