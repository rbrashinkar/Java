package programes;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter num2");
		int num2 = scanner.nextInt();
		if(num1 > num2)
		{
			System.out.println("Grater no :"+num1);
		}
		else {
			System.out.println("Grater no :"+num2);
		}
		scanner.close();

	}

}
