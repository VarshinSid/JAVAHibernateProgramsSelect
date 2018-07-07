package p1;

public class StudentApp {

	public static void main(String[] args) 
	{
		Student s = new Student();
		
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.select();
	}
}
