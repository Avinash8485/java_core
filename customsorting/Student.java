package customsorting;

public class Student {
	@Override
	public String toString() {
		return "Student  name = " + name + ", age =" + age + "";
	}
	int age;
	String name;
	Student(int age, String name) {

		this.age = age;
		this.name = name;
	}

}
