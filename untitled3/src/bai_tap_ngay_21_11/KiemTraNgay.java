package bai_tap_ngay_21_11;
import java.util.Scanner;
public class KiemTraNgay {
    public static boolean namNhuan(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static int soNgayTrongThang(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return namNhuan(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        int maxDay = soNgayTrongThang(month, year);

        if (maxDay == -1 || day < 1 || day > maxDay) {
            System.out.println("Ngay thang nam KHONG hop le!");
            return;
        }
        System.out.println("Ngay thang nam hop le.");

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        nextDay++;
        if (nextDay > maxDay) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        int prevDay = day;
        int prevMonth = month;
        int prevYear = year;
        prevDay--;

        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }
            prevDay = soNgayTrongThang(prevMonth, prevYear);
        }
        System.out.println("Ngay ke tiep: " + nextDay + "/" + nextMonth + "/" + nextYear);
        System.out.println("Ngay truoc do: " + prevDay + "/" + prevMonth + "/" + prevYear);
    }

    public static void main(String[] args) {
        bai2();
    }
}
