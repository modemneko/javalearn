package kru.a11oopextendstest11;

public class Teacher extends Employee{
    @Override
    public void work() {
        super.work();
        System.out.println("正在教研");
    }

    public Teacher() {
    }

    public Teacher(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }
}
