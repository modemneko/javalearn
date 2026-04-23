package kru.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        I一1、II一2、III一3、IV一4、V一5、VI一6、VI一7、VIII一8、IX一9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/

        // 1~9
        String[] romaStr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数字：");
        String str = sc.next();

        if (str.length() > 9) {
            System.out.println("输入长度不超过9");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c > 0 && c < 9) {
                continue;
            } else {
                System.out.println("必须是数字");
                return;
            }
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                result += romaStr[i] + " ";
            }
        }

        System.out.println(result);
    }
}
