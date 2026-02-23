package kru.test;

public class Test19 {
    public static void main(String[] args) {
//        需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
//        将两数相除，要求不使用乘法、除法和%运算符。
//        得到商和余数。

//        100-10=90
//        90-10=80
//        80-10=70
//        70-10=60
//        10-10=0 （余数）
        // 高精度除法思想

        // 被除数
        int a = 10;
        // 除数
        int b = 3;
        // 统计相减了多少次
        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }
        // 当a<b时，a就是余数
        System.out.println("余数：" + a);
        // 当循环结束之后，count记录的值就是商
        System.out.println("商：" + count);
    }
}
