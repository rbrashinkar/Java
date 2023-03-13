package programes;
class EmployeeRoom
{
	int wall;
	int door;
	void info(int w,int d)
	{
		wall=w;
		door=d;
		System.out.println("No fo Wall="+wall);
		System.out.println("No of Door="+door);
		
	}
}

public class Practice2 {

	public static void main(String[] args) {
		int s=4;
		int s2=1;
		EmployeeRoom nEmployeeRoom=new EmployeeRoom();
		nEmployeeRoom.info(s, s2);
	}

}
