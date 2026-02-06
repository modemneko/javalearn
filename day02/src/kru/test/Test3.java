package kru.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 数字6是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为6，最终结果输出true。
        如果它们的和为 6的倍数。最终结果输出true。
        其他情况都是false。*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = input.nextInt();
        System.out.println("请输入第二个数：");
        int b = input.nextInt();

        if ((a == 6 || b == 6) || ((a + b) % 6 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
