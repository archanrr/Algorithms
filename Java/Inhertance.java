enum EngineType{
	PETROL,DIESEL,EV;
}
class Vehicle{
	int id;
	EngineType E;
	final int speed = 0;
	Vehicle(){
		System.out.println("vEHICLE CALLED");
	}
	void accelarate() {
		System.out.println("Applied Accelerate");
	}
	void brake() {
		System.out.println("Applied break");
	}
	void vehicleDetails() {
		System.out.println("Vehicle id"+id);
		System.out.println("Vehicle Engine Type"+E);
		System.out.println("Vehicle speed"+speed);
	}
}
class tesla extends Vehicle{
	String model;
	tesla(){
		System.out.println("Tesla CALLED");
	}
	
}
public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tesla v = new tesla();

	}

}
