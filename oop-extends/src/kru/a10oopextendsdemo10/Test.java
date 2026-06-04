package kru.a10oopextendsdemo10;
/*
    1.经理
    成员变量:工号，姓名，工资，管理奖金
    成员方法:工作(管理其他人)，吃饭(吃米饭)
    2. 厨师
    成员变量:工号，姓名，工资
    成员方法:工作(炒菜)，吃饭(吃米饭)*/

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("1001"
                , "张经理"
                , 8000.00
                , 10000.00
        );

        manager.work();
        manager.eat();
        manager.show();

        Chef chef = new Chef("1001", "王主厨", 8888);

        chef.work();
        chef.eat();
        chef.show();
    }
}
