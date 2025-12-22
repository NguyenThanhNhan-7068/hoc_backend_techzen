package java_oop.bai_3_ngay_17_12_2025.bai_hoc.bai_1;

import java.util.Scanner;

public class NhanVienQuanLy extends NhanVien{
    private double basicSalary;
    private double coefficientSalary;

    public NhanVienQuanLy() {

    }

    public NhanVienQuanLy(String id, String fullName, String dayOfBirthday, String address, double basicSalary, double coefficientSalary) {
        super(id, address, dayOfBirthday, fullName);
        this.basicSalary = basicSalary;
        this.coefficientSalary = coefficientSalary;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.println("nhap luong co ban: ");
        basicSalary = sc.nextDouble();
        System.out.println("nhap he so luong: ");
        coefficientSalary = sc.nextDouble();
    }

    public void output(){
        super.output();
        System.out.println("luong co ban: "+ basicSalary);
        System.out.println("he so luong: "+ coefficientSalary);
    }

}
