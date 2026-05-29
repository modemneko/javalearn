package kru.a01oopextendsdemo1;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int kilogram, String gender) {
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
    public void catchFat() {
        super.catchFat();
    }
}
