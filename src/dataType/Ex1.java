package dataType;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Dollars :");
		double dollar=sc.nextDouble();
		double pound,french,german,japanese;
		pound=dollar/1.487;
		french=dollar/0.172;
		german=dollar/0.584;
		japanese=dollar/0.00955;
		
		System.out.println("British pound : " +pound);
		System.out.println("French : " +french);
		System.out.println("German : " +german);
		System.out.println("Japanese : " +japanese);
	}

}
