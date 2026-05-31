package kru.a01oopextendsdemo1;

public class AnimalTest {
    public static void main(String[] args) {
        /*
        现在有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪。
        暂时不考虑属性，只要考虑行为。
        请按照继承的思想特点进行继承体系的设计。
        四种动物分别有以下的行为：
        布偶猫：吃饭、喝水、抓老鼠
        中国狸花猫：吃饭、喝水、抓老鼠
        哈士奇：吃饭、喝水、看家、拆家
        泰迪：吃饭、喝水、看家、蹭一蹭*/

        Ragdoll rd = new Ragdoll("小布偶", 5, "公的");

        rd.eat();
        rd.drink();
        rd.catchFat();

        rd.showInfo();

        fengeFu();

        Lihua lh = new Lihua("小狸花", 6, "母的");

        lh.eat();
        lh.drink();
        lh.catchFat();

        lh.showInfo();

        fengeFu();

        Husky hs = new Husky("破坏王", 8, "母的");

        hs.eat();
        hs.drink();
        hs.lookupHome();
        hs.BreakHome();

        hs.showInfo();

        fengeFu();

        Taddy td = new Taddy("卷毛", 6, "母的");

        td.eat();
        td.drink();
        td.lookupHome();
        td.cengceng();

        td.showInfo();
    }

    public static void fengeFu() {
        for (int i = 0; i < 16; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
