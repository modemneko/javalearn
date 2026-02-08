package kru.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        // 需求：使用三元运算符，获取两个数的较大值

        int a = 10;
        int b = 6;

        // 使用三元运算符获取两个整数的较大值
        // 三元运算符的结果必须要被使用
        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println("最大值是: " + (a > b ? a : b));
    }
}
