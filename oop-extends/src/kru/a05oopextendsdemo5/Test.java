package kru.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void ziShow() {
        //如何打印Zi
        //System.out.println(name);//Zi
        //System.out.println(this.name);//Zi
        //如何打印Fu
        //System.out.println(super.name);//Fu
        //如何打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        //如何打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}
