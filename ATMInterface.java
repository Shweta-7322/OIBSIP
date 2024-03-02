import java.util.Scanner;
public class ATMInterface { 
    private static final int MAX_TRANSACTIONS=100;
    private static String[] transactionHistory = new String[MAX_TRANSACTIONS];
    private static int transactionCount=0;  
    public static void main(String args[] )  
    {    
        int balance = 100000, withdraw, deposit;    
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine"); 
            System.out.println("Choose 1 to Check Transaction History");
            System.out.println("Choose 2 for Withdraw");  
            System.out.println("Choose 3 for Deposit");  
            System.out.println("Choose 4 for Check Balance");  
            System.out.println("Choose 5 for Quit");  
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt();  
        switch(choice)  
        {  
        case 1:
        System.out.println("Transaction History:");
        for(int i=0; i<transactionCount;i++)
        {
            System.out.println("transactionHistory[i]");
        }
        break;
    
        case 2:  
        System.out.print("Enter money to be withdrawn:");  
        withdraw = sc.nextInt();    
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
        case 3:  
        System.out.print("Enter money to be deposited:");   
        deposit = sc.nextInt();   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depo4sited");  
        System.out.println("");  
        break;  
   
        case 4:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
        case 5:  
        System.exit(0);  
      }  
    }  
}  

}
