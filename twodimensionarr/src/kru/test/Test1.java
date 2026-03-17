package kru.test;

public class Test1 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99
        要求计算出每个季度的总营业额和全年的总营业额*/

        int[][] YearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        for (int j = 0; j < 4; j++) {
            System.out.print("第"+ (j + 1) +"季度" + "\t");
        }
        System.out.print("全年 \t");
        System.out.println();
        int yearSum = 0;
        for (int i = 0; i < YearArrArr.length; i++) {
            System.out.print(getSum(YearArrArr[i]) + "\t    ");
            yearSum += getSum(YearArrArr[i]);
        }
        System.out.println(yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
