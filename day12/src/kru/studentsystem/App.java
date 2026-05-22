package kru.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作\n1、登陆 2、注册 3、忘记密码 4、退出");

            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgotPassword(list);
                case "4" -> {
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        // 1. 用户名
        System.out.print("请输入用户名：");
        String username = sc.next();
        // 检查存在性
        for (User u : list) {
            if (u.getUsername().equals(username)) {
                System.out.println("该用户已经存在！");
                return;
            }
        }
        // 长度
        if (username.length() < 3) {
            System.out.println("用户名长度不能低于3");
            return;
        }
        if (username.length() > 15) {
            System.out.println("用户名长度不能超过15");
            return;
        }
        // 字母+数字组合，不能纯数字
        int digitCount = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("用户名只能包含字母和数字");
                return;
            }
            if (Character.isDigit(c)) digitCount++;
        }
        if (digitCount == username.length()) {
            System.out.println("用户名不能是纯数字！");
            return;
        }

        // 2. 密码
        System.out.print("请输入密码：");
        String password = sc.next();
        System.out.print("再次输入密码：");
        String twicePwd = sc.next();
        if (!password.equals(twicePwd)) {
            System.out.println("两次输入的密码不一致");
            return;
        }

        // 3. 身份证
        System.out.print("请输入身份证号码：");
        String id = sc.next();
        if (id.length() != 18) {
            System.out.println("身份证必须为18位");
            return;
        }
        if (id.charAt(0) == '0') {
            System.out.println("身份证不能以0开头");
            return;
        }
        // 前17位必须为数字
        for (int i = 0; i < 17; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                System.out.println("身份证前17位必须为数字");
                return;
            }
        }
        // 最后一位可为数字或x/X
        char last = id.charAt(17);
        if (!(Character.isDigit(last) || last == 'x' || last == 'X')) {
            System.out.println("身份证最后一位只能是数字或x/X");
            return;
        }

        // 4. 手机号
        System.out.print("请输入手机号码：");
        String phone = sc.next();
        if (phone.length() != 11) {
            System.out.println("手机号必须为11位");
            return;
        }
        if (phone.charAt(0) == '0') {
            System.out.println("手机号第一位不能为0");
            return;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("手机号只能包含数字");
                return;
            }
        }

        // 所有验证通过，添加用户
        list.add(new User(username, password, id, phone));
        System.out.println("注册成功！");
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        // 验证码（允许3次机会，正确则跳出）
        int codeTry = 0;
        boolean codeOk = false;
        while (codeTry < 3) {
            String temp = checkCode();
            System.out.print("请输入验证码(" + temp + ")：");
            String code = sc.next();
            if (code.equals(temp)) {
                codeOk = true;
                break;
            } else {
                codeTry++;
                System.out.println("验证码错误，剩余尝试次数：" + (3 - codeTry));
            }
        }
        if (!codeOk) {
            System.out.println("验证码错误次数过多，请稍后重试");
            return;
        }

        // 登录（最多3次机会）
        int loginTry = 0;
        while (loginTry < 3) {
            System.out.print("请输入用户名：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();

            // 查找用户
            User found = null;
            for (User u : list) {
                if (u.getUsername().equals(username)) {
                    found = u;
                    break;
                }
            }
            if (found == null) {
                System.out.println("用户名未注册");
                loginTry++;
                continue;
            }
            if (found.getPassword().equals(password)) {
                System.out.println("登录成功！");
                return;
            } else {
                System.out.println("密码错误");
                loginTry++;
            }
        }
        System.out.println("登录失败次数过多，请稍后再试");
    }

    public static String checkCode() {
        char[] arr = new char[52];
        char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
        char[] code = new char[5];

        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('A' + i);
            arr[26 + i] = (char)('a' + i);
        }

        Random sc = new Random();

        // 生成5位随机数，存储到code中
        for (int i = 0; i < 5; i++) {
            code[i] = arr[sc.nextInt(0,arr.length)];
        }

        // 用1位随机数字替换code中的其中1位（随机位置）
        code[sc.nextInt(0, code.length)] = numArr[sc.nextInt(0, numArr.length)];

        String result = "";
        for (int i = 0; i < code.length; i++) {
            result += code[i];
        }
        return result;
    }

    public static void forgotPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = sc.next();

        // 查找用户
        User target = null;
        for (User u : list) {
            if (u.getUsername().equals(name)) {
                target = u;
                break;
            }
        }
        if (target == null) {
            System.out.println("用户名未注册");
            return;
        }

        System.out.print("请输入身份证号码：");
        String id = sc.next();
        System.out.print("请输入手机号码：");
        String phone = sc.next();

        if (target.getIdentify().equals(id) && target.getPhoneNumber().equals(phone)) {
            System.out.print("请输入新的密码：");
            String newPwd = sc.next();
            // 修改密码（假设User有setPassword方法，若无则需重新构造）
            target.setPassword(newPwd);   // 推荐添加setter
            // 或者：list.set(list.indexOf(target), new User(name, newPwd, id, phone));
            System.out.println("修改成功！");
        } else {
            System.out.println("账号信息不匹配，修改失败");
        }
    }
}
