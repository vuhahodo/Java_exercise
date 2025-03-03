package ex25;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor với tọa độ
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor với MyPoint
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // toString()
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    // Tính chiều rộng
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Tính chiều cao
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Tính diện tích
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Tính chu vi
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}

