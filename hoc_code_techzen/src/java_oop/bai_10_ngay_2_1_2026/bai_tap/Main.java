package java_oop.bai_10_ngay_2_1_2026.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        phones.add(new OldPhone(
                "DTC001",
                "Iphone 15 Promax",
                20,
                6,
                "Apple",
                95,
                "Da qua su dung, tinh trang tot"
        ));

        phones.add(new OldPhone(
                "DTC002",
                "Iphone 12 Promax",
                90,
                6,
                "Apple",
                75,
                "Da qua su dung, man hinh nut nhe"
        ));

        phones.add(new NewPhone(
                "DTM001",
                "Samsung Galaxy S22",
                10,
                12,
                "Samsung",
                5
        ));

        phones.add(new NewPhone(
                "DTM002",
                "Samsung Galaxy A54",
                50,
                12,
                "Samsung",
                2
        ));
    }

    public static void main(String[] args) {
        int choose = -1;

        while (true) {
            do {
                System.out.println("-- CHUONG TRINH QUAN LY DIEN THOAI --");
                System.out.println("1. Xem danh sach dien thoai");
                System.out.println("2. Them moi");
                System.out.println("3. Cap nhat");
                System.out.println("4. Xoa");
                System.out.println("5. Sap xep theo gia");
                System.out.println("6. Tim kiem");
                System.out.println("7. Tinh tong tien");
                System.out.println("8. Giam gia cho dien thoai cu");
                System.out.println("9. Thoat");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1 -> menuShowList();
                        case 2 -> menuAddNew();
                        case 3 -> update();
                        case 4 -> delete();
                        case 5 -> menuSort();
                        case 6 -> menuSearch();
                        case 7 -> sumPrice();
                        case 8 -> discountPriceWithOdlPhone();
                        case 9 -> { return; }
                        default -> System.out.println("Lua chon khong hop le, xin chon lai");
                    }

                }
                catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                }
                catch (Exception e) {
                    System.out.println(
                            "Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng."
                    );
                }

            } while (choose < 1 || choose > 9);
        }
    }

    private static void menuShowList() {
        int choose = -1;
        while (true) {
            do {
                System.out.println("\nDANH SACH DIEN THOAI");
                System.out.println("1. Xem tat ca");
                System.out.println("2. Xem dien thoai cu");
                System.out.println("3. Xem dien thoai moi");
                System.out.println("4. Tro ve menu chinh");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1 -> {
                            for (int i = 0; i < phones.size(); i++) {
                                System.out.println("\nThong tin dien thoai thu " + (i + 1));
                                phones.get(i).output();
                            }
                        }
                        case 2 -> {
                            int count = 0;
                            for (Phone p : phones) {
                                if (p instanceof OldPhone) {
                                    count++;
                                    p.output();
                                }
                            }
                            if (count == 0) System.out.println("Khong co dien thoai cu!");
                        }
                        case 3 -> {
                            int count = 0;
                            for (Phone p : phones) {
                                if (p instanceof NewPhone) {
                                    count++;
                                    p.output();
                                }
                            }
                            if (count == 0) System.out.println("Khong co dien thoai moi!");
                        }
                        case 4 -> { return; }
                        default -> System.out.println("Lua chon khong hop le");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                } catch (Exception e) {
                    System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
                }
            } while (choose < 1 || choose > 4);
        }
    }


    private static void menuAddNew() {
        int choose = -1;
        while (true) {
            do {
                System.out.println("\nTHEM MOI DIEN THOAI");
                System.out.println("1. Them moi dien thoai cu");
                System.out.println("2. Them moi dien thoai moi");
                System.out.println("3. Tro ve menu chinh");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1 -> {
                            try {
                                OldPhone oldPhone = new OldPhone();
                                oldPhone.input();
                                oldPhone.setId(getIdOldPhone());
                                phones.add(oldPhone);
                                System.out.println("Them moi thanh cong");
                            } catch (NumberFormatException e) {
                                System.out.println("Gia, thoi gian bao hanh, tinh trang pin phai la so");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        case 2 -> {
                            try {
                                NewPhone newPhone = new NewPhone();
                                newPhone.input();
                                newPhone.setId(getIdNewPhone());
                                phones.add(newPhone);
                                System.out.println("Them moi thanh cong");
                            } catch (NumberFormatException e) {
                                System.out.println("Gia, thoi gian bao hanh, so luong phai la so");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        case 3 -> { return; }

                        default -> System.out.println("Lua chon khong hop le, xin chon lai");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                } catch (Exception e) {
                    System.out.println(
                            "Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng."
                    );
                }

            } while (choose < 1 || choose > 3);
        }
    }


    private static String getIdOldPhone() {

        int max = 0;
        for (Phone phone : phones) {
            if (phone.getId().startsWith("DTC")) {
                int idNum = Integer.parseInt(phone.getId().substring(3));
                if (max < idNum) {
                    max = idNum;
                }
            }
        }
        return String.format("DTC%03d", max + 1);
    }

    private static String getIdNewPhone() {
        int max = 0;
        for (Phone phone : phones) {
            if (phone.getId().startsWith("DTM")) {
                int idNum = Integer.parseInt(phone.getId().substring(3));
                if (idNum > max) {
                    max = idNum;

                }
            }
        }
        return String.format("DTM%03d", max + 1);
    }

    private static void update() {
        System.out.print("Nhap vao ma muon cap nhat: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone instanceof OldPhone oldPhone && oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    try {
                        oldPhone.input();
                        System.out.println("Cap nhat thanh cong!");
                    } catch (NumberFormatException e) {
                        System.out.println("Du lieu nhap vao phai la so");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Khong tim thay ma muon cap nhat!");
            }

        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone instanceof NewPhone newPhone && newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    try {
                        newPhone.input();
                        System.out.println("Cap nhat thanh cong!");
                    } catch (NumberFormatException e) {
                        System.out.println("Du lieu nhap vao phai la so");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Khong tim thay ma muon cap nhat!");
            }

        } else {
            System.out.println("Ma khong hop le!");
        }
    }

    private static void delete() {
        System.out.print("Nhap vao ma muon xoa: ");
        String id = sc.nextLine();

        boolean isExistPhone = false;
        Phone phoneToDelete = null;

        for (Phone phone : phones) {
            if (phone.getId().equals(id)) {
                isExistPhone = true;
                phoneToDelete = phone;
                break;
            }
        }

        if (!isExistPhone) {
            System.out.println("Khong tim thay ma muon xoa!");
            return;
        }

        phones.remove(phoneToDelete);
        System.out.println("Xoa thanh cong!");
    }

    //    private static void sortByPrice(boolean ascending) {
//        for (int i = 0; i < phones.size() - 1; i++) {
//            for (int j = i + 1; j < phones.size(); j++) {
//                boolean shouldSwap;
//
//                if (ascending) {
//                    shouldSwap = phones.get(i).getPrice() > phones.get(j).getPrice();
//                }
//                else {
//                    shouldSwap = phones.get(i).getPrice() < phones.get(j).getPrice();
//                }
//
//                if (shouldSwap) {
//                    Phone temp = phones.get(i);
//                    phones.set(i, phones.get(j));
//                    phones.set(j, temp);
//                }
//            }
//        }
//
//        System.out.println("Sap xep thanh cong!");
//        System.out.println("\nDanh sach sau khi sap xep:");
//
//        for (int i = 0; i < phones.size(); i++) {
//            System.out.println("\nThong tin dien thoai thu " + (i + 1));
//
//            Phone p = phones.get(i);
//
//            if (p instanceof OldPhone oldPhone) {
//                System.out.println("sap xep dien thoai cu");
//                oldPhone.output();
//            }
//            else if (p instanceof NewPhone newPhone) {
//                System.out.println("Sap xep thoai moi");
//                newPhone.output();
//            }
//        }
//    }
    private static void sortByPrice(boolean ascending) {
        if (ascending) {
            Collections.sort(phones);
        } else {
            Collections.sort(phones, new PhonePriceDescComparator());
        }

        System.out.println("Sap xep thanh cong!");
        for (int i = 0; i < phones.size(); i++) {
            System.out.println("\nThong tin dien thoai thu " + (i + 1));
            phones.get(i).output();
        }
    }

    private static void menuSort() {
        int choose = -1;
        while (true) {
            do {
                System.out.println("\nSAP XEP THEO GIA");
                System.out.println("1. Tang dan");
                System.out.println("2. Giam dan");
                System.out.println("3. Tro ve");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1 -> sortByPrice(true);
                        case 2 -> sortByPrice(false);
                        case 3 -> { return; }
                        default -> System.out.println("Lua chon khong hop le");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                } catch (Exception e) {
                    System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
                }
            } while (choose < 1 || choose > 3);
        }
    }


    private static void searchByType() {
        int choose = -1;
        while (true) {
            do {
                System.out.println("\n1. Dien thoai cu");
                System.out.println("2. Dien thoai moi");
                System.out.println("3. Tro ve");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());
                    ArrayList<Phone> result = new ArrayList<>();

                    if (choose == 1) {
                        for (Phone p : phones) if (p instanceof OldPhone) result.add(p);
                    } else if (choose == 2) {
                        for (Phone p : phones) if (p instanceof NewPhone) result.add(p);
                    } else if (choose == 3) {
                        return;
                    } else {
                        System.out.println("Lua chon khong hop le");
                        continue;
                    }

                    displaySearchResult(result, "theo loai");

                } catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                } catch (Exception e) {
                    System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
                }
            } while (choose < 1 || choose > 3);
        }
    }


    private static void searchByPrice() {
        try {
            System.out.print("Nhap gia thap nhat: ");
            double min = Double.parseDouble(sc.nextLine());

            System.out.print("Nhap gia cao nhat: ");
            double max = Double.parseDouble(sc.nextLine());

            ArrayList<Phone> result = new ArrayList<>();
            for (Phone p : phones) {
                if (p.getPrice() >= min && p.getPrice() <= max) {
                    result.add(p);
                }
            }

            displaySearchResult(result, "theo gia");

        } catch (NumberFormatException e) {
            System.out.println("Gia phai la so");
        } catch (Exception e) {
            System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
        }
    }


    private static void searchByName() {
        try {
            System.out.print("Nhap ten can tim: ");
            String key = sc.nextLine().toLowerCase();

            ArrayList<Phone> result = new ArrayList<>();
            for (Phone p : phones) {
                if (p.getName().toLowerCase().contains(key)) {
                    result.add(p);
                }
            }

            displaySearchResult(result, "theo ten");

        } catch (Exception e) {
            System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
        }
    }


    private static void displaySearchResult(ArrayList<Phone> result, String criteria) {
        System.out.println("\n==== Ket qua tim kiem " + criteria + " ====");
        if (result.isEmpty()) {
            System.out.println("Khong tim thay ket qua nao!");
        } else {
            for (int i = 0; i < result.size(); i++) {
                System.out.println("\nThong tin dien thoai thu " + (i + 1));
                result.get(i).output();
            }
            System.out.println("Tim thay " + result.size() + " ket qua.");
        }
    }

    private static void menuSearch() {
        int choose = -1;
        while (true) {
            do {
                System.out.println("\nTIM KIEM DIEN THOAI");
                System.out.println("1. Theo loai");
                System.out.println("2. Theo gia");
                System.out.println("3. Theo ten");
                System.out.println("4. Tro ve");

                System.out.print("Moi ban lua chon: ");

                try {
                    choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1 -> searchByType();
                        case 2 -> searchByPrice();
                        case 3 -> searchByName();
                        case 4 -> { return; }
                        default -> System.out.println("Lua chon khong hop le");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Lua chon phai la so");
                } catch (Exception e) {
                    System.out.println("Ứng dụng gặp một số lỗi không mong muốn, xin vui lòng thử lại các chức năng.");
                }
            } while (choose < 1 || choose > 4);
        }
    }


    private static void sumPrice() {
        System.out.println("===========Tong tien===========");

        double sumPriceNew = 0;
        double sumPriceOld = 0;

        for (Phone phone : phones) {
            double sumPrice = phone.sumPrice();

            if (phone instanceof OldPhone) {
                sumPriceOld += sumPrice;
            } else {
                sumPriceNew += sumPrice;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Tong tien dien thoai cu: " + sumPriceOld + " VND");
        System.out.println("Tong tien dien thoai moi: " + sumPriceNew + " VND");
        System.out.println("=========================");

    }

    private static void discountPriceWithOdlPhone() {
        boolean checkOldPhone = false;
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                checkOldPhone = true;
                break;
            }
        }

        if (!checkOldPhone) {
            System.out.println("o co dien thoai cu!");
            return;
        }

        System.out.println("nhap phan tram giam gia:l ");
        double discountPercent = Double.parseDouble(sc.nextLine());

        if (discountPercent < 0 || discountPercent > 100) {
            System.out.println("ty le giam gia khong hop ly.");
            return;
        }

        System.out.println("\nGiam gia " + discountPercent + "% cho dien thoai cu:");
        int count = 0;

        for (Phone phone : phones) {
            if (phone instanceof OldPhone oldPhone) {
                oldPhone.promotion(discountPercent);
                count++;
            }
        }

        System.out.println("\nda giam gia cho " + count + " dien thoai cu!");

    }


}