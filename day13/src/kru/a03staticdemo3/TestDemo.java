package kru.a03staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> studentArr = new ArrayList<>();

        studentArr.add(new Student("张三",18,"男"));
        studentArr.add(new Student("李四",20,"女"));
        studentArr.add(new Student("王五",19,"女"));

        int maximumAge = StudentUtil.getMaximumAge(studentArr);
        System.out.println(maximumAge);
    }
}
