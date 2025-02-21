package defaultsorting;

public class Student implements Comparable<Student>{
	int age ;

	Student(int age) {

		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Age : "+age;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.age-s.age;  
	}
}

//This -> current object to be inserted
//s -> already existing object
//for descending s.age-this.age
//for ascending this.age - s.age

