package java_core.buoi2_bai_tap_ngay_19_11;

import java.util.Scanner;

public class BanHang {
    public static void hoa_don(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten hang: ");
        String tenHang= sc.nextLine();
        System.out.println("nhap so luong: ");
        int soLuong= sc.nextInt();
        System.out.println("nhap don gia: ");
        float donGia = sc.nextFloat();
        float tienHang = soLuong * donGia;
        System.out.println("tien hang: "+ tienHang);
        float VAT = tienHang * 0.1f;
        System.out.println("thue VAT" + VAT);
        float tongTien = tienHang + VAT;
        System.out.println("Tong tien thanh toan: "+ tongTien);
    }

    public static void main(String[] args) {
        hoa_don();
    }
}
