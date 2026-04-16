package kru.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += "abc";
        }
        System.out.println(s);
    }
}
