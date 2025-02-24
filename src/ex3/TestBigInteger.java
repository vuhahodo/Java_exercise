package ex3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Khởi tạo hai số BigInteger từ chuỗi số lớn
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222222222222222");

        // Cộng hai số
        BigInteger sum = i1.add(i2);
        System.out.println("Sum: " + sum);

        // Nhân hai số
        BigInteger product = i1.multiply(i2);
        System.out.println("Product: " + product);
    }
}
