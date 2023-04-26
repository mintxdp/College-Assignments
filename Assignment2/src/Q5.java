class Deposit{
	long Principal;
	int time;
	double rate;
	double Total_amt;
	Deposit(){  //0paratmeter
		
	}
	//second constructor
	Deposit(long Principal,int time,double rate){
		this.Principal=Principal;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long Principal,int time){
		this.Principal=Principal;
		this.time=time;
	}
	Deposit(long Principal,double rate){
this.Principal=Principal;
	this.rate=rate;
}
	public void display() {
		System.out.println("Principal : "+Principal);
		System.out.println("rate : "+rate);
		System.out.println("time : "+time);
		System.out.println("");
	}
	public void calc_amt() {
		Total_amt=Principal*rate*time/100;
		System.out.println("Total Amount : "+Total_amt);
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
