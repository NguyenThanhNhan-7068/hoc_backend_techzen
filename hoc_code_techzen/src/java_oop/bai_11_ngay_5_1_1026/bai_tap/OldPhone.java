package java_oop.bai_11_ngay_5_1_1026.bai_tap;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.validation.PhoneValidation;

import java.util.Scanner;

public class OldPhone extends Phone implements Promotion {
    private int batteryHealth;
    private String description;

    public OldPhone() {}

    public OldPhone(String id, String name, double price, int warrantyPeriod,
                    String manufacturer, int batteryHealth, String description) {
        super(id, name, price, warrantyPeriod, manufacturer);
        this.batteryHealth = batteryHealth;
        this.description = description;
    }

    @Override
    public void input() throws Exception {
        super.input();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tinh trang pin (%): ");
        this.batteryHealth = Integer.parseInt(scanner.nextLine());
        PhoneValidation.checkBatteryHealth(this.batteryHealth);

        System.out.print("Nhap mo ta them: ");
        this.description = scanner.nextLine();
        PhoneValidation.checkDescription(this.description);
    }


    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin (%): " + this.batteryHealth);
        System.out.println("Mô tả thêm: " + this.description);
    }

    @Override
    public double sumPrice() {
//        double sum = 0;
//        for (Phone phone : phones){
//            if(phone.getId().startsWith("DTC")){
//                sum += (phone.getPrice() * batteryHealth / 100);
//            }
//        }
//        return sum;
        return this.getPrice() * this.batteryHealth/100;
    }
    public void promotion(double discountPercent){
        double oldPrice = this.getPrice();
        double discordPrice = oldPrice * (discountPercent/100);
        double newPrice = oldPrice - discordPrice;

        this.setPrice(newPrice);
    }

    public int getBatteryHealth() {
        return batteryHealth;
    }

    public void setBatteryHealth(int batteryHealth) {
        this.batteryHealth = batteryHealth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
