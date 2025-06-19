/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import AnhVLTCE200360Lab2.Animal.Elephant;
import AnhVLTCE200360Lab2.Animal.Lion;

public class AnhVLTCE200360Lab2 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int m, n;
    String[] Values;
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
            //read the first line, whrer n[0] is m case, and m[1] is the number needed
            String getFirstLine[] = sc.nextLine().split(" ");
            m = Integer.parseInt(getFirstLine[0]);
            n = Integer.parseInt(getFirstLine[1]);
            
            String[][] Data = new String[n][2];
            
            switch (m) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        Data[i] = sc.nextLine().split(" ");
                    }
                    
                    for (int j = 0; j < n; j++) {
                        if (Data[j][0].equals("Lion")) {
                            Lion newLion = new Lion(Data[j][1]);
                            result += "Name: " + newLion.displayInfo() + "\n" + "Sound: " + newLion.makeSound();
                        } else {
                            Elephant newElephant = new Elephant(Data[j][1]);
                            result += "Name: " + newElephant.displayInfo() + "\n" +  "Sound: " + newElephant.makeSound();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        Data[i] = sc.nextLine().split(" ");
                    }
                    
                    for (int j = 0; j < n; j++) {
                        if (Data[j][0].equals("Lion")) {
                            Lion newLion = new Lion(Data[j][1]);
                            result += "Name: " + newLion.displayInfo() + "\n" + "Sound: " + newLion.makeSound();
                        } else {
                            Elephant newElephant = new Elephant(Data[j][1]);
                            result += "Name: " + newElephant.displayInfo() + "\n" +
                                    "Sound: " + newElephant.makeSound() + "\n" +
                                    "This is a big animal";
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        Data[i] = sc.nextLine().split(" ");
                    }
                    
                    Zookeeper newKeeper = new Zookeeper("");
                    
                    for (int j = 0; j < n; j++) {
                        if (Data[j][0].equals("Zookeeper")) {
                            newKeeper.name = Data[j][1];
                        } else if (Data[j][0].equals("Lion")) {
                            Lion newLion = new Lion(Data[j][1]);
                            result += "Zookeeper " + newKeeper.name + " feeds " + newLion.displayInfo();
                        } else { 
                            Elephant newElephant = new Elephant(Data[j][1]);
                            result += "Zookeeper " + newKeeper.name + " feeds " + newElephant.displayInfo();
                        }
                    }
                    
                    break;
                case 4:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        Data[i] = sc.nextLine().split(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        if (Data[j][0].equals("Lion")) {
                            count += 1;
                        }
                    }
                    result += count;
                    break;
                default:
                    System.exit(0);
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
    public void CaseOne(String[] Data, int runtimeLimit) {
        
    }
    
    // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
    // --START FIXED PART--------------------------
    /**
     * Main algorithm
     */
    public void solve() {
        // --END FIXED PART----------------------------

        // ALGORITHM - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
        
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
        AnhVLTCE200360Lab2 q = new AnhVLTCE200360Lab2();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
