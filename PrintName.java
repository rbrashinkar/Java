package programes;

public class PrintName {

	public static void main(String[] args) {
		String nameString="Rohini";
		int j=0;
		int k=0;
		
		//by using for loop
		System.out.println("Using for loop");
		for(int i=0;i<20;i++)
		{
			System.out.println(nameString);
			//System.out.println(i);
		}
		
		
		System.out.println("Using Do while loop");
		do {
			
			System.out.println(nameString);
			j++;
		} while ( j<20);
		System.out.println("Using  while loop");
		while (k<20) {
			
			System.out.println(nameString);
			k++;
		}
	}

}
