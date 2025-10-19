# The-Simple-Questions-Pattern-Rectangular-Area-
The Simple Questions (Pattern, Rectangular Area)   This exercise covers two basic programming tasks:Pattern Printing: Learn to create simple shapes using loops.  Rectangular Area: Calculate the area and perimeter of a rectangle using user input. Area = width × height  Perimeter = 2 × (width + height) Language: Java

// This is the code for calculating the area of a rectangle.
class Rectcom{
	public static void main(String[] abc){
		String Width= abc[0];
		String height = abc[1];
		double width= Double.parseDouble(Width);
		double Height = Double.parseDouble(height);

	double area = width*Height;
	double perimeter = 2*(width+Height);

		System.out.println("Width " + " = "+width);
		System.out.println("Heght " + " = "+Height);
		System.out.printf("Area = %.2f\n",area);
		System.out.printf("Perimeter %.2f\n",perimeter);
		

}	

}

	
