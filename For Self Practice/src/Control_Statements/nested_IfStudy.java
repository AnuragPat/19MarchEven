package Control_Statements;

public class nested_IfStudy {

	public static void main(String[] args) {
		// if pin correct ------->enter amount
		//if amount correct------>transaction done
		//else ----------->enter correct amount
		//else------->enter correct pin
     int pin=1234;
     int amount=7000;
     if(pin==1234) {
    	 System.out.println("Pin is correct");
    	 if(amount>=5000) {
    		 System.out.println("Transaction done");
    	 }
    	 else {
    		 System.out.println("Enter correct amount");
    	 }
     }
     else 
     {
    	 System.out.println("Plase enter correct pin .");
     }
		
    int code=1211;
    int amount1=6000;
    if( code==1233) {
    	{System.out.println("enter amount");}
    
    if(amount1<=10000) {
    	System.out.println("transaction done");
    }
    else {
    	System.out.println("enter correct amount");
    }
    }
	
    else {
    	System.out.println("enter correct code");
    }
		
	}	
	

}
