package kru.test;

public class StringTest {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String temp = str[0].substring(0,2);

        boolean flag = true;

        for (int i = 0; i < str.length; i++) {
            String str01 = str[i].substring(0,2);
            if (temp.equals(str01)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println(temp);
        } else {
            System.out.println(" ");
        }
    }
}
