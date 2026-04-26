package kru.test;

import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        /*给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A=‘abcde'，在移动一次之后结果就是‘bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/
        String strA = "abcde";
        String strB = "cdeab";

        System.out.println(check(strA, strB));
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    // 旋转字符串
    public static String rotate(String str) {
        String begin = str.substring(0,1);
        StringJoiner sj = new StringJoiner("","",begin);
        int len = str.length();
        sj.add(str.substring(1, len));
        String result = sj.toString();
        return result;
    }
}
