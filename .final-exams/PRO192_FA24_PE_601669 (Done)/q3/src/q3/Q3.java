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
        
        Scanner sw = new Scanner(System.in);
        
        ArrayList<Furniture> frList = new ArrayList<>();
        MyFurniture myFur = new MyFurniture();
        
        System.out.print("Enter TC (1-f1;2-f2;3-f3):");
        int tc = Integer.parseInt(sw.nextLine());
        
        switch (tc) {
            case 1:
                frList.add(new Furniture("VN1m", 8));
                frList.add(new Furniture("VJ1n", 2));
                frList.add(new Furniture("FR1p", 16));
                frList.add(new Furniture("PJ1n", 17));
                
                System.out.println("The list before running f1:");
                for (Furniture fr : frList) {
                    System.out.print("{" + fr.getName() + "," + fr.getPrice() + ")");
                }
                
                System.out.println("\nOUTPUT:\n" + myFur.f1(frList));
                break;
            case 2:
                frList.add(new Furniture("A12", 6));
                frList.add(new Furniture("B1X", 9));
                frList.add(new Furniture("C34", 2));
                frList.add(new Furniture("D2Y", 29));
                frList.add(new Furniture("E67", 22));
                frList.add(new Furniture("1F", 19));
                frList.add(new Furniture("3G1", 12));
                frList.add(new Furniture("2H", 5));
                
                System.out.println("The list before running f2:");
                for (Furniture fr : frList) {
                    System.out.print("{" + fr.getName() + "," + fr.getPrice() + ")");
                }
                
                myFur.f2(frList);
                
                System.out.println("\nThe list after running f2:");
                for (Furniture fr : frList) {
                    System.out.print("{" + fr.getName() + "," + fr.getPrice() + ")");
                }
                
                System.out.println("\n");
                
                break;
            case 3:
                frList.add(new Furniture("A1", 19));
                frList.add(new Furniture("B1", 56));
                frList.add(new Furniture("C3", 8));
                frList.add(new Furniture("D2", 47));
                frList.add(new Furniture("E6", 56));
                frList.add(new Furniture("1F", 65));
                frList.add(new Furniture("3G1", 8));
                frList.add(new Furniture("2H", 65));
                
                System.out.println("The list before running f3:");
                for (Furniture fr : frList) {
                    System.out.print("{" + fr.getName() + "," + fr.getPrice() + ")");
                }
                
                myFur.f3(frList);
                
                System.out.println("\nThe list after running f3:");
                for (Furniture fr : frList) {
                    System.out.print("{" + fr.getName() + "," + fr.getPrice() + ")");
                }
                
                System.out.println("\n");
                
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
