class Distance{
	double M,CM;
	
	//double distance; result=0; //error
	
	Distance(double M,double CM){
		this.M=M;
		this.CM=CM;
	}
	//distance=M+CM/100; result=0; //error part 

  double  display() {
		
		return M+CM/100;
		//RETURN distance; result=0; //error
	}
	
}
public class HM3  {
	static double sum(double a ,double b) {
		return a+b;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1=new Distance(100,45);
        Distance d2=new Distance(55,20);
        System.out.println("Distance "+d1.toString()+" = "+d1.display());//toString is a default method of object class.
        System.out.println("Distance "+d2.toString()+" = "+d2.display());
        System.out.println();
        System.out.println("Sum of the two distances is "+ sum(d1.display(),d2.display()));
	}

}
