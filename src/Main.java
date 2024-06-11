public class Main {
    public static void main(String[] args) {
        double startingPrice = 85;
        double salesTax = startingPrice * 0.05;
        System.out.println("Your total price of a purchase of $85 including sales tax is"  +  (salesTax + startingPrice));
    }
}