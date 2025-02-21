package generalization;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);			//a.add(new Integer(10))
		a.add("String");	//a.add(new String("String"))
		a.add(10.8);		//a.add(new Double(10.8))
		a.add(true);
		
		
		//Object x  =   new Integer(10)
		//Object x	=	new String("String")
		//Object x	=	new Double(10.8)
		
		
		for(Object x : a) {
			if(x instanceof Integer) {  //if(x instanceof Double)
				System.out.println(x);
			}
		}

	}

}
