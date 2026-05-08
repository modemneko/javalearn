package kru.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 通过键盘录入的方式存入学生信息到ArrayList集合
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 录入五个学生信息
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入学生的年龄：");
            int age = sc.nextInt();

            list.add(i, new Student(name, age));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
