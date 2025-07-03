package q4;

public class MyUtilities implements IUtilities {

    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        int limit = (int)Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
    
    @Override
    public int getPrime(int n) {
        if (n <= 0) {
            return 0;           // or throw IllegalArgumentException
        }

        int count = 0;          // how many primes we’ve found
        int candidate = 2;      // numbers to test

        while (true) {
            if (isPrime(candidate)) {
                count++;
                if (count == n) {
                    return candidate;
                }
            }
            candidate++;
        }
    }

    @Override
    public char getCharacterByIndex(String strInput, int index) {
        char returnChar = '@';
        
        if (index < strInput.length() - 1) {
            char[] charArr = strInput.toUpperCase().toCharArray();
            return charArr[index];
        }
        
        return returnChar;
    }
}
