package GameObjects.InteractiveObjects;

import GameObjects.GameObjects;

public class Enemy extends GameObjects {
    
    protected int hp;
    
    public Enemy(int id, double x, double y, String name, int hp) {
        super(id, x, y, name, true);
        this.hp = hp;
    }
    
    public void getAttack(int attack) {
        this.hp = (this.hp >= 0) ? this.hp - attack : 0;
        super.isInteractive = false; // destroyed
    }
    
    @Override
    public void updateName(String name) {
        this.name = name;
    }
    
    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getTypeofNPC() {
        return -1;
    }
}
