package java_oop.bai_8_ngay_29_12_2025.bai_hoc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
//    vao truoc ra truoc
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);
        integerQueue.add(50);

        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.size());

        while (!integerQueue.isEmpty()){
            System.out.println(integerQueue.poll());
        }
//        while (!integerQueue.isEmpty()){
//            System.out.println(integerQueue.size());
//        }
//        co tra ve null khi lay qua phan tu cuoi(khac stack)

    }
}
