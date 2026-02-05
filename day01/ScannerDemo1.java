// 导包, 找到Scanner这个类在哪
// 书写要注意：要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建Scanner对象，表示我现在准备要用Scanner这个类
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入一个整数：");
        // 接收数据
        // 变量i记录了键盘录入的数据
        int i = sc.nextInt();
        System.out.println("你输入的数据是："+i);
    }
}
