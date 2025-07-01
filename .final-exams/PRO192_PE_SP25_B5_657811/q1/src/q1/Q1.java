package q1;

import java.util.Scanner;

public class Q1 {
   
    public static void main(String[] args) {
        String color;
        int melting;
        int testCase;
        Scanner sc = new Scanner(System.in);
        
        color = sc.nextLine();
        melting = Integer.parseInt(sc.nextLine());
        
        System.out.println(
                "1. Test getColor()\n"
              + "2. Test setMelting()\n"
        );
        
        testCase = Integer.parseInt(sc.nextLine());
        
        switch (testCase) {
            case 1:
                Wax testGetColor = new Wax(color, melting);
                System.out.println(testGetColor.getColor());
                break;
            case 2:
                System.out.print("Enter new melting: ");
                melting = Integer.parseInt(sc.nextLine()) * 3;
                Wax testSetMelting = new Wax(color, melting);
                System.out.println(testSetMelting.melting);
                break;
            default:
                break;
        }
    }
}
