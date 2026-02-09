package kru.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*需求：键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就吃网红餐厅。
        否则，就吃经济实惠的沙县小吃。*/

        Scanner input = new Scanner(System.in);

        System.out.println("请输入身上的钱：");
        int money = input.nextInt();

        if (money >= 100) {
            System.out.println("钱大于等于100块，吃网红餐厅");
        } else {
            System.out.println("钱不够，吃经济实惠的沙县小吃");
        }
    }
}
