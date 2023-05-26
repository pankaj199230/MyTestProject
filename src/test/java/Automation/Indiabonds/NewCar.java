package Automation.Indiabonds;

public class NewCar extends OldCar{

	public void Gear() {

		System.out.println("Gear of New Car");

	}

	public static void main(String[] args) {

		
		NewCar n = new NewCar();
		n.UI();
		System.out.println(n.colour);
		n.Brakes();
		
		
	}

}
