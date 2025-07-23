package GameObjects;

import java.util.ArrayList;

public class GameObjectList extends ArrayList<GameObjects>{

    private static final long serialVersionUID = 07232025L;
    
    // default radius is 5 (3,4,5)
    public ArrayList<GameObjects> inRange(double charx, double chary) {
        ArrayList<GameObjects> ret = new ArrayList<>();
        
        this.forEach((go) -> {
            double range = Math.sqrt(Math.pow(go.getX() - charx, 2) + Math.pow(go.getY() - chary, 2));
            if (range >= 0 && range <= 5) {
                ret.add(go);
            }
        });
        
        return ret;
    }
    
    public GameObjects atLocation(double charx, double chary) {
        GameObjects go = new GameObjects();
        
        for (GameObjects goComp : this) {
            if (goComp.getX() == charx && goComp.getY() == chary) {
                go = goComp;
                break;
            }
        }
        
        return go;
    }
}
