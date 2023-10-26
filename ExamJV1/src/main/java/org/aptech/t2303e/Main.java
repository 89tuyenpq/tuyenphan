package org.aptech.t2303e;
public class Main {
    public static void main(String[] args) {
        Product tomato = new Product(1, "Tomato", "Food", 1.5, 589);
        Product zaraShirt = new Product(2, "Zara shirt", "Appearance", 12.0, 90);
        Product kitchenTable = new Product(3, "Kitchen table", "Household", 299.0, 13);
        Product iPhone = new Product(4, "iPhone", "Electronic", 1000.0, 4);
        Product football = new Product(5, "Football", "Sport", 19.9, 2);
        Order order1 = new Order("Mike Tyson", "2023-08-08 11:30:00");
        order1.addProduct(tomato, 5);
        order1.addProduct(iPhone, 2);
        order1.addProduct(football, 4);
        System.out.println("Order 1:");
        System.out.println(order1);
        DeliveryOrder deliveryOrder = new DeliveryOrder("Chris Evans", "2023-08-09 13:14:00");
        deliveryOrder.setAddress("89 dịch vọng");
        deliveryOrder.addProduct(zaraShirt, 3);
        deliveryOrder.addProduct(iPhone, 3);
        System.out.println("Delivery Order:");
        System.out.println(deliveryOrder);
    }
}