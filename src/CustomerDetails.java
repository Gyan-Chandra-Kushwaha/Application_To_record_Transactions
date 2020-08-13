
import java.util.Scanner;
//Generating customer details.
public class CustomerDetails {

    // Define required variables to store customer information
    public String name, address, mobile, email, gender, accType, nationality, religion;

    Scanner sc1 = new Scanner(System.in); //Import scanner class for enabling user input
    public String accNo; //variable to generate account number

    //Function to display customer details
    public void displayCustomerDetails(){
        System.out.println("Name: "+name+", Account No.: "+accNo+", Address: "+address+", Mobile: "+mobile+", Email: "+email+", Gender: "+gender+", Account Type: "+accType+", Nationality: "+nationality+", Religion: "+religion);
    }

}

