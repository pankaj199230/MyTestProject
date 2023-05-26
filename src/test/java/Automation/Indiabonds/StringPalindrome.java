package Automation.Indiabonds;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="pankaj";
		String t="";		
		System.out.println(name.length());
		
		for (int i=name.length()-1; i>=0;i--)
		{
			
			System.out.println (name.charAt(i));
			t=t+name.charAt(i);
			
			}	
		if(t.equals(name)) {
			
			System.out.println("String is Palindrome");
			
			
		}
		
		
		
		
	}

}
