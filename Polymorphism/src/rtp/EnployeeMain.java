package rtp;

public class EnployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Developer();
		e1.work();
		
		Employee e2 = new Tester();
		e2.work();
		
		display(new Developer());
		display(new Tester());
		

	}

	//display(new Developer()); -> Employee obj = new Developer(); -> obj.work();
	//display(new Tester()); -> Employee obj = new Tester(); -> obj.work();
	static void display(Employee obj) {
		
		if(obj instanceof Developer) {
			Developer d = (Developer) obj;
			d.work();
			
		}
		
		else if(obj instanceof Tester) {
			Tester t = (Tester) obj;
			t.work();
		}
		
	}

}
