package MainCharacter;

import java.util.ArrayList;

public class MainCharacter {
    int id, maxhp, currenthp, attack;
    String name;
    double x, y; // position
    ArrayList<String> items;
    
    public MainCharacter(int id, String name, int hp, int attack, double x, double y) {
        this.id = id;
        this.name = name;
        this.maxhp = hp;
        this.currenthp = (int) ((int)hp * 0.8);
        this.attack = attack;
        this.x = x;
        this.y = y;
        items = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public int getMaxhp() {
        return this.maxhp;
    }

    public int getCurrenthp() {
        return this.currenthp;
    }
    
    public int getAttack() {
        return this.attack;
    }

    public String getName() {
        return this.name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public ArrayList<String> getItems() {
        return this.items;
    }
    
    public void healthHP(int hp) {
        if (this.currenthp + hp >= this.maxhp) {
            this.currenthp = this.maxhp;
        } else {
            this.currenthp += hp;
        }
    }
    
    public void getAttack(int hp) {
        if (this.currenthp - hp <= 0) {
            this.currenthp = 0;
        } else {
            this.currenthp -= hp;
        }
    }
    
    public void move(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
}
