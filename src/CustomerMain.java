import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        int custOption, custWill, LoopVar;
        Scanner sc = new Scanner(System.in);

        //Taking will of customer to continue the process
        System.out.println("Choose 1 for continue, other integers for quit): ");
        LoopVar = sc.nextInt();
        sc.nextLine();
        CustomerDetails customerInputs = new CustomerDetails();
        Transactions transactions = new Transactions();

        //Loop is for keeping all process in the memory for later retrieval since data is being saved only in memory
        while (LoopVar == 1) {

            //Taking customer option for different processes
            System.out.println("Do you want to add a new customer? (1 for yes, 2 for others processes): ");
            custOption = sc.nextInt();
            sc.nextLine(); // For absorbing /n, in order to move cursor to the next line

            //If is for adding the new customer
            if (custOption == 1) {
                System.out.println("Enter customer Name: ");
                customerInputs.name = sc.nextLine();
                System.out.println("Enter customer address: ");
                customerInputs.address = sc.nextLine();
                System.out.println("Enter customer email id: ");
                customerInputs.email = sc.nextLine();
                System.out.println("Enter customer gender: ");
                customerInputs.gender = sc.nextLine();
                System.out.println("Enter customer account type: ");
                customerInputs.accType = sc.nextLine();
                System.out.println("Enter customer nationality: ");
                customerInputs.nationality = sc.nextLine();
                System.out.println("Enter customer religion: ");
                customerInputs.religion = sc.nextLine();
                System.out.println("Enter customer mobile no.: ");
                customerInputs.mobile = sc.nextLine();
                customerInputs.accNo = "1234" + customerInputs.mobile;
                System.out.println("Customer added successfully.");
            }
            //For performing other tasks than adding a new customer
            else if (custOption == 2) {
                System.out.println("Please enter an Input, (1 for Customer Details, 2 for Transactions, 3 for Account Summary Details): ");
                custWill = sc.nextInt();
                transactions.accNo = customerInputs.accNo;
                switch (custWill) {
                    case 1: //For getting customer details
                        customerInputs.displayCustomerDetails();
                        break;
                    case 2: //For Credit and Debit
                        transactions.TransactionProcess();
                        break;
                    case 3: //For getting account summary
                        transactions.displayAccSummary();
                        break;
                    default: //For handling Wrong user inputs
                        System.out.println("Not a valid input.");
                        break;
                }
            }

            //For continuing the process
            System.out.println("Choose 1 for continue, other integers for quit): ");
            LoopVar = sc.nextInt();
            sc.nextLine();
        }
    }
}
