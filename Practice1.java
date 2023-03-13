package programes;
class Employee
{
	String name;
	int salary;
	void info(String n1,int n2)
	{
		name=n1;
		salary=n2;
		System.out.println("Name of Employee="+name);
		System.out.println("Salary of Employee="+salary);
				
	}
}

public class Practice1 {

	public static void main(String[] args) {
		String namString="Rohini";
		int sal=4000;
		Employee lEmployee=new Employee();
		lEmployee.info(namString, sal);

	}

}
