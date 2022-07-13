package Control_Statements;

public class nested_ifElsePractice {

	public static void main(String[] args) {
		// if pin correct----->enter amount
		//if amount upto 10000----------->proccesing
		//else ------>enter correct pin
		//else ----->your transaction done
		int PIN=1234;
   float amount=55000.09f;
   if(PIN==1234) {
	   System.out.println("Enter amount");
	   if(amount<=10000)
	   {
		   System.out.println("Proccesing");
	   }
	   else 
	   {
		   System.out.println("Enter correct amount");
	   }
   } 
   else {
	   System.out.println("enter correct PIN");
   }
	   
	   
   
   
	}

}
