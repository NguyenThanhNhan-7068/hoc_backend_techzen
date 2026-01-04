package java_oop.bai_10_ngay_2_1_2026.bai_tap;

import java.util.Comparator;

public class PhonePriceDescComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
