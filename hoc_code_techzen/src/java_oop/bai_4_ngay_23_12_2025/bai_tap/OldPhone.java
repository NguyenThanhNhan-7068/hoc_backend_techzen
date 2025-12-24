package java_oop.bai_4_ngay_23_12_2025.bai_tap;

public class OldPhone extends Phone {
    private int batteryHealth;
    private String description;
    private static int oldPhoneCounter = 0;

    public OldPhone() {}

    public OldPhone(String id, String name, double price, int warrantyPeriod,
                    String manufacturer, int batteryHealth, String description) {
        super(id, name, price, warrantyPeriod, manufacturer);
        this.batteryHealth = batteryHealth;
        this.description = description;
    }

    @Override
    public void input() {
        super.input();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Nhap tinh trang pin (%): ");
        this.batteryHealth = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap mo ta them: ");
        this.description = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin (%): " + this.batteryHealth);
        System.out.println("Mô tả thêm: " + this.description);
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
