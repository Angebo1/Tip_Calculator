//Main class connecting everything together and taking user's input
import java.util.Scanner;

public class Calculator{  
    public static void main(String[] args)
    {
        TipCalc tipCalculator = new TipCalc();

        System.out.println("Please enter the bill amount: ");
        TipCalc.billAmount();

        System.out.println("Cash or card?");
        Scanner scan = new Scanner(System.in);
        String pay = scan.nextLine();
        Paying paying = new Paying (new Cash());
        if (pay.equals("cash")){
            System.out.println(paying.executePayment("", "You are paying with cash!"));
        }
        if (pay.equals("card")){
            paying = new Paying(new Card());
            System.out.println(paying.executePayment("You are paying with a debit/credit card!", ""));
        }
        else {
            System.out.println("Invalid Entry");
        } 

        System.out.println("What percentage would you like the tip to be?: ");
        tipCalculator.tipPercentage();
        
        scan.close();
    }

}
