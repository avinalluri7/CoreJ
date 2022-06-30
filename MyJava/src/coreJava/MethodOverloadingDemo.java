package coreJava;



class Casio{
	
	public Casio(int i) {
		
		int j;
		int k;
		
	}
	
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	
	public void add(int i, int j,int k) {
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j) {
		System.out.println(i+j);
	}
	
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Casio c = new Casio(6);
		c.add(1, 3);
		c.add(2.4,5.6);
		c.add(1, 2,3);
		
		

	}

}
