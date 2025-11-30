package buoi6_bai_tap_ngay_28_11_2025;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String chuoiNgay = "02/28/2025";
        DateTimeFormatter dinhDang1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ngay1 = LocalDate.parse(chuoiNgay, dinhDang1);
        System.out.println("a. LocalDate = " + ngay1);

        LocalDate ngayHienTai = LocalDate.now();
        DateTimeFormatter dinhDang2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("b.Hom nay = " + ngayHienTai.format(dinhDang2));

        LocalDateTime thoiGian = LocalDateTime.now();
//        System.out.println("c.Ngay = " + thoiGian.getDayOfMonth());
//        System.out.println("Tháng = " + thoiGian.getMonthValue());
//        System.out.println("Năm = " + thoiGian.getYear());
//        System.out.println("Gio = " + thoiGian.getHour());
//        System.out.println("Phut = " + thoiGian.getMinute());
//        System.out.println("Giay = " + thoiGian.getSecond());
        System.out.print("c. ngay: " + thoiGian.getDayOfMonth() + " Thang "+thoiGian.getMonthValue()+" nam "+thoiGian.getYear() + " luc ");
        System.out.println(thoiGian.getHour() +" gio "+ thoiGian.getMinute()+" phut "+thoiGian.getSecond()+ " giay");

        System.out.println("d.cach day 1000 ngay la ngay = " + ngayHienTai.minusDays(1000));

        System.out.print("Nhap ngay (dd/MM/yyyy): ");
        String chuoiNhap = nhap.nextLine();
        System.out.print("Nhap n: ");
        int n = nhap.nextInt();
        LocalDate ngayNhap = LocalDate.parse(chuoiNhap, dinhDang2);
        System.out.println("e. Sau n ngay la ngay = " + ngayNhap.plusDays(n));
    }

}
