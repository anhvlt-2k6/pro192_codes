package q4;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int countWords = 0;
        
        String[] substr = str.trim().split(" ");
        
        int maxWords = Integer.MIN_VALUE;
        
        for (String s : substr) {
            if (maxWords <= s.length()) {
                maxWords = s.length();
            }
        }
        
        for (String s : substr) {
            
            String s_rev = "";
            
            for (int i = 0; i < s.length(); i++) {
                s_rev = s.charAt(i) + s_rev;
            }
            
            if (s.equals(s_rev) && s.length() == maxWords) {
                countWords += 1;
            }
        }
        
        return countWords;
    }

    @Override
    public String f2(String str) {
        String thatStr = "";
        
        String[] substr = str.trim().split(" ");
        
        int minWords = Integer.MAX_VALUE;
        
        for (String s : substr) {
            if (minWords >= s.length()) {
                minWords = s.length();
            }
        }
        
        for (String s : substr) {
            
            String s_rev = "";
            
            for (int i = 0; i < s.length(); i++) {
                s_rev = s.charAt(i) + s_rev;
            }
            
            if (s.equals(s_rev) && s.length() == minWords) {
                thatStr = s;
                break;
            }
        }
        
        return thatStr;
    }
    
}
