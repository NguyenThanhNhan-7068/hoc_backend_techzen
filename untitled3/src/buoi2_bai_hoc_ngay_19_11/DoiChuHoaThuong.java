package buoi2_bai_hoc_ngay_19_11;

import java.util.Scanner;

public class DoiChuHoaThuong {
    public static void baiLam(){
        Scanner sc = new Scanner(System.in);
//        nhap ky tu tu phim
        System.out.println("nhap ky tu: ");
        char c = sc.next().charAt(0);
        if(c >='A' && c<='Z'||c>='a' && c<= 'z'){
            if(c<='Z'){
                c+=32;
            }
            else{
                c+=32;
            }
            System.out.println("ky tu sau khi doi: "+c);
        }
        else{
            System.out.println("ky tu ban nhap khong phai la chu");
        }

    }

    public static void main(String[] args) {
        baiLam();
    }
}
