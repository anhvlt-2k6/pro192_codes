/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnhVLTCE200360Lab6 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n;
    String[] args;
    String result = "";
    List<Robot> robots;
    
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
        
        robots = new ArrayList<Robot>();
        
        for (int i = 0; i < n; i++) {
            String[] arg = args[i].split(" ");
            
            if (arg[0].equals("Delivery")) {
                String Id = arg[1];
                int x = Integer.parseInt(arg[2]);
                int y = Integer.parseInt(arg[3]);
                robots.add(new DeliveryRobot(Id, x, y));
                result += "Add DeliveryRobot: " + Id + " at (" + x + "," + y + ")\n";
            } else if (arg[0].equals("Survey")) {
                String Id = arg[1];
                int x = Integer.parseInt(arg[2]);
                int y = Integer.parseInt(arg[3]);
                robots.add(new SurveyRobot(Id, x, y));
                result += "Add SurveyRobot: " + Id + " at (" + x + "," + y + ")\n";
            } else if (arg[0].equals("Report")) {
                result += "--Report--\n";
                for (Robot rb : robots) {
                    result += rb.getPosition() + "\n";
                }
            } else if (arg[0].equals("Rotate")) {
                for (Robot rb : robots) {
                    if (rb.getId().equals(arg[1])) {
                        rb.rotate(arg[2]);
                        result += rb.getId() + " rotated to " + rb.getDirection() + "\n";
                        break;
                    }
                }
            } else if (arg[0].equals("Move")) {
                for (Robot rb : robots) {
                    if (rb.getId().equals(arg[1])) {
                        rb.move();
                        result += rb.getId() + " moved to (" + rb.getX() + "," + rb.getY() + ")\n";
                        break;
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
        AnhVLTCE200360Lab6 q = new AnhVLTCE200360Lab6();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
