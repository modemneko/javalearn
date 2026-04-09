package kru.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我现在键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String text1 = sc.next();

        //2.代码中再定义一个字符串abc
        String text2 = "abc";
        System.out.println(text1 == text2);// false
        //3.用==比较，这两者能一样吗？
    }
}
