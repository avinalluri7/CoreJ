 package coreJava;
 
 
 
 class Cal{
	 
	 
	 public int add(int a , int b){
		 
		 return  a+b;
		 
	 }
	 
	 
 }
 
 class AdvCal extends Cal{
	 
	 
	 public int sub(int a , int b){
		 
		 
		 return a-b;
		 
	 }
	 
 }

public class InheritanceDemo {

	public static void main(String[] args) {
		
		AdvCal ob = new AdvCal();
		System.out.println(ob.add(4, 5));
		System.out.println(ob.sub(5, 3));

	}

}
