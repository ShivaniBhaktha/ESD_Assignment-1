/*Implement a JAVA program to find the square of the number.*/

import java.util.Scanner;

class FourSquare
{

	public static void main(String[] args) 
	{
		
		int number;
		double square;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		number = sc.nextInt();

		square=Math.pow(number, 2);

		System.out.println("square of "+number+" is: "+square);


	}
}