package soloImpact;

import MainCharacter.MainCharacter;

import GameObjects.GameObjectList;

import GameObjects.InteractiveObjects.Enemy;
import GameObjects.InteractiveObjects.FriendlyNPC;

import java.util.Scanner;

public class GameEngine {
    
    Scanner sc = new Scanner(System.in);
    
    MainCharacter hero;
    GameObjectList objects;
    
    public void startGame() {
        System.out.print("Please enter a name for your character: ");
        String mainName = sc.nextLine();
        hero = new MainCharacter(0, mainName, 100, 10, 0.0, 0.0);
        
        System.out.print("Please enter the difficulty you desire (1 as easy and anything else are hard): ");
        boolean isHard = (Integer.parseInt(sc.nextLine()) == 1) ? (false) : (true);
        
        objects = new GameObjectList();
        if (isHard) {
            // add enemy
            objects.add(new Enemy(1, 8.0, 7.0, "Dual Sword", 20));
            objects.add(new Enemy(2, 19.0, 9.0, "Single Foot", 20));
            
            // add friendly npc
            objects.add(new FriendlyNPC(3, 0.0, 3.0, "orangc", 1));
            objects.add(new FriendlyNPC(4, 2.0, 4.0, "Stef", 2));
            objects.add(new FriendlyNPC(5, 1.0, 1.0, "Fonta Drinker", 3));
        } else {
            // add enemy
            objects.add(new Enemy(1, 8.0, 7.0, "Dual Sword", 2));
            objects.add(new Enemy(2, 19.0, 9.0, "Single Foot", 2));
            
            // add friendly npc
            objects.add(new FriendlyNPC(3, 0.0, 3.0, "orangc", 1));
            objects.add(new FriendlyNPC(4, 2.0, 4.0, "Stef", 2));
            objects.add(new FriendlyNPC(5, 1.0, 1.0, "Fonta Drinker", 3));       
        }
        
        this.loop();
        
        // close game
        objects.removeAll(objects);
        sc.close();
    }
    
    public void loop() {
        while (true) {
            System.out.print(
                  "Main menu:\n"
                + "1. Move the main character\n"
                + "2. See all initialized objects\n"
                + "Your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    this.move();
                    break;
                case 2:
                    System.out.print(objects.displayAll() + "\n");
                    break;
                default:
                    break;
            }
        }
    }
    
    public void move() {
        System.out.print("Enter the x: ");
        double x = sc.nextDouble();
        sc.nextLine(); // safe consumption
        
        System.out.print("Enter the y: ");
        double y = sc.nextDouble();
        sc.nextLine(); // safe consumption
        
        hero.move(x, y);
        System.out.print(String.format("Current location of hero is: %.2f %.2f\n", hero.getX(), hero.getY()));
        
        int loc = objects.atLocation(hero.getX(), hero.getY());
        
        if (loc != -1) {
            if (objects.get(loc) instanceof Enemy) {
                System.out.print("Enemy is detected. Wanna combat ('n' to reject, else to proceed)?: ");
                String input = sc.nextLine();
                
                if (input.equals("n")) {
                    return;
                }

                System.out.println("Attacking enemy");
                while (objects.get(loc).getHp() >= 0) {
                    objects.get(loc).getAttack(hero.getAttack());
                    System.out.print("Current enemy hp: " + objects.get(loc).getHp() + "\n");
                }
                objects.remove(loc);
                System.out.println("Emeny has been elimated!");
            } else if (objects.get(loc) instanceof FriendlyNPC) {
                System.out.print("Hey it cool NPC. Wanna interact ('n' to reject, else to proceed)?: ");
                String input = sc.nextLine().trim();
                
                if (input.equalsIgnoreCase("n")) {
                    return;
                }
                
                switch (objects.get(loc).getTypeofNPC()) {
                    case 1:
                        System.out.print(objects.get(loc).getName() + ": Hi\n");
                        break;
                    case 2:
                        hero.setItems("food");
                        System.out.print(objects.get(loc).getName() + ": (Just gave you food) Have a nice day!\n");
                        break;
                    case 3:
                        System.out.print(objects.get(loc).getName() + ": (Just gave you weapon) Have a nice day!\n");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
