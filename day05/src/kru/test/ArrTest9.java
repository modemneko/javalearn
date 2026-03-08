package kru.test;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        // 定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
        // 难点：如何获取数组中的随机索引
        int[] arr = {1,2,3,4,5};
        // 索引范围：0 1 2 3 4
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            // 生成随机索引
            int random_index = r.nextInt(0, arr.length);
            // 拿着随机索引指向的元素 跟 i 指向那个的元素进行交换
            int temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        // 当循环结束之后，那么数组当中的所有的数据已经打乱顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
