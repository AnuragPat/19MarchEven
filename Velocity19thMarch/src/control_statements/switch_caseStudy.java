package control_statements;

public class switch_caseStudy {

	public static void main(String[] args) {
		// Yeae 1------>welcome to 1st year engg
		//Year2------>Welcome to 2nd year engg
		//Year 3----->Welcome to 3rd year engg
		//Year4----->Welcome to 4th year engg
	    //Year default----->Please enter year bet 1-4
		
		int Year=3;
		switch(Year) {
		case 1:System.out.println("welcome to 1wst year engg");
		break;
		case 2:System.out.println("Welcome to 2nd year engg");
		break;
		case 3:System.out.println("welcome to 3rd year engg");
		break;
		case 4:System.out.println("welcome to 4th year engg");
        break;
        default:System.out.println("Enter year between 1-4");
		}
      //PNQ
	  //BOM
	  //NGP
	  //DL
		String Airport="HYD";
		switch(Airport) 
		{case "PNQ":System.out.println("Welcome to Pune airport");
		break;
		
		case "BOM":System.out.println("welcome to Mumbai airport");
		break;
		case "NGP":System.out.println("Welcome to Nagpur airport");
		break;
		
		case "DL":System.out.println("welcome to Dehli airport");
		break;
		
		default:System.out.println("Plase enter city between pune, nagpur,mumbai,dehli");
		
		}
	}

}
