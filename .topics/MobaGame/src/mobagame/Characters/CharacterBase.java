package mobagame.Characters;

public abstract class CharacterBase {
    // initialize the name, hp, and base hpDelta (pos means add hp, neg means... u know)
    protected String name;
    protected int hp, hpDelta;
    
    // take the name of character with properties
    public CharacterBase(String name, int hp, int hpDelta) {
        this.name = name;
        this.hp = hp;
        this.hpDelta = hpDelta;
    }
    
    // basic action in-game (like take damage to others)
    public void changeHpOfTarget(CharacterBase target, int hpDelta) {
        System.out.println(this.name + " changes " + target.getName() + " for " + hpDelta + " in HP.");
        this.hp += hpDelta;
        if (this.hp <= 0) {
            this.hp = 0;
        }
        System.out.println(this.name + " now has " + this.hp + " HP.");
    }
    
    // check the status of character
    public boolean deadORsurvive (int hp) {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    // ?
    public String getName() {
        return name;
    }
    
    public int getHP() {
        return hp;
    }
}