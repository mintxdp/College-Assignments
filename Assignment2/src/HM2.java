class Book{
	String BName,BEdition;
	double BPrice;
	Book(String BName,double BPrice,String BEdition){
		this.BName=BName;
		this.BEdition=BEdition;
		this.BPrice=BPrice;
		
	}
	void Display() {
		System.out.println("Book Name : "+BName);
		System.out.println("Book Edition : "+BEdition);
		System.out.println("Book Price : "+BPrice);
		System.out.println("");
		
	}
	
}
public class HM2 {

	public static void main(String[] args) {
		System.out.println("BOOK DETAILS :"+"\n");
		// TODO Auto-generated method stub

		Book b1= new Book("BOOK1",500,"FIRST");
		Book b2= new Book("BOOK2",722.45,"SECOND");
		Book b3=new Book("BOOK3",134.32,"THIRD");
		Book b4= new Book("BOOK4",167.00,"FIRST");
		Book b5=new Book("BOOK5",432,"SEVENTH");
		b1.Display();b2.Display();b3.Display();b4.Display();b5.Display();
		
		
	}

}
