package java_oop.bai_10_ngay_2_1_2026.bai_tap;

import java_oop.bai_10_ngay_2_1_2026.bai_tap.validation.CommonValidation;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone>{
    private String id;
    private String name;
    private double price;
    private int warrantyPeriod;
    private String manufacturer;

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    public Phone() {}

    public Phone(String id, String name, double price, int warrantyPeriod, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
        this.manufacturer = manufacturer;
    }

    public void input() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten dien thoai: ");
        String name = scanner.nextLine();
        CommonValidation.checkEmpty(name, "Ten dien thoai");
        this.name = name;

        System.out.print("Nhap gia ban: ");
        this.price = CommonValidation.parsePositiveDouble(
                scanner.nextLine(), "Gia ban");

        System.out.print("Nhap thoi gian bao hanh: ");
        this.warrantyPeriod = CommonValidation.parsePositiveInt(
                scanner.nextLine(), "Thoi gian bao hanh");

        System.out.print("Nhap hang san xuat: ");
        String manufacturer = scanner.nextLine();
        CommonValidation.checkEmpty(manufacturer, "Hang san xuat");
        this.manufacturer = manufacturer;
    }

    public void output() {
        System.out.println("\nID: "+ this.id);
        System.out.println("Tên điện thoại: " + this.name);
        System.out.println("Giá bán: " + this.price);
        System.out.println("Thời gian bảo hành: " + this.warrantyPeriod);
        System.out.println("Hãng sản xuất: " + this.manufacturer);

    }

    public abstract double sumPrice();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
