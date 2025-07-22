package GameObjects;

import java.util.ArrayList;

public class GameObjectList extends ArrayList<GameObjects>{
    
    // default radius is 5 (3,4,5)
    public ArrayList<GameObjects> inRange(int charx, int chary) {
        ArrayList<GameObjects> ret = new ArrayList<>();
        for (GameObjects go : this) {
            double range = Math.sqrt(Math.pow(go.getX() - charx, 2) + Math.pow(go.getY() - chary, 2));
            if (range >= 0 && range <= 5) {
                ret.add(go);
            }
        }
        return ret;
    }
}
