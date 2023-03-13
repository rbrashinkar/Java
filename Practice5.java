package programes;
class EmployeeSport
{
	String playername;
	String nameofSport;
	void info(String n,String nn)
	{
		playername=n;
		nameofSport=nn;
		System.out.println("Player Name= "+n);
		System.out.println("Name of Sport= "+nn);
	}
}

public class Practice5 {

	public static void main(String[] args) {
		EmployeeSport s=new EmployeeSport();
		s.info("Riyansh","Cricket");

	}

}
