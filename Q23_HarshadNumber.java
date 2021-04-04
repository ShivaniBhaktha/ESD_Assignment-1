/*Implement a Java program to check whether a number is a Harshad Number or not.*/

import java.util.Scanner;

class Q23_HarshadNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		int temp = number;
		int sum = 0;
		int digit;
		while(number > 0){
			digit = number % 10;
			number = number / 10;
			sum = sum + digit;
		}
		if((temp % sum) == 0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("Not a Harshad number");
		}
	}
}