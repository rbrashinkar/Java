package programes;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 1, sum = 0; 
		System.out.print("Enter num: ");
		int num = scanner.nextInt();
		//executes until the condition returns true  
		while(i <= num)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}  
		//prints the sum   
		System.out.println("Sum of First 100 Natural Numbers is = " + sum);
		scanner.close();

	}

}
