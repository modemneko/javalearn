package kru.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder();

        String str = sb.append("aaa").append("bbb").append("ccc").append("ddd").toString();

        // System.out.println(sb);

        System.out.println(str);
    }
}
