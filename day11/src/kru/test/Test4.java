package kru.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 18);
        Student stu3 = new Student("野兽", 24);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
