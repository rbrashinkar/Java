package programes;

import java.util.Scanner;

//TODO find Area of Triangle..
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter heigth: ");
		float h=sc.nextFloat();
		System.out.print("Enter b: ");
		float b = sc.nextFloat();
		double area=(h*b)/2;
		System.out.println("Area is: "+area);
		sc.close();

	}

}
