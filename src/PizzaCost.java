
import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double basecost, size, toppings, total;

        System.out.println("How many topping would you like? > ");
        toppings = s.nextDouble();

        System.out.println("What is the size of the pizza (in inches)? > ");
        size = s.nextDouble();

        basecost = 1.5 + 0.75;

        total = size * 0.50 + toppings * 0.75 + basecost;

        System.out.format("The total cost of the piza will be $%.2f.", total);
    }

}
