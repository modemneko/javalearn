package kru.a11oopextendstest11;

public class AdminStaff extends Employee{
    @Override
    public void work() {
        super.work();
        System.out.println("正在行政");
    }

    public AdminStaff() {
    }

    public AdminStaff(String id, String name, int age, String workContent) {
        super(id, name, age, workContent);
    }
}
