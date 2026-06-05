package kru.a11oopextendstest11;
/*
带有继承结构的标准Javabean类
在黑马程序员中有很多员工(Employee)。
按照工作内容不同分教研部员工（Teacher)和行政部员工(AdminStaff）
1.教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor）
2.行政部根据负责事项不同，又分为维护专员(Maintainer)，采购专员(Buyer)
3.公司的每一个员工都编号，姓名和其负责的工作
4.每个员工都有工作的功能，但是具体的工作内容又不一样。
*/
public class Employee {
    private String id;
    private String name;
    private int age;
    private String WorkContent;

    public Employee() {
    }

    public Employee(String id, String name, int age, String workContent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.WorkContent = workContent;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorkContent() {
        return WorkContent;
    }

    public void setWorkContent(String workContent) {
        WorkContent = workContent;
    }

    public void show() {
        System.out.println(this.id + ", " + this.name + ", " + this.age + ", " + this.WorkContent);
    }

    public void work() {
        System.out.println("正在工作");
    }
}
