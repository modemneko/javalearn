package kru.a11oopextendstest11;

public class Lecturer extends Employee{
    @Override
    public void work() {
        super.work();
        System.out.println("正在讲课");
    }

    public Lecturer() {
    }

    public Lecturer(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }
}
