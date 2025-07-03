package q3;

public class Order {
    protected String orderId;
    protected String customerName;
    protected double sale;
    
    public Order() {
        this.orderId = "";
        this.customerName = "";
        this.sale = 0;
    }
    
    public Order(String orderId, String customerName, double sale) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.sale = sale;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", this.orderId.toUpperCase(), this.customerName.toUpperCase(), this.sale);
    }
}
