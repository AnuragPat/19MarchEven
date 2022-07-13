package Control_Statements;

public class switch_CaseStudy {

	public static void main(String[] args) {
		// 
		int Day=4;
		switch(Day) {
		case 1:System.out.println("1st day is Monday");
		break;
		
		case 2:System.out.println("2nd day is Tuesday");
		break;
		
		case 3:System.out.println("3rd day is Wednesday");
		break;
		
		case 4:System.out.println("4th day is Thursday");
		break;
		
		case 5:System.out.println("5th day is Friday");
		break;
		
		case 6:System.out.println("6th day is Saturday");
		break;
		
		case 7:System.out.println("7th day is Sunday");
		break;
		
		default:System.out.println("enter day between 1-7");
		
		}//another example of switch case
		char grade='C';
		switch(grade) {
		case 'A':System.out.println("you get grade A");
		break;
		case 'B':System.out.println("you get grade B");
		break;
		case 'C':System.out.println("you get grade C");
		break;
		case 'D':System.out.println("you are fail");
		break;
		default:System.out.println("Please enter grade between A to D");
		}
         
         
	}

}
