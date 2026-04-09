package kru.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();

        int countUp = 0;
        int countLow = 0;
        int countNum = 0;

        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (element >= 'a' && element <= 'z') {
                countLow++;
            } else if (element >= 'A' && element <= 'Z') {
                countUp++;
            } else if (element >= '0' && element <= '9') {
                countNum++;
            }
        }

        System.out.printf("大写字符：%d\n小写字符：%d\n数字字符：%d", countUp, countLow, countNum);
    }
}
