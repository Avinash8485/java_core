package sortpackage;

public class Pen implements Comparable<Pen>{

	int cost;  //Integer cost;
	Pen(int cost){
		this.cost=cost;
	}
	
	@Override	
	public String toString() {
		return "Cost : "+cost;
	}
	
	@Override
	public int compareTo(Pen p) {
		
		//this.cost.compareTo(p.cost); without using (-) operator
		return this.cost - p.cost;// return p.cost-this.cost;
	}
	
}
