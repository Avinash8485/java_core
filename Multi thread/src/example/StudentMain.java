package example;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("Thread New");
		s.setPriority(9);
		s.start();

	}

}
