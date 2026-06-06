package a04polymophsmdemo4;

public class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        System.out.println("年龄为" +
                this.age + "岁的" +
                this.name + "养了一只" +
                animal.color + "颜色的" +
                animal.age + "岁的" + something
        );

        animal.eat(something);
    }
}
