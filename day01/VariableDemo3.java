public class VariableDemo3 {
    // 主入口
    public static void main(String[] args) {
        // byte
        byte b = 10;
        System.out.println(b);// 10
        // short
        short s = 20;
        System.out.println(s);// 20
        // int
        int i = 30;
        System.out.println(i);// 30
        // long
        // 如果要定义long类型的变量
        // 在数据值的后面需要加一个L作为后缀
        // L可以是大写的，也可以是小谢的
        // 建议：使用大写。
        long n = 9999999999L;
        System.out.println(n);

        // float
        // 注意：定义float类型变量的时候
        // 数据值也需要加一个F作为后缀
        float f = 10.1F;
        System.out.println(f);

        // double
        double d = 20.2;
        System.out.println(d);

        // char
        char c = '中';
        System.out.println(c);

        // boolean
        // true false
        boolean o = true;
        System.out.println(o);
    }
}
