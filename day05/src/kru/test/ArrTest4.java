package kru.test;

public class ArrTest4 {
    public static void main(String[] args) {
        // 定义数组求最大值：33,5,22,44,55

        //扩展问题：
        //1.根据求最大值的思路，自己改写一下求最小值
        //2.为什么max要记录为arr[0]，默认值不能为0吗？
        //不能写0

        //定义数组
        int[] arr = {33,5,22,44,55};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);

        //最小值

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("最小值是：" + max);
    }
}
