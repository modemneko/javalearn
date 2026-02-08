package kru.test;

public class Test2 {
    public static void main(String[] args) {
//        如果红灯亮，就停止
//        如果黄灯亮，就减速
//        如果绿灯亮，就行驶

        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        if(isLightGreen){
            System.out.println("gogogo!");
        } else if (isLightYellow) {
            System.out.println("slow!");
        } else if (isLightRed) {
            System.out.println("stop!");
        }
    }
}
