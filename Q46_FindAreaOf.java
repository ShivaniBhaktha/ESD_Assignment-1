/* Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid e)rhombus f) triangle*/

class Q46_FindAreaOf{
	double circle(double radius){
		return radius*radius*Math.PI;
	}
	double triangle(double height, double base){
		return 0.2*height*base;
	}
	double square(double side){
		return side*side;
	}
	double rectangle(double length, double breadth){
		return length*breadth;
	}
	double rhombus(double base, double height){
		return base * height;
	}
	double trapezoid(double base1, double base2, double height){
		return ((base1 + base2)/2)*height;
	}
	
	
	public static void main(String args[]){
		Q46_FindAreaOf obj = new Q46_FindAreaOf();
		System.out.println("Area of Circle: "+obj.circle(2));
		System.out.println("Area of triangle: "+obj.triangle(2, 6));
		System.out.println("Area of square: "+obj.square(2));
		System.out.println("Area of rectangle: "+obj.rectangle(2, 3));
		System.out.println("Area of rhombus: "+obj.rhombus(2, 8));
		System.out.println("Area of trapezoid: "+obj.trapezoid(2, 2, 6));
	}
}