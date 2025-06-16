package javafoundation;

import java.util.Scanner;

public class JavaFoundation {

    public static void main(String[] args) {
    
    }
    
    public static void variables() {
        // There are some types
        boolean active = true; // 8-bit
        
        int sample_int = 1; // 32-bit
        double price = 19.99; // 64-bit
        float price_sample = (float) 19.99; // 32-bit
        
        char a_char = 'A'; // 16-bit in Unicode
        String b_char = "This is a string";
    }
    
    // it is all about +, -, *, /, %
    public static void operators() {
        
    }
    
    public static void logicInstruction() {
        boolean isifTrue = true;
        int switchCheck = 2;
        if (isifTrue) {
            // do here
        } else if (!isifTrue) {
        
        } else {
        
        }
        
        switch (switchCheck) {
            case 1:
                // do what
            case 0:
                // do else
            default:
                // do by default
        }
    }
    
    public static void loopInstruction() {
        int a = 10;
        
        while (a > 0) {
            // do here
            a += 1;
        }
        
        for (int i = 0; i < 10; i++) {
            // do whatever from 0 -> 9
        }
        
        do {
            // do those first
        } while (a > 10);
    }
    
    public static void InputandOutput() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        name = sc.nextLine();
        age = sc.nextInt();
    }
}
