package kru.test;

public class Test2 {
    public static void main(String[] args) {
        /*找质数
        1、判断101-200之间有多少个素数，并输出所有素数。*/

        // 思路一：2~99
        // 计数器，计算一共有几个素数
        int count = 0;

        for (int i = 101; i <= 200; i++) { // 外循环
            // i 表示循环中的每一个数字
            boolean flag = true;
            for (int j = 2; j < 99; j++) { // 内循环
                // j 表示2~99之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    // 跳出单层循环，内循环
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("当前数字"+i+"是素数");
            }
        }
        System.out.println("一共有个"+count+"素数");
    }
}
