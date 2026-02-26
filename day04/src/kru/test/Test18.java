package kru.test;

public class Test18 {
    public static void main(String[] args) {
/*        需求：给你一个整数x。
        如果x是一个回文整数，打印 true，否则，返回 false。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。

        int x = 12;
        int ge = x % 10;
        int shi = x / 10 % 10;

        // 拼接
        System.out.println(ge + "" + shi);*/

        // 定义数字
        int x = 12321;
        // 定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;
        int num = 0;

        while (x != 0) {
            // 从右往左获取每一位数字
            int ge = x % 10;
            // 修改一下x记录的值
            x = x / 10; // 1234 / 10 = 123
            // 把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num == temp);
    }
}
