package kru.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        // 随机长相
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();

        // 长相是随机的
        if (gender == '男') {
            // 从boyfaces里面随机长相
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        } else if (gender == '女') {
            // 从girlfaces里面随机长相
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        } else {
            this.face = "面目狰狞";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    String[] boyfaces={"风流倜傥","器宇轩昂","相貌英俊","五官端正","面目全非"};
    String[] girlfaces={"美轮美奂","沉鱼落雁","亭亭玉立","惨不忍睹","形貌丑陋"};

    //attack攻击描述
    String[] attacks_desc={
            "%s使出一招[背心订],转到对方后面，一掌向%s背心拍去",
            "%s使出了一招[游龙],抓向%s",
            "%s大喝一声，锤向%s"
    };

    //受伤描述
    String[] hurt_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处於伤",
            "结果一击命中，%s弯下腰",
            "结果%s痛苦地闷哼一声",
            "结果%s摇摇晃晃",
            "结果%s脸色惨白",
            "结果%s口吐鲜血",
            "结果%s倒了下去"
    };

    // 定义一个方法来攻击别人
    // 思考：谁攻击谁
    // Role r1 = new Role();
    // Role r2 = new Role();
    // r1.攻击(r2);
    // 方法的调用调用者去攻击参数
    public void attack(Role role) {
        Random r = new Random();

        // 攻击的描述
        System.out.printf(
                attacks_desc[r.nextInt(attacks_desc.length)],
                this.getName(),
                role.getName()
        );

        // 计算造成的伤害
        int hurt = r.nextInt(20) - 1;

        // 修改血量
        // 剩余血量
        int remainBlood =  role.getBlood() - hurt;
        // 如果为负数，则修改为0
        remainBlood  = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        // this 表示方法的调用者
        // 受伤的描述, 需要做个判断，因为受伤情况是越来越严重的
        if (remainBlood >= 90 && remainBlood <= 100) {
            System.out.printf(hurt_desc[0], role.getName());
        } else if (remainBlood >= 80 && remainBlood <= 89) {
            System.out.printf(hurt_desc[1], role.getName());
        } else if (remainBlood >= 70 && remainBlood <= 79) {
            System.out.printf(hurt_desc[2], role.getName());
        } else if (remainBlood >= 60 && remainBlood <= 69) {
            System.out.printf(hurt_desc[3], role.getName());
        } else if (remainBlood >= 50 && remainBlood <= 59) {
            System.out.printf(hurt_desc[4], role.getName());
        } else if (remainBlood >= 40 && remainBlood <= 49) {
            System.out.printf(hurt_desc[5], role.getName());
        } else if (remainBlood >= 30 && remainBlood <= 39) {
            System.out.printf(hurt_desc[6], role.getName());
        } else {
            System.out.printf(hurt_desc[7], role.getName());
        }
        System.out.println();

    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("面目为：" + getFace());
    }

}
