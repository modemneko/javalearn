package kru.a01oopextendsdemo1;

public class Animal {
    /*
    现在有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪。
    暂时不考虑属性，只要考虑行为。
    请按照继承的思想特点进行继承体系的设计。
    四种动物分别有以下的行为：
    布偶猫：吃饭、喝水、抓老鼠
    中国狸花猫：吃饭、喝水、抓老鼠
    哈士奇：吃饭、喝水、看家、拆家
    泰迪：吃饭、喝水、看家、蹭一蹭*/

    //权限修饰符：
    //private：子类就无法访问了
    //私有：只能在本类中访问
    //爸爸的私房钱（自己能用）
    //注意事项：
    //子类只能访问父类中非私有的成员

    private String name;
    private int kilogram;
    private String gender;

    public Animal() {
    }

    public Animal(String name, int kilogram, String gender) {
        this.name = name;
        this.kilogram = kilogram;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilogram() {
        return kilogram;
    }

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println("属性：" + this.getName() + " " + this.getKilogram() + "kg " + this.getGender());
    }

    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void catchFat() {
        System.out.println("抓老鼠");
    }

    public void lookupHome() {
        System.out.println("看家");
    }
}

