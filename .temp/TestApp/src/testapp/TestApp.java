package testapp;

import java.util.ArrayList;
import java.util.Arrays;

public class TestApp {

    String id = "test";

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public static void main(String[] args) {
        TestApp ta = new TestApp();
        ta.setId("Hi");
        System.out.print(ta.getId());
        
        
        
    }
}
