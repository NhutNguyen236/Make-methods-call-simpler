package classes;

public class ReplaceParameter {
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // =============== Calling method and passing it result as the parameter to
    // another methods =============================

    public void getPrice() {
        int basePrice = quantity * 100;
        double feesVAT = 0.1;
        int discountLevel;
        if (quantity >= 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }

        // ===================== ============================== =======
        double finalPrice = discountedPrice(basePrice, discountLevel, feesVAT);
        // ===================== ============================== =======

        System.out.println("Price after discounted: " + Math.round(basePrice - finalPrice));

        System.out
                .println("Discount Price: " + Math.round(finalPrice) + " - " + "Percent discount: "
                        + (discountLevel * 10) + '%');
    }

    public double discountedPrice(int basePrice, int discountLevel, double feesVAT) {
        System.out.println("Price: " + basePrice);
        basePrice = (int) (basePrice + (basePrice * 0.1));
        System.out.println("Price after Fees: " + basePrice + " - " + "VAT fee: " + "10%");
        if (discountLevel == 2) {
            return basePrice * 0.2; // 20%
        } else {
            return basePrice * 0.1; // 10%
        }
    }

    // ===================================================================================================

    // =============== Applying Replace Parameter with Method Call
    // ==========================================================
    public double getPriceReplaceParameter() {
        return getPriceDiscounted();
    }

    // Get the final price after VAT fee and discount
    public double getPriceDiscounted() {
        int basePrice = quantity * 100;

        // ======================================================
        double finalPrice = getFinalPrice(basePrice);
        // ======================================================

        return finalPrice;
    }

    // Get the discount level base on the quantity
    private int getDiscountedLevel() {
        if (quantity >= 100) {
            return 2;
        } else {
            return 1;
        }
    }

    // Calculate final price with discount level
    private double getFinalPrice(int basePrice) {
        if (getDiscountedLevel() == 2) {
            return basePrice - (basePrice + (basePrice * 0.1)) * 0.2;
        } else {
            return basePrice - (basePrice + (basePrice * 0.1)) * 0.1;
        }
    }
}
