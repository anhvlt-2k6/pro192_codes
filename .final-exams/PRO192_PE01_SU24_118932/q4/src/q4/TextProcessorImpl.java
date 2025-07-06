package q4;

public class TextProcessorImpl implements TextProcessor {

    @Override
    public String removeWhiteSpace(String input) {
        return input.replace(" ", "");
    }

    @Override
    public int countVowels(String input) {
        char[] inp = input.toLowerCase().toCharArray();
        int countVow = 0;
        
        for (char w: inp) {
            if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
                countVow += 1;
            }
        }
        
        return countVow;
    }
}
