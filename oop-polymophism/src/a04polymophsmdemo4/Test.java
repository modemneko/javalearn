package a04polymophsmdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();

        Dog dog = new Dog();

        dog.setName("狗");
        dog.setAge(2);
        dog.setColor("黑");

        p1.setName("老王");
        p1.setAge(30);

        p1.keepPet(dog, "骨头");

        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }
        System.out.println();

        Person p2 = new Person();

        Cat cat = new Cat();

        cat.setName("猫");
        cat.setAge(3);
        cat.setColor("灰");

        p2.setName("老李");
        p2.setAge(25);

        p2.keepPet(cat, "鱼");
    }
}
