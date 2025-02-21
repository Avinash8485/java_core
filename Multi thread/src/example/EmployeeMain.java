package example;

public class EmployeeMain {

	public static void main(String[] args) {
		

		Employee s = new Employee();
		
		s.setName("Thread Employee");
		s.setPriority(8);
		s.start();


	}

}
