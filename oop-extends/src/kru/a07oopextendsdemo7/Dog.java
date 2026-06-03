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
public class Dog {
      public void eat() {
          System.out.println("吃饭");
      }
      public void drink() {
          System.out.println("喝水");
      }
      public void lookHome() {
          System.out.println("看家");
      }
}
