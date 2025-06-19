package mobagame;

import java.util.Scanner;

public class MobaGame {

    public static void main(String[] args) {
        
        try {
            if (MainMenuSelector()) {
                // start the game
            } else {
                System.exit(0);
            }
        } catch (Exception exp) {
            System.out.print("Error: " + exp.getMessage());
        }
        
    }
    
    public static boolean MainMenuSelector() {
        Scanner userInput = new Scanner(System.in);
        int choice;
        System.out.print(
                "=================================\n" +
                "  Welcome to Java MOBA Console   \n" +
                "=================================\n" +
                "1. Start Game\n" +
                "2. Exit\n" +
                "Choose option: "
        );
        choice = userInput.nextInt();
        
        switch (choice) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                throw new InternalError("There is no option available");
                // or recall this function if you want
        }
    }
}
