/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnhVLTCE200360Lab7 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n;
    String[] args;
    String result = "";
    List<Device> devices;
    
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
        
        devices = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] arg = args[i].split(" ");
            if (arg[0].equals("Light")) {
                devices.add(new Light(arg[1]));
                result += "Add Light: " + arg[1] + "\n";
            } else if (arg[0].equals("Thermostat")) {
                devices.add(new Thermostat(arg[1]));
                result += "Add Thermostat: " + arg[1] + "\n";
            } else if (arg[0].equals("TurnOn")) {
                for (Device d : devices) {
                    if (d.getId().equals(arg[1])) {
                        d.turnOn();
                        result += d.getId() + " turned on\n";
                        break;
                    }
                }
            } else if (arg[0].equals("TurnOff")) {
                for (Device d : devices) {
                    if (d.getId().equals(arg[1])) {
                        d.turnOff();
                        result += d.getId() + " turned off\n";
                        break;
                    }
                }
            } else if (arg[0].equals("SetBrightness")) {
                int brightness = Integer.parseInt(arg[2]);
                if (brightness < 0 || brightness > 100) {
                    result += arg[2] + " brightness value "  + brightness + " is invalid!\n";
                    continue;
                }
                for (Device d : devices) {
                    if (d.getId().equals(arg[1]) && d instanceof Light) {
                        ((Light)d).setBrightness(brightness);
                        result += d.getId() + " brightness set to " + brightness + "\n";
                        break;
                    }
                }
            } else if (arg[0].equals("SetTemperature")) {
                int temp = Integer.parseInt(arg[2]);
                if (temp < 10 || temp > 35) {
                    result += arg[2] + " temperature value "  + temp + " is invalid!\n";
                    continue;
                }
                for (Device d : devices) {
                    if (d.getId().equals(arg[1]) && d instanceof Thermostat) {
                        ((Thermostat)d).setTemperature(temp);
                        result += d.getId() + " temperature set to " + temp + "\n";
                        break;
                    }
                }
            } else if (arg[0].equals("Status")) {
                for (Device d: devices) {
                    if (d.getId().equals(arg[1])) {
                        result += d.getStatus();
                        break;
                    }
                }
            } else if (arg[0].equals("StatusAll")) {
                result += "-- Device Status --\n";
                devices.forEach((d) -> {
                    result += d.getStatus() + "\n";
                });
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
        AnhVLTCE200360Lab7 q = new AnhVLTCE200360Lab7();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
