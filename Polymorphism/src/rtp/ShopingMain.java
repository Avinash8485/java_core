package rtp;

public class ShopingMain {

	static void display(OnlineShoppingApp obj) {

		obj.order();
	}

	public static void main(String[] args) {
		
		// upcasting using method
		System.out.println(" upcasting using method : ");
		display(new Amazon());
		System.out.println("=====================");
		display(new Myntra());
		System.out.println("=====================");
		display(new Flipcart());
		
		System.out.println("--------------------------");
		
		//upcasting using single reference variable
		System.out.println(" upcasting using single reference variable : ");
		OnlineShoppingApp on ;
		on = new Amazon();
		on.order();
		System.out.println("=====================");
		on = new Myntra();
		on.order();
		System.out.println("=====================");
		on = new Flipcart();
		on.order();
		
		System.out.println("--------------------------");
		
		//upcasting using seprate reference variable
		System.out.println(" upcasting using seprate reference variable : ");
		OnlineShoppingApp on1= new Amazon();
		on1.order();
		System.out.println("=====================");
		OnlineShoppingApp on2 = new Myntra();
		on2.order();
		System.out.println("=====================");
		OnlineShoppingApp on3 = new Flipcart();
		on3.order();

	}

}
