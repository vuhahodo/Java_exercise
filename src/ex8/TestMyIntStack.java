package ex8;

public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(3); // Tạo stack với kích thước ban đầu là 3

        // Push elements
        System.out.println("Pushing 10: " + stack.push(10));
        System.out.println("Pushing 20: " + stack.push(20));
        System.out.println("Pushing 30: " + stack.push(30));

        // Stack đầy - kiểm tra resize
        System.out.println("Pushing 40 (should trigger resize): " + stack.push(40));

        // Peek top element
        System.out.println("Peek top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Kiểm tra stack rỗng
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pop hết phần tử còn lại
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Kiểm tra pop khi rỗng (sẽ gây Exception)
        try {
            System.out.println("Popped: " + stack.pop());
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

