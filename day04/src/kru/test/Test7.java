package kru.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /* 在实际开发中，多种情况断时，会用到if的第三种格式：
        需求：
        商场都会有VIP的会员制，根据不同的会员公有不同的折扣。
        假设商品总价为1000.
                健盘录入会员级别，并计算出实际支付的钱。
        会员1级：打9折。
        会员2级：打8折。
        会员3级：打7折。
        非会员：不打折，要打也是打骨折。*/

        int price = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入会员等级：");
        int vip = sc.nextInt();

        if (vip == 1) {
            System.out.println("1级会员，打9折，实际支付金额：" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("2级会员，打8折，实际支付金额：" + (price * 0.8));
        } else if (vip == 3) {
            System.out.println("3级会员，打7折，实际支付金额：" + (price * 0.7));
        } else if (vip != (1 | 2 | 3)) {
            System.out.println("非会员，实际支付金额：" + (price));
        }
    }
}
