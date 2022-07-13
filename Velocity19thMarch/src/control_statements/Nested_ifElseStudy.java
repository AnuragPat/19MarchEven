package control_statements;

public class Nested_ifElseStudy {

	public static void main(String[] args) {
		// if username correct----->enter password{
	//	if password correct------>login success
	//	else----->enter correct password
	//    }
	// else------>enter correct username
		
		String UN="Velocity";
		String PWD="velocity@12";
		if(UN=="Velocity")
		{
			System.out.println("Enter Password");
			if(PWD=="velocity@12")
				System.out.println("Login Successfully");
			else {
				System.out.println("Password is incorrect");
			}
		}
		
		else {
			System.out.println("Enter correct UN");
		}
	}

}
