import java.util.Scanner;
class Commission{
	
	double sales;
	Commission(double x){
		this.sales= x;
	}
	public double getCommission() {
	 if(sales<500)
			return ((2/100)*sales);
	
	else if(sales>=500&&sales<5000)
		return (5/100)*sales;
	else
 return (8/100)*sales;		
}
}
class Demo extends Commission{

	Demo(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	double sales=sc.nextDouble();
		Demo d1=new Demo(sales) ;
		d1.getCommission()	;
		System.out.println(d1.getCommission());
		
		
	}

}
