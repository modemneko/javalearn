package kru.a07oopextendsdemo7;

public class Sapi extends Dog{
    @Override
    public void eat() {
        super.eat();
        Husky husky = new Husky();
        husky.eatDogFood();
        eatBone();
    }

    public void eatBone() {
        System.out.println("吃骨头");
    }
}
