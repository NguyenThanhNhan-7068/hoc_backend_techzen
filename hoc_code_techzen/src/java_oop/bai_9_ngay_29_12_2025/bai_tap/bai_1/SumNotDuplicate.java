package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_1;

import java.util.HashSet;
import java.util.Set;

public class SumNotDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4,2};
        int sum = sumNotDuplicate(arr);

        System.out.println("tong: " + sum);



    }

    public static int sumNotDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        int sum = 0;

        for (int num : set){
            sum += num;
        }
        return sum;

    }


}
