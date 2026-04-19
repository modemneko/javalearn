package kru.stringbuilderdemo;

import java.util.Objects;
import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        /*需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        对称字符串：123321、111
        非对称字符串：123123*/

        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转

        Scanner sc =  new Scanner(System.in);
        System.out.print("请输入一个数：");
        String orgStr = sc.next();

        String revStr = new StringBuilder().append(orgStr).reverse().toString();

        if (Objects.equals(orgStr, revStr)) {
            System.out.println(orgStr + "是回文数");
        } else {
            System.out.println(orgStr + "不是回文数");
        }
    }
}
