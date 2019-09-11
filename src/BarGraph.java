
import hsa.Console;
import java.awt.Color;

public class BarGraph {

    public static void main(String[] args) {
        Console c = new Console();

        int h1, h2, h3, h4;
        c.print("Enter height of bar 1> ");
        h1 = c.readInt();
        c.print("Enter height of bar 2> ");
        h2 = c.readInt();
        c.print("Enter height of bar 3> ");
        h3 = c.readInt();
        c.print("Enter height of bar 4> ");
        h4 = c.readInt();
        //1st bar
        c.setColor(Color.RED);
        c.fillRect(250, 500 - h1, 50, h1);
        c.drawString("Value: " + h1, 250, 500 - h1 - 20);
        //2st bar
        c.setColor(Color.BLUE);
        c.fillRect(350, 500 - h2, 50, h2);
        c.drawString("Value: " + h2, 350, 500 - h2 - 20);
        //3st bar
        c.setColor(Color.GREEN);
        c.fillRect(450, 500 - h3, 50, h3);
        c.drawString("Value: " + h3, 450, 500 - h3 - 20);
        //4st bar
        c.setColor(Color.PINK);
        c.fillRect(550, 500 - h4, 50, h4);
        c.drawString("Value: " + h4, 550, 500 - h4 - 20);

    }

}
