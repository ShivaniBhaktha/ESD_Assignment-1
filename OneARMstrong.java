/*Implement JAVA program to check whether a given number is ARMSTRONG or not.*/
class OneARMstrong
{
	public static void main (String  args[])
	{
		int num =153;

		int rem, result =0;
		int initial = num;
		while(num !=0)
		{
			rem = num % 10;
            result += rem*rem*rem;
            num /= 10;
		}

		if(result == initial)
		{
			System.out.println(initial +" is an ARMstrong num");
		}
		else
		{
			System.out.println(initial +" is not an ARMstrong num");
		}
	}
}
