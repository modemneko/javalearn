package kru.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*双色球： 投注号码由6个红色球号码和1个蓝色
        球号码组成。红色球号码从1-33中选
        择；蓝色球号码从1-16中选择。*/

        Scanner sc = new Scanner(System.in);

        // 定义数组存储用户输入的号码
        int[] userNumArr = new int[7];

        for (int i = 0; i < userNumArr.length; i++) {
            System.out.print("请输入第"+ (i + 1) + "个号码: ");
            userNumArr[i] = sc.nextInt();
        }
        System.out.println("你输入的号码：");
        for (int i : userNumArr) {
            System.out.print(i + "  ");
        }

        // 摇号码
        int[] ballNum = createNumber();
        // 计算中了几个红球
        int countRedBall = 0;
        for (int i = 0; i < 6; i++) {
            if (userNumArr[i] == ballNum[i]) {
                countRedBall++;
            }
        }
        // 计算蓝球是否中奖
        int countBlueBall = 0;
        if (userNumArr[6] == ballNum[6]) {
            countBlueBall++;
        }
        System.out.println();
        for (int i = 0; i < ballNum.length; i++) {
            System.out.print(ballNum[i] + " ");
        }
        System.out.println();
        System.out.println("红球中了" + countRedBall + "个");
        System.out.println("蓝球中了" + countBlueBall + "个");

    }
    public static int[] createNumber() {
        // 6 + 1 = 7
        int[] NumArr = new int[7];

        // 随机生成号码并添加到数组当中
        // 红球： 不能重复的 6个红球 从1~33中选
        // 蓝球： 可以跟红球号码重复 1个蓝球 从1~16中选

        Random Rd = new Random();

        for (int i = 0; i < 6;) {
            int redBall = Rd.nextInt(1,33);
            if (!contains(NumArr, redBall)) {
                NumArr[i] = redBall;
                i++;
            }
        }
        int blueBall = Rd.nextInt(1,16);
        NumArr[6] = blueBall;

        return NumArr;
    }
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
