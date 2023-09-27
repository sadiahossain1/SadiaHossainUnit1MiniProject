// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the total bill amount: ");
        double bill = scan.nextDouble();

        System.out.print("Please enter the tip percentage: ");
        int tip = scan.nextInt();

        System.out.print("Please enter the number of people in the party: ");
        int numberOfPeople = scan.nextInt();

        double tipPerPerson = (bill * (tip/100.00)) / numberOfPeople;
        System.out.println(tipPerPerson);

        double totalBill = bill + (tipPerPerson * numberOfPeople);
        System.out.println(totalBill);

        double totalPerPerson = totalBill/numberOfPeople;
        System.out.println(totalPerPerson);

        double totalTipAmount = tipPerPerson * numberOfPeople;
        System.out.println(totalTipAmount);
    }
}