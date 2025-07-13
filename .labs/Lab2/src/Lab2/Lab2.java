/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab2 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n, m;
    String[] args;
    String result = "";

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
            String[] firstLine = sc.nextLine().split(" ");
            m = Integer.parseInt(firstLine[0]);
            n = Integer.parseInt(firstLine[1]);
            args = new String[n];
            
            for (int i = 0; i < n; i++) {
                args[i] = sc.nextLine();
            }
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
        
        ArrayList<Lion> lionList = new ArrayList<>();
        ArrayList<Elephant> eleList = new ArrayList<>();
        
        switch (m) {
            case 1:
                for (int i = 0; i < n; i++) {
                    String[] arg = args[i].split(" ");
                    if (arg[0].equals("Lion")) {
                        lionList.add(new Lion(arg[1]));
                        result += "Sound: Roar" + "\n";
                    } else if (arg[0].equals("Elephant")) {
                        eleList.add(new Elephant(arg[1]));
                        result += "Name: " + arg[1] + "\n";
                        result += "Sound: Trumpet" + "\n";
                    }
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    String[] arg = args[i].split(" ");
                    eleList.add(new Elephant(arg[1]));
                    result += "Name: " + arg[1] + "\n";
                    result += "Sound: Trumpet" + "\n";
                    result += "This is a big animal" + "\n";
                }
                break;
            case 3:
                Zookeeper zk = new Zookeeper();
                for (int i = 0; i < n; i++) {
                    String[] arg = args[i].split(" ");
                    if (arg[0].equals("Lion")) {
                        lionList.add(new Lion(arg[1]));
                    } else if (arg[0].equals("Elephant")) {
                        eleList.add(new Elephant(arg[1]));
                    } else if (arg[0].equals("Zookeeper")) {
                        zk = new Zookeeper(arg[1]);
                    }
                }
                
                for (Lion li : lionList) {
                    result += zk.feed(li) + "\n";
                }
                
                for (Elephant el : eleList) {
                    result += zk.feed(el) + "\n";
                }
                
                break;
            case 4:
                for (int i = 0; i < n; i++) {
                    String[] arg = args[i].split(" ");
                    if (arg[0].equals("Lion")) {
                        lionList.add(new Lion(arg[1]));
                    } else if (arg[0].equals("Elephant")) {
                        eleList.add(new Elephant(arg[1]));
                    }
                }
                
                result += String.format("%d", lionList.size());
                
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
            fw.write(result);
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
        Lab2 q = new Lab2();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
