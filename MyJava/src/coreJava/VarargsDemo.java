package coreJava;



class Calci {
	
	
	public int add(int...n) {
		
		int sum =0;
		for(int k : n) {
			sum = sum +k;
		}
		
		return sum;
		
	}
	
}

public class VarargsDemo {

	public static void main(String[] args) {
		Calci obj = new Calci();
		
		System.out.println(obj.add(3, 4,8));

	}

}
