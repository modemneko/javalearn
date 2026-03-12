package kru.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*定义方法实现随机产生一个5位的验证码
          验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字*/
        // a ~ z A ~ Z

        char[] az = new char[26*2];

        for (int i = 0; i < 26; i++) {
            az[i] = (char)('a' + i);
            az[i + 26] = (char)('A' + i);
        }
        Random rd = new Random();

        System.out.println("以下是你的验证码：");
        for (int i = 0; i < 4; i++) {
            int random = rd.nextInt(0, az.length - 1);
            System.out.print(az[random]);
        }
        int last_num = rd.nextInt(0,9);
        System.out.print(last_num);
    }
}
