package sortpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PenMainClass{
public static void main(String[] args) {
	Pen p1 = new Pen(20);
	Pen p2 = new Pen(40);
	Pen p3 = new Pen(30);
	
	ArrayList<Pen> a = new ArrayList<Pen>();
	a.add(p1);
	a.add(p2);
	a.add(p3);
	
	
	
	//Syntax : Collection.sort(List l);
	//Since list has Car objects,sort() compareTo() of car class
	//COllections.reverse(l); for descending order
	Collections.sort(a);
	
	for(Pen p : a) {
		System.out.println(p);
	}
}
}
