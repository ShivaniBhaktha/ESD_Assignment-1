/* Implement a Java program to check two numbers are Amicable numbers or not.*/

import java.util.Scanner;

class Q27_AmicableNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number1 = num.nextInt();
		System.out.println("Enter the number: ");
		int number2 = num.nextInt();
		int i, sum1 = 0, sum2 = 0;
		for( i = 1; i < number1; i++){
			if((number1 % i) == 0){
				sum1= sum1 + i;
			}
		}
		for( i = 1; i < number2; i++){
			if((number2 % i) == 0){
				sum2 = sum2 + i;
			}
		}
		if(( sum1 == number2) && (sum2 == number1)){
			System.out.println("Amicable numbers");
		}
		else{
			System.out.println("Not Amicable numbers");
		}
		
	}
}