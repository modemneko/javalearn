package kru.a01staticdemo2;

public class ArrayUtil {
    /* 定义数组工具类
    ●提供一个工具类方法printArr，用于返回整数数组的内容。
    返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
    ●提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
    ●定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/

    private ArrayUtil() {}

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] arr) {
        double max = 0.0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        double result = max / arr.length;
        return result;
    }
}
