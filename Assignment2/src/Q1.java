import java.util.Scanner;
class Phone{
	Scanner sc = new Scanner(System.in);
	int areacode,exchange,number;
	public void input(int areacode,int exchange,int number) {
		this.areacode=areacode;
		this.exchange=exchange;
		this.number=number;
	}
	public void display() {
		System.out.println("("+areacode+")"+" "+(exchange)+"-"+(number));
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //First object of class phone;
		Phone p1= new Phone();
        p1.areacode=223;
        p1.exchange=234;
        p1.number=1234;
         //Second object of class phone;
        Phone p2= new Phone();
        p2.input(224,235,1245);
        //display
        p1.display();
        p2.display();
	}

}
