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

        Cat buou = new Cat("小布偶", 7, "公的");

        buou.eat(); // 吃饭
        buou.drink(); // 喝水
        buou.catchFat(); // 抓老鼠

        buou.showInfo(); // 属性

        fengeFu();

        Cat lihua = new Cat("小梨花",6,"母的");

        lihua.eat(); // 吃饭
        lihua.drink(); // 喝水
        lihua.catchFat(); // 抓老鼠

        lihua.showInfo(); // 属性

        fengeFu();

        Dog hashiqi = new Dog("破坏王",8,"公的");

        hashiqi.eat(); // 吃饭
        hashiqi.drink(); // 喝水
        hashiqi.lookupHome(); // 看家
        hashiqi.chaijia(); // 拆家

        hashiqi.showInfo(); // 属性

        fengeFu();

        Dog taidi = new Dog("卷毛",6,"母的");

        taidi.eat(); // 吃饭
        taidi.drink(); // 喝水
        taidi.lookupHome(); // 看家
        taidi.cengceng(); // 蹭蹭

        taidi.showInfo(); // 属性
    }

    public static void fengeFu() {
        for (int i = 0; i < 10; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
