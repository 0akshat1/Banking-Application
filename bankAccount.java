import java.util.Scanner;
public class bankAccount {


    //variables are
    int balance;
    int previousTransaction;
    String CustomerName;
    String CustomerId;

    bankAccount(String cname ){
       CustomerName = cname;
       
    }


    String randomID(int length){
        String setID = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char [length]; //char type array
        for(int i=0;i<length;i++){
       int rand =   (int) (Math.random()*setID.length()); //casting String setpass into int and using random fucntion
       password[i] = setID.charAt(rand);
        }
        return new String (password);
    }


    void deposit (int amount ){
        if(amount !=0){
          balance+=amount;
          previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount!=0){
            balance -= amount;
            previousTransaction = amount;
        }
    }
    
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        }else if(previousTransaction<0){
            System.out.println("withdrawn: "+Math.abs(previousTransaction));
        }else{
            System.out.println("Sorry No Transaction occured");
        }
    }

    void showMenu (){
     char option ;
     Scanner sc = new Scanner(System.in);
     System.out.println("\n");
     System.out.println("Welcome "+CustomerName);
     System.out.println("\n");
//call a method that genrate a random password to return password
CustomerId = randomID(6);
System.out.println("Your Customer ID is: "+CustomerId);
     System.out.println("\n");
     System.out.println("Please Select an option");
     System.out.println("A. check Balance");
     System.out.println("B. Deposit");
     System.out.println("C. Withdraw");
     System.out.println("D. Previous Transaction");
     System.out.println("E. Exit");

     do{
        System.out.println("**********************************************************************************************************************************************************************************************************");
        System.out.println("Enter an option");
        System.out.println("**********************************************************************************************************************************************************************************************************");
        option = sc.next().charAt(0);
        System.out.println("\n");
        switch(option){
            case 'A':
            System.out.println("____________________________________________________________");
            System.out.println("Balance = "+balance);
            System.out.println("____________________________________________________________");
            break;
        
        case 'B':
            System.out.println("____________________________________________________________");
            System.out.println("Enter an Amount to Deposit");
            System.out.println("____________________________________________________________");
            int amount = sc.nextInt();
            deposit(amount);
            System.out.println("\n");
            System.out.println("YOUR AMOUNT HAS BEEN DEPOSITED");
            break;

            case 'C':
            System.out.println("____________________________________________________________");
            System.out.println("Enter an Amount to Withdraw");
            System.out.println("____________________________________________________________");
            int amount2 = sc.nextInt();
            withdraw(amount2);
            System.out.println("\n");
            System.out.println("YOUR AMOUNT HAS BEEN WITHDRAWN SUCCESSFULLY");
            break;

            case 'D':
            System.out.println("____________________________________________________________");
            getPreviousTransaction();
            System.out.println("____________________________________________________________");
            break;

            default:
            System.out.println("Invalid Option!! Please enter again");
            break;
        }
     }while(option != 'E');
     System.out.println("Thank you for using out Services");
     sc.close();
    }
}
