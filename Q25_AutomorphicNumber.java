/*Implement a Java program check whether a number is an Automorphic number or not.*/

import java.util.Scanner;

class Q25_AutomorphicNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double number = num.nextDouble();
		double temp = number;
		double sqNum = number * number;
		double mask = 1;
		double lastDigits;
		int length = String.valueOf(number).length();
		
		int i;
		for( i = 0; i < length - 2 ; i++){
			mask = mask * 10;
		}		
		lastDigits = sqNum % mask;
		if(temp == lastDigits){
			System.out.println("Number is automorphic");
		}
		else
		{
			System.out.println("Number is not automorphic");
		}
	}
}