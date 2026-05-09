package kru.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        /*定义Javabean类：Phone
        Phone属性：品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为：小米，1000。苹果，8000。锤子2999。
        定义一个方法，将价格低于3000的手机信息返回。*/

        ArrayList<Phone> list = new ArrayList<>();

        list.add(new Phone("小米",1000));
        list.add(new Phone("苹果",8000));
        list.add(new Phone("锤子",2999));

        System.out.println("低于3000的手机信息：" + getInfo(list));
    }

    public static String getInfo(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                String info = list.get(i).getBrand() + ", " + list.get(i).getPrice();
                return info;
            }
        }
        return "";
    }
}
