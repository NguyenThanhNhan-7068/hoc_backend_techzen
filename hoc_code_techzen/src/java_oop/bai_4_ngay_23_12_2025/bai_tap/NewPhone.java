package java_oop.bai_4_ngay_23_12_2025.bai_tap;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone() {}

    public NewPhone(String id, String name, double price, int warrantyPeriod,
                    String manufacturer, int quantity) {
        super(id, name, price, warrantyPeriod, manufacturer);
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
    public void output() {
        super.output();
        System.out.println("So luong: " + this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
