/*Implement a JAVA program to find the max and min of given two numbers.*/
/*input through command line arg*/

import java.util.Scanner;
class Q13_MaxAndMin{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Enter 'num1'");
		int num1 = num.nextInt();
		System.out.println("Enter 'num2'");
		int num2 = num.nextInt();
		System.out.println("\n");
		
		if(num1>num2){
			System.out.println(num1+" is maximum" );
			System.out.println("\n");
		}
		else{
			System.out.println(num2+" is maximum");
			System.out.println("\n");
		}
		
		if(num1<num2){
			System.out.println(num1+" is minimum");
			System.out.println("\n");			
		}
		else{
			System.out.println(num2+ "is manimum");
			System.out.println("\n");
		}
	}
}