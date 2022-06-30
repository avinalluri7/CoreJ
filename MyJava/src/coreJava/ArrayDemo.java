package coreJava;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int Num[] = new int[3];
				Num[0] = 3;
				Num[1] = 4;
				Num[2] = 5;
				
				for(int a:Num) {
					
					System.out.println(a);
					
				}
				
				// we can also declare as int Num[] = {1,2,3,4};
				
				
				int d[][] = {{1,2,3},{4,5,6,7},{7,8,9,11,22}};// jagged array
				
				// normal for loop
				for(int i=0;i<d.length;i++) {
					for(int j=0;j<d[i].length;j++) {
						
					System.out.print(" "+d[i][j]);
					}
					
					System.out.println();
				}
				
				
				// enhanced for loop
				for(int ar[]:d) {
					for(int l : ar) {
						System.out.print(" "+l);
					}
					
					System.out.println();
				}
				
				 

	}

}
