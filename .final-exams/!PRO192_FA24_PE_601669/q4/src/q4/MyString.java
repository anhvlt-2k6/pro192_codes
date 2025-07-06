package q4;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        int countWords = 0;
        
        String[] substr = str.split(" ");
        
        for (String s : substr) {
            StringBuilder res = new StringBuilder();
            res.append(s).reverse();
            if (s.equals(res)) {
                countWords += 1;
            }
        }
        
        return countWords;
    }

    @Override
    public String f2(String str) {
        String[] substr = str.split(" ");
        String vowelStr = "";
        
        for (String s: substr) {
            StringBuilder res = new StringBuilder();
            res.append(s).reverse();
            if (s.equals(res) && vowelStr.length() < s.length()) {
                vowelStr = s;
            }
        }
        
        return vowelStr;
    }
    
}
