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
    int num;
    String[] queryString;
    ArrayList<BookCategory> categories;
    ArrayList<Book> books;
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
            num = Integer.parseInt(sc.nextLine());
            
            queryString = new String[num];
            categories = new ArrayList<>();
            books = new ArrayList<>();
            
            for (int i = 0; i < num; i++) {
                queryString[i] = sc.nextLine();
            }
            
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
        
        int countBookCategory = 0;
        int booksCount = 0;
        
        for (int j = 0; j < num; j++) {
            String[] args = queryString[j].split(",");
            if (args[0].equals("AddBookCategory")) {
                categories.add(new BookCategory(args[1], args[2]));
                result += categories.get(countBookCategory).entry() + "\n";
                countBookCategory += 1;
            } else if (args[0].equals("PrintBookCategory")) {
                
                result += "---PrintBookCategory---\n";
                
                if (countBookCategory != 0) {
                    for (int k = 0; k < countBookCategory; k++) {
                        result += categories.get(k).print() + "\n";
                    }
                } else {
                    result += "Empty\n";
                }
                
                result += "---\n";

            } else if (args[0].equals("AddBook")) {
               
               BookCategory compare = null;
               for (int l = 0; l < countBookCategory; l++) {
                   if (categories.get(l).getId().equals(args[4])) {
                       compare = categories.get(l);
                       break;
                   }
               }
               books.add(new Book(args[1], args[2], Integer.parseInt(args[3]), compare));
               result += books.get(booksCount).Entry() + "\n";
               booksCount += 1;
               
            } else if (args[0].equals("PrintBook")) {
                
                result += "---PrintBook---\n";
                
                if (booksCount != 0) {
                    for (int m = 0; m < booksCount; m++) {
                        result += books.get(m).Print() + "\n";
                    }                
                } else {
                    result += "Empty\n";
                }
                
                result += "---\n";
 
            } else if (args[0].equals("SearchBook")) {
                
                result += "---SearchBook---\n";
                
                Book compareBook = null;
                for (int n = 0; n < booksCount; n++) {
                    if (books.get(n).getTitle().equals(args[1])) {
                        compareBook = books.get(n);
                        break;
                    }
                }
                
                if (compareBook != null) {
                    result += compareBook.Print() + "\n";
                } else {
                    result += "Not found\n";
                }
                
                result += "---\n";
                
            } else {
                books.clear();
                result += "* Remove all books\n";
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
