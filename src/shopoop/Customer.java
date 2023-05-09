package additionaltasks.shopoop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {
    private String name;
    private List<Invoice> invoices;

    public Customer(String name) {
        this.name = name;
        this.invoices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public int totalSpent() {
        int totalSpent = 0;
        for (Invoice invoice : invoices) {
            totalSpent += invoice.totalPrice();
        }
        return totalSpent;
    }

    public static List<Customer> topCustomers (List<Customer> customers, int numberOfTopCustomer) {
        customers.sort(Comparator.comparingInt(Customer::totalSpent).reversed());
        return customers.subList(0, Math.min(numberOfTopCustomer, customers.size()));
    }
}
