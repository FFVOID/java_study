package ch02.sec01;

public class VariableChangeExample {

	public static void main(String[] args) {
		int x = 3; // 00000000 00000000 00000000 00000011
 		int y = 5; // 00000000 00000000 00000000 00000101
 		
 		//short x1 = 3; // 00000000 00000011
 		//short x2 = 5; // 00000000 00000101
 		
 		int temp = x; //3
 		x = y; // x =5
 		y = temp; //y =3 
 		
 		System.out.println(x + "," + y);
 		
 		

	}

}
