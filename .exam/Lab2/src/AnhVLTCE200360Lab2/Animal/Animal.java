/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnhVLTCE200360Lab2.Animal;

/**
 *
 * @author anhvlt
 */
public abstract class Animal {
    public String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract String makeSound();
    public abstract String displayInfo();
}
