
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double mass, velocity, momentum;

        System.out.println("What is the object's mass (in kgs)? > ");
        mass = s.nextDouble();

        System.out.println("What is the object's velocity (in meters/second)? > ");
        velocity = s.nextDouble();

        momentum = mass * velocity;
        System.out.format("The momentum of the object is %.2fkg*m/s.", momentum);
    }

}
