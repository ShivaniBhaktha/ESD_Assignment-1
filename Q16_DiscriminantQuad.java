/* Find the discriminant, for the quadratic equations. */

class Q16_DiscriminantQuad{
	public static void main(String[] args) {

    // value a, b, and c
    double a = -4, b = -7, c = 12;
    

    // calculate the discriminant  (b2 - 4ac)
    double discriminant  = b * b - 4 * a * c;
	System.out.println("The Discriminant  is: "+discriminant );
}
}