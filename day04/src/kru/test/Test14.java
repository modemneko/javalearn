package kru.test;

public class Test14 {
    public static void main(String[] args) {
        //    用for循环求1~5之间的和
//        用来进行累加的
        int sum = 0;
//      求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
        for (int i = 1; i <= 100; i++) {
            // 可以把得到的每一个数字累加到变量sum当中
            sum += i;
        }
        System.out.println(sum);
    }
}
