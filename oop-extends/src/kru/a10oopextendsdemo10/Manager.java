package kru.a10oopextendsdemo10;

public class Manager extends Employee{
    private double managementBonus;

    public Manager(String id, String name, double salary, double managementBonus) {
        super(id, name, salary);
        this.managementBonus = managementBonus;
    }

    public double getManagementBonus() {
        return managementBonus;
    }

    public void setManagementBonus(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    @Override
    public void work() {
        super.work();
        Management();
    }

    public void Management() {
        System.out.println("正在管理其他人");
    }

    @Override
    public void eat() {
        super.eat();
        eatRice();
    }

    public void eatRice() {
        System.out.println("吃米饭");
    }

    @Override
    public void show() {
        super.show();
        System.out.println(getManagementBonus());
    }
}
