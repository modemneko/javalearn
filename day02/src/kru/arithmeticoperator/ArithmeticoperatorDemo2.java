package kru.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    // 1. 整数参与计算，结果只能得到整数
    // 2. 小数参与计算，结果有可能是不精确的
    public static void main(String[] args) {
        // 除法
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333…

        // 取模、取余，实际上也是做除法运算，只不过得到的是余数而已
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1

        // 应用场景
        // 可以用取模来判断，A是否可以被B整除
        // A % B
        // 判断A是否为偶数
        // A % 2 如果结果为0,那么证明A是一个偶数,如果结果为1,那么证明A是一个奇数
//        斗地主发牌
//        三个玩家
//        把每一张牌定义一个序号
//        拿着序号 % 3 如果结果为1，就发给第一个玩家
//        如果结果为2，那么就发给第二个玩家
//        如果结果为0，那么就发给第第三个玩家
    }
}
