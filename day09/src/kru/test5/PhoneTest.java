package kru.test5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        Phone[] phones = new Phone[3];

        p1.setBrand("小米");
        p1.setPrice(2999.9);
        p1.setColor("白色");

        p2.setBrand("小米");
        p2.setPrice(2999.9);
        p2.setColor("白色");

        p3.setBrand("小米");
        p3.setPrice(2999.9);
        p3.setColor("白色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        double sum = 0;

        for (int i = 0; i < phones.length; i++) {
            System.out.println(
                    "品牌：" + phones[i].getBrand() + "价格："+ phones[i].getPrice()+" 颜色：" + phones[i].getColor()
            );
        }
    }
}
