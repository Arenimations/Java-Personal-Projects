import java.util.*;
public class Triangle {

	Scanner keyboard = new Scanner(System.in);
	//data fields
	
	
	
	double side1, side2, side3;
	//methods
	
	public void input()
	{
		
		System.out.println("Please enter the value for side 1: ");
		side1 = keyboard.nextDouble();
		
		System.out.println("Please enter the value for side 2: ");
		side2 = keyboard.nextDouble();
		
		System.out.println("Please enter the value for side 3: ");
		side3 = keyboard.nextDouble();
		
		keyboard.close();
		
		if((side1 + side2 < side3) || (side2 + side3 < side1))
		{
			System.exit(0);
		}
	}

	
	public double perimeter()
	{
		double perimeter;
		perimeter = side1 + side2 + side3;
		return perimeter;
		
	}

	
	public boolean isEquilateral()
	{
		if (side1 == side2 && side2 == side3)
		{
			return true;
		}
		else
			return false;
		
	}
	
	
	public double area()
	{
		double S = (side1 + side2 + side3) / 2;
		double Area = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
		return Area;
		
	}
	
	
	public void output()
	{
		System.out.println("The three sides that you entered are: " + side1 + ", " + side2 + " and " + side3);
		System.out.println("The perimeter of the triangle is: " + perimeter());
		System.out.println("Is the triangle an equilateral: " + isEquilateral());
		System.out.printf("The area of the triangle is: %.2f", area());
	}
	
	
	
	
}
