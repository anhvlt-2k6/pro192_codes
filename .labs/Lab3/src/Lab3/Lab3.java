/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n;
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
            n = Integer.parseInt(sc.nextLine());
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
        ArrayList<WeatherRecord> lcList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] arg = args[i].split(" ");
            if (arg[0].equals("Urban")) {
                lcList.add(new UrbanWeather(Integer.parseInt(arg[1]), 
                                            arg[2], 
                                            Double.parseDouble(arg[3]),
                                            Integer.parseInt(arg[4])));
                result += "Add urban: " 
                        + lcList.get(lcList.size() - 1).getId() 
                        + " " 
                        + lcList.get(lcList.size() - 1).getLocation() 
                        + "\n";
            } else if (arg[0].equals("Rural")) {
                lcList.add(new RuralWeather(Integer.parseInt(arg[1]), 
                                            arg[2], 
                                            Double.parseDouble(arg[3]),
                                            arg[4]));
                result += "Add rural: " 
                        + lcList.get(lcList.size() - 1).getId() 
                        + " " 
                        + lcList.get(lcList.size() - 1).getLocation();
                
                if (lcList.get(lcList.size() - 1).getLocation().equals("FPT")) {
                    result += " <- Chay di cac chau oi, luis gala day ;-;";
                }
                
                result += "\n";
                
            } else if (arg[0].equals("PrintAll")) {
                result += "--PrintAll--\n";
                for (WeatherRecord wc : lcList) {
                    result += wc.getInfo() + "\n";
                }
            } else if (arg[0].equals("PrintByType")) {
                
                if (arg[1].equals("Urban")) {
                    result += "--PrintByType: Urban--\n";
                } else if (arg[1].equals("Rural")) {
                    result += "--PrintByType: Rural--\n";
                }
                
                for (WeatherRecord wc : lcList) {
                    if (wc instanceof UrbanWeather && arg[1].equals("Urban")) {
                        result += wc.getInfo() + "\n";
                    }
                    
                    if (wc instanceof RuralWeather && arg[1].equals("Rural")) {
                        result += wc.getInfo() + "\n";
                    }
                }
            }
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
        Lab3 q = new Lab3();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
