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
        ArrayList<Radio> rdList = new ArrayList<>();
        MyRadio myrad = new MyRadio();
        
        System.out.print("Enter TC(1-f1;2-f2;3-f3):");
        int tc = Integer.parseInt(sw.nextLine());
        
        switch (tc) {
            case 1:
                rdList.add(new Radio("VN1", 8));
                rdList.add(new Radio("VJ2", 2));
                rdList.add(new Radio("FR", 19));
                rdList.add(new Radio("PJ1", 17));
                
                for (Radio rd : rdList) {
                    System.out.print("(" + rd.getContent() + "," + rd.getRate() + ")");
                }
                
                System.out.println("\nOUTPUT:\n" + myrad.f1(rdList));
                
                break;
            case 2:
                
                rdList.add(new Radio("A12", 6));
                rdList.add(new Radio("B1X", 9));
                rdList.add(new Radio("C34", 2));
                rdList.add(new Radio("D2Y", 29));
                rdList.add(new Radio("E67", 22));
                rdList.add(new Radio("1F", 19));
                rdList.add(new Radio("3G1", 12));
                rdList.add(new Radio("2H", 5));
                
                for (Radio rd : rdList) {
                    System.out.print("(" + rd.getContent() + "," + rd.getRate() + ")");
                }
                
                myrad.f2(rdList);
                
                System.out.print("\nOUTPUT:\n");
                
                for (Radio rd : rdList) {
                    System.out.print("(" + rd.getContent() + "," + rd.getRate() + ")");
                }
                
                System.out.print("\n");
                
                break;
            case 3:
                
                rdList.add(new Radio("A2", 10));
                rdList.add(new Radio("B2", 56));
                rdList.add(new Radio("C3", 10));
                rdList.add(new Radio("D6", 47));
                rdList.add(new Radio("E6", 56));
                rdList.add(new Radio("1F", 15));
                rdList.add(new Radio("3G1", 18));
                rdList.add(new Radio("2H", 25));
                
                for (Radio rd : rdList) {
                    System.out.print("(" + rd.getContent() + "," + rd.getRate() + ")");
                }
                
                myrad.f3(rdList);
                
                System.out.print("\nOUTPUT:\n");
                
                for (Radio rd : rdList) {
                    System.out.print("(" + rd.getContent() + "," + rd.getRate() + ")");
                }
                
                System.out.print("\n");
                
                
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
