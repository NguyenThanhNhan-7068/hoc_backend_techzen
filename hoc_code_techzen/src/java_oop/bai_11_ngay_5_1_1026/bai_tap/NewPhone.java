package java_oop.bai_11_ngay_5_1_1026.bai_tap;

import java_oop.bai_11_ngay_5_1_1026.bai_tap.validation.CommonValidation;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone() {}

    public NewPhone(String id, String name, double price, int warrantyPeriod,
                    String manufacturer, int quantity) {
        super(id, name, price, warrantyPeriod, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public void input() throws Exception {
        super.input();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        this.quantity = CommonValidation.parsePositiveInt(
                scanner.nextLine(), "So luong");
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
