package kru.a01oopextendsdemo1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void lookupHome() {
        super.lookupHome();
    }
}
