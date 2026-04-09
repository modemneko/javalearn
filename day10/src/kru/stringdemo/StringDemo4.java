package kru.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // 已知正确的用户名和密码，请用程序实现模拟用户登陆
        // 总共给三次机会，登陆之后，给出相应的提示

        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        checkLogin(rightUsername, rightPassword);

    }

    public static void checkLogin(String rightUsername, String rightPassword) {
        Scanner sc = new Scanner(System.in);

        int flag = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名：");
            String userName = sc.next();
            System.out.print("请输入密码：");
            String passWord = sc.next();

            if (userName.equals(rightUsername) && passWord.equals(rightPassword)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                flag += 1;
                System.out.println("用户或密码有误，还剩" + (2 - i) + "次");
                if (flag > 2) {
                    System.out.println("错误次数达到3次，账号已冻结");
                    break;
                }
            }
        }
    }
}
