package java_oop.bai_3_ngay_17_12_2025.bai_tap.Bai_4;

public class NewPhone extends Phone {
    private int quantity;
    private static int newPhoneCounter = 0;

    public NewPhone() {
        super();
        newPhoneCounter++;
        this.id = String.format("DTM%03d", newPhoneCounter);
    }

    public NewPhone(String name, double price, int warrantyPeriod, String manufacturer, int quantity) {
        super("", name, price, warrantyPeriod, manufacturer);
        newPhoneCounter++;
        this.id = String.format("DTM%03d", newPhoneCounter);
        this.quantity = quantity;
    }

    @Override
    public void input() {
        super.input();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Nhap so luong: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | So luong: %d\n", quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
