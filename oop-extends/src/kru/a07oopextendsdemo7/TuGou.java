package kru.a07oopextendsdemo7;

public class TuGou extends Dog{
    @Override
    public void eat() {
        super.eat();
        eatOldFood();
    }
    public void eatOldFood() {
        System.out.println("吃剩饭");
    }
}
