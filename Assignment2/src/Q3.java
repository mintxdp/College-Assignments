class student{
String name;
int roll;
double dsa_marks;

public void getdata(String nm,int rl,double dm) {
	name=nm;
	roll=rl;dsa_marks=dm;
}
public void showdata() {
	System.out.println("Name= "+(name));
	System.out.println("Roll= "+(roll));
	System.out.println("Dsa_Marks= "+(dsa_marks));
	System.out.println();
}

}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student();
		student s2= new student();
		student s3 = new student();
		student s4= new student();
		student s5 = new student();
		s1.getdata("Ram", 1, 55);
		s2.getdata("Mohan", 2, 56);
		s3.getdata("Meenakshi", 3, 57);
		s4.getdata("Rohan", 4, 58);
		s5.getdata("Bulbul", 5, 59);
	
	s1.showdata();s2.showdata();s3.showdata();s4.showdata();s5.showdata();
	
	double arr[] = new double[5];
	arr[0]=s1.dsa_marks;arr[1]=s2.dsa_marks;arr[2]=s3.dsa_marks;arr[3]=s4.dsa_marks;arr[4]=s5.dsa_marks;
     double tmax= arr[0];
		for(int i=1;i<5;i++) {
			if(arr[i]>arr[i-1])
				tmax=arr[i];
		}
		System.out.println("Maximum marks is scored is :"+tmax );
	}

}
