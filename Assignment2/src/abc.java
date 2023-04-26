
import StudentDetails.Test;
import contain_Interface.Sports;
public class abc implements Sports  {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test();
		t1.input(45, 47);
		t1.output();
        Student s1= new Student();
      //error-line:  ((Object)s1).input("ram",5,"Maths");
        
       
		System.out.println("Student Details : ");
		
		System.out.println("Total Score is : "+(int)(score1+score2));
	    
		
	}

}