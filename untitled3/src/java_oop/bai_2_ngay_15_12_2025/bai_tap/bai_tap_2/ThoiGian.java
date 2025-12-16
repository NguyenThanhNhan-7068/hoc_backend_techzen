package java_oop.bai_2_ngay_15_12_2025.bai_tap.bai_tap_2;

public class ThoiGian {
        int gio;
        int phut;
        int giay;

        ThoiGian() {
            gio = 0;
            phut = 0;
            giay = 0;
        }

        ThoiGian(int gio) {
            this.gio = gio;
            phut = 0;
            giay = 0;
        }

        ThoiGian(int gio, int phut) {
            this.gio = gio;
            this.phut = phut;
            giay = 0;
        }

        ThoiGian(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        ThoiGian(ThoiGian tg) {
            gio = tg.gio;
            phut = tg.phut;
            giay = tg.giay;
        }

        void xuat() {
            System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
        }

}
