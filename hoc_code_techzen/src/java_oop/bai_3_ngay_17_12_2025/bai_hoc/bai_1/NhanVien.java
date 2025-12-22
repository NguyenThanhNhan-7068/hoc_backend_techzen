package java_oop.bai_3_ngay_17_12_2025.bai_hoc.bai_1;

import java.util.Scanner;

// lớp cha
public class NhanVien {
    private String id;
    private String fullName;
    private String dayOfBirthday;
    private String address;
// get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

// contructer

    public NhanVien() {
    }

    public NhanVien(String id, String fullName, String dayOfBirthday, String address) {
        this.id = id;
        this.address = address;
        this.dayOfBirthday = dayOfBirthday;
        this.fullName = fullName;
    }
//    nhap
    public void input(Scanner sc){
        System.out.println("nhap ten: ");
        fullName = sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        dayOfBirthday = sc.nextLine();
        System.out.println("nhap dia chi: ");
        address = sc.nextLine();
    }
//    xuat
    public void output(){
        System.out.println("id: "+ id);
        System.out.println("ten: "+ fullName);
        System.out.println("ngay sing: "+ dayOfBirthday);
        System.out.println("dia chi: "+address);
    }
}
