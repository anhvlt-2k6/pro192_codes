/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author ShiroiNeko
 */
public class Engine {
    
    protected String designer;
    protected int power;
    
    public Engine() {
        this.designer = "";
        this.power = 0;
    }
    
    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }
    
    public String getDesigner() {
        return String.format("%c%c%d%s", 
                this.designer.toCharArray()[0],
                this.designer.toCharArray()[1],
                this.power,
                this.designer.substring(2));
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        int countCharArr = 0;
        for (char w : this.designer.toCharArray()) {
            if (Character.isAlphabetic(w)) {
                countCharArr += 1;
            }
        }
        
        this.power = power * countCharArr;
    }
}
