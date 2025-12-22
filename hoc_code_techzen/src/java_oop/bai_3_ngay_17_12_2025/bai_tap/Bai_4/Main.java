package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_4;

import java.util.Scanner;

public class Main {
    private static PhoneManager phoneManager = new PhoneManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int choice = getChoice(1, 9);

            switch (choice) {
                case 1:
                    viewPhoneList();
                    break;
                case 2:
                    addNewPhone();
                    break;
                case 3:
                    phoneManager.updatePhone();
                    break;
                case 4:
                    phoneManager.deletePhone();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    searchPhone();
                    break;
                case 7:
                    calculateTotalPrice();
                    break;
                case 8:
                    discountOldPhone();
                    break;
                case 9:
                    System.out.println("Thoat chuong trinh!");
                    return;
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\n-- CHUONG TRINH QUAN LY DIEN THOAI --");
        System.out.println("1. Xem danh sach dien thoai");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Sap xep theo gia");
        System.out.println("6. Tim kiem");
        System.out.println("7. Tinh tong tien");
        System.out.println("8. Giam gia cho dien thoai cu");
        System.out.println("9. Thoat");
        System.out.print("Chon chuc nang: ");
    }

    private static void viewPhoneList() {
        while (true) {
            System.out.println("\n-- XEM DANH SACH DIEN THOAI --");
            System.out.println("1. Xem tat ca");
            System.out.println("2. Xem dien thoai cu");
            System.out.println("3. Xem dien thoai moi");
            System.out.println("4. Tro ve menu chinh");
            System.out.print("Chon: ");

            int choice = getChoice(1, 4);
            switch (choice) {
                case 1:
                    phoneManager.viewAllPhones();
                    break;
                case 2:
                    phoneManager.viewOldPhones();
                    break;
                case 3:
                    phoneManager.viewNewPhones();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void addNewPhone() {
        while (true) {
            System.out.println("\n-- THEM MOI --");
            System.out.println("1. Them moi dien thoai cu");
            System.out.println("2. Them moi dien thoai moi");
            System.out.println("3. Tro ve menu chinh");
            System.out.print("Chon: ");

            int choice = getChoice(1, 3);
            switch (choice) {
                case 1:
                    phoneManager.addOldPhone();
                    break;
                case 2:
                    phoneManager.addNewPhone();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void sortByPrice() {
        while (true) {
            System.out.println("\n-- SAP XEP THEO GIA --");
            System.out.println("1. Tang dan");
            System.out.println("2. Giam dan");
            System.out.println("3. Tro ve menu chinh");

        }
    }

    private static void searchPhone() {
        while (true) {
            System.out.println("\n-- TIM KIEM --");
            System.out.println("1. Tim kiem tat ca dien thoai");
            System.out.println("2. Tim kiem dien thoai cu");
            System.out.println("3. Tim kiem dien thoai moi");
            System.out.println("4. Tro ve menu chinh");


        }
    }

    private static void searchSubMenu() {
        while (true) {
            System.out.println("\n-- TIM KIEM THEO --");
            System.out.println("1. Tim kiem theo gia (se hoan thien sau)");
            System.out.println("2. Tim kiem theo ten (se hoan thien sau)");
            System.out.println("3. Tim kiem theo hang (se hoan thien sau)");
            System.out.println("4. Tro ve menu Tim kiem");

        }
    }

    private static void calculateTotalPrice() {
        System.out.println("\nChuc nang: Tinh tong tien (chua lam)");
    }

    private static void discountOldPhone() {
        System.out.println("\nChuc nang: Giam gia cho dien thoai cu (chua lam)");
    }

    private static int getChoice(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.print("Vui long nhap so tu " + min + " den " + max + ": ");
            } catch (NumberFormatException e) {
                System.out.print("Vui long nhap so hop le: ");
            }
        }
    }
}
