package kru.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        /*需求:
        1，main方法中定义一个集合，存入三个用户对象。
        用户属性为：id，username，password
        2，要求：定义一个方法，根据id查找对应的用户信息。
        如果存在，返回索引1
        如果不存在，返回-1
        */

        ArrayList<User> list = new ArrayList<>();

        list.add(new User(1, "zhangsan", "12345678"));
        list.add(new User(2, "lisi", "12345678"));
        list.add(new User(3, "wangwu", "12345678"));

        System.out.println(search(list, 3));
    }

    public static int search(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
