package staticarraysorting;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StaticArraySorting {
    
    // Input and Output
    File inputFile;
    FileWriter outputFile;
    
    // Input as args and Output as result string
    ArrayList<String> args;
    String result = "";
    
    public void writeOutput() {
        try {
            outputFile = new FileWriter("output.txt");
            outputFile.write(result);
            outputFile.close();
        } catch (Exception e) {
            System.err.println("#ERROR: " + e.getCause());
        }
    }
    
    public void readInput() {
        try {
            inputFile = new File("input.txt");
            Scanner nl = new Scanner(inputFile);
            args = new ArrayList<>();
            while (nl.hasNextLine()) {
                args.add(nl.nextLine());
            }
        } catch (Exception e) {
            System.err.println("#ERROR: " + e.getCause());
        }
    }
    
    public void solve() {
        int lines = 0;
        
        // Count for valid lines
        for (String arg : args) {
            if (!(arg.startsWith("#") || arg.length() == 0)) {
                lines += 1;
            }
        }
        
        
        // Set into the array
        Integer[] arr = new Integer[lines];
        int index = 0;
        for (String arg : args) {
            try {
                if (!(arg.startsWith("#") || arg.length() == 0)) {
                    arr[index] = Integer.parseInt(arg);
                    index += 1;
                }
            } catch (Exception e) {
                
            }
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Print the output
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";
        }
    }
    
    public static void main(String[] args) {
        StaticArraySorting o = new StaticArraySorting();
        o.readInput();
        o.solve();
        o.writeOutput();
    }
}
