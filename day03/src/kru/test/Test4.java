package kru.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /* 需求：动物园里有两只老虎，体重分别通过键盘录入获得
        * 请用程序实现两只老虎的体重是否相同 */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一支老虎的体重：");
        int a = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int b = sc.nextInt();

        String result = a == b ? "相同" : "不同";
        System.out.println(result);

    }
}
