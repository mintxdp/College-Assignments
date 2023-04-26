class person{
	String name;
	int age;
	person(String nm,int ag){
		name = nm;
		age=ag;
	
	}
}
class employee extends person{
int eid;
double salary;
	employee(String nm, int ag,int ed,double sal) {
		super(nm, ag);
		// TODO Auto-generated constructor stub
		eid=ed;
		salary = sal;
	}
	public void empDisplay() {
		System.out.println("Name : "+name);
		System.out.println("Age : "  +age);
		System.out.println("Eid : "+eid);
		System.out.println("salary : "+salary);
		System.out.println();
	}
	
		
	
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details :");

		employee e1= new employee("Subham",28,12,5000);
		e1.empDisplay();
		
		
	}

}
