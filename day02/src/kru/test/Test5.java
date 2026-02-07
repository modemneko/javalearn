package kru.test;

public class Test5 {
    public static void main(String[] args) {
        // 需求：一座寺庙里住着三个和尚，已知他们的身高
        //分别为150cm、210cm、165cm
        //请用程序实现获取这三个和尚的最高身高。

        int a = 150;
        int b = 210;
        int c = 165;

        int t1 = a > b ? a : b;
        int t2 = c > t1 ? c : t1;

        System.out.println("三个和尚的最高身高是：" + t2);
    }
}
