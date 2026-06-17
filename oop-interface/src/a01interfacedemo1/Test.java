package a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小吉", 1);

        f.show();
        f.eat();
        f.swim();

        line();

        Dog d = new Dog("修狗", 2);

        d.show();
        d.eat();
        d.swim();

        line();

        Rabbit r = new Rabbit("兔女郎", 2);

        r.show();
        r.eat();
    }

    public static void line() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
