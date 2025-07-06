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
        
        System.out.println("The journals have been added:");
        
        JournalList jl = new JournalList();
        
        jl.addJournal(new Journal(100, "OXFORD", 4000.00));
        System.out.println(jl.get(0).toString());
        
        jl.addJournal(new Journal(101, "WILL", 2000.00));
        System.out.println(jl.get(1).toString());
        
        jl.addJournal(new Journal(102, "ISI", 5000.00));
        System.out.println(jl.get(2).toString());
        
        jl.addJournal(new Journal(103, "SCOPUS", 8000.00));
        System.out.println(jl.get(3).toString());
        
        jl.addJournal(new Journal(104, "SJR", 7000.00));
        System.out.println(jl.get(4).toString());
        
        Scanner sw = new Scanner(System.in);
        
        System.out.println("Add a new journal:");
        
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sw.nextLine());
        
        System.out.print("Enter publisher: ");
        String publisher = sw.nextLine();
        
        System.out.print("Enter price: ");
        Double price = Double.parseDouble(sw.nextLine());
        
        jl.addJournal(new Journal(id, publisher, price));
        
        System.out.print(
                  "1. Test getJournalPublisherById\n"
                + "2. Test getAveragePrice\n"
                + "Enter TC(1/2):");
        
        int tc = Integer.parseInt(sw.nextLine());
        
        switch(tc) {
            case 1:
                System.out.print("Enter id: ");
                int find_id = Integer.parseInt(sw.nextLine());
                System.out.println("OUTPUT");
                System.out.println(jl.getJournalPublisherById(find_id));
                break;
            case 2:
                System.out.println("OUTPUT");
                System.out.println(String.format("%.2f", jl.getAveragePrice()));
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
