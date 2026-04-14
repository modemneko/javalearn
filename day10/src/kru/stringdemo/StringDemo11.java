package kru.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        String id = "321281202001011234";

        String y = id.substring(6,10);
        String m = id.substring(10,12);
        String d = id.substring(12,14);
        System.out.println("出生："+y+"年"+m+"月"+d+"日");
        int gender = id.charAt(16);
        // ASCII '3' - '0' 转成整数
        if ((gender - '0') % 2 == 1) {
            System.out.println("性别：男");
        } else {
            System.out.println("性别：女");
        }
        // System.out.println((gender - '0'));
    }
}
