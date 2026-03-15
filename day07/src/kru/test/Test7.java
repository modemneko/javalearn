package kru.test;

public class Test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组当中
        //反向推导
        int num = 1234567891;
        int copy_num = num;

        // 计算数组的长度
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);

        // 已知长度后，动态初始化一个数组
        int[] arr = new int[count];

        for (int i = arr.length - 1; i >= 0 ; i--) {
            arr[i] = copy_num % 10;
            copy_num /= 10;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < 9){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}