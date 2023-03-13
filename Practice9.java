package programes;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter heigth: ");
		int h=scanner.nextInt();
		System.out.print("Enter width: ");
		int w=scanner.nextInt();
		double area=h*w;
		System.out.println("Area of Rectangle: "+area);
       scanner.close();
	}

}
