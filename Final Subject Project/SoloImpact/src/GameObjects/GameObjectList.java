package GameObjects;

import GameObjects.InteractiveObjects.Enemy;

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
    
    // location of the arraylist (if the arraylist is not null it should start with 0, if not found then return -1; if null then ignore)
    public int atLocation(double x, double y) {
        
        for (int i = 0; i < this.size(); i++) {
            GameObjects go = this.get(i);
            if (Double.compare(go.getX(), x) == 0 && Double.compare(go.getY(), y) == 0) {
                return i;
            }
        }
        
        return -1;
    }

}
