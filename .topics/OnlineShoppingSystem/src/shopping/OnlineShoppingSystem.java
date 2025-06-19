package shopping;

public class OnlineShoppingSystem {

    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Alice", "alice@example.com");
        Order orderOfFirstCustomer = new Order("Laptop", 1200.01, 1, firstCustomer);
        
        orderOfFirstCustomer.displayOrderDetails();
    }
}
