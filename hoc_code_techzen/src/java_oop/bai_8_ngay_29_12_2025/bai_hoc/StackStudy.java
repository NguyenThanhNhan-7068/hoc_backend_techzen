package java_oop.bai_8_ngay_29_12_2025.bai_hoc;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
//        vao truoc ra sau
        Stack<Integer> integerStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so thap phan: ");
        int n = Integer.parseInt(sc.nextLine());

        while (n != 0){
            integerStack.push(n % 2);
            n /= 2;
        }

        while (!integerStack.isEmpty()){
            System.out.println(integerStack.pop());
        }
    }



}
