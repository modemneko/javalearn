package kru.a11oopextendstest11;

public class Tutor extends Employee{
    @Override
    public void work() {
        super.work();
        System.out.println("正在助教");
    }

    public Tutor() {
    }

    public Tutor(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }
}
