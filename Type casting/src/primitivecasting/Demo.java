package primitivecasting;

public class Demo {

	public static void main(String[] args) {
		// Widening ---> converting small data to dig data (implicitly)
		
		int x = 100;
		double y = x;
		System.out.println(y+"  "+x);
		
		char a = 'Z';
		int b = a;
		System.out.println(b+" "+a);
		
		System.out.println("============================================");
		// Narrowing ---> converting big data into small data (explicitly)
		
		double c  = 10.45;
		int d = (int) c;
		System.out.println(d+" "+c);
		
		int e =68;
		char f = (char) e;
		System.out.println(f+" "+e);
		
		System.out.println("============================================");
		
		System.out.println((int)647.839);
		System.out.println((char)84);
		
		
		
		

	}

}
