package Automation.Indiabonds;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5]; // declare array and allocate memory

		a[0] = 11;   // initialize values into array
		a[1] = 22;
		a[2] = 33;
		a[3] = 44;
		a[4] = 55;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]); //retrieve values present in array

		}

	}
}
