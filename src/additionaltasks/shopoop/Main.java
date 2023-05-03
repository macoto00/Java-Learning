package additionaltasks.shopoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product milk = new Product(30, "Milk");
        Product bread = new Product(15, "Bread");
        Product tea = new Product(60, "Tea");
        Product meat = new Product(120, "Meat");
        Product chocolate = new Product(65, "Chocolate");
        DiscountedProduct milk2 = new DiscountedProduct(30, "Milk2", 5);

        InvoiceItem first = new InvoiceItem(milk, 5);
        InvoiceItem second = new InvoiceItem(milk2, 2);
        InvoiceItem third = new InvoiceItem(bread, 1);
        InvoiceItem fourth = new InvoiceItem(tea, 1);
        InvoiceItem fifth = new InvoiceItem(meat, 1);
        InvoiceItem sixth = new InvoiceItem(chocolate, 4);

        Customer tomas = new Customer("Tomáš");
        Invoice tomasInvoice = new Invoice(tomas);
        tomas.addInvoice(tomasInvoice);
        tomasInvoice.addInvoiceItem(first);
        tomasInvoice.addInvoiceItem(second);
        tomasInvoice.addInvoiceItem(third);
        tomasInvoice.addInvoiceItem(fourth);

        System.out.println(tomasInvoice);
        System.out.println();

        bread.setPrice(600);

        InvoiceItem seventh = new InvoiceItem(bread, 1);

        Customer eva = new Customer("Eva");
        Invoice evaInvoice = new Invoice(eva);
        eva.addInvoice(evaInvoice);
        evaInvoice.addInvoiceItem(seventh);
        evaInvoice.addInvoiceItem(fifth);
        evaInvoice.addInvoiceItem(sixth);

        System.out.println(evaInvoice);
        System.out.println();

        List<Customer> customers = new ArrayList<>();
        customers.add(tomas);
        customers.add(eva);

        List<Customer> topCustomers = Customer.topCustomers(customers, 5);

        for (Customer customer : topCustomers) {
            System.out.println(customer.getName() + " spent " + customer.totalSpent() + " in total.");
        }
    }
}
