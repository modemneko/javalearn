package kru.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*抢红包 需求:

        一个大V直播抽奖，奖品是现金红包，分别有(2，588，888，1000,10000}五个奖金。请使用代码模拟抽奖，
        打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）*/

        int[] redPacketNumArr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[redPacketNumArr.length];

        Random Rd = new Random();

        // 抽奖
        for (int i = 0; i < 5;) {
            int RdIndex = Rd.nextInt(redPacketNumArr.length);
            int prize =  redPacketNumArr[RdIndex];

            // 判断当前的奖项是否存在，如果存在则重新抽取，如果不存在，就表示是有效奖项
            if (!contains(newArr, prize)) {
                newArr[i] = prize;
                // 添加完之后再移动索引
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    // 判断prize在数组当中是否存在
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
