package kru.test3;

public class GoodsTest {
    public static void main(String[] args) {
        // 创建一个数组
        Goods[] arr = new Goods[3];

        // 创建三个商品对象
        Goods G1 = new Goods("001", "华为P40", 5999.0, 100);
        Goods G2 = new Goods("002", "保温杯", 277.0, 50);
        Goods G3 = new Goods("003", "枸杞", 12.7, 70);
        
        // 把商品添加到数组中
        arr[0] = G1;
        arr[1] = G2;
        arr[2] = G3;
        
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
