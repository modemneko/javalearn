package kru.test;

public class Test4 {
    public static void main(String[] args) {
        /*数组元素的复制
        需求：
        把一个数组中的元素复制到另一个新数组中去。*/

        int[] org_arr = {1,2,3,4,5};
        int[] new_arr = new int[org_arr.length];

        for (int i = 0; i < org_arr.length; i++) {
            new_arr[i] = org_arr[i];
        }

        System.out.println("新数组：");
        for (int i : new_arr) {
            System.out.print(i+" ");
        }
    }
}
