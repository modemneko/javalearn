package kru.a02innerclassdemo2;

public class Outer {
    String name;

    public static class Inner {
        static int a = 10;
    }

    public Inner getInstance() {
        return new Inner();
    }
}
