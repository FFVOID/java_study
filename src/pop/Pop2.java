package pop;

public class Pop2 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 , 10 };
		int a = 0;
		
		
		
		for (int i = 0; i < array.length; i++) {
			if(a < array[i]) {
				a = array[i]; 
		} else {
			continue;
		}
				
		
			
	}
		System.out.println("최대값은:" + a);
		
	}
}
