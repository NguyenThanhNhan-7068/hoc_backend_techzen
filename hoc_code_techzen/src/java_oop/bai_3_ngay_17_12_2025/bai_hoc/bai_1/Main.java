package java_oop.bai_3_ngay_17_12_2025.bai_hoc.bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<NhanVienQuanLy> nvqlList = new ArrayList<>();
    static ArrayList<NhanVienSanXuat> nvsxList =new ArrayList<>();

    public static String getIDQuanLy(){
        if(nvqlList.isEmpty()){
            return "QL001";
        }
        int max = Integer.parseInt(nvqlList.getFirst().getId().substring(2));
        for (NhanVienQuanLy nv : nvqlList){
            int id = Integer.parseInt(nv.getId().substring(2));
            if(max < id){
                max =id;
            }
        }
        return String.format("QL%03d",max+1);
    }
    public static String getIdSanXuat(){
        if(nvsxList.isEmpty()){
            return "SX001";
        }
        int max = Integer.parseInt(nvsxList.getFirst().getId().substring(2));
        for(NhanVienSanXuat nv : nvsxList){
            int id = Integer.parseInt(nv.getId().substring(2));
            if(max < id){
                max =id;
            }
        }
        return String.format("SX%03d", max+1);
    }
    public  static void themMoiNhanVien(Scanner sc){
        int choose;
        while (true){
            do{
                System.out.println("===============nhap lua chon=============");
                System.out.println("1. nhan vien quan ly");
                System.out.println("2. nhan vien san xuat");
                System.out.println("3. thoat");
                System.out.println("nhap lua chon cua ban: ");
                choose =sc.nextInt();
            }
            while (choose < 1 || choose >3);
            switch (choose){
                case 1:
                    int soLuongNhanVienQuanLy;
                    do{
                        System.out.println("nhap so luong nhan vien quan ly: ");
                        soLuongNhanVienQuanLy = sc.nextInt();
                        if(soLuongNhanVienQuanLy < 1){
                            System.out.println("nhap lai, so luong nhan vien khong the be hon 1.");
                        }
                    }
                    while (soLuongNhanVienQuanLy <1);

                    for (int i = 1; i<= soLuongNhanVienQuanLy; i++){
                        NhanVienQuanLy nvql1 = new NhanVienQuanLy();
                        String newId = getIDQuanLy();
                        nvql1.setId(newId);
                        sc.nextLine();

                        nvql1.input(sc);
                        nvqlList.add(nvql1);
                    }
                    System.out.println("them nhan vien quan ly thanh cong");
                    return;

                case 2:
                    int soLuongNhanVienSanXuat;
                    do{
                        System.out.println("nhap so luong nhan vien san xuat");
                        soLuongNhanVienSanXuat = sc .nextInt();
                        if(soLuongNhanVienSanXuat <1 ){
                            System.out.println("nhap lai,so luong nhan vien lon hon 0");
                        }

                    }
                    while (soLuongNhanVienSanXuat < 1);
                    for (int i = 1; i <= soLuongNhanVienSanXuat; i++){
                        NhanVienSanXuat nvsx1 = new NhanVienSanXuat();
                        String newID = getIdSanXuat();
                        nvsx1.setId(newID);

                        sc.nextLine();
                        nvsx1.input(sc);
                        nvsxList.add(nvsx1);
                    }
                    System.out.println("them nhan vien san xuat thanh cong. ");
                    return;
                case 3:
                    return;

            }
        }



    }
    public static void  capNhapThongTinNhanVien(){

    }
    public static void xemThongTinNhanVienQuanLy(ArrayList<NhanVienQuanLy> nvqlList){
        int cuont =0;
        for (int i = 0 ; i <= nvqlList.size(); i++){

        }
    }
    public static void xemDanhSach(Scanner sc){
        int choose;
        while (true){
            System.out.println("1. xem thong tin nhan vien quan ly");
            System.out.println("2. xem thong tin nhan vien san xuat");
            System.out.println("3. thoat.");

            System.out.println("nhap lua chon cua ban: ");
            choose = sc.nextInt();
            switch (choose){
                case 1:

            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVienSanXuat nvsx = new NhanVienSanXuat("SX001","nguyen thanh nhan","2004","Da Nang",1000);
        nvsx.output();
        System.out.println("---------------------------");
        NhanVienQuanLy nvql = new NhanVienQuanLy("QL001","nguyen thanh ","2005","hai phong",10000.0,5.3);
        nvql.output();

        int choose;
        while (true){
            do{
                System.out.println("\n===================Man hinh chinh====================");
                System.out.println("1: them moi");
                System.out.println("2: cap nhat thong tin");
                System.out.println("3: xem danh sach");
                System.out.println("4: thoat.");

                System.out.println("nhap lua chon cua ban: ");
                choose = sc.nextInt();
            }
            while (choose <1 || choose >4);
            switch (choose){
                case 1:
                    themMoiNhanVien(sc);
                    return;
                case 2:
                    capNhapThongTinNhanVien();


            }
        }

    }
}
