package java_oop.bai_3_ngay_17_12_2025.bai_hoc.bai_1;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
//    co cac thuoc tinh cua lop nhan vien

//    thuoc tinh rieng lop con nay
    private double numberProducts;

//    tao structer( structer khong dung chung giua cac lop cha con
    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(String id, String fullName, String dayOfBirthday, String address, double numberProducts) {
        super(id, address, dayOfBirthday, fullName);
        this.numberProducts = numberProducts;
    }
//    get set cho thuoc tinh rieng. thuoc tinh lop cha get set o class nhan vien roi

    public double getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(double numberProducts) {
        this.numberProducts = numberProducts;
    }

//    nhap
    public void input(Scanner sc){
//        phuong thuc nay ton tai o lop nhanvien. dung lenh super nhu ben duoi de dung cua lop cha.
        super.input(sc);
//        phan nhap rieng cua class
        System.out.println("nhap so san pham: ");
        this.numberProducts = Double.parseDouble(sc.nextLine());
    }

//    xuat
    public void output(){
//        phuong thuc nay ton tai o lop nhanvien. dung lenh super nhu ben duoi de dung cua lop cha.
        super.output();
//        phan nhap rieng cua class
        System.out.println("so san pham: " + numberProducts);
    }
}
