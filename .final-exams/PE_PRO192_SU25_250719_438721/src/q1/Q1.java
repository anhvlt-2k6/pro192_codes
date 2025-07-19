/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    // Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    // --VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    int n;
    String[] lines;
    String result = "";
    ArrayList<Task> tasks;

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
            lines = new String[n];
            
            for (int i = 0; i < n; i++) {
                lines[i] = sc.nextLine();
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
        tasks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = lines[i].split(" ");
            
            if (line[0].equals("Work")) {
                int id = Integer.parseInt(line[1]);
                String name = line[2];
                String project = line[3];
                tasks.add(new WorkTask(id, name, project));
                result += "Add new work: " + id + " " + name + "\n";
            } else if (line[0].equals("Personal")) {
                int id = Integer.parseInt(line[1]);
                String name = line[2];
                String location = line[3];
                tasks.add(new PersonalTask(id, name, location));
                result += "Add new personal: " + id + " " + name + "\n";
            } else if (line[0].equals("Done")) {
                int id = Integer.parseInt(line[1]);
                for (Task t : tasks) {
                    if (t.getId() == id) {
                        t.markDone();
                    }
                }
                result += id + " is done!\n";
            } else if (line[0].equals("PrintAll")) {
                result += "--PrintAll--\n";
                for (Task t : tasks) {
                    result += t.getInfo() + "\n";
                }
            } else if (line[0].equals("PrintByType")) {
                if (line[1].equals("Work")) {
                    result += "--PrintByType: Work--\n";
                    for (Task t : tasks) {
                        if (t.getType().equals("Work")) {
                            result += t.getInfo() + "\n";
                        }
                    }
                } else if (line[1].equals("Personal")) {
                    result += "--PrintByType: Personal--\n";
                    for (Task t : tasks) {
                        if (t.getType().equals("Personal")) {
                            result += t.getInfo() + "\n";
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
        Q1 q = new Q1();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
