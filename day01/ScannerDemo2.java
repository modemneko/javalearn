// 导包, 找到Scanner这个类在哪
// 书写要注意：要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        // 创建Scanner对象，表示我现在准备要用Scanner这个类
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请你输入第二个整数：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("求和的值是："+sum);
    }
}
