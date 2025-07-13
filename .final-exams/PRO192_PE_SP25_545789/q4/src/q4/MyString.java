package q4;

import java.util.ArrayList;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int thatNum = 1;
        char[] subArr = str.toCharArray();
        ArrayList<Integer> intMap = new ArrayList<>();
        
        for (char c : subArr) {
            if (Character.isDigit(c)) {
                int thatDig = Integer.parseInt(String.format("c", c));
                intMap.set(thatDig, intMap.get(thatDig) + 1);
            }
        }
        
        int maxNum = Integer.MIN_VALUE;
        
        for (Integer i : intMap) {
            if (i >= maxNum) {
                thatNum = intMap.indexOf(i);
            }
        }
        
        return thatNum;
    }
    
    // skipped
    @Override
    public String f2(String str) {
        return "";
    }
    
}
