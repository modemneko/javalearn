package kru.a07oopextendsdemo7;
/*
利用方法的重写设计继承结构
现在有三种动物：哈士奇、沙皮狗、中华田园犬
暂时不考虑属性，只要考虑行为。
请按照继承的思想特点进行继承体系的设计。
三种动物分别有以下的行为：
哈士奇：吃饭（吃狗粮）、喝水、看家、拆家
沙皮狗：吃饭（吃狗粮、吃骨头）、喝水、看家
中华田园犬：吃饭（吃剩饭）、喝水、看家
*/
public class TestDog {
    public static void main(String[] args) {
        Husky husky = new Husky();
        System.out.println("哈士奇：");
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        Sapi sapi = new Sapi();
        System.out.println("沙皮狗：");
        sapi.eat();
        sapi.drink();
        sapi.lookHome();

        TuGou tuGou = new TuGou();
        System.out.println("中华田园犬：");
        tuGou.eat();
        tuGou.drink();
        tuGou.lookHome();
    }
}
