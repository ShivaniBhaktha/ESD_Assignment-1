/*Implement a Program in Java to check whether a number is a Keith Number or not*/

import java.util.Scanner;

class Q36_KeithNumber{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = num.nextInt();
		//number = 742;
		int temp = number;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int length = String.valueOf(number).length();
		//System.out.println(length);
		int sum = 0, i, j = 0; 
		for(i = 0; number > 0; i++){
			arr1[i] = number % 10;
			//System.out.println(arr1[i]);
			number = number / 10;
		}
		i--;
		while(i >= 0){
			arr2[j] = arr1[i];
			//System.out.println(arr2[j]);
			i--; j++;
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = arr2[j - i] + sum;
			}
			j++;
			arr2[j] = sum;
			
			if(sum == temp){
				System.out.println("Keith number");
				return;
			}
		}
		System.out.println("Not a Keith number");

	}
}