/*Implement a java program to find the memory size in bytes given the input as address length. */

import java.util.Scanner;

class Q48_MemorySize{
	public static void main(String args[]){
		Scanner ad = new Scanner(System.in);
		System.out.println("Enter the Start Address: ");
		int StartAddr = ad.nextInt();
		//StartAddr = 23788;
		System.out.println("Enter the End Address: ");
		int EndAddr = ad.nextInt();
		//EndAddr = 23898;
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}