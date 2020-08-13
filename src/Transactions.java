import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transactions extends CustomerDetails{
    public int TransactionNo;
    public int debit, credit, option,balance = 0,new_balance = 0;

    // Method to return current date and time
    public String getdate(){
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        return df.format(dateobj);
    }

    //Method to handle Transactions
    public void TransactionProcess(){
        //Taking user input for transaction
        System.out.println("Please choose Transaction option, (Choose 1 for Debit, 2 for Credit): ");
        Scanner sc2 = new Scanner(System.in);
        option = sc2.nextInt(); //Variable to take user input

        //Perform tasks according to user input
        switch(option){
            case 1:
                System.out.println("Enter Debit amount: ");
                debit = sc2.nextInt();
                credit = 0;

                // Check if available balance is sufficient
                if (balance < debit){
                    System.out.println("Insufficient Balance. Please credit some amount.");
                    debit = 0;
                }else {
                    System.out.println(debit + " Rs is Debited.");
                    TransactionNo = TransactionNo + 1;
                }
                break;
            case 2:
                System.out.println("Enter Credit amount: ");
                credit = sc2.nextInt();
                debit = 0;
                System.out.println(credit+" Rs is Credited.");
                TransactionNo = TransactionNo + 1;
                break;
            default:
                System.out.println("Not a valid input.");
                break;

        }

        new_balance = (new_balance + credit - debit);

        //Update available balance after current Transaction process
        balance = balance + new_balance;
        if (balance < 0) {
            System.out.println("Insufficient Balance. Please credit some amount.");
        }
        // reset the variable for the next loop
        new_balance = 0;

    }

    //Method to display Account Summary
    public void displayAccSummary(){
        System.out.println("Account No.: "+accNo+", Transaction NO.: "+TransactionNo+", Last Debit: "+debit+", Last Credit: "+credit+", Available Balance: "+balance+", Date & Time: "+getdate());
    }

}
