package kru.test;


public class Test8 {
    public static void main(String[] args) {
        /*复制数组
        需求：定义一个方法copyOfRange(int[]arr,int from,int to)
        功能：将数组arr中从索引from（包含from）开始。
            到索引to结束（不包含to）的元素复制到新数组中，
            将新数组返回。*/

        // 原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 调用方法拷贝数据
        int[] copyArr = copyOfRange(arr, 3, 7);

        // 遍历
        for (int j : copyArr) {
            System.out.print(j);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        // form 开头 to 结尾
        // 动态数组，长度：to - from
        int[] newArr = new int[to - from];

        // 伪造索引思想
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
