/*Implement a Java program to check a number is a cube or not.*/

import java.util.Scanner;
import java.lang.Math;
class Q29_Cube{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		int n = (int) Math.round(Math.pow(number, 1.0/3.0));
		if(number ==(n*n*n)){
			System.out.print("Number is a perfect cube");
		}
		else{
			System.out.print("Number is a not perfect cube");
		}
	}
}