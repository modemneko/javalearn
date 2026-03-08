package kru.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 需求：定义一个方法，在方法内部定义两个变量
        // 求出他们的和并进行打印
        getSum();
    }
    public static void getSum() {
        int a = 10;
        int b = 20;

        int result = a + b;
        System.out.println(result);
    }
}
