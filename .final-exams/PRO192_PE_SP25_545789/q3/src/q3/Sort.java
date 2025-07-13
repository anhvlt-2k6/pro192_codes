/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Comparator;

/**
 *
 * @author ShiroiNeko
 */
public class Sort implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Radio a = (Radio) o1;
        Radio b = (Radio) o2;
        
        if (a.getRate() < b.getRate()) {
            return -1;
        }
        
        if (a.getRate() > b.getRate()) {
            return 1;
        } 
        
        return 0;
    }
    
}
