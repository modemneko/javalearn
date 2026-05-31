package kru.a01oopextendsdemo1;

public class Husky extends Dog{
    public Husky() {
    }

    public Husky(String name, int kilogram, String gender) {
        super(name, kilogram, gender);
    }

    public void BreakHome() {
        System.out.println("哈士奇在拆家");
    }
}
