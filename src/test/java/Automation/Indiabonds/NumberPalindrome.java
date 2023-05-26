package Automation.Indiabonds;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 121;

		int rev = 0;

		int Z = number;

		while (number > 0) {

			rev = (rev*10) + number % 10;        //  0+ 1       10+2     120+1                             
			number = number / 10;                   

		}

		
		if(rev==Z)
		{
			
			System.out.println("number is palindrome");
		}
	}

}
