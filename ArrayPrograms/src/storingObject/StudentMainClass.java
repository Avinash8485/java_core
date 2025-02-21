package storingObject;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1= new Student("avinash",90);
		Student s2= new Student("yaswanth",95);
		Student s3= new Student("gowtham",99);

		Student[] s = new Student[3];

		s[0] = s1;
		s[1] = s2;
		s[2] = s3;


		for(int i=0;i<s.length;i++) {
			System.out.println("name :"+s[i].name + "  marks: "+s[i].marks);
		}

	}

}
