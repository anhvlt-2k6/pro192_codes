/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
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
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = scn.nextLine();
        
        System.out.print("Enter speed: ");
        int speed = Integer.parseInt(scn.nextLine());
        
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scn.nextLine());
        
        System.out.print("Enter price: ");
        double price  = Double.parseDouble(scn.nextLine());
        
        System.out.print("Enter name: ");
        String name = scn.nextLine();
        
        System.out.print("Enter brand: ");
        String brand = scn.nextLine();
        
        SoidStateDrive ssd = new SoidStateDrive(code, speed, quantity, price, name, brand);
        
        System.out.print(
                "1. Test toString\n" +
                "2.Test getFinalPrice\n" +
                "3. Test getTotalAmount\n" + 
                "Enter your choice(1/2/3): "
        );
        
        int tc =  Integer.parseInt(scn.nextLine());
        
        System.out.println("OUTPUT:");
        
        switch (tc) {
            case 1:
                System.out.println(ssd.toString());
                break;
            case 2:
                System.out.println(String.format("%.2f", ssd.getFinalPrice()));
                break;
            case 3:
                System.out.println(String.format("%.2f", ssd.getTotalAmount()));
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
        Q2 q = new Q2();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
