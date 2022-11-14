package fibonacci;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
	//n	//1 2 3 4 5 6 7 8  9  10 11
		//0 1 1 2 3 5 8 13 21 34 55
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<n;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
}
}
