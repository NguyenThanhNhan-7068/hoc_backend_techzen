package java_oop.bai_9_ngay_29_12_2025.bai_hoc;


import java.util.Comparator;

public class ScoreASCIdDESCComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compareScore = Double.compare(o1.getScore(), o2.getScore());
        if (compareScore == 0) {
            return -Integer.compare(o1.getId(), o2.getId());
        }
        return compareScore;
    }
}
