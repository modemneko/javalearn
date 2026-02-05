public class VariableDemo2 {
    // 主入口
    public static void main(String[] args) {
        // 变量的基本用法
        // 定义变量，再进行输出
        int a = 10;
        System.out.println(a);// 10
        System.out.println(a);// 10
        System.out.println(a);// 10

        // 变量参与计算
        int b = 20;
        int c = 30;
        System.out.println(b + c);

        // 修改变量记录的值
        a = 50;
        System.out.println(a);// 50

        System.out.println("------------------");

        // 一条语句中，可以定义多个变量
        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 变量在使用之前必须要赋值
        int g;
        g = 500;
        System.out.println(g);
    }
}
