package additionaltasks.shopoop;

import java.util.ArrayList;

public class Invoice {
    private Customer customer;
    private ArrayList<InvoiceItem> invoiceItems;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.invoiceItems = new ArrayList<>();
    }

    public void addInvoiceItem (InvoiceItem invoiceItem) {
        invoiceItems.add(invoiceItem);
    }

    public int totalPrice () {
        int totalPrice = 0;
        for (InvoiceItem item : invoiceItems) {
            totalPrice += item.totalPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String str = "Invoice for " + customer.getName() + ":\n";
        for (InvoiceItem item : invoiceItems) {
            str += "- " + item.toString() + "\n";
        }
        str += "Total Price: " + totalPrice();
        return str;
    }
}
