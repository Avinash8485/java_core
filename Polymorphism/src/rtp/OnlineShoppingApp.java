package rtp;

class OnlineShoppingApp {
	void order() {
		System.out.println("Ordering");
	}

}

class Amazon extends OnlineShoppingApp{
	
	@Override
	void order() {
		System.out.println("Ordering Laptop from Amazon");
	}
}

class Myntra extends OnlineShoppingApp{
	
	@Override
	void order() {
		System.out.println("Ordering Shoes from Myntra");
	}
}

class Flipcart extends OnlineShoppingApp{
	
	@Override
	void order() {
		System.out.println("Ordering mobile from Flipcart");
	}
}


