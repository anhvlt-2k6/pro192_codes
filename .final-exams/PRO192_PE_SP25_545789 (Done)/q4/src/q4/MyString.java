package q4;

import java.util.ArrayList;
import java.util.Arrays;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int thatDig = -1, max = Integer.MIN_VALUE;
        if (str.isEmpty() || str == null) {
            return 1;
        }
        
        int[] map = {0,0,0,0,0,0,0,0,0,0,0};
        char[] arr = str.toCharArray();
        
        
        for (char c : arr) {
            if (Character.isDigit(c)) {
                map[Integer.parseInt(String.format("%c", c))] += 1;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (map[i] >= max) {
                max = map[i];
                thatDig = i;
            }
        }
        
        return (thatDig > -1) ? thatDig : 1;
    }
    
    // skipped
    @Override
    public String f2(String str) {
        return "";
    }
    
}
