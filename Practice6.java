package programes;

public class Practice6 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		for(i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		for(i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		System.out.println("Total="+sum);
		System.out.println("Print Even Number till 100");
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			
		}
		System.out.println("Print Odd Number till 100");
		for(i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
			
		}
	}

}

