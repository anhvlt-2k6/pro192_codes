package mobagame.Characters;

public class Healer extends CharacterBase {
    public Healer(String name) {
        super(name, 200, 20);
    }
    
    public void Healing(CharacterBase target) {
        changeHpOfTarget(target, this.hpDelta);
    }
}
