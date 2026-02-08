package kru.arithmeticoperator;

public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        // 先用后加：先赋值给y，再进行自增
        int y = x++; // y = 10 x = 11
        // 先加后用：先进行自增，再把自增后的结果赋值给z
        int z = ++x; // x = 12 z = 12
        System.out.println("x:" + x); // 12
        System.out.println("y:" + y); // 10
        System.out.println("z:" + z); // 12
    }
}
