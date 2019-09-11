import hsa.Console;
import java.awt.Color;


public class Bar {
    int x, height;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        c.fillRect(x, 500-height, 50, height);
        c.drawString("Value: " + height, x, 500-height-10);
    }
}
