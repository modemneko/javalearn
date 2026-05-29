package kru.a04staticdemo4;

/*
总结：
静态方法中没有this关键字
静态方法中，只能访问静态。
非静态方法可以访问所有。
静态方法不能访问非静态的东西*/

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1(Student this) {
        System.out.println("this: " + this);
        System.out.println(this.name + ", " + this.age +
                ", " + teacherName);

        this.show2();
    }

    public void show2() {
        System.out.println("show2");
    }

    public static void method() {
        System.out.println("静态方法");
    }
}
