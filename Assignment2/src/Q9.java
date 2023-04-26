class Student{
	String name;
	int roll;
	String course;
	public void courses(String course1,String course2,String course3) {
		this.course=course1+course2+course3;
	}
	public void input_student(String name,int roll) {
		this.name=name;
		this.roll=roll;
		
	}
	public void display_student() {
	
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Course : "+course);
	}
}
//class2
class Exam extends Student{
	double tot_marks;
	public void inputmarks(double mark1, double mark2,double mark3) {
		this.tot_marks=mark1+mark2+mark3;
	}
	
	public void displayresult() {
		
		System.out.println("Total marks secured : "+tot_marks);
	}
}
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		Student s5= new Student();
		
		s1.input_student("Sohan", 1);
        s2.input_student("Mohan",2);
        s1.input_student("Shreya", 3);
        s2.input_student("Meenakshi",4);
        s1.input_student("Rohan", 5);
        s1.courses("phy", "math", "che");
        s2.courses("phy", "math", "che");
        s3.courses("phy", "math", "che");
        s4.courses("phy", "math", "che");
        s5.courses("phy", "math", "che");
        
	}

}
