/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnhVLTCE200360Lab5 {
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
        ArrayList<SmartDevice> sdList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] arg = args[i].split(" ");
            if (arg[0].equals("Light")) {
                sdList.add(new SmartLight(arg[1], Integer.parseInt(arg[2])));
                result += "Add light: " + arg[1] + "\n";
            } else if (arg[0].equals("Thermostat")) {
                sdList.add(new SmartThermostat(arg[1], Integer.parseInt(arg[2])));
                result += "Add thermostat: " + arg[1] + "\n";
            } else if (arg[0].equals("Status")) {
                result += "-- Device Status --\n";
                for (SmartDevice sm : sdList) {
                    result += sm.getStatus() + "\n";
                }
            } else if (arg[0].equals("TurnOn")) {
                for (SmartDevice sm : sdList) {
                    if (arg[1].equals(sm.getId())) {
                        sm.turnOn();
                        result += "Turn on: " + sm.getId() + "\n";
                        break;
                    }
                }
            } else if (arg[0].equals("TurnOff")) {
                for (SmartDevice sm : sdList) {
                    if (arg[1].equals(sm.getId())) {
                        sm.turnOff();
                        result += "Turn off: " + sm.getId() + "\n";
                        break;
                    }
                }
            } else if (arg[0].equals("AdjustBrightness")) {
                for (SmartDevice sm : sdList) {
                    if (sm instanceof SmartLight) {
                        if (arg[1].equals(sm.getId())) {
                            ((SmartLight) sm).setBrightness(Integer.parseInt(arg[2]));
                            result += "Adjust brightness " + sm.getId() + " to " + arg[2] + "\n";
                            break;
                        }
                    }
                }
            } else if (arg[0].equals("AdjustTemp")) {
                for (SmartDevice sm : sdList) {
                    if (sm instanceof SmartThermostat) {
                        if (arg[1].equals(sm.getId())) {
                            ((SmartThermostat) sm).setTemperature(Integer.parseInt(arg[2]));
                            result += "Adjust temperature " + sm.getId() + " to " + arg[2] + "\n";
                            break;
                        }
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
        AnhVLTCE200360Lab5 q = new AnhVLTCE200360Lab5();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
