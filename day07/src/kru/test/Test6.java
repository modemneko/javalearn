package kru.test;

public class Test6 {
    public static void main(String[] args) {
        /*需求：
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        规则如下：
        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。*/

        int num = 1983;
        // 调用数字转数组方法
        int[] numArr = numToArr(num);
        // 调用数组加密方法
        int[] encrypt_result = numEncrypt(numArr);
        // 调用数组转数字方法
        int num_result = ArrToNum(encrypt_result);

        System.out.println(num_result);
    }

    public static int[] numToArr(int num) {
        // 数字转数组方法
        int count = 0;
        int copy_num = num;
        while (num != 0) {
            num /= 10;
            count++;
        }
        
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy_num % 10;
            copy_num /= 10;
        }

        return arr;
    }
    
    public static int[] numEncrypt(int[] num_arr) {
        // 数字加密方法
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] += 5;
            num_arr[i] %= 10;
        }
        int[] reverse_num = new int[num_arr.length];

        int index = 0;
        for (int i = num_arr.length - 1; i >= 0; i--) {
            reverse_num[index] = num_arr[i];
            index++;
        }

        return reverse_num;
    }

    public static int ArrToNum(int[] arr) {
        // 数组拼接成数字方法
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
}
