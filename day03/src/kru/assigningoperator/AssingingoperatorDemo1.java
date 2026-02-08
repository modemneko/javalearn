package kru.assigningoperator;

public class AssingingoperatorDemo1 {
    public static void main(String[] args) {
        // +=
        //规则：将左边和右边进行相加，然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        a += b; // a = (int)(a + b); 根据等号前面的类型
        System.out.println(a); // 30
        System.out.println(b); // 20

        // 细节
        // +=, -=, *=, /=, %= 底层都隐藏了一个强制类型转换
        short s = 1;
        // s + 1 之后再赋值给 s
        s += 1; // s = (short)(s + 1)

        System.out.println(s); // 2
    }
}
