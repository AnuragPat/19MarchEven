package Control_Statements;

public class switch_caseExample {

	public static void main(String[] args) {
		//month1-------->1st month is JAN
		//month2-------->2nd month is FEB
		//month3-------->3rd month is March
		//month4-------->4th month is April
		//month5-------->5th month is MAY
		//month6-------->6th month is JUNE
		//month7-------->7th month is JULLY
		//month8-------->8th month is AUG
		//month9-------->9th month is SEP
		//month10------->10th month is OCT
		//month11------->11th month is NOV
		//month12------->12th month is DEC
		int month=110;
		switch(month){
		case 1:System.out.println("1st month is JAN ");
		break;
		case 2:System.out.println("2nd month is FEB");
		break;
		case 3:System.out.println("3rd month is MARCH");
		break;
		case 4:System.out.println("4th month is APRIL");
		break;
		case 5:System.out.println("5th month is MAY");
		break;
		case 6:System.out.println("6th month is JUNE");
		break;
		case 7:System.out.println("7th month is JULLY");
		break;
		case 8:System.out.println("8th month is AUG");
		break;
		case 9:System.out.println("9th month is SEP");
		break;
		case 10:System.out.println("10th month is OCT");
		break;
		case 11:System.out.println("11th month is NOV");
		break;
		case 12:System.out.println("12th month is DEC");
		break;
		default:System.out.println("Please enter month between 1to 12");
		}
		

	}

}
