package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckNoDuplicateName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nhan","van","nhan","tu","vi");
        checkNoDuplicateName(names);

    }

    public static void checkNoDuplicateName(List<String> names) {
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        System.out.println("Ten duy nhat:");
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) == 1) {
                System.out.println(name);
            }
        }

        System.out.println("Ten xuat hien nhieu lan:");
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) > 1) {
                System.out.println(name);
            }
        }
    }
}
