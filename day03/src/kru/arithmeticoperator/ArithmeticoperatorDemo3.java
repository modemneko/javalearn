package kru.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 10;
        // 我们现在要强转的是b1 + b2计算后的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result); // 20
        // 如果要转换的数据过大，将会发生错误
    }
}
