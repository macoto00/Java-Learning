package additionaltasks.shopoop;

public class Main {
    public static void main(String[] args) {

        Product milk = new Product(30, "Milk");
        Product bread = new Product(15, "Bread");
        Product tea = new Product(60, "Tea");
        DiscountedProduct milk2 = new DiscountedProduct(30, "Milk2", 5);

        Customer tomas = new Customer("Tomáš");

        InvoiceItem first = new InvoiceItem(milk, 5);
        InvoiceItem second = new InvoiceItem(milk2, 2);
        InvoiceItem third = new InvoiceItem(bread, 1);
        InvoiceItem fourth = new InvoiceItem(tea, 1);

        Invoice tomasInvoice = new Invoice(tomas);
        tomasInvoice.addInvoiceItem(first);
        tomasInvoice.addInvoiceItem(second);
        tomasInvoice.addInvoiceItem(third);
        tomasInvoice.addInvoiceItem(fourth);

        System.out.println(tomasInvoice);
        System.out.println();
        System.out.println(first);
    }
}
