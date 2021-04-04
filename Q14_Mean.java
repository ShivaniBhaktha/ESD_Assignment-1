/*Implement a JAVA program to find the Mean of given 5 numbers.*/


import java.util.Arrays; 
  
public class Q14_Mean { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35 };
		float sum = 0;
		float mean;
		for(int i=0;i<intArr.length;i++){
			sum = sum+intArr[i];	
		}
		mean = sum/intArr.length;
		System.out.println(" Mean is:"+mean);
	}	
}  