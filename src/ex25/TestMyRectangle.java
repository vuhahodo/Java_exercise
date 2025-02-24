package ex25;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(1, 5, 6, 2);
        MyRectangle r2 = new MyRectangle(new MyPoint(0, 3), new MyPoint(4, 0));

        // Kiểm tra thông tin hình chữ nhật
        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 1 - Width: " + r1.getWidth());
        System.out.println("Rectangle 1 - Height: " + r1.getHeight());
        System.out.println("Rectangle 1 - Area: " + r1.getArea());
        System.out.println("Rectangle 1 - Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2: " + r2);
        System.out.println("Rectangle 2 - Width: " + r2.getWidth());
        System.out.println("Rectangle 2 - Height: " + r2.getHeight());
        System.out.println("Rectangle 2 - Area: " + r2.getArea());
        System.out.println("Rectangle 2 - Perimeter: " + r2.getPerimeter());
    }
}

