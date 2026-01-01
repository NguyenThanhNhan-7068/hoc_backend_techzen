package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_3;

import java.util.Comparator;

public class PhonePriceDescComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
