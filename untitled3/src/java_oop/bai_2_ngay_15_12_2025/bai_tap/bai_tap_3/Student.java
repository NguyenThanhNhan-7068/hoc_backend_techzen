package java_oop.bai_2_ngay_15_12_2025.bai_tap.bai_tap_3;

public class Student {
    private int id;
    private String name;
    private double score;

    Student(int id, String name, double score) {
        this.id = id;
        setName(name);
        setScore(score);
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getScore() {
        return score;
    }

    void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Loi,ten khong dc trong!");
            return ;
        }
        this.name = name;
    }

    void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("nhap sai,diem tu 0 ->10.");
            return;
        }
        this.score = score;
    }
}
