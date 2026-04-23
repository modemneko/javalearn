package kru.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        // 创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");

        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj.length());

        System.out.println(sj);// [aaa, bbb, ccc]

        System.out.println(sj.toString());// [aaa, bbb, ccc]
    }
}
