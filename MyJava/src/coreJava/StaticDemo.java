package coreJava;


class Emp{
	
	
	int eid;
	int sal;
	static String ceo;
	
	
	static{               //when you load a class
		
		
		ceo = "larry";
		
	}
	
	public Emp() {      // when you create a object
		
		eid = 22;
		sal = 3000;
		
	}
	
	
	public void show(){
		
		System.out.println(sal+" "+ceo);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Emp navin = new Emp();
		Emp rakesh = new Emp();
		Emp raj = new Emp();
		
		
		//navin.sal = 3000;
		//rakesh.sal = 2000;
		//raj.sal = 1000;
		 
		//Emp.ceo = "avi";
		//rakesh.ceo = "avi";
		//Emp.ceo = "nag";
		
		
		
	navin.show();
	rakesh.show();
	raj.show();

	}

}
