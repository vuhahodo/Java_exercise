package ex8;

public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    // Constructor
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1; // Stack ban đầu rỗng
    }

    // Push method - Modified
    public boolean push(int element) {
        if (isFull()) {
            resize(); // Tăng kích thước mảng nếu đầy
        }
        contents[++tos] = element;
        return true;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return tos < 0;
    }

    // Check if stack is full
    public boolean isFull() {
        return tos == contents.length - 1;
    }

    // Resize method: Increase array size by 50%
    private void resize() {
        int newSize = contents.length * 3 / 2 + 1; // Tăng kích thước lên 1.5 lần
        int[] newContents = new int[newSize];
        System.arraycopy(contents, 0, newContents, 0, contents.length);
        contents = newContents;
        System.out.println("Stack resized to: " + newSize);
    }
}

