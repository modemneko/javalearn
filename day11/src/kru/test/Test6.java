package kru.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*需求：
        1，main方法中定义一个集合，存入三个用户对象。
        用户属性为：id，username，password
        2，要求：定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true
        如果不存在，返回false*/

        ArrayList<User> list = new ArrayList<>();

        list.add(new User(1, "zhangsan", "12345678"));
        list.add(new User(2, "lisi", "12345678"));
        list.add(new User(3, "wangwu", "12345678"));

        // 查询id为3的用户
        int id = 3;

        if (search(list, id)) {
            System.out.println("用户id为" + id + "存在");
        } else {
            System.out.println("用户id为" + id + "不存在");
        }
    }

    public static boolean search(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
