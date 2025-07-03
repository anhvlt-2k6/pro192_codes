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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q2 {
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
        try (Scanner sc = new Scanner(new File(fi))) {
            // --END FIXED PART----------------------------

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
        
        Scanner su = new Scanner(System.in);
        
        OrderList orderList = new OrderList();
        
        orderList.addOrder(new Order("001", "HANG", 100.0));
        orderList.addOrder(new Order("002", "ANH",  200.0));
        orderList.addOrder(new Order("003", "LOAN", 300.0));
        orderList.addOrder(new Order("004", "TUAN", 400.0));
        orderList.addOrder(new Order("005", "KHAI", 500.0));
        orderList.addOrder(new Order("006", "HIEU", 600.0));
        
        System.out.println("The Orders have been added:\n");
        orderList.forEach((w) -> {
            System.out.print(w.toString() + "\n");
        });
        
        System.out.println("Add a new order:\n");
        
        System.out.print("Enter orderId: ");
        String orderId = su.nextLine();
        
        System.out.print("Enter customerName: ");
        String customerName = su.nextLine();
        
        System.out.print("Enter sale: ");
        Double sale = Double.parseDouble(su.nextLine());
        
        orderList.addOrder(new Order(orderId, customerName, sale));
        
        System.out.print(
                "1. Test getSaleByOrderId\n" +
                "2. Test getOrdersBySale\n" +
                "Enter TC(1/2):"
        );
        
        int tc = Integer.parseInt(su.nextLine());
        
        switch (tc) {
            case 1:
                System.out.print("Enter orderId: ");
                String getorderId = su.nextLine();
                System.out.println(orderList.getSaleByOrderId(getorderId));
                break;
            case 2:
                List<Order> getbySale = new ArrayList<>();
                double getSale = Double.parseDouble(su.nextLine());
                getbySale = orderList.getOrdersBySale(getSale);
                if (getbySale.isEmpty()) {
                    System.out.println("N/A");
                } else {
                    for (Order w : getbySale) {
                        System.out.println(w.toString());
                    }
                }
                
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
        Q2 q = new Q2();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    // --END FIXED PART----------------------------
}
