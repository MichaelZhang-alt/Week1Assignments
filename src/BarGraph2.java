
import hsa.Console;
import java.awt.Color;

public class BarGraph2 {

    public static void main(String[] args) {
        Console c = new Console();
        Bar b = new Bar();
        
        int h1, h2, h3, h4;
        c.print("Enter height of bar 1> ");
        h1 = c.readInt();
        c.print("Enter height of bar 2> ");
        h2 = c.readInt();
        c.print("Enter height of bar 3> ");
        h3 = c.readInt();
        c.print("Enter height of bar 4> ");
        h4 = c.readInt();
        
        //bar 1
        b.x = 250;
        b.height = h1;
        b.col = Color.red;
        b.draw(c);
        
        //bar 2
        b.x = 350;
        b.height = h2;
        b.col = Color.green;
        b.draw(c);
        
        //bar 3
        b.x = 450;
        b.height = h3;
        b.col = Color.pink;
        b.draw(c);
        
        //bar 4
        b.x = 550; 
        b.height = h4;
        b.col = Color.blue;
        b.draw(c);
        
    }
    
}
