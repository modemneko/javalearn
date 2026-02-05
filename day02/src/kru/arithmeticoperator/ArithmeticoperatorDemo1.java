package kru.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2); // 5
        // -
        System.out.println(5 - 1); // 4
        // *
        System.out.println(3 * 3); // 9

        // 如果在计算的时候有小数参与
        // 结论：在代码中，如果有小数参与计算，结果有可能不精确的
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
