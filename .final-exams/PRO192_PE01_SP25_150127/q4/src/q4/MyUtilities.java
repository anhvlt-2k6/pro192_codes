package q4;

public class MyUtilities implements IUtilities {

    @Override
    public int getLengthOfLongestWord(String sentence) {
        return sentence.length();
    }

    @Override
    public double calculateAverageValue(String str) {
        double averageValue = 0;
        double globalSum = 0;
        int matchedInt = 0;
        
        char[] digits = str.toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            if (Character.isDigit(digits[i])) {
                int goodInt = digits[i] - '0' + 1;
                if (goodInt % 2 == 0) {
                    globalSum += goodInt;
                    matchedInt += 1;
                }
            }
        }
        
        averageValue = globalSum / matchedInt;
        
        return averageValue;
    }
    
}
