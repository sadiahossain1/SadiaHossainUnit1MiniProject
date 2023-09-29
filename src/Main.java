// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // use type DecimalFormat to round calculations to the hundredths place
        DecimalFormat format = new DecimalFormat("#.##");
        format.setMinimumFractionDigits(2);

        // prompts user to enter the initial bill amount and stores that amount as a double
        System.out.print("Please enter the total bill amount: ");
        double bill = scan.nextDouble();

        // tells user to enter the tip percentage and stores it as an int
        System.out.print("Please enter the tip percentage as a whole number: ");
        int tip = scan.nextInt();

        // prompts user to enter the total # of people and stores it as an int
        System.out.print("Please enter the number of people in the party: ");
        int numberOfPeople = scan.nextInt();

        // calculates the tip amount per person and stores it as a double
        double tipPerPerson = (bill * (tip/100.00)) / numberOfPeople;

        // calculates the total bill amount and stores it as a double
        double totalBill = bill + (tipPerPerson * numberOfPeople);

        // calculates the total amount per person and stores it as a double
        double totalPerPerson = totalBill/numberOfPeople;

        // calculates the total tip amount and stores it as a double
        double totalTipAmount = tipPerPerson * numberOfPeople;

        System.out.println("|-------------------------|");
        System.out.println("Total Tip Amount: $" + format.format(totalTipAmount));
        System.out.println("Total Bill: $" + format.format(totalBill));
        System.out.println("Tip Per Person: $" + format.format(tipPerPerson));
        System.out.println("Total Per Person: $" + format.format(totalPerPerson));
        System.out.println("|-------------------------|");

    }
}
