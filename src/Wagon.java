
import hsa.Console;
import java.awt.Color;

public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        
        //sky
        c.setColor(Color.CYAN);
        c.fillRect(0,0,700,600);
        
        //grass
        c.setColor(Color.GREEN);
        c.fillRect(0,400,700,100);
        
        //wagon body
        c.setColor(Color.RED);
        c.fillRect(150,280,300,100);
        
        //wheels
        c.setColor(Color.BLACK);
        c.fillOval(180, 350, 50, 50);
        c.fillOval(380, 350, 50, 50);
        
        //Sun
        c.setColor(Color.YELLOW);
        c.fillOval(500,50,80,80);
        
        //handle
        c.setColor(Color.BLACK);
        c.drawLine(150,280,50,200);
    }
    
}
