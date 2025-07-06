package q3;

import java.util.ArrayList;

public class SDrinkList extends ArrayList<SDrink> {
    
    public void addSDrink(SDrink sdrink) {
        this.add(sdrink);
    }
    
    public int getSDrinkByMake(String value) {
        int count = 0;
        
        for (SDrink w : this) {
            if (w.getMake().toLowerCase().equals(value.toLowerCase())) {
                count += 1;
            }
        }
        
        return count;
    }
    
    public SDrink SDrinkWithMinPrice() {
        SDrink thisValue = new SDrink();
        
        thisValue.setPrice(this.get(0).getPrice());
        
        for (SDrink w : this) {
            if (thisValue.getPrice() >= w.getPrice()) {
                thisValue = w;
            }
        }
        
        return thisValue;
    }   
}
