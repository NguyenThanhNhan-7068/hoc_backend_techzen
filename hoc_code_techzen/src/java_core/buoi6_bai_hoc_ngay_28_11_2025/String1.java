package java_core.buoi6_bai_hoc_ngay_28_11_2025;

import java.lang.String;

public class String1 {
    public static void main(String[] args){
        String s = "  Hel_lo  ";
        //equals()/equalsIgnoreCase(): kiem tra 2 chuoi giong nhau
        System.out.println("kiem tra 2 chuoi giong nhau ca chu hoa, thuong: "+ s.equals("hello"));
        System.out.println("kiem tra 2 chuoi giong nhau khong phan biet hoa, thuong: "+ s.equalsIgnoreCase("hello"));

        //length(): kiem tra chieu dai chuoi
        System.out.println("chieu dai chuoi: " + s.length());

        //concat():noi hai chuoi
        System.out.println("cong chuoi bang  dau +: " + s + " World");
        System.out.println("cong chuoi bang concat(): "+ s.concat(" World"));

        // charArt(int index): tra ve ky tu tai vi tri index trong chuoi
        System.out.println("tra ve ky tu tai vi tri index trong chuoi: "+ s.charAt(4));

        // replace() / replaceAll(): thay the
        System.out.println("replace: "+ s.replace("l","d"));

        // substring(): trich suat chuoi con
        System.out.println("trich xuat tu beginIndex den truoc end index: "+ s.substring(0,2));// lay tu 0 ->1
        System.out.println("trich xuat tu beginIndex den het chuoi: " + s.substring(2));

        // toLowerCase() / toUpperCase(): in thuong, in hoa
        System.out.println("in thuong: "+ s.toLowerCase());
        System.out.println("in hoa: "+ s.toUpperCase());

        // trim():bo khoang trang dau va cuoi chuoi. giua khong bo.
        System.out.println("bo khoang trang: "+ s.trim());

        //split(String regex): cat chuoi thanh mang con
        String str = "Hanh,Hoai,Hoa";
        String[] name = str.split(",");// dau "," la dieu kien cat chuoi
        for(int i =0 ; i < name.length;i++) System.out.println("split: "+ (i+1)+": "+name[i]);

        // string.format()
        int a = 2;
        int b = 3;
        String s1 = a +" + "+ b + " = " + (a+b);
        String s2 = String.format("%d + %d = %d", a,b,(a+b));
        System.out.println(s2);
    }
}
