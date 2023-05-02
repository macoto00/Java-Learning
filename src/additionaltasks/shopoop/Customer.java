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

    public int totalSpend() {
        int totalSpend = 0;
        for (Invoice invoice : invoices) {
            totalSpend += invoice.totalPrice();
        }
        return totalSpend;
    }

    public static List<Customer> topCustomers(List<Customer> customers, int numCustomers) {
        customers.sort(Comparator.comparingInt(Customer::totalSpend).reversed());
        return customers.subList(0, Math.min(numCustomers, customers.size()));
    }
}
