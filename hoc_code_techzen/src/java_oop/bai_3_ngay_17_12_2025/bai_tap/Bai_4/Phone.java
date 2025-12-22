package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_4;

import java.util.Scanner;

public class Phone {
    protected String id;
    protected String name;
    protected double price;
    protected int warrantyPeriod;
    protected String manufacturer;

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

        System.out.print("Nhap ten dien thoai: ");
        this.name = scanner.nextLine();

        System.out.print("Nhap gia ban: ");
        this.price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap thoi gian bao hanh (thang): ");
        this.warrantyPeriod = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap hang san xuat: ");
        this.manufacturer = scanner.nextLine();
    }

    public void display() {
        System.out.printf("ID: %s | Ten: %s | Gia: %.2f | BH: %d thang | Hang: %s",
                id, name, price, warrantyPeriod, manufacturer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
