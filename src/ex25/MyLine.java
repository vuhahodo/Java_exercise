package ex25;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor sử dụng tọa độ
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor sử dụng các đối tượng MyPoint
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter và Setter cho điểm bắt đầu
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Getter và Setter cho điểm kết thúc
    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài đoạn thẳng
    public double getLength() {
        return begin.distance(end);
    }

    // Tính góc nghiêng của đoạn thẳng (radians)
    public double getGradient() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return Math.atan2(dy, dx);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}

