package programes;
class EmployeeLaptop
{
	String processor;
	String os;
	void info(String n1,String n2)
	{
		processor=n1;
		os=n2;
		System.out.println("Processor="+processor);
		System.out.println("Operating System="+os);
	}
}

public class Practice4 {

	public static void main(String[] args) {
		EmployeeLaptop n=new EmployeeLaptop();
		n.info("Intel", "Linux");
	}

}
