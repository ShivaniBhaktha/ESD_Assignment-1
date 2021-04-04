/* Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/

import java.util.Scanner;

class Q24_PronicNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		int i;
		for( i = 1; i < number; i++){
			if((number % i) == 0){
				if((number % (i + 1))== 0){
					System.out.println("Number is pronic");
					return;
				}
			}
		}
		System.out.println("Number is not pronic");
	}
}