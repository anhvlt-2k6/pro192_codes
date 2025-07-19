package q3;

import java.util.ArrayList;

public class JournalList extends ArrayList<Journal>{

    public void addJournal(Journal journal) {
        this.add(journal);
    }
    
    public String getJournalPublisherById(int id) {
        String journal = "N/A";
        
        for (Journal w : this) {
            if (w.getId() == id) {
                journal = w.getPublisher().toUpperCase();
                break;
            }
        }
        
        return journal;
    }
    
    public double getAveragePrice() {
        
        double totalPrice = 0.0;
        int index = 0;
        
        for (Journal z : this) {
            totalPrice += z.getPrice();
            index += 1;
        }
        
        return totalPrice / index;
    }
    
}
