class Complex{
	double real;double imag;
	
	
	
	public void setData(double x, double y) {
		real=x;
		imag=y;
	}
	Complex(){
	double a=real;
	double b=imag;
	
		}
	public void Display() {
		System.out.println((int)real+"+"+"i"+(int)imag);
		
	}
	
	}

class Q2{
	
	public static void main(String[] args) {
		Complex c1= new Complex(); 
		Complex c2=new Complex();
		
		c1.setData(1,2);
        c2.setData(2,3);
		c1.Display();
		c2.Display();
		
	}
	
		
	}

