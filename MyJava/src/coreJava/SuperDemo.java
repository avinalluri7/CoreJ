package coreJava;


class A
    {
	
	
	   public A()
	   {
		System.out.println("in a");
	   }
	
}


class B extends A
{
	public B()
	   {
		System.out.println("in b");
	   }
}

public class SuperDemo {

	public static void main(String[] args) {
		
		
		B obja = new B();
		
	

	}

}
