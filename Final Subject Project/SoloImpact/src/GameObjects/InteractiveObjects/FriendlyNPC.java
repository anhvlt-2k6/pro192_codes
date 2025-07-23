package GameObjects.InteractiveObjects;

import GameObjects.GameObjects;

public class FriendlyNPC extends GameObjects {

    /*
    Type of friendly NPC
    1. Neutral (No shop)
    2. Farmer - has food
    3. Entrepreneur - has weapon
    */
    
    protected int typeofNPC;
    
    public FriendlyNPC(int id, double x, double y, String name, int typeofNPC) {
        super(id, x, y, name, true);
        this.typeofNPC = typeofNPC;
    }
    
    @Override
    public void updateName(String name) {
        super.name = name;
    }
    
    /*
    Some friendly NPC open shops.
    */

    @Override
    public int getTypeofNPC() {
        return this.typeofNPC;
    }
    
    @Override
    public int getHp() {
        return -1;
    }

    @Override
    public void getAttack(int attack) {
        
    }
}
