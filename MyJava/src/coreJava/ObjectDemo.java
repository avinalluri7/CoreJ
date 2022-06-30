package coreJava;

class Calc {
	
	
	int a;
	int b;
	int r ;
	
	void perform() {
		
		
		r = a+b;
	}
	
	public Calc() {
		
		a = 4;
		b = 7;
		
		System.out.println("hi");
	}
	
	
	public Calc(int k) {
		
		k=12;
		
		System.out.println("hello"+k);
	}
	

	public Calc(int k, int d , int y) {
		
		System.out.println("hello babu");
	
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Calc c = new Calc(6);
		
		c.a = 1;
		c.b= 2;
		c.perform();
		 
		System.out.println(c.r);
				
		
		
		
	
	}

}

