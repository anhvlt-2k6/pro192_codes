package javapolymorphism;

public class Animal {
    private String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    public void speak() {
        System.out.println("Animal makes sound");
    }
    
}