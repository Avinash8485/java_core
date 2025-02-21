package defaultsorting;

public class Product implements Comparable<Product>{
	
	int productId;
	String productName;
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + productName + "]";
	}


	@Override
	public int compareTo(Product p) {
		
		return p.productName.compareTo(this.productName);
	}


	
	
	

}
