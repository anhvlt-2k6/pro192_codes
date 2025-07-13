
package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyRadio implements IRadio {

    @Override
    public int f1(List<Radio> t) {
        int maxRate = Integer.MIN_VALUE;
        
        for (Radio rd : t) {
            if (rd.getRate() > maxRate) {
                for (char c : rd.getContent().toCharArray()) {
                    if (Character.isDigit(c)) {
                        maxRate = rd.getRate();
                    }
                }
            }
        }
        
        return maxRate;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void f2(List<Radio> t) {
        Comparator cmp = new Sort();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Radio> ls_match = new ArrayList<>();
        
        for (Radio w: t) {
            if (!Character.isDigit(w.getContent().toCharArray()[0])) {
                ls_match.add(w);
                index.add(t.indexOf(w));
            }
        }
        
        Collections.sort(ls_match, cmp);
        
        for (Integer i : index) {
            t.set(i, ls_match.get(0));
            ls_match.remove(0);
        }
    }

    @Override
    public void f3(List<Radio> t) {
        
        int min = Integer.MAX_VALUE;
        
        for (Radio rd : t) {
            if (rd.getRate() < min) {
                min = rd.getRate();
            }
        }
        
        for (Radio rd2 : t) {
            if (Character.isDigit(rd2.getContent().toCharArray()[0]) && rd2.getRate() <= min) {
                t.remove(rd2);
            }
        }
    }    
}
