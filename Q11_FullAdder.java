/*11. Implement a JAVA program to implement a Full adder using Bitwise operator*/

class Q11_FullAdder{
	public static void main(String args[]){
		int first = 1;
		int second = 1;
		int carry_in = 1;
		int sum = first ^ second ^ carry_in;
		int carry_out = (first & second) | (second & carry_in) | (carry_in & first);
		System.out.println("sum is "+sum);
		System.out.println("cout is "+carry_out);
	}
}