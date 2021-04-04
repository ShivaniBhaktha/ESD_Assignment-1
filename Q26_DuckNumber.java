/*Implement a Java program to check whether a number is a Duck Number or not*/

import java.util.Scanner;


class Q26_DuckNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		while(number > 0){
			if((number % 10 )== 0){
				System.out.println(" Number is a Duck Number");
				return;
			}
			else{
				number = number / 10;
			}
		} 
		System.out.println(" Number is not a Duck Number");
	}
}