package kru.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /* 遍历数组求和
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/

        // 定义数组
        int[] arr = new int[10];
        // 把随机数存入到数组当中
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
           // 每循环1此就会生成一个新的随机数
           int number = r.nextInt(1,100);
           // 把生成的随机数添加到数组当中
            //数组名[索引] = 数据;
            arr[i] = number;
        }

        // 遍历数组
        int sum = 0;
        // 求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组所有数据的和为"+sum);

        // 求平均数
        int arange = sum / arr.length;
        System.out.println("平均数" + arange);

        // 统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arange>arr[i]) {
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均值小");

        // 遍历数组，验证答案
        // 验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
