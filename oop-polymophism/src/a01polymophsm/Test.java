package a01polymophsm;

public class Test{
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("张三");
        student.setAge(19);
        register(student);

        Teacher teacher = new Teacher();
        teacher.setName("刘老师");
        teacher.setAge(35);
        register(teacher);

        Administrator administrator = new Administrator();
        administrator.setName("Admin");
        administrator.setAge(25);
        register(administrator);

    }

    public static void register(Person s) {
        s.show();
    }
}
