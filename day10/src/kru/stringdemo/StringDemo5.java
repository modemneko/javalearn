package kru.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一句话：");
        String str1 = sc.next();

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
    }
}
