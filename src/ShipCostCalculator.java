public class ShipCostCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the price of the item: $50");
        double shippingCost;
        double price = 50;
        if (price < 100) {
            shippingCost = price * 0.02;
            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + (price + shippingCost));
        } else {
            shippingCost = 0 ;
            System.out.println("Shipping cost is 0");
            System.out.println("Total price: $" + price);
        }
    }
}