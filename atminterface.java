package progran;

import java.util.Scanner;
public class atminterface
{
    public static void main(String args[] )
      { 
        int balance = 5000,withdraw=0,deposit=0;;
	
        Scanner scanner = new Scanner(System.in);
        while(true)
          {
            System.out.println("Welcome to ATM");
            System.out.println("Press 1 for Withdraw cash");
            System.out.println("Press 2 for Deposit cash");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for EXIT");
           
            int n = scanner.nextInt();
            switch(n)
             {
                case 1:
                System.out.print("Enter Amount to be withdrawn:");
                withdraw = scanner.nextInt();
		System.out.println("Please Wait Your Transaction in Process");
                if(balance >= withdraw)
                  {
                    balance = balance - withdraw;
                    System.out.println("Please collect your Cash");
                  }
                else
                  {
                    System.out.println("Insufficient Balance in your account");
                  }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter Amount to be deposited:");
                deposit = scanner.nextInt();
                balance = balance + deposit;
                System.out.println("Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
             }
          }
      }
}