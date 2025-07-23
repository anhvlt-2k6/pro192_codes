package soloImpact;

import MainCharacter.MainCharacter;

import GameObjects.GameObjectList;
import GameObjects.InteractiveObjects.Enemy;
import GameObjects.InteractiveObjects.FriendlyNPC;

import java.util.Scanner;

public class GameEngine {
    
    MainCharacter hero;
    GameObjectList objects;
    
    public void startGame() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a name for your character:");
        String mainName = sc.nextLine();
        hero = new MainCharacter(0, mainName, 100, 10, 0.0, 0.0);
        
        System.out.print("Please enter the difficulty you desire (1 as easy and anything else are hard): ");
        boolean isHard = (Integer.parseInt(sc.nextLine()) == 1) ? (false) : (true);
        this.initializeWorld(isHard);
    }
    
    public void initializeWorld(boolean isHard) {
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
            
        }
    }
}
