package Inehritance_Study3;

public class Herarachical_study {

	public static void main(String[] args) {
		Home HH=new Home();//calling own properties
		HH.POP();
		Home.colour();
		
		Hall HL=new Hall();//calling own properties
		HL.furniture();
		Hall.anticpiece();
		HL.POP();//calling super class non static properties
		Hall.colour();//calling super class static properties
		
		
		
		Kitchen K=new Kitchen();//calling own properties
		K.trolly();
		Kitchen.chimoney();
		K.POP();//calling super class non static properties
		Kitchen.colour();//calling super class static properties
	}

}
