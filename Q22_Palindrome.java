/* Check whether the number is a palindrome number or not.*/

import java.util.Scanner;

class Q22_Palindrome{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = num.nextInt();
		int temp = n;
		int digit, revNum = 0;
		while(temp > 0){
			digit = temp % 10;
			temp = temp / 10;
			revNum = (revNum * 10) + digit;
		}
		if(revNum == n){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	
	}
}