interface detailsinfo{
	 String display(String s);
	public int count();
}

class Person implements detailsinfo{
	static int maxcount=0;
	String name;
	public String display(String name){
		this.name=name;
		return this.name;
		
	}
	 public int count() {
		maxcount=this.name.length();
		return  maxcount;
	}
}
public class Q8 extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		System.out.println(p1.display("Dheeraj"));
		System.out.println(p1.count());
	}

}
