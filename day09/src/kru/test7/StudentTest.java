package kru.test7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[4];

        Student s1 = new Student(1,"小张",19);
        Student s2 = new Student(2,"李四",24);
        Student s3 = new Student(3,"王五",25);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(4,"王五",25);
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            // 已存在，不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            // 不存在，就可以添加
            // 判断元素个数是否小于数组长度，小于：没存满，大于：存满了，不进行任何操作

            if (getCount(arr) == arr.length) {
                Student[] newArr = createNewArr(arr);
                // 把s4添加进去
                newArr[getCount(arr)] = s4;
            } else {
                // [s1,s2,null] 如果下一次要添加数据，就是添加到2索引的位置
                arr[getCount(arr)] = s4;
            }
        }

        // 遍历学生信息
        printInfo(arr);

        // 根据Id删除某个学生的信息
        deleteInfo(arr, 3);

        // 删除完毕之后遍历所有学生信息
        printInfo(arr);

        // 如果查询数组名字为“heima002”的学生，然后删除
        heimaplusAge(arr, "heima002");
    }

    public static void heimaplusAge(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName() == name) {
                int age = students[i].getAge();
                students[i].setAge(age + 1);
                System.out.println("+1 岁的操作 成功！");
            }
        }
    }

    public static void deleteInfo(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
                    System.out.println("Id为" + id + "的学生信息，删除成功！");
                }
            } else {
                System.out.println("删除失败！Id" + id + "不存在！");
            }
        }
    }

    public static void printInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(
                        students[i].getId() + " " + students[i].getName() + " " + students[i].getAge()
                );
            }
        }
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            // 把老数组中的元素添加到新数组当中
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // 定义一个方法，判断一个数组中存了多少个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
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
