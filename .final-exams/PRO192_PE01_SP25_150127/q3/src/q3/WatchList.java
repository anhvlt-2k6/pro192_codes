package q3;

import java.util.ArrayList;

public class WatchList extends ArrayList<Watch> {
    
    public void addWatch(Watch watch) {
        this.add(watch);
    }
    
    public WatchList filterByBrand(String value) {
        WatchList foundList = new WatchList();
        for (Watch w : this) {
            if (w.brand.toLowerCase().equals(value.toLowerCase())) {
                foundList.add(w);
            }
        }
        
        return foundList;
    }
    
    public Watch findMostExpensive() {
        
        if (this.isEmpty()) {
            return null;
        }
        
        Watch mostExpensive = this.get(0);
        
        for (Watch w : this) {
            if (w.price > mostExpensive.price) {
                mostExpensive = w;
            }
        }
        
        return mostExpensive;
    }
    
}
