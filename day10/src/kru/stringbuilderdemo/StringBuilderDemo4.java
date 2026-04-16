package kru.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder();

        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);

        // 再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
