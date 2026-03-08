package kru.test;

public class Test5 {
    public static void main(String[] args) {
        /*数组遍历
        需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44，55]*/

        int[] arr = {11,22,33,44,55};

        printArr(arr);
    }

    // 定义方法用于数组的遍历
    // 1 我要干嘛？遍历数组
    // 2 我干这件事情需要什么才能完成？数组
    // 3 调用是否需要结果？ 不需要

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

}
