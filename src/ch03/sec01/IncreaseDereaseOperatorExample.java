package ch03.sec01;

public class IncreaseDereaseOperatorExample {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		int z;
		
		x++; // 11
		++x; // 12
		
		System.out.println("x=" + x);
		System.out.println("-----------------");
		
		y--;
		--y;
		
		System.out.println("y=" + y);
		System.out.println("-----------------");
		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-----------------");
		
		z = ++x; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-----------------");
		
		z = ++x + y++; // 23 = 15 + 8
		System.out.println("z=" + z); // 23 
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
		
	}

}
