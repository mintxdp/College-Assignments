class product{
	int pid;
	double price;
	static double tot_price;
	product(int a,double b){
		pid =a;price =b;
	}
	public void display() {
		System.out.println("Product id :"+pid);
		System.out.println("Price :"+price);
		System.out.println();
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  product p1= new product(1234,55);
  product p2 = new product(1235,94);
  product p3= new product(1236,23);
  product p4 = new product(1237,167);
  product p5= new product(1238,34);
p1.display();p2.display();p3.display();p4.display();p5.display();
  double t_price= p1.price+p2.price+p3.price+p4.price+p5.price;
  System.out.println("Total price : "+t_price);
   
  
		
	}

}
