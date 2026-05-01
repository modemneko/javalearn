package kru.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 需求：定义一个集合，添加字符串，并进行遍历
        // 遍历格式参照：[元素1, 元素2, 元素3];

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
