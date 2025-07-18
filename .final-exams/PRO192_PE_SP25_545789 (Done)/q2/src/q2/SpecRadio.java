/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author ShiroiNeko
 */
public class SpecRadio extends Radio {
    protected String channel;
    
    public SpecRadio(String content, int rate, String channel) {
        super(content, rate);
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%d", super.content, this.channel, super.rate);
    }
    
    public void setData() {
        super.content = super.content.substring(1);
    }
    
    public String getValue() {
        String new_str = "";
        char[] newArr = super.content.toCharArray();
        
        for (int i = 0; i < newArr.length; i++) {
            if (i % 2 != 0) {
                new_str += String.format("%s", newArr[i]);
            }
        }
        
        return (super.rate % 2 != 0) ? new_str : super.content;
    }
}
