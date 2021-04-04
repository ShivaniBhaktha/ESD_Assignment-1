/* program to find the square root of a number input through command line*/
import java.util.Scanner;
import java.lang.Math;
class FiveRoot{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = obj.nextInt();
		System.out.println("The square of a number is "+(Math.pow(number,0.5)));
	}
}