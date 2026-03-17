package kru.twodimension;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        二维数组动态初始化格式：
        数据类型[][]数组名=new数据类型[m][n];
        m表示这个二维数组，可以存放多少个一维数组
        n表示每一个一维数组，可以存放多少个元素*/

        // 创建二维数组
        // 3行一维数组，一维数组长度为5
        int[][] arr = new int[3][5];

        arr[0][0] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
