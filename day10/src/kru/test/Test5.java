package kru.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。*/

        char[] arr = new char[52];
        char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
        char[] code = new char[5];

        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('A' + i);
            arr[26 + i] = (char)('a' + i);
        }

        Random sc = new Random();

        // 生成5位随机数，存储到code中
        for (int i = 0; i < 5; i++) {
            code[i] = arr[sc.nextInt(0,arr.length)];
        }

        // 用1位随机数字替换code中的其中1位（随机位置）
        code[sc.nextInt(0, code.length)] = numArr[sc.nextInt(0, numArr.length)];

        for (char c : code) {
            System.out.print(c);
        }

    }
}
