package buoi6_bai_hoc_ngay_28_11_2025;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        String s1 ="";
        // string la imutable.
        // chay duoc nhung moi buoc se tao 1 doi tuong moi
        // => co the gay loi tran bo nho neu de vong for

        for(int i = 0; i <= 10; i++) s1 += i;
        // canh bao mau vang cho dau + la bao dang cong chuoi trong vong lap voi khai bao string. co kha nang tran bo nho
        System.out.println(s1);

        System.out.println("=========================");

        //de xu le van de do ta dung stringbuffer/StringBuider
        StringBuffer sb = new StringBuffer(); // gia tri cua no la mot dia chi duy nhat khong doi
        StringBuilder sb1 = new StringBuilder();
        sb1.append("di lam");

        for(int i = 0; i <= 10; i++) sb.append(i).append(" ");//.append(" ") them khoang trang giua moi lan in
        System.out.println(sb);

        // dao nguoc chuoi. chi stringbuffer/StringBuider moi co. tring thuong khong co
        sb.reverse();
        sb1.reverse();
        System.out.println("chuoi dao: " + sb);
        System.out.println("chuoi dao: " + sb1);


        // bai tap dao nguoi chuoi
        //1: string(khong co phuong thuc reverse)
        //2: chuyen string -> stringbuffer/StringBuider roi dung lenh reverse

        String name = "Nguyen Thanh Nhan";
        // chuyen String => StringBuilder
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.reverse();
        System.out.println("chuoi dao: "+sb2);

    }
}
