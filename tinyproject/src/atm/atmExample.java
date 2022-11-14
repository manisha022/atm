package atm;

import java.util.Scanner;

public class atmExample {

	public static void main(String[] args) {
		//declare and initialize balance, withdraw, and deposit
		double withdraw,deposite,balance=100000d;
		//output from user
		Scanner input=new Scanner(System.in);
        while (true) {
			System.out.println("Auotomated Teller Machiene");
			System.out.println("1: Withdraw");
			System.out.println("2: Deposite");
			System.out.println("3: Check balance");
			System.out.println("4: Exit");
			System.out.println("Choose operation you want to perform: ");
			int choice=input.nextInt();
			switch(choice) 
			{
			case 1:System.out.println("Enter money to be withdraw");
			       withdraw=input.nextDouble();
	     //check whether the balance is greater than or equal to the withdrawal amount 
			       if(balance >=withdraw) 
			       {
			    	 //remove the withdrawl amount from the total balance
			    	   balance-=withdraw;
			    	   System.out.println("Please collect your money");
			       }
			       else {
			    	   //show custom error message
			    	   System.out.println("Insuficient Balance");
			       }
			       System.out.println("");
			       break;
			case 2:System.out.println("Enter money to be Deposite");
			       deposite=input.nextDouble();
			       //add deposite amount in balance
			       balance+=deposite;
			       System.out.println("Your money has been successfully deposite");
			       System.out.println("");
			       break;
			case 3:
				//displaying total balance
				System.out.println("balance :"+balance);
				System.out.println("");
		         break;
			case 4:
				//exit from menu
				System.exit(0);
				break;
			default:System.out.println("Invalid option");
			}
		}
	}

}
