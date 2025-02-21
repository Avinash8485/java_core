package vectorExample;
import java.util.*;
public class VectorMianClass {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(19);
		v.add(45);
		
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("=============");
		
		for(int i:v) {
			System.out.println(i);
		}
	}

}
