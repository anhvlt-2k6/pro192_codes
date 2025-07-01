/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import AnhVLTCE200360Lab3.Weather.*;

public class AnhVLTCE200360Lab3 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n;
    String[] requests;
    WeatherRecord[] records;
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
            
            requests = new String[n];
            records = new WeatherRecord[n];
            
            for (int i = 0; i < n; i++) {
                requests[i] = sc.nextLine();
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
    // access Type: 1 - printAll, 2 - Urban, 3 - Rural
    public void printMethods(int accessType, int queryIndex) {
        switch (accessType) {
            case 1:
                result += "--PrintAll--\n";
                for (int j = 0; j < queryIndex; j++) {
                    result += records[j].getInfo();
                    result += "\n";
                }
                break;
            case 2:
                result += "--PrintByType: Urban--\n";
                for (int j = 0; j < queryIndex; j++) {
                    if (records[j] instanceof UrbanWeather) {
                        result += records[j].getInfo();
                        result += "\n";
                    }
                }
                break;
            case 3:
                result += "--PrintByType: Rural--\n";
                for (int j = 0; j < queryIndex; j++) {
                    if (records[j] instanceof RuralWeather) {
                        result += records[j].getInfo();
                        result += "\n";
                    }
                }
                break;
            default:
                break;
        }
    }
    // --FIXED PART - DO NOT EDIT ANY THINGS HERE--
    // --START FIXED PART--------------------------
    /**
     * Main algorithm
     */
    public void solve() {
        // --END FIXED PART----------------------------

        // ALGORITHM - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
        int count = 0;
        for (int j = 0; j < n; j++) {
            String[] argus = requests[j].split(" ");
            if (argus[0].contains("Urban")) {
                int id = Integer.parseInt(argus[1]);
                String city = argus[2];
                double temperature = Double.parseDouble(argus[3]);
                int humidity = Integer.parseInt(argus[4]);
                records[j] = new UrbanWeather(id, city, temperature, humidity);
                count += 1;
                result += "Add urban: " + id + " " + city + "\n";
            } else if (argus[0].contains("Rural")) {
                int id = Integer.parseInt(argus[1]);
                String villageName = argus[2];
                double temperature = Double.parseDouble(argus[3]);
                boolean stormAlert;
                stormAlert = !argus[4].contains("false");
                records[j] = new RuralWeather(id, villageName, temperature, stormAlert);  
                count += 1;
                result += "Add rural: " + id + " " + villageName + "\n";
            } else if (argus[0].contains("PrintAll")) {
                printMethods(1, j);
            } else {
                if (argus[1].contains("Urban")) {
                    printMethods(2, count);
                } else {
                    printMethods(3, count);
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
        AnhVLTCE200360Lab3 q = new AnhVLTCE200360Lab3();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
