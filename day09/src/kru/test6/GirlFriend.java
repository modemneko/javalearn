package kru.test6;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String Hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    public double Avg(GirlFriend[] girlFriendInfo) {
        double sum = 0.0;
        for (int i = 0; i < girlFriendInfo.length; i++) {
            sum += girlFriendInfo[i].getAge();
        }
        double resultAvg = sum / girlFriendInfo.length;
        return resultAvg;
    }

    public int LowerThanAge(GirlFriend[] girlFriendsInfo, double avgAge) {
        int CountLower = 0;
        for (int i = 0; i < girlFriendsInfo.length; i++) {
            if (girlFriendsInfo[i].getAge() < avgAge) {
                CountLower++;
            }
        }
        return CountLower;
    }

    public void printInfo(GirlFriend[] girlFriendInfo) {
        for (int i = 0; i < girlFriendInfo.length; i++) {
            System.out.println(
                    "第" + (i + 1) + "个女朋友  " +
                    "姓名：" + girlFriendInfo[i].getName() + "，" +
                    "年龄：" + girlFriendInfo[i].getAge() + "，" +
                    "性别：" + girlFriendInfo[i].getGender() + "，" +
                    "爱好：" + girlFriendInfo[i].getHobby()
            );
        }
    }
}
