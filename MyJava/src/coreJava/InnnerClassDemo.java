package coreJava;



class Outer{
	
	
	



	public void show() {
		System.out.println("avi");
	}
	
	
	
	class Inner{
		
		
		public void display() {
			
			System.out.println("my name is avi");
		}
	}
	
}

public class InnnerClassDemo {

	public static void main(String[] args){
		 
		
		Outer obj = new Outer();
		
		Outer.Inner obj1 = obj.new Inner();
		
		obj.show();
		obj1.display();

	}

}
