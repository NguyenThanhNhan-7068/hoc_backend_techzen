package java_oop.bai_5_ngay_24_12_2025.bai_tap;

import java.util.Scanner;

public abstract class Phone {
    private String id;
    private String name;
    private double price;
    private int warrantyPeriod;
    private String manufacturer;

    public Phone() {}

    public Phone(String id, String name, double price, int warrantyPeriod, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
        this.manufacturer = manufacturer;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNhap ten dien thoai: ");
        this.name = scanner.nextLine();

        System.out.print("Nhap gia ban: ");
        this.price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap thoi gian bao hanh (thang): ");
        this.warrantyPeriod = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap hang san xuat: ");
        this.manufacturer = scanner.nextLine();
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
