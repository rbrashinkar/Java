package programes;

import java.util.Scanner;
//To find the Area of circle.......
public class Practice8 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius=sc.nextInt();
		double area;
		area=(radius*radius)*Math.PI;
		System.out.println("Area of Circle= "+area); 
        sc.close();
	}

}
