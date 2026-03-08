package kru.test;

import java.util.ArrayList;
import java.util.Random;

public class ArrTest {
    public static Ar ar = new Ar(1);
    public static void main(String[] args) {
        /* 遍历数组求和
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/

        // 定义数组
        int[] arr = new int[10];
        // 把随机数存入到数组当中
        Random r = new Random();

        for (int i : arr) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(1, 100);
            // 把随机数存入到数组当中
            // 数组名[索引] = 数据;
            arr[i] = number;
        }
        int he = 0;
        for (int i =0 ; i < arr.length ; i++) {
            he += arr[i];
        }
        float average = he / arr.length;
        for (int i =0 ; i < arr.length ; i++) {
            if (arr[i] < average) ar.add(arr[i]);
            //min.size;
        }
    }

        //@SuppressWarnings("unchecked")
        /**
         *一个简单的可变数组(建议去用{@link ArrayList})
         * 反射抄的arc的seq
         * @Author cia
         * @Vision 8.8.8.8
        **/
        static class Ar{
            public float[] items;
            public int size;

            public Ar(){
                this(16);
            }

            public  Ar(int size){
                this.size = size;
                items = new float[size];
            }

            public void add(float value){
                if (size == items.length){
                    float[] newitem = new float[size*2];
                    //T[] newitem = (float[]) (items.getClass() == Object[].class ? new Object[size * 2] : java.lang.reflect.Array.newInstance(items.getClass().getComponentType(),size*2));
                    System.arraycopy(items,0,newitem,0,Math.min(size,size*2));
                    this.items = newitem;
                }
                items[size++] = value;
            }
        }

}
