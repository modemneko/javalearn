package kru.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 键盘输入任意字符串，打乱里面的内容

        String str = "abcdefg";

        char[] arr = str.toCharArray();

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            Random rd = new Random();
            int random_index = rd.nextInt(0, arr.length - 1);
            char temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
