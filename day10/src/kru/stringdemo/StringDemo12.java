package kru.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        // 敏感词替换
        String talk = "你玩的真好，以后不要再玩了，TMD";

        // 定义一个数组方敏感词
        String[] arr = {"TMD","CNM","SB","MLGB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
