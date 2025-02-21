package MultiLevelInheritance;

public class MainClass {

	public static void main(String[] args) {
		Tom t = new Tom();
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.z);
		System.out.println(t.s);
		
		t.sleep();
		
		t.work();
		
		t.request();
		

	}

}
