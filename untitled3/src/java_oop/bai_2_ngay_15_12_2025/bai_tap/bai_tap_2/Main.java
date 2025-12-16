package java_oop.bai_2_ngay_15_12_2025.bai_tap.bai_tap_2;

public class Main {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat();

        ThoiGian b = new ThoiGian(7);
        b.xuat();

        ThoiGian c = new ThoiGian(7, 30);
        c.xuat();

        ThoiGian d = new ThoiGian(7, 30, 50);
        d.xuat();

        ThoiGian f = new ThoiGian(d);
        f.xuat();
    }
}
