package GameObjects;

import GameObjects.InteractiveObjects.Enemy;
import GameObjects.InteractiveObjects.FriendlyNPC;

import java.util.ArrayList;

public class GameObjectList extends ArrayList<GameObjects>{

    private static final long serialVersionUID = 07232025L;

    public String displayAll() {
        String ret = "";
        
        for (GameObjects go : this) {
            String objectType = "";
            
            if (go instanceof Enemy) {
                objectType = "Enemy";
            } else {
                objectType = "Friendly NPC";
            }
            
            ret += String.format("[%s] %s at x=%.2f y=%.2f\n", 
                    objectType,
                    go.getName(),
                    go.getX(),
                    go.getY());
        }
        
        return ret;
    }
    
    // location of the arraylist
    public int atLocation(double charx, double chary) {
        final double EPS = 1e-6;         // tolerance for comparing doubles
        int index = 0;

        for (GameObjects goComp : this) {
            if (Math.abs(goComp.getX() - charx) < EPS && Math.abs(goComp.getY() - chary) < EPS) {
                return index;
            }
            
            index++;
        }

        return -1;
    }
}
