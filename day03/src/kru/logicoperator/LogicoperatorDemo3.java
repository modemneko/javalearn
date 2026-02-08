package kru.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // &&
        // 运行结果和单个&是一样的
        // 表示两边都为真，结果才是真
        System.out.println(true && true); // true
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && false); // false

        // ||
        // 运行结果跟单个|是一样的
        // 表示两边都为假，结果才是假
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println(true || false); // true

        // 短路逻辑运算符具有短路效果
        // 简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
