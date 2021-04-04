/*Implement a java program to count the repeated occurence of a digit in a n-digit number.*/

import java.util.Scanner;

class Q44_RepeatedOccurenceCount{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		//number = 4556835;
		System.out.println("Digit occurence to be checked: ");
		int checkDigit = num.nextInt();
		//checkDigit = 5;
		int count = 0;
		int digit;
		while(number > 0){
			digit = number % 10;
			if(checkDigit == digit){
				count++;
			}		
			number = number / 10;
		}
		System.out.println("Count the repeated occurence of "+checkDigit+" : "+count);
	}
}