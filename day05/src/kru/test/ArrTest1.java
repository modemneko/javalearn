package kru.test;

public class ArrTest1 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5
        遍历数组得到每一个元素，求数组里面所有数据和*/

        int[] arr1 = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            // i 表示数组里面的每一个索引
            sum += arr1[i];
        }

        System.out.println("数组里面所有数据和：" + sum);
    }
}
