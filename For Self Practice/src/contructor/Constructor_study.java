package contructor;

public class Constructor_study {//for practice
	public static void main(String[] args) {
		int marks=40;
		if( marks>=40) {
			System.out.println("i am pass");
		}
		
		String city="goa";
		if(city=="pune") {
			System.out.println("WELCOME");
		}
		marks=35;
		if(marks>=40) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		String Name="Anurag";
		if(Name=="Anurag") {
			System.out.println(" Hi Anurag");
		}
		else {
			
		}
		char grade='A';
		if(grade=='A') {
			System.out.println("welcome in Velocity");
		}
		else if(grade=='B'){
			System.out.println("go on 2nd stage");
			
		}
		else if(grade=='C') {
			System.out.println("Admission full");
		}
		else {
			System.out.println("Try next in batch");
		}
		int pin=1234;
		int amount=9000;
		if(pin==1234) {
			System.out.println("enter amount");
		
		     if(amount>=5000) {
			  System.out.println("trnasaction done");
		     }
		     else 
		     {
			  System.out.println("enter valid amount");
		     }
		     }
		else {
			System.out.println("enter correct pin");
		}
	}		
	
	
}