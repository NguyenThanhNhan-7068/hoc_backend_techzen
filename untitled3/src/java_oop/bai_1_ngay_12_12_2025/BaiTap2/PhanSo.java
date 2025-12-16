package java_oop.bai_1_ngay_12_12_2025.BaiTap2;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tu so: ");
        tuSo = sc.nextInt();
        do {
            System.out.print("nhap mau so # 0: ");
            mauSo = sc.nextInt();
            if(mauSo == 0) System.out.println("mau phai khac 0, nhaap lai: ");
        }
        while (mauSo == 0);
    }

    private int uocChungLonNhat(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b !=0) {
            int du = a % b;
            a = b;
            b = du;
        }
        return a;
    }
    private void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    public void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" +mauSo);
        }
    }

    public PhanSo cong(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public PhanSo tru(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public PhanSo nhan(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.tuSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public PhanSo chia(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo;
        kq.mauSo = this.mauSo * ps.tuSo;
        return kq;
    }
    public void kiemTraGiaTri() {
        if (tuSo == 0) {
            System.out.println("phan so bang 0");
        } else if (tuSo * mauSo > 0) {
            System.out.println("phan so duong");
        } else {
            System.out.println("phan so am");
        }
    }
}
