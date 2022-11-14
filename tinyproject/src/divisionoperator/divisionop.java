package divisionoperator;

import java.util.Scanner;

public class divisionop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator: ");
		double n1=sc.nextDouble();
		System.out.println("Enter denominator: ");
		double n2=sc.nextDouble();
		double div=n1/n2;
		if(n1==0 || n2==0) {
			System.out.println("Hint: Don't enter zero as Numerator OR Denominator");
			return;
		}
		System.out.println("div "+div);
	}
}
