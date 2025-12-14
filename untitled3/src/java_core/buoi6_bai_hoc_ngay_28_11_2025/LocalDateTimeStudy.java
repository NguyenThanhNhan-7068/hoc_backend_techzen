package java_core.buoi6_bai_hoc_ngay_28_11_2025;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeStudy {
    public static void main(String[] args) {
        // bien LocalDate LocalTime LocalDateTime co the dung de tinh toan
        LocalDate localDate = LocalDate.now();// tao doi tuong localDate
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);

        /// cac phuong thuc cua localDate,localTime,localDateTime
        LocalDate currentDate = LocalDate.now();

        //pluss year
        LocalDate localDate1 = currentDate.plusMonths(-10);
        System.out.println(localDate1);

        //withYear: thay doi nam giu nguyen cac gia tri khac
        LocalDate localDate2=currentDate.withYear(2030);
        System.out.println("thay doi nam: "+localDate2);

        //get: lay ngay thang nam
        System.out.println("nam nay la nam: "+localDate2.getYear());
        System.out.println("hom nay la ngay: "+ localDate2.getDayOfMonth());
        System.out.println(" hom nay la thang: "+ localDate2.getMonth());

        //isAfter/isBefore: kiem tra ngay 1 sau ngay 2 va nguoc lai
        System.out.println(localDate2.isBefore(localDate1));
        System.out.println(localDate2.isAfter(localDate1));

        ///format ngay thang nam
        //chuyen string -> local
        String strDate = "14/02/2030";// nguoi dung nhap
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate3 = LocalDate.parse(strDate,dateTimeFormatter);
        System.out.println("ngay theo dinh dang moi: "+ localDate3);// output: 2023/02/14

        // chuyen local -> tring
        System.out.println("in ra cong them 1 thang voi format ban dau: " + localDate3.plusYears(1).format(dateTimeFormatter));



    }
}
