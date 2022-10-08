//tipCalc class takes the bill amount and calculates the percentage of tip according to the percentage
//specified by the user. It then asks user if bill should be split among others
import java.util.Scanner;

public class TipCalc{
    static Scanner scan = new Scanner(System.in);

    static double bill;
    double tip;
    double total;
    double split;
    double splitInput;
    double billPerson;

    public static void billAmount(){
        bill = scan.nextDouble();
    }

    public void tipPercentage(){
        tip = scan.nextDouble();
        if(tip<1){
            total = bill * tip;
        }
        else total = bill * (tip/100);
        System.out.println("Your total is: " + total);
        splitBill();
        }


        public void splitBill()
        {
        System.out.println("Would you like to split your bill? ");
        System.out.println("Enter 1 for YES or 0 for NO: ");

        splitInput = scan.nextDouble();
        if(splitInput == 0)
        {
            System.out.println("Your total is: " + total);
            System.out.println("re-run for next calculation");  
        }
        else if(splitInput == 1)
        {
            System.out.println("How many people are paying? ");
            split = scan.nextDouble();
            billPerson = total / split;
            System.out.println("Each person pays: " + billPerson);
            System.out.println("re-run for next calculation");  

        }
        else System.out.println("Invalid Entry");
        }

    }