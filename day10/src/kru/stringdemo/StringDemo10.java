package kru.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        // 手机号屏蔽，把中间的四位打成****

        // 方法1：
        String phoneNumber = "12345678910";
        System.out.println(phoneEn(phoneNumber));

        // 方法2：
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7,11);
        System.out.println(start+"****"+end);;

    }
    public static String phoneEn(String num) {
        char[] charArr = num.toCharArray();
        for (int i = 3; i < 7; i++) {
            charArr[i] = '*';
        }
        String newNum = "";
        for (int i = 0; i < charArr.length; i++) {
            newNum += charArr[i];
        }
        return newNum;
    }
}
