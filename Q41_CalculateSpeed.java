/* Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/

import java.util.Scanner;

class Q41_CalculateSpeed{
	public static void main(String args[]){
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the distance in meters: ");
		double distance = d.nextDouble();
		//distance = 400
		System.out.println("Enter the time in hours,minutes and seconds: ");
		Scanner time = new Scanner(System.in);
		int hour = time.nextInt();
		//hour = 1;
		int min = time.nextInt();
		// min = 34;
		int sec = time.nextInt();
		//sec = 50;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double mps = distance/ totalSec;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println("mps : "+mps+"  kmph : "+kmph+"  mph : "+mph); 
		
	}
}