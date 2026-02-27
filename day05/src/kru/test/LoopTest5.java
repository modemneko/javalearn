package kru.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        // 先获取一个随机数
        // 范围：0~10

        // 创建对象
        Random r = new Random();

        // 生成随机数
        int number = r.nextInt(1,101);

        Scanner input = new Scanner(System.in);
        System.out.printf("请输入一个数字来玩猜数字：");
        int sc = input.nextInt();

       /* System.out.println(number);

        if (sc % number == 1) {
            System.out.println("接近了，继续猜");
        } else if (sc > number) {
            System.out.println("大了，继续猜");
        } else if (sc < number) {
            System.out.println("小了，继续猜");
        } else if (sc == number) {
            System.out.println("猜对了，数字是：" + number);
        }*/
    }
}
