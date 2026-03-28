package kru.test8;

import kru.test7.Student;

public class StudentTest2 {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "小王", 18);
        Student stu2 = new Student(2, "小琴", 19);
        Student stu3 = new Student(3, "小银", 20);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 通过Id删除学生信息
        deleteInfo(arr, 1);

        // 遍历所有学生信息
        printInfo(arr);

        // 查询查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        alterAge(arr, 2);

        printInfo(arr);
    }

    public static void alterAge(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    int age = students[i].getAge();
                    students[i].setAge(age + 1);
                    System.out.println("+1 岁的操作 成功！");
                }
            }
        }
    }

    public static void deleteInfo(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("id： "+ id +" 学生信息，删除成功！");
            }
        }
    }

    public static void printInfo(Student[] students) {
        // 这里要做一个非空判断，只打印非空的学生对象
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("id: " + students[i].getId() + " name：" + students[i].getName() + " age: " + students[i].getAge());
            }
        }
    }

    public static int getIndex(Student[] arr, int id) {
        // 获取学生的id信息
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        // 当循环结束之后，还没有找到就表示不存在
        return -1;
    }

    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            // 比较
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    return true;
                }
            }
        }

        // 当循环结束后，还没找到一样的，那么就表示数组中要查找的id是不存在的
        return false;
    }
}
