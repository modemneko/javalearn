package kru.test;

public class ArrTest2 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                sum += 1;
            }
        }
        System.out.println("数组里面一共有" + sum + "个能被3整除的数字");
    }
}
