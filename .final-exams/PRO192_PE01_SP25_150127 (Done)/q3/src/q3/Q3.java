/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    
    // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
    // --START FIXED PART--------------------------
    String fi, fo;

    /**
     * Set input and output file for automatic rating
     * 
     * @param args path of input file and path of output file
     */
    public void setFile(String[] args) {
        fi = args.length >= 2 ? args[0] : inputFile;
        fo = args.length >= 2 ? args[1] : outputFile;
    }

    /**
     * Reads data from input file
     */
    public void read() {
        try (Scanner sc = new Scanner(new File(fi))) {
            // --END FIXED PART----------------------------

            // INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            
            // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
            // --START FIXED PART--------------------------
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Input Exception # " + ex);
        }
    }
    // --END FIXED PART----------------------------

    // ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):

    // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
    // --START FIXED PART--------------------------
    /**
     * Main algorithm
     */
    public void solve() {
        // --END FIXED PART----------------------------

        // ALGORITHM - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
        Scanner userGet = new Scanner(System.in);
        WatchList wl = new WatchList();
        
        wl.add(new Watch(1, "Rolex", "Submariner", 7500.0));
        wl.add(new Watch(2, "Omega", "Speedmaster", 5000.0));
        wl.add(new Watch(3, "Seiko", "Prospex", 300.0));
        wl.add(new Watch(6, "Rolex", "Daytona", 13500.0));
        
        System.out.println("Add a new watch: ");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(userGet.nextLine());
        
        System.out.print("Enter brand: ");
        String brand = userGet.nextLine();
        
        System.out.print("Enter model: ");
        String model = userGet.nextLine();
        
        System.out.print("Enter price: ");
        double price = Double.parseDouble(userGet.nextLine());
        
        wl.add(new Watch(id, brand, model, price));
        
        System.out.print(
                "1. Test filterByBrand\n" +
                "2. Test findMostExpensive\n" +
                "Enter TC (1/2): "
        );
        
        int testCase = Integer.parseInt(userGet.nextLine());
        
        switch (testCase) {
            case 1:
                System.out.print("Enter brand: ");
                String findBrand = userGet.nextLine();
                WatchList wlFound = wl.filterByBrand(findBrand);
                
                if (wlFound.isEmpty() || wlFound == null) {
                    System.out.println("N/A");
                    break;
                }
                
                for (int i = 0; i < wlFound.size(); i++) {
                    System.out.println(wlFound.get(i).toString());
                }
                
                break;
            case 2:
                Watch wlExpensive = wl.findMostExpensive();
                System.out.println(wlExpensive.toString());
                break;
            default:
                break;
        }
        
        // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
        // --START FIXED PART--------------------------
    }

    /**
     * Write result into output file
     */
    public void printResult() {
        try {
            FileWriter fw = new FileWriter(fo);
            // --END FIXED PART----------------------------

            // OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:

            // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
            // --START FIXED PART--------------------------
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q3 q = new Q3();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
