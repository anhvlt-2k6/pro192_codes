package q1;

public class Wax {
    protected String color;
    protected int melting;
    
    public Wax() {
        this.color = "";
        this.melting = 0;
    }
    
    public Wax(String color, int melting) {
        this.color = color;
        this.melting = melting;
    }
    
    public String getColor() {
        String melting_char = String.format("%d", melting);
        return melting_char.concat(color.substring(melting_char.length() - 1));
    }
    
    public int getMelting() {
        return this.melting;
    }
    
    public void setMelting(int melting) {
        this.melting = melting;
    }
}
