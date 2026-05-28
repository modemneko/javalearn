package kru.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaximumAge(ArrayList<Student> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAge() > max) {
                max = arr.get(i).getAge();
            }
        }
        return max;
    }
}
