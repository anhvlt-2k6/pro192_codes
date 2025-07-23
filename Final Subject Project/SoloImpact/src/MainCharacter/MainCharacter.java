package MainCharacter;

import java.util.ArrayList;

/**
 *
 * @author Vo Luu Tuong Anh
 * 
 * 
 * the class Main Character should be unique (declare once, interact globally)
 * Parameters required:
 * 1. id - of objects (For the main, that is 0) (int)
 * 2. name - of the character (String)
 * 3. hp - that set is the initial hp of the character (also the max hp) (int)
 * 4. attack - the negation of target hp (int)
 * 5. x and y - are the location of character on the map
 * 
 */
public class MainCharacter {
    int id, maxhp, currenthp, attack;
    String name;
    double x, y; // position
    ArrayList<String> items;
    
    public MainCharacter() {
        // overload?
    }
    
    public MainCharacter(int id, String name, int hp, int attack, double x, double y) {
        this.id = id;
        this.name = name;
        this.maxhp = hp;
        this.currenthp = hp;
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

    public void setItems(String item) {
        this.items.add(item);
    }
    
    public void move(double deltaX, double deltaY) {
        this.x = deltaX;
        this.y = deltaY;
    }
}
