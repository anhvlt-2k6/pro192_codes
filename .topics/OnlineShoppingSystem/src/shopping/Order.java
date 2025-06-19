package shopping;

import models.Product;

public class Order extends Product {
    private Customer customer;
    
    public Order(String name, double price, int quantity, Customer customer) {
        super(name, price, quantity);
        this.customer = customer;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName() + " (Email :" + customer.getEmail() + ")" );
        System.out.println("Product Order: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}
