package kru.test;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number); // 100
        number = change(number);
        System.out.println("调用change方法后：" + number);
    }

    public static int change (int number) {
        number = 200;
        return number;
    }
}
