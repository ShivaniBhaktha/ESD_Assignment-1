/* Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9.*/
class ThreeASCIIValues{
	public static void main(String args[]){
		int ch = 'A';
		while(ch <= 'Z'){
			char character = (char)ch;
			System.out.println(character+" : "+ch);
			ch = ch + 1;
		}
		ch = '0';
		while(ch <= '9'){
			char character = (char)ch;
			System.out.println(character+" : "+ch);
			ch = ch + 1;
		}
		ch = 'a';
		while(ch <= 'z'){
			char character = (char)ch;
			System.out.println(character+" : "+ch);
			ch = ch + 1;
		}
	}
}