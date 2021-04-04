/* Implement a program to check if a number is Mersenne number or not.*/

import java.lang.Math;
import java.util.Scanner;


class Q33_MersenneNumber{
	
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		//number = 255;
		double temp = Math.log(number + 1)/Math.log(2);
		//System.out.println(temp);
		if( temp == (int) temp ){
			System.out.println("Mersenne number");
		}else{
			System.out.println("Not a Mersenne number");
		}
	}
}