package q3;

import java.util.ArrayList;
import java.util.List;

public class OrderList extends ArrayList<Order> {
    
    public void addOrder(Order order) {
        this.add(order);
    }
    
    public double getSaleByOrderId(String orderId) {
        double ret = 0;
        for (Order w : this) {
            if(w.getOrderId().toLowerCase().equals(orderId.toLowerCase())) {
                ret = w.getSale();
            }
        }
        return ret;
    }
    
    public List<Order> getOrdersBySale(double value) {
        List<Order> lsOrder = new ArrayList<>();
        
        for (Order y : this) {
            if (y.getSale() >= value) {
                lsOrder.add(y);
            }
        }
        
        return lsOrder;
    }
    
}
