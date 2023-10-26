package org.aptech.t2303e;
import java.util.ArrayList;

public class Order {
    private String customerName;
    private String transactionTime;
    private ArrayList<LineItem> lineItems;

    public Order(String customerName, String transactionTime) {
        this.customerName = customerName;
        this.transactionTime = transactionTime;
        this.lineItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public boolean addProduct(Product product, int quantity) {
        if (quantity > 0) {
            LineItem lineItem = new LineItem(product, quantity);
            this.lineItems.add(lineItem);
            return true;
        }
        return false;
    }

    public double cost() {
        double totalCost = 0;
        for (LineItem item : lineItems) {
            totalCost += item.cost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Customer: ").append(customerName).append("\n");
        info.append("Transaction Time: ").append(transactionTime).append("\n");
        info.append("Line Items:\n");
        for (LineItem item : lineItems) {
            info.append("- ").append(item.toString()).append("\n");
        }
        info.append("Total Cost: ").append(cost()).append("\n");
        return info.toString();
    }
}