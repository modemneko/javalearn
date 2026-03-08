package kru.test;

public class ArrTest6 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
        交换前：1,2,3,4,5
        交换后：5,2,3,4,1*/

        int[] arr1 = {1,2,3,4,5};
        // 利用循环去交换数据
        for (int i = 0,j = arr1.length - 1; i < j; i++,j--) {
            // 交换变量i和变量j指向的元素
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        // 当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }

        /*for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
        }*/


    }
}
