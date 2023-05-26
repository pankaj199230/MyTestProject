package Automation.Indiabonds;

public class indianTrafficRules implements globalTrafficRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=13;
		globalTrafficRules g = new indianTrafficRules();
		
	g.GreenGo();
	g.RedStop();
	g.WaitYellow();		
	System.out.println(g.i);  // it prints i from interface coz here we create the object of indianTrafficRules and 
	                            // implement the method and variables of globalTrafficRules
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		
		System.out.println("GOOOOOOOOOOOOOOOOOO");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("STOPPPPPPPPPPPPPPPPPPPP");
	}

	@Override
	public void WaitYellow() {
		// TODO Auto-generated method stub
		System.out.println("WAITTTTTTTTTTTTTTTTTTT");
	}

}
