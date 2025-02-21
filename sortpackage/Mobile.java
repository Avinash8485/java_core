package sortpackage;

public class Mobile {
	String brand;
	int cost;
	public Mobile(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "BRAND :"+brand+"  COST : "+cost;
	}
}
