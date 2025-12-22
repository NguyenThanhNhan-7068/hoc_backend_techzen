package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_4;

public class OldPhone extends Phone {
    private int batteryHealth;
    private String description;
    private static int oldPhoneCounter = 0;

    public OldPhone() {
        super();
        oldPhoneCounter++;
        this.id = String.format("DTC%03d", oldPhoneCounter);
    }

    public OldPhone(String name, double price, int warrantyPeriod, String manufacturer,
                    int batteryHealth, String description) {
        super("", name, price, warrantyPeriod, manufacturer);
        oldPhoneCounter++;
        this.id = String.format("DTC%03d", oldPhoneCounter);
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
    public void display() {
        super.display();
        System.out.printf(" | Pin: %d%% | Mo ta: %s\n", batteryHealth, description);
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
