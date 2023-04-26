package StudentDetails;

public class Student extends Test {

	int roll;String name;String course;
	double mark;

	void input(String name,int roll,String course) {
	
		this.roll=roll;
		this.name=name;
		course="Maths";

		
		
	}
	public void output() {
		System.out.println("NAME : "+name);
		System.out.println("ROLL : "+roll);
		
		System.out.println("TOTAL MARKS : "+mark);
		
		
		
	}
	
}