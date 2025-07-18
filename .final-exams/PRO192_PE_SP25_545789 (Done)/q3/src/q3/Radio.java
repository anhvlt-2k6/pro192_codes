package q3;

import java.util.Comparator;

public class Radio implements Comparator {
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

    @Override
    public int compare(Object o1, Object o2) {
        Radio r1 = (Radio)o1;
        Radio r2 = (Radio)o2;
        
        if (r1.getRate() < r2.getRate()) {
            return -1;
        }
        
        if (r1.getRate() > r2.getRate()) {
            return 1;
        }
        
        return 0;
    }
}
