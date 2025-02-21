package nonprimitivecasting;

class VechicleBikeMain {

	public static void main(String[] args) {
		
		//upcasting
		Vechicle v = new Bike();	// implicitly
		
		System.out.println(v.brand); //can access only super class members
		v.start();
		
		System.out.println("=======================================");
		
		//down casting
		Bike b = (Bike) v;		//explicitly
		System.out.println(b.brand+" "+b.fuel);	//can access both super class and sub class members
		b.drive();
		b.start();

	}

}
