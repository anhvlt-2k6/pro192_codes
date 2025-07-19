package q4;

public class MyUtilities implements IUtilities {

    @Override
    public int getLengthOfLongestWord(String sentence) {
        int maxLengh = Integer.MIN_VALUE;
        
        if (sentence.isEmpty()) {
            return 0;
        }
        
        String[] strArr = sentence.split(" ");
        
        for (String s : strArr) {
            if (s.length() >= maxLengh) {
                maxLengh = s.length();
            }
        }
        
        return (maxLengh > -1) ? maxLengh : 0;
    }

    @Override
    public double calculateAverageValue(String str) {
        int sum = 0, index = 0;
        if (str.isEmpty()) {
            return 0.0;
        }
        
        char[] arr = str.toCharArray();
        
        for (char c : arr) {
            if (Character.isDigit(c)) {
                int i = Integer.parseInt(String.format("%c", c));
                if (i % 2 == 0) {
                    sum += i;
                    index += 1;
                }
            }
        }
        
        return (index != 0) ? (sum / index) : 0.0;
    }
    
}
