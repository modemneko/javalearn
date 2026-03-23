package kru.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = new GirlFriend("小诗诗", 28, "女", "磨刀");
        GirlFriend g2 = new GirlFriend("乃依", 18, "男", "射箭");
        GirlFriend g3 = new GirlFriend("林尼", 18, "男", "射箭");
        GirlFriend g4 = new GirlFriend("笑面教授", 18, "女", "学习");

        GirlFriend[] arr = new GirlFriend[4];

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        GirlFriend clcAvg = new GirlFriend();
        // 调用方法计算平均年龄
        double resultAvg = clcAvg.Avg(arr);
        System.out.println(arr.length + "个女朋友的平均年龄为：" + resultAvg);

        // 调用方法统计比平均值低的女朋友
        GirlFriend countLowerThanAvg = new GirlFriend();
        int resultCount = countLowerThanAvg.LowerThanAge(arr, resultAvg);
        System.out.println("年龄比平均值低的女朋友有 " + resultCount + "个");

        // 打印所有信息
        GirlFriend printInfo = new GirlFriend();
        printInfo.printInfo(arr);
    }
}
