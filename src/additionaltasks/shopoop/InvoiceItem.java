package additionaltasks.shopoop;

public class InvoiceItem {
    private Product product;
    private int amount;
    private int unitPrice;

    public InvoiceItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = product.getPrice();
    }

    public int totalPrice() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return product.getName() + " x " + amount + " = " + totalPrice();
    }
}
