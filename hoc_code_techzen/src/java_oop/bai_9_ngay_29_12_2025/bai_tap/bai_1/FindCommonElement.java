package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_1;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {1,4,6};

        int[] arr3 = findCommonElement(arr1,arr2);
        output(arr3);

    }

    public static void output(int[] arr){
        System.out.print("Phan tu trung: ");

        if(arr.length == 0){
            System.out.print("khong co phan tu trung.");
            return;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    public static int[] findCommonElement(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        Set<Integer> setCommonElement = new HashSet<>();

        for (int num1 : set1) {
            for (int num2 : set2) {
                if (num1 == num2) {
                    setCommonElement.add(num1);
                }
            }
        }

        int[] arrCommonElement = new int[setCommonElement.size()];
        int index = 0;

        for (int num : setCommonElement) {
            arrCommonElement[index] = num;
            index++;
        }

        return arrCommonElement;


    }
}
