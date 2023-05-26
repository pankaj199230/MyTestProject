package Automation.Indiabonds;

public class MutlidimensionalArray1 {

	public static void main(String[] args) {

		int rows = 4;
		int columns = 4;

		int a[][] = new int[rows][columns];
		int value = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				a[i][j] = value;
				value++;
				System.out.print(a[i][j] + " ");

			}
			System.out.println();

		}
	}
}
