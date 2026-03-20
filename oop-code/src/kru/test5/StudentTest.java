package kru.test5;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        // 调用的空参构造
        // Student s = new Student();
        // 报错：会调用Student的无参构造

        Student s = new Student();

        // 有参构造
        Student ss = new Student("张三", 19);


        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
