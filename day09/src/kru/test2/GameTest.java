package kru.test2;

public class GameTest {
    public static void main(String[] args) {
        // 创建角色
        Role r1 = new Role("耄耄",100, '猫');
        // 角色2
        Role r2 = new Role("坤坤", 100,'男');

        // 展示一下角色的信息
        System.out.println("角色1：");
        r1.showRoleInfo();
        System.out.println("角色2：");
        r2.showRoleInfo();

        // 开始格斗， 回合制游戏
        while(true) {
            // r1 开始攻击 r2
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O 了" + r2.getName());
                break;
            }

            // r2 开始攻击 r1
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O 了" + r1.getName());
                break;
            }
        }

    }
}
