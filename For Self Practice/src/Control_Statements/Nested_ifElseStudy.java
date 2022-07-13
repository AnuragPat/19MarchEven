package Control_Statements;

public class Nested_ifElseStudy {

	public static void main(String[] args) {
		// if email-id correct---->enter password
   //{  if password correct ------>login success
	//	else ------->enter correct password   }
	//  else-------->enter correct email-id
		String MailId="shravya2704@gmail.com";
		String password="SHRAVYA";
		if(MailId=="shravya2704@gmail.com") 
		{
			System.out.println("Enter password");
			if(password=="SHRAVYA") 
			{
				System.out.println("Login successfully");
				}
			else
				{
				System.out.println("Please enter correct password");
				}
		}
		else {
			System.out.println("Please enter correct mail id .");
		}
	}

}
