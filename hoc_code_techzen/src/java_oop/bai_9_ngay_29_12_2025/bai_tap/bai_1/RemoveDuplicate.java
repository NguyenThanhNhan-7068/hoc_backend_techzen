package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_1;

import java.util.HashSet;
import  java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6,5,1,2};

        int[] uniqueArr = removeDuplicate(arr);

        System.out.println("====danh sach phan tu===== ");
        for (int num : uniqueArr){
            System.out.println(num);
        }


    }

    static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set){
            uniqueArr[index] = num;
            index++;
        }

        return uniqueArr;
    }

}
