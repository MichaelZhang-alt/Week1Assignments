
import java.util.Scanner;
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int h1, h2, h3, h4;
        System.out.println("Enter height of bar 1> ");
        h1 = s.nextInt();
        System.out.println("Enter height of bar 2> ");
        h2 = s.nextInt();
        System.out.println("Enter height of bar 3> ");
        h3 = s.nextInt();
        System.out.println("Enter height of bar 4> ");
        h4 = s.nextInt();
        
        
        Pen p = new StandardPen(new SketchPadWindow(640,480));  
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){
        pb.x=x;
        pb.y=y;
        pb.width = w;
        pb.barColor = c;
        pb.draw(p);
}
