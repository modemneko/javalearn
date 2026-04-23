package kru.test;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：己经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//26
    }
}
