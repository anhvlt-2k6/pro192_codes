package q4;

public class MyUtilities implements IUtilities {

    @Override
    public int countSpecial(String str) {
        int countSpec = 0;
        char[] strArr = str.toCharArray();
        
        for (char c : strArr) {
            if (!(Character.isAlphabetic(c) || Character.isDigit(c))) {
                countSpec += 1;
            }
        }
        
        return countSpec;
    }

    @Override
    public int sumNumberDivisible3(String str) {
        int sumNum = 0;
        char[] strArr = str.toCharArray();
        
        for (char c : strArr) {
            if (Character.isDigit(c)) {
                int a = Integer.parseInt(String.format("%c", c));
                if (a % 3 == 0) {
                    sumNum += a;
                }
            }
        }
        
        return sumNum;
    }
    
}
