package additionaltasks.shopoop;

public class DiscountedProduct extends Product {
    private int amountDiscount;

    public DiscountedProduct(int price, String name, int amountDiscount) {
        super(price, name);
        this.amountDiscount = amountDiscount;
    }

    @Override
    public int getPrice() {
        return super.getPrice() - amountDiscount;
    }
}
