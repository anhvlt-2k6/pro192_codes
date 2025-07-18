package AnhVLTCE200360Lab6;

import java.util.ArrayList;
import java.util.List;

public class SurveyRobot implements Robot {
    
    protected String Id;
    protected int x;
    protected int y;
    protected String direction;
    protected List<String> log;

    public SurveyRobot() {
        this.Id = "";
        this.x = 0;
        this.y = 0;
        this.direction = "";
        this.log = new ArrayList<>();
    }
    
    public SurveyRobot(String Id, int x, int y) {
        this.Id = Id;
        this.x = x;
        this.y = y;
        this.direction = "NORTH";
        this.log = new ArrayList<>();
    }
    
    @Override
    public void move() {
        if (this.direction.equals("NORTH")) {
            this.y += 1;
        } else if (this.direction.equals("SOUTH")) {
            this.y -= 1;
        } else if (this.direction.equals("EAST")) {
            this.x += 1;
        } else if (this.direction.equals("WEST")) {
            this.x -= 1;
        }
    }

    @Override
    public void rotate(String direction) {
        String curDir = this.direction;
        if (direction.equals("RIGHT")) {
            
            if (curDir.equals("NORTH")) {
                this.direction = "EAST";
            } else if (curDir.equals("EAST")) {
                this.direction = "SOUTH";
            } else if (curDir.equals("SOUTH")) {
                this.direction = "WEST";
            } else if (curDir.equals("WEST")) {
                this.direction = "NORTH";
            }
            
        } else if (direction.equals("LEFT")) {
        
            if (curDir.equals("NORTH")) {
                this.direction = "WEST";
            } else if (curDir.equals("EAST")) {
                this.direction = "NORTH";
            } else if (curDir.equals("SOUTH")) {
                this.direction = "EAST";
            } else if (curDir.equals("WEST")) {
                this.direction = "SOUTH";
            }
            
        }
    }

    @Override
    public String getPosition() {
        return String.format("%s (Survey): (%d,%d) facing %s", this.getId(), this.x, this.y, this.getDirection());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    @Override
    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
