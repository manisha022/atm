package foododering;

import java.util.Scanner;

public class Menu 
{
public double subtotal;
public static double runningTotal;
static boolean order=true;
private static double itemPrice;
static Scanner input=new Scanner(System.in);

public static void menu()
{
	System.out.println("Welcome \n1. Burger (50Rs) \n2. Fries (42Rs) \n3. Pizza (199Rs) \n4. Soda (30Rs) \n5. Done");
}
public static double itemPrice(int foodItem)
{
	if(foodItem==1) 
	{
		System.out.println("You have order Burger");
		itemPrice=50.00;
	}
	if(foodItem==2) 
	{
		System.out.println("You have order Fries");
		itemPrice=42.00;
	}
	if(foodItem==3) 
	{
		System.out.println("You have order Pizza");
		itemPrice=199.00;
	}
	if(foodItem==4) 
	{
		System.out.println("You have order Soda");
		itemPrice=30.00;
	}
	quantity();
	return itemPrice;
}
public static double quantity() 
{
	System.out.println("Enter Quantity");
	double quantity=input.nextDouble();
	subtotal(quantity,itemPrice);//method for return item price and quantity addition
	return quantity;
}
public static double subtotal(double quantity,double itemPrice) 
{
	double subtotal=quantity*itemPrice;
	System.out.println("Subtotal :"+subtotal);
	return subtotal;
}
public static void done(double runningTotal) 
{
	order=false;
	System.out.println(runningTotal);
	System.out.println("Enjoy your meal");
}

	public static void main(String[] args) {
		int menuOption;
		int foodItem=0;
		input=new Scanner(System.in);
		double runningTotal=0;
		do {
			menu();
			menuOption=input.nextInt();//take from user
			switch(menuOption) 
			{
			case 1:
				foodItem=1;
				runningTotal+=itemPrice(foodItem);
				break;
			case 2:
				foodItem=2;
				runningTotal+=itemPrice(foodItem);
				break;
			case 3:
				foodItem=3;
				runningTotal+=itemPrice(foodItem);
				break;
			case 4:
				foodItem=4;
				runningTotal+=itemPrice(foodItem);
				break;
			case 5:
				done(runningTotal);
				break;
			default: System.out.println("Invalid option");
			}
		}while(order);
		System.out.println("Total amount :"+runningTotal);
}
}
