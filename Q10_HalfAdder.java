/* Implement a JAVA program to implement a Half adder using Bitwise operator.*/


class Q10_HalfAdder{
	public static void main(String args[]){
		int first = 1;
		int second = 1;
		int sum = first ^ second;
		int cout = first & second;
		System.out.println("sum is : "+sum);
		System.out.println("carry is : "+cout);
	}
}