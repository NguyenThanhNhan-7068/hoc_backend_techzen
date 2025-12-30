package java_oop.bai_8_ngay_29_12_2025.bai_tap;

public class Main {
    public static void main(String[] args) {
// ctrl + alt + L có thể tự format
        System.out.println("=== MyStack (LinkedList) ===");
        MyStack<Integer> stackLL = new MyStack<>();

        System.out.println("isEmpty: " + stackLL.isEmpty());
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(3);

        System.out.println("stack: " + stackLL);
        System.out.println("peek: " + stackLL.peek());
        System.out.println("pop: " + stackLL.pop());
        System.out.println("sau pop: " + stackLL);
        System.out.println("size: " + stackLL.Size());

        System.out.println("\n=== MyStackArray ===");
        MyStackArray stackArr = new MyStackArray();

        System.out.println("isEmpty: " + stackArr.isEmpty());
        stackArr.push(10);
        stackArr.push(20);
        stackArr.push(30);

        System.out.println("stack: " + stackArr);
        System.out.println("peek: " + stackArr.peek());
        System.out.println("pop: " + stackArr.pop());
        System.out.println("sau pop: " + stackArr);
        System.out.println("size: " + stackArr.size());


        System.out.println("\n=== MyQueue  ===");
        MyQueue<Integer> queueLL = new MyQueue<>();

        System.out.println("isEmpty: " + queueLL.isEmpty());
        queueLL.add(5);
        queueLL.add(6);
        queueLL.add(7);

        System.out.println("queue: " + queueLL);
        System.out.println("peek: " + queueLL.peek());
        System.out.println("poll: " + queueLL.poll());
        System.out.println("sau poll: " + queueLL);
        System.out.println("size: " + queueLL.getSize());

        System.out.println("\n=== MyQueueArray ===");
        MyQueueArray queueArr = new MyQueueArray();

        System.out.println("isEmpty: " + queueArr.isEmpty());
        queueArr.add(100);
        queueArr.add(200);
        queueArr.add(300);

        System.out.println("queue: " + queueArr);
        System.out.println("peek: " + queueArr.peek());
        System.out.println("poll: " + queueArr.poll());
        System.out.println("sau poll: " + queueArr);
        System.out.println("size: " + queueArr.size());
    }
}
