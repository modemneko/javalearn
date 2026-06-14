package kru.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("wawa",20);

        frog.drink();
        frog.eat();

        Dog dog = new Dog("doge", 24);

        dog.drink();
        dog.eat();

        Sheep sheep = new Sheep("sheet", 19);

        sheep.drink();
        sheep.eat();

    }
}
