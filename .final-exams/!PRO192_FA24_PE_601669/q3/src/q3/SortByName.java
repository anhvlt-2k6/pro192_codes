package q3;

import java.util.Comparator;

public class SortByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Furniture a = (Furniture) o1;
        Furniture b = (Furniture) o2;
        
        if (a.price < b.price) {
            return -1;
        }
        
        if (a.price > b.price) {
            return 1;
        } 
        
        return 0;
    }
    
}
