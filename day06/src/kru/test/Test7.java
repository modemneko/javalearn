package kru.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*判断是否存在
        定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/

        int[] arr = {1,5,8,12,56,89,67};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int number = sc.nextInt();

        if (contains(arr, number)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    //1.我要干嘛？
    //2.我干这件事情，需要什么才能完成？ 数组 数字
    //3.调用处是否需要继续使用结果？返回true false
    public static boolean contains(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
