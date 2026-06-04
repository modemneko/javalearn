package kru.a10oopextendsdemo10;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        cook();
    }

    public void cook() {
        System.out.println("正在炒菜");
    }

    @Override
    public void eat() {
        super.eat();
        eatRice();
    }

    public void eatRice() {
        System.out.println("吃米饭");
    }
}
