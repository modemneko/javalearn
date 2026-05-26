package kru.a01staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        /* 定义数组工具类
        ●提供一个工具类方法printArr，用于返回整数数组的内容。
        返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
        ●提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
        ●定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/
        int[] numArr = {1,2,3,4,5,6};

        System.out.println(ArrayUtil.printArr(numArr));

        double[] dArr = {1.2, 3.3, 4.4, 6.6, 7.7};

        System.out.println(ArrayUtil.getAerage(dArr));
    }
}
