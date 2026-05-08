package kru.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素
        // jdk5 以后int Integer 之间是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

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
