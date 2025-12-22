package java_oop.bai_2_ngay_15_12_2025.bai_hoc;

import java.util.Scanner;

public class Animal {
    private String id;
    private String name;
    private String color;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id: ");
        id = sc.nextLine();
        System.out.println("nhap ten: ");
        name = sc.nextLine();
        System.out.println("nhap mau sac: ");
        color = sc.nextLine();
        System.out.println("nhap tuoi: ");
        age = sc.nextInt();
    }
    public void xuat(){
        System.out.println("id: " + getId());
        System.out.println("ten:" + getName());
        System.out.println("mau sac: " + getColor());
        System.out.println("tuoi:" + getAge());

    }
}
