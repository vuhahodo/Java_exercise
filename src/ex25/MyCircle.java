package ex25;

public class MyCircle {
    private MyPoint center;
    private int radius;

    // Constructor mặc định
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor với tọa độ
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor với MyPoint
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getter và Setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi hình tròn
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Tính khoảng cách giữa hai hình tròn
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

    // toString() 
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
}

