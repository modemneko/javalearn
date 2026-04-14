package kru.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        // 金额转换
        int[] num = {2,1,3,5};
        String[] upNum = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
        String[] resultNum = {"零","零","零","零","零","零","零"};

        for (int i = 0; i < num.length; i++) {
            int index = num[num.length - 1 - i];
            resultNum[resultNum.length - 1 - i] = upNum[index];
        }
        for (int i = 0; i < resultNum.length; i++) {
            System.out.print(resultNum[i] + "佰" + " ");
        }
        System.out.print("元");
    }
}
