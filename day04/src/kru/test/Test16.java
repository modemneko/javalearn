package kru.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
//        键盘录入两个数字，表示一个范围
//        统计这个范围中，既能被3整除，又能被5整除的数字有多少个
        Scanner input = new Scanner(System.in);
        System.out.println("请输入范围");
        System.out.println("先输入数字范围开始：");
        int start = input.nextInt();
        System.out.println("再输入数字范围结束：");
        int end = input.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println("输入的范围既能被3整除，又能被5整除的数字有" + count + "个");

    }
}
