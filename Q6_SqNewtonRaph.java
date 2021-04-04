/*Implement a JAVA program to find the square using newton raphson method.*/

class Q6_SqNewtonRaph{

	static double squareRoot(double integer, double tolerance_level)  
    {  
        double x = integer;   
        double root;  
        int count = 0;  
      
        while (true) 
        {  
            count++;  
            root = 0.5 * (x + (integer / x));  
            if (Math.abs(root - x) < tolerance_level)  
                break;  
            x = root;  
        }  
      
        return root;  
    }  
       
    public static void main (String[] args)  
    {  
        double integer = 90;  
        double tolerance_level = 0.00001;  
      
        System.out.println(squareRoot(integer, tolerance_level));  
    }  
} 
