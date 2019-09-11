
import hsa.Console;
import java.awt.Color;

public class PenBar {
    int x, y, width;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        c.fillRect(x, 500 - y, width, y);
        c.drawString("Value: " + y, x, 500-y-10);
    }
}
