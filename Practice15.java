package programes;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num=153;
		System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      num1 = num1 * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + num1);
		

	}

}
