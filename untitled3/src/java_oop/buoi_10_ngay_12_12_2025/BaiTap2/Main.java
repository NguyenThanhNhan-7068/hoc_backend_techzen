package java_oop.buoi_10_ngay_12_12_2025.BaiTap2;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhap phan so 1:");
        ps1.nhap();
        System.out.println("nhap phan so 2:");
        ps2.nhap();

        System.out.print("tong la: ");
        ps1.cong(ps2).xuat();

        System.out.print("hieu la: ");
        ps1.tru(ps2).xuat();

        System.out.print("tich la: ");
        ps1.nhan(ps2).xuat();

        System.out.print("thuong la: ");
        ps1.chia(ps2).xuat();
        ps1.kiemTraGiaTri();
    }
}


