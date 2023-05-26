package Automation.Indiabonds;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= new int [2][3];
		
            a[0][0]=00;                              // 00 11 22
            a[0][1]=11;                              // 33 44 55
            a[0][2]=22;
            a[1][0]=33;
            a[1][1]=44;
            a[1][2]=55;
		

            System.out.println("The 2D array is: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }}}