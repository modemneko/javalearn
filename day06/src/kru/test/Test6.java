package kru.test;

public class Test6 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最大值返回

        int[] arr = {11,22,33,44,55};

        System.out.println("数组的最大值是：" + getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
