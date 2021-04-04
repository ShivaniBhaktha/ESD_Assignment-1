/*Implement a JAVA program to multiply two numbers using recursive multiplication*/

import java.util.Scanner;
class Q15_RecursiveMulti{
	static int multiply(int num1, int num2){
		    if(num1<num2){
				return multiply(num2,num1);
				}else if(num2!=0){
					return (num1+multiply(num1,num2-1));
					}
					else{
						return 0;
						}
		
	}
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'num1'");
		int num1 = num.nextInt();
		System.out.println("Enter 'num2'");
		int num2 = num.nextInt();
		int mul = multiply(num1,num2);
		System.out.println(" The product is: "+mul);
	}
	
}