package kru.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数×，计算并返回x的平方根。
        结果只保留整数部分，小数部分将被舍去。*/

        // 平方根  16的平方根是4
        //        25的平方根是5

        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10

        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，那么维续往后判断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方跟的整数部分

        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个大于等于2的整数：");
        int number = sc.nextInt();

        // 开始：1 结束：小于number
        for (int i = 1; i < number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                // 一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "的平方根的整数部分");
                break;
            }
        }
    }
}
