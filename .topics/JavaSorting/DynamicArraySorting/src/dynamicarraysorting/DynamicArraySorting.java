package dynamicarraysorting;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DynamicArraySorting {
    
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
       ArrayList<Integer> arr_int = new ArrayList<>();
       
       for (String arg : args) {
           if (!(arg.startsWith("#") || arg.length() == 0)) {
               arr_int.add(Integer.parseInt(arg));
           }
       }
       
       
       Collections.sort(arr_int);
       
       for (int i : arr_int) {
           result += i + "\n";
       }
    }
    
    public static void main(String[] args) {
        DynamicArraySorting o = new DynamicArraySorting();
        o.readInput();
        o.solve();
        o.writeOutput();
    }
}
