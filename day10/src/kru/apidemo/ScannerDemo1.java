package kru.apidemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个小数：");
        double num = sc.nextDouble();

        System.out.println("结果："+num);
    }
}
