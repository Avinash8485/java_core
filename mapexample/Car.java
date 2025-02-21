package mapexample;

public class Car {
String brand;

@Override
public String toString() {
	return "Brand : "+brand;
}

public Car(String brand) {
	super();
	this.brand = brand;
}

}
