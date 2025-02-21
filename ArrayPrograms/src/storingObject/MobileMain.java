package storingObject;

public class MobileMain {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("samsaung",111,60000);
		Mobile m2 = new Mobile("apple",222,100000);
		Mobile m3 = new Mobile("vivo",333,70000);
		
		Mobile[] m = new Mobile[3];
		m[0]=m1;
		m[1]=m2;
		m[2]=m3;
		for(int i=0;i<m.length;i++) {
			System.out.println("name :"+m[i].model + "  price: "+m[i].price+"   cost :  "+m[i].cost);
		}

	}

}
