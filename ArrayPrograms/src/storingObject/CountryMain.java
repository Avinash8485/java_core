package storingObject;

public class CountryMain {

	public static void main(String[] args) {
		Country c1 = new Country(140,"INDIA");
		Country c2 = new Country(35,"AMERICA");
		
		Country[] c = new Country[2];
		
		c[0]=c1;
		c[1]=c2;
		
		for(int i=0;i<c.length;i++) {
			System.out.println("population of "+c[i].name + " is "+c[i].population+" crores ");
		}


	}

}
