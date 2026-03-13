package kru.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /*评委打分
        需求：
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
        高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。*/

        int[] score_man = new int[6];

        Random Rd = new Random();

        for (int i = 0; i < score_man.length; i++) {
            int score = Rd.nextInt(0,100);
            score_man[i] = score;
        }

        // 求最大值和最小值
        int max = score_man[0], min = 0;

        for (int i = 0; i < score_man.length; i++) {
            if (score_man[i] > max) {
                max = score_man[i];
                min = max;
            } else if (score_man[i] < min && score_man[i] != 0) {
                min = score_man[i];
            }
        }
        // 新数组,筛选出最大的和最小的并存入新数组
        int[] new_arr = new int[4];

        for (int i = 0; i < new_arr.length; i++) {
            if (score_man[i] == max && score_man[i] == min) {
                continue;
            } else {
                new_arr[i] = score_man[i];
            }
        }

        // 数组求和
        int sum = 0;
        for (int i : new_arr) {
            sum += i;
        }
        // 输出平均值
        System.out.println("选手的得分：" + (sum / 4));
    }
}
