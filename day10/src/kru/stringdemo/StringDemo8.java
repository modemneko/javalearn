package kru.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转。
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入abc，输出结果cba*/

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();

        String result = reverseStr(str);
        System.out.println(result);

    }
    public static String reverseStr(String str1) {
        String result = "";
        for (int i = str1.length() - 1; i >= 0 ; i--) {
            result += str1.charAt(i);
        }
        return result;
    }
}
