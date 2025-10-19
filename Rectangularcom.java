class Rectcom{
	public static void main(String[] abc){
		String Width= abc[0];
		String height = abc[1];
		double width= Double.parseDouble(Width);
		double Height = Double.parseDouble(height);

	double area = width*Height;
	double perimeter = 2*(width+Height);

		System.out.println("Width " + " = "+width);
		System.out.println("Height " + " = "+Height);
		System.out.printf("Area = %.2f\n",area);
		System.out.printf("Perimeter = %.2f\n",perimeter);
		

}	

}


	
