package ex25;

public class MyPoint {
    private int x;
    private int y;

    // Constructor mặc định (tọa độ 0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor với giá trị cụ thể
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public int getX() {
        return x;
    }

    // Setter cho x
    public void setX(int x) {
        this.x = x;
    }

    // Getter cho y
    public int getY() {
        return y;
    }

    // Setter cho y
    public void setY(int y) {
        this.y = y;
    }

    // Đặt lại cả x và y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Lấy giá trị (x, y) dưới dạng mảng
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Tính khoảng cách đến một điểm khác (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Tính khoảng cách đến một điểm khác (đối tượng MyPoint)
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Tính khoảng cách đến gốc tọa độ (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}

