package kru.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        // 程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少？

        //2.抽奖机制
        //用点券去抽水晶
        //保底360次

        int count = 0;

        // 生成一个1~100之间的随机数字
        Random r = new Random();
        // 注意：这个生成随机数的代码是不能写在循环里的，否则每次都会产生新的随机数
        int number = r.nextInt(1,101);

        // 猜这个数字是多少
        Scanner sc = new Scanner(System.in);

        // 判断两个数字给出不同的提示

        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }

    }
}
