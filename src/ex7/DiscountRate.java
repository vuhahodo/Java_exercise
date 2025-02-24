package ex7;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscount = 0.1; // Tất cả thành viên đều nhận giảm giá 10% sản phẩm

    public static double getServiceDiscountRate(String type) {
        switch (type.toLowerCase()) {
            case "premium": return serviceDiscountPremium;
            case "gold": return serviceDiscountGold;
            case "silver": return serviceDiscountSilver;
            default: return 0.0;
        }
    }

    public static double getProductDiscountRate() {
        return productDiscount;
    }
}

