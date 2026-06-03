package kru.a02oopextendsdemo2;

import java.rmi.dgc.VMID;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi zi = new Zi();

        // 把对象的地址值z以16进制的形式打在控制台上
//        System.out.println(Long.toHexString(VM.current().addressOf(z)));

        // 利用带参构造创建子类对象
        Zi z2 = new Zi("张三", 23);
    }
}

class Fu {
    private int a = 0x111;
    int b = 0x222;

    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    int c = 0x333;

    public Zi() {
    }

    public Zi(String 张三, int i) {
    }
}