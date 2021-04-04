/*Implement a JAVA program to find the GCF  and LCM of given numbers. input through command line*/

public class Q7_GCFAndLCM{
	public static void main(String[] args) {

		int num1 = 32, num2 = 230, gcf = 1;

		for(int i = 1; i <= num1 && i <= num2; i++) {
      
		if(num1 % i == 0 && num2 % i == 0)
			gcf = i;
    }
	
	System.out.printf("The GCF of %d and %d is %d.", num1, num2, gcf);
	System.out.println("\n");
    int lcm = (num1 * num2) / gcf;
    System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
	System.out.println("\n");
  }
}