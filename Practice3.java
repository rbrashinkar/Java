package programes;
class EmployeeStudent
{
	int rollno;
	String name;
	void info(int n,String n1)
	{
		rollno=n;
		name=n1;
		System.out.println("RollNo ="+rollno);
		System.out.println("Name ="+name);
		
	}
	
}
public class Practice3 {

	public static void main(String[] args) {
		
      EmployeeStudent d=new EmployeeStudent();
      d.info(101, "Rohini");
	}

}
