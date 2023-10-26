package org.aptech.t2303e;
public class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder(String customerName, String transactionTime) {
        super(customerName, transactionTime);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "Delivery Address: " + address + "\n";
    }
}