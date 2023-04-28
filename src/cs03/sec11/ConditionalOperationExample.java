package cs03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {

		char ch = '0';
	      boolean b =  ('a'<=ch&&ch<='z')||(ch<='A'&&ch<='Z')||(ch>='0'&&ch<='9');   
	      System.out.println(b);

	}

}
