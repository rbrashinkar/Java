package programes;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter N1: ");
		int N1 = scanner.nextInt();
		System.out.print("Enter N2: ");
		int N2 = scanner.nextInt();
		System.out.print("Enter N3: ");
		int N3 = scanner.nextInt();
		
		 if(N1 > N2 && N1 >N3)
		 {
			 System.out.println("Greatest Number is: "+N1);
		 }
		 else if(N1 <N2 && N2 > N3)
		 {
			 System.out.println("Greatest Number is: "+N2);
		 }
		 else {
			 System.out.println("Greatest Number is: "+N3);
		}
      scanner.close();
	}

}
