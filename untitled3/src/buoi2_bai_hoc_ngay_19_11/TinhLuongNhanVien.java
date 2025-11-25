package buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void tinhLuong(){
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap tham nien cong tac: ");
        int TNCT = sc.nextInt();
        double luongCanBan = 65000;
        double heso=0;
        if(TNCT<0 ) System.out.println("nhap sai. khong the nho hon 0.");
        else if(TNCT <12);
        else if(TNCT<36) heso=2.34;
        else if (TNCT<60) heso=3;
        else {
            heso=4.5;
        }

        double luong = heso*luongCanBan;
        System.out.println("luong nhan vien la: "+ luong);

    }

    public static void main(String[] args) {
        tinhLuong();
    }

}
