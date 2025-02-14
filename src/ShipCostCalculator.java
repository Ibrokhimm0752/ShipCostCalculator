import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.println("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();

            if (itemCost < 100) {
                shipCost = itemCost * SHIP_RATE;
            } else {
                totalCost = itemCost + shipCost;
                System.out.println("Your shipping cost is $" + shipCost);
                System.out.println("Your total cost is $" + totalCost);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invlaid item Price: " + trash);
            System.exit(0);

        }
    }


