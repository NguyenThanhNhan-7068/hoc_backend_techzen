package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_1;

import java.util.TreeSet;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2,6,4,1,8,3};

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int min = set.first();
        int max = set.last();

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }



}
