package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyFurniture implements IFurniture {

    @Override
    public int f1(List<Furniture> t) {
        int sumPrice = 0;
        
        for (Furniture w : t) {
            if (w.getName().toCharArray()[w.getName().length() - 1] != 'n') {
                sumPrice += w.getPrice();
            }
        }
        
        return sumPrice;
    }

    @Override
    public void f2(List<Furniture> t) {
        Comparator cmp = new Furniture();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Furniture> ls_match = new ArrayList<>();
        
        // Divide into two groups, one match and another is not
        for (Furniture w: t) {
            if (Character.isDigit(w.getName().toCharArray()[0])) {
                ls_match.add(w);
                index.add(t.indexOf(w));
            }
        }
        
        // Sort the ls_match
        Collections.sort(ls_match, cmp);
        
        // Replace the items of the t
        for (Integer i : index) {
            t.set(i, ls_match.get(0));
            ls_match.remove(0);
        }
    }

    @Override
    public void f3(List<Furniture> t) {
        
        int totalPrice = 0;
        
        for (Furniture w : t) {
            totalPrice += w.getPrice();
        }
        
        int averagePrice = totalPrice / t.size(); 
        
        t.removeIf(y -> 
            y.getPrice() > averagePrice && Character.isDigit(y.getName().charAt(0))
        );
    }
}
