package kru.a07oopextendsdemo7;

public class Husky extends Dog{
    @Override
    public void eat() {
        super.eat();
        eatDogFood();
    }

    public void eatDogFood() {
        System.out.println("吃狗粮");
    }

    public void breakHome() {
        System.out.println("拆家");
    }
}
