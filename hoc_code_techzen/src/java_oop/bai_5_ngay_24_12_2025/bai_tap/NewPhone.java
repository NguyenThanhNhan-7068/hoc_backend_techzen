package java_oop.bai_5_ngay_24_12_2025.bai_tap;

import static java_oop.bai_5_ngay_24_12_2025.bai_tap.Main.phones;

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

    @Override
    public double sumPrice() {
//        double sum =0;
//        for(Phone phone : phones){
//            if(phone.getId().startsWith("DTM")){
//                sum += (phone.getPrice() * quantity);
//            }
//        }
//        return sum;
        return this.getPrice() * this.quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
