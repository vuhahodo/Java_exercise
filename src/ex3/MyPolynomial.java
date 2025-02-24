package ex3;

public class MyPolynomial {
    private double[] coeffs; // Mảng chứa các hệ số của đa thức

    // Constructor với số lượng hệ số không cố định (varargs)
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Trả về bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Tính giá trị của đa thức khi thay x vào
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Cộng hai đa thức
    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double c1 = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double c2 = (i <= another.getDegree()) ? another.coeffs[i] : 0;
            newCoeffs[i] = c1 + c2;
        }

        return new MyPolynomial(newCoeffs);
    }

    // Nhân hai đa thức
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }

    // Chuyển đa thức thành chuỗi dạng "c_n * x^n + ... + c_1 * x + c_0"
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}

