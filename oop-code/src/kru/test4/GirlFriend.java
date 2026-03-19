package kru.test4;

public class GirlFriend {
    // 属性
    private int age;

    // 就近原则
    public void method() {
        // int age = 10;
        // 谁离我近，我就用谁
        System.out.println(age);
        System.out.println(this.age);
    }
}
