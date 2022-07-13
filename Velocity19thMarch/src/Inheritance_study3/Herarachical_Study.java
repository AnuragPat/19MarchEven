package Inheritance_study3;

public class Herarachical_Study {

	public static void main(String[] args) {
		Father FF=new Father();
		FF.pocketMoney();// calling fathers own properties
		Father.discipline();
		
		Daughter DD=new Daughter();
		DD.makeUp();//calling daughter own properties
		Daughter.dashing();
		DD.pocketMoney();//fathers properties non static
		Daughter.discipline();//calling fathers static property
		
		Son SS=new Son();
		SS.clever();// calling son's own properties
		Son.shine();
		SS.pocketMoney();//calling non-static fathers properties
		Son.discipline();//calling static fathers properties

	}

}
