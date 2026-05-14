package kru.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String menuText =
                "------------------欢迎来到学生管理系统------------------\n" +
                "1：添加学生\n" +
                "2：删除学生\n" +
                "3：修改学生\n" +
                "4：查询学生\n" +
                "5：退出\n" +
                "请输入您的选择：";


        // Ctrl + Alt + T

        while (true) {
            // 打印菜单要放进循环中
            System.out.println(menuText);
            // 每次循环都要重新获取用户输入
            String choose = sc.next();

            switch (choose) {
                case "1" -> addStuInfo(list);
                case "2" -> delStuInfo(list);
                case "3" -> updateStuInfo(list);
                case "4" -> queryStuInfo(list);
                case "5" -> {
                    System.out.println("退出");
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStuInfo(ArrayList<Student> studentsList){
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生ID：");
        String id = sc.next();// id

        if (studentsList.get(Integer.parseInt(id)).getId().isEmpty()) {
            System.out.println("没有这个学生信息");
            return;
        }

        System.out.print("请输入学生姓名：");
        String name = sc.next();// 学生姓名
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();// 学生年龄
        System.out.print("请输入学生家庭住址：");
        String address = sc.next();// 学生家庭住址

        studentsList.add(new Student(id, name, age, address));

    }

    public static boolean delStuInfo(ArrayList<Student> studentsList) {
        System.out.println("删除学生");

        System.out.print("请输入需要删除的学生ID：");
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(id)) {
                studentsList.remove(i);
                return true;
            } else {
                System.out.println("没有这个学生信息");
            }
        }
        return false;
    }

    public static boolean updateStuInfo(ArrayList<Student> studentsList) {

        System.out.print("请输入需要修改的学生ID：");
        Scanner sc = new Scanner(System.in);
        String setId = sc.next();

        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(setId)) {
                System.out.print("请输入学生ID：");
                String id = sc.next();// id
                System.out.print("请输入学生姓名：");
                String name = sc.next();// 学生姓名
                System.out.print("请输入学生年龄：");
                int age = sc.nextInt();// 学生年龄
                System.out.print("请输入学生家庭住址：");
                String address = sc.next();// 学生家庭住址

                studentsList.set(i, new Student(id, name, age, address));
                return true;
            } else {
                System.out.println("没有这个学生信息");
            }
        }
        return false;
    }

    public static void queryStuInfo(ArrayList<Student> studentsList) {

        if (studentsList.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t 姓名\t\t  年龄\t 家庭住址 ");
        for (int i = 0; i < studentsList.size(); i++) {
            String id = studentsList.get(i).getId();
            String name = studentsList.get(i).getName();
            int age = studentsList.get(i).getAge();
            String address = studentsList.get(i).getAddress();

            System.out.println(id + "\t\t " + name + "\t\t  " + age + "\t" + address);
        }
    }
}
