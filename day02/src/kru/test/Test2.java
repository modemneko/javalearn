package kru.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /* 需求：
        您和您的约会对象正试图在餐厅获得一张桌子。
        键盘录入两个整数，表示你和你约会对象衣服的时髦度。（手动录入0~10之间的整数，不能录其他）
        如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。
        否则输出false。*/

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的衣服的时髦度(0~10)：");
        int a = input.nextInt();
        System.out.println("请输入相亲对象的衣服的时髦度(0~10)：");
        int b = input.nextInt();
        if ((a >= 0 && a <= 10) && (b >= 0 && b <= 10)) {
            boolean result = a > b;
            System.out.println(result);
        } else {
            System.out.println("输入的值超出范围或者有其他字符！");
        }
    }
}
