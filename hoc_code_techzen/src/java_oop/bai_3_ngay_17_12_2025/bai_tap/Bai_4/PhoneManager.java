package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_4;

import java.util.ArrayList;

public class PhoneManager {
    private final ArrayList<OldPhone> oldPhones;
    private final ArrayList<NewPhone> newPhones;

    {
        oldPhones = new ArrayList<>();
        newPhones = new ArrayList<>();

        oldPhones.add(new OldPhone("iPhone 12", 8000000, 3, "Apple", 85, "ko co"));
        oldPhones.add(new OldPhone("Samsung Galaxy", 6000000, 6, "Samsung", 75, "nut kinh"));

        newPhones.add(new NewPhone("iPhone 15", 25000000, 12, "Apple", 10));
        newPhones.add(new NewPhone("Samsung GalaxyS24", 22000000, 12, "Samsung", 15));
    }

    public void viewAllPhones() {
        System.out.println("\n=== DANH SACH DIEN THOAI CU ===");
        if (oldPhones.isEmpty()) {
            System.out.println("Khong co dien thoai cu nao!");
        } else {
            for (OldPhone phone : oldPhones) {
                phone.display();
            }
        }

        System.out.println("\n=== DANH SACH DIEN THOAI MOI ===");
        if (newPhones.isEmpty()) {
            System.out.println("Khong co dien thoai moi nao!");
        } else {
            for (NewPhone phone : newPhones) {
                phone.display();
            }
        }
    }

    public void viewOldPhones() {
        System.out.println("\n=== DANH SACH DIEN THOAI CU ===");
        if (oldPhones.isEmpty()) {
            System.out.println("Khong co dien thoai cu nao!");
        } else {
            for (OldPhone phone : oldPhones) {
                phone.display();
            }
        }
    }

    public void viewNewPhones() {
        System.out.println("\n=== DANH SACH DIEN THOAI MOI ===");
        if (newPhones.isEmpty()) {
            System.out.println("Khong co dien thoai moi nao!");
        } else {
            for (NewPhone phone : newPhones) {
                phone.display();
            }
        }
    }

    public void addOldPhone() {
        System.out.println("\n=== THEM DIEN THOAI CU ===");
        OldPhone phone = new OldPhone();
        phone.input();
        oldPhones.add(phone);
        System.out.println("Them dien thoai cu thanh cong! ID: " + phone.getId());
    }

    public void addNewPhone() {
        System.out.println("\n=== THEM DIEN THOAI MOI ===");
        NewPhone phone = new NewPhone();
        phone.input();
        newPhones.add(phone);
        System.out.println("Them dien thoai moi thanh cong! ID: " + phone.getId());
    }

    public void updatePhone() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("\n=== CAP NHAT THONG TIN DIEN THOAI ===");
        System.out.print("Nhap ID dien thoai can cap nhat: ");
        String id = scanner.nextLine();

        if (isInvalidIdFormat(id)) {
            System.out.println("ID khong dung dinh dang! Phai bat dau bang DTC hoac DTM va co 6 ky tu.");
            return;
        }

        if (id.startsWith("DTC")) {
            for (OldPhone phone : oldPhones) {
                if (phone.getId().equals(id)) {
                    System.out.println("Tim thay dien thoai cu:");
                    phone.display();
                    System.out.println("\nNhap thong tin moi:");
                    phone.input();
                    System.out.println("Cap nhat thanh cong!");
                    return;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (NewPhone phone : newPhones) {
                if (phone.getId().equals(id)) {
                    System.out.println("Tim thay dien thoai moi:");
                    phone.display();
                    System.out.println("\nNhap thong tin moi:");
                    phone.input();
                    System.out.println("Cap nhat thanh cong!");
                    return;
                }
            }
        }

        System.out.println("Khong tim thay dien thoai voi ID: " + id);
    }

    public void deletePhone() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("\n=== XOA DIEN THOAI ===");
        System.out.print("Nhap ID dien thoai can xoa: ");
        String id = scanner.nextLine();

        if (isInvalidIdFormat(id)) {
            System.out.println("ID khong dung dinh dang! Phai bat dau bang DTC hoac DTM va co 6 ky tu.");
            return;
        }

        if (id.startsWith("DTC")) {
            for (int i = 0; i < oldPhones.size(); i++) {
                if (oldPhones.get(i).getId().equals(id)) {
                    oldPhones.remove(i);
                    System.out.println("Xoa dien thoai cu thanh cong!");
                    return;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (int i = 0; i < newPhones.size(); i++) {
                if (newPhones.get(i).getId().equals(id)) {
                    newPhones.remove(i);
                    System.out.println("Xoa dien thoai moi thanh cong!");
                    return;
                }
            }
        }

        System.out.println("Khong tim thay dien thoai voi ID: " + id);
    }

    private boolean isInvalidIdFormat(String id) {
        return id.length() != 6 || (!id.startsWith("DTC") && !id.startsWith("DTM"));
    }
}
