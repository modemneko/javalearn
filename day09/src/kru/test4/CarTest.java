package kru.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);

        Car[] arr = new Car[3];

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();

            System.out.printf("----请输入第%d辆车的信息----\n", i + 1);
            System.out.printf("请输入第%d辆车的汽车品牌：\n", i + 1);
            String br = sc.next();
            c.setBrand(br);
            System.out.printf("请输入第%d辆车的汽车价格：\n", i + 1);
            int pr = sc.nextInt();
            c.setPrice(pr);
            System.out.printf("请输入第%d辆车的汽车颜色：\n", i + 1);
            String cl = sc.next();
            c.setColor(cl);

            // 把汽车对象添加到数组当中
            arr[i] = c; // [c, c, c]
        }

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println(
                    "品牌：" + arr[i].getBrand() + ", 价格：" + arr[i].getPrice() + ", 颜色：" + arr[i].getColor()
            );
        }
    }
}
