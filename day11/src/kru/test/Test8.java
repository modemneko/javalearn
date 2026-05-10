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


        for (int i = 0; i < getInfo(list).size(); i++) {
            System.out.println(getInfo(list).get(i).getBrand() + " " + getInfo(list).get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
