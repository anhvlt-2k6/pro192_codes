package soloImpact;

import java.util.Scanner;

import GameObjects.GameObjects;
import GameObjects.GameObjectList;

import GameObjects.InteractiveObjects.Enemy;
import GameObjects.InteractiveObjects.FriendlyNPC;

import MainCharacter.MainCharacter;
import java.util.ArrayList;

public class SoloImpact {
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
        
            System.out.print(
                    "Welcome to the SoloImpact. Please enter a name for your character:"
            );
            
            
            String MainCharName = sc.nextLine();
            
            MainCharacter hero = new MainCharacter(1, MainCharName, 100, 10, 0.0, 0.0);

            // Create and populate the game object list
            GameObjectList worldObjects = new GameObjectList();
            worldObjects.add(new Enemy(100, 2f, 3f, "Goblin", 30));
            worldObjects.add(new Enemy(101, -1f, 4f, "Orc", 50));
            worldObjects.add(new FriendlyNPC(200, 5f, 5f, "Villager", 2));
            worldObjects.add(new FriendlyNPC(201, -3f, -2f, "Merchant", 3));

            // Display all interactive objects in range of the hero
            System.out.println("\nObjects within range of hero:");
            ArrayList<GameObjects> nearby = worldObjects.inRange((int)hero.getX(), (int)hero.getY());
            for (GameObjects obj : nearby) {
                System.out.println(" - " + obj.getName() + " at (" + obj.getX() + ", " + obj.getY() + ")");
            }

            // Simulate hero attacking enemies
            System.out.println("\nHero attacks all nearby enemies for " + hero.attack + " damage:");
            for (GameObjects obj : nearby) {
                if (obj instanceof Enemy) {
                    Enemy e = (Enemy) obj;
                    e.getAttack(hero.attack);
                    System.out.println("Enemy " + e.getName() + " now has HP: " + e.hp);
                }
            }

            // Simulate hero moving
            hero.move(1f, 1f);
            System.out.println("\nHero moves to new position: (" + hero.getX() + ", " + hero.getY() + ")");

            // Check interactive NPC shops
            System.out.println("\nChecking NPC shops in world:");
            for (GameObjects obj : worldObjects) {
                if (obj instanceof FriendlyNPC) {
                    FriendlyNPC npc = (FriendlyNPC) obj;
                    System.out.println("NPC " + npc.getName() + " has shop type: " + npc.getItemInShop());
                }
            }
    }
}
