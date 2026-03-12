package kru.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*需求:
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7
        折，经济舱6.5折。*/

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入价格：");
        double price = sc.nextDouble();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入是否是头等舱(true or false)：");
        boolean cabin = sc.hasNext();

        System.out.println((cabin ? "您是头等舱，" : "您是经济舱：") + "正在为您计算机票优惠价格");
        System.out.println(
                "计算出价格结果：" + cl_airTicket(price,month,cabin)
        );
    }

    public static int cl_airTicket(double ticket_price, int month, boolean cabin) {
        if (cabin) {
            // true表示头等舱，false表示经济舱
            if (month >= 5 && month <= 10) { // 头等舱旺季9折
                ticket_price *= 0.9;
            } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) { // 头等舱淡季7折
                ticket_price *= 0.7;
            }
        } else {
            if (month >= 5 && month <= 10) { // 经济舱舱旺季8.5折
                ticket_price *= 0.85;
            } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) { // 经济舱舱淡季6.5折
                ticket_price *= 0.65;
            }
        }
        return (int)ticket_price;
    }
}
