package q3;

public class Radio {
    protected String content;
    protected int rate;
    
    public Radio() {
        this.content = "";
        this.rate = 0;
    }
    
    public Radio(String content, int rate) {
        this.content = content;
        this.rate = rate;
    }

    public String getContent() {
        return this.content;
    }

    public int getRate() {
        return this.rate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
