package kru.test;

public class Test8 {
    public static void main(String[] args) {
        /*需求：
        把加密的数据解密出来 */

        // 被加密的数字
        int EncryptedNum = 6438;
        // 先转成数组
        int[] NumArr = numToArr(EncryptedNum);
        // 再进行解密
        int[] DecrytedNum = NumDecrypt(NumArr);
        // 再转成数字
        int result_num = ArrToNum(DecrytedNum);
        // 打印最终结果
        System.out.println(result_num);
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

    public static int[] NumDecrypt(int[] arr) {
        // 先反转
        int[] reversedArr = new int[arr.length];

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[index] = arr[i];
            index++;
        }

        // 由于加密是通过对10取余的方式进行获取的
        // 所以在解密的时候就需要判断，0~4之间+10  5~9数字不变
        for (int i = 0; i < reversedArr.length; i++) {
            if (reversedArr[i] >= 0 && reversedArr[i] <= 4) {
                reversedArr[i] += 10;
            }
            reversedArr[i] -= 5;
        }

        return reversedArr;
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
