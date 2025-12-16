package java_oop.bai_2_ngay_15_12_2025.bai_tap.bai_tap_1;

class PhanSo {
    int tuSo;
    int mauSo;

    PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    PhanSo(int tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }

    PhanSo(int tuSo, int mauSo) {
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        int ucln = timUCLN(Math.abs(tuSo), Math.abs(mauSo));
        this.tuSo = tuSo / ucln;
        this.mauSo = mauSo / ucln;
    }
    void xuat() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        }
        else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    PhanSo copy() {
        return new PhanSo(tuSo, mauSo);
    }

    void cong(int value) {
        tuSo += value * mauSo;
    }

    int timUCLN(int a, int b) {
        while (b != 0) {
            int du = a % b;
            a = b;
            b = du;
        }
        return a;
    }
}
