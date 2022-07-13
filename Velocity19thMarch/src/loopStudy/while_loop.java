package loopStudy;

public class while_loop {

	public static void main(String[] args) {
		// group study
		int i=2;
        while(i<=20) {
        	System.out.println(i );
        	i=i+2;
        	
        }
        int a=3;
        while(a<=30) {
        	System.out.println(a);
        	a=a+3;
        }
        int b=50;
        while(b>=5) {
        	System.out.println(b);
        	b--;
        }
        int pin=1234;
        String Password="ABCD";
        if(pin==1234) {
        	System.out.println("enter password");
        
         if(Password=="ABC") {
        	System.out.println("enter amount");
        }
        else {
        	System.out.println("enter correct amount");
        }
        }
        
        else {
        	System.out.println("Enter correct password");
        }
        char Grade='A';
        switch(Grade='C') {
        case 'A':System.out.println("you got A grade");
        break;
        case 'B':System.out.println("you got B grade");
        break;
        default:System.out.println("Enter correct grade");
        break;
        }
        
        
        
        
        
        
        
        
	}

}
