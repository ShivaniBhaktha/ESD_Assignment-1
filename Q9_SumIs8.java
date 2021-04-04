/*Implement a JAVA program to find the number between 0 - 1000 where the sum is 8*/

class Q9_SumIs8{  
	public static void main(String args[]){ 
		for (int i=1; i<=1000; i++){
			int number=i;
			int sum=0;
			while(number!=0){
				int remainder=number%10;
				sum=sum+remainder;
				number=number/10;
			}
			if(sum==8)
			{
				System.out.print(i + " ");
			}
		}
	System.out.println("\n");	
	}
}