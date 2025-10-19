
import java.util.Scanner;
class Rect{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
	System.out.print("Enter the Width: ");
		double width= sc.nextDouble();
	System.out.print("Enter the Height: ");
		double Height= sc.nextDouble();
	double area = width*Height;
	double perimeter = 2*(width+Height);

		System.out.println("Width " + " = "+width);
		System.out.println("Heght " + " = "+Height);
		System.out.println("Area " + " = "+area);
		System.out.println("Perimeter " + " = "+perimeter);

	}
}