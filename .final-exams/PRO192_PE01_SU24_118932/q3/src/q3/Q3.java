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
        
        System.out.println("The sdrinks have been added:");
        
        SDrinkList dl = new SDrinkList();
        
        dl.addSDrink(new SDrink("PS021", "PEPSI", 175.0));
        System.out.println(dl.get(0).toString());
        
        dl.addSDrink(new SDrink("MD033", "MIRINDA", 168.0));
        System.out.println(dl.get(1).toString());
        
        dl.addSDrink(new SDrink("SP005", "SCHWEPPES", 220.0));
        System.out.println(dl.get(2).toString());
        
        dl.addSDrink(new SDrink("2C017", "COCA-COLA", 218.0));
        System.out.println(dl.get(3).toString());
        
        dl.addSDrink(new SDrink("MD020", "MIRINDA", 185.0));
        System.out.println(dl.get(4).toString());
               
        System.out.println("Add a new SDrinks:\n");
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = scn.nextLine();
        
        System.out.print("Enter make: ");
        String make = scn.nextLine();
        
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scn.nextLine());
        
        dl.addSDrink(new SDrink(code, make, price));
        
        System.out.print(
                "1. Test getSDrinkByMake\n" +
                "2. Test SDrinkWithMinPrice\n" +
                "Enter TC(1/2): "
        );
        
        int tc =  Integer.parseInt(scn.nextLine());
        
        System.out.println("OUTPUT:");
        
        switch (tc) {
            case 1:
                System.out.print("Enter make: ");
                String name = scn.nextLine();
                System.out.println(dl.getSDrinkByMake(name));
                break;
            case 2:
                System.out.println(dl.SDrinkWithMinPrice());
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
