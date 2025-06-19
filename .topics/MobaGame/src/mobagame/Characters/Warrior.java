package mobagame.Characters;

public class Warrior extends CharacterBase {
    public Warrior(String name) {
        super(name, 150, -20);
    }
    
    public void heaveStrike(CharacterBase target) {
        changeHpOfTarget(target, this.hpDelta - 10);
    }
}
