package UpCasting_Study;

public class upCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Son S=new Son();//----------->creating obj of son class
   S.bike();
   S.car();
   S.degree();
   
   
   Father FS=new Son();//---------------->creating obj of son class with refence of father
   FS.bike();
   FS.car();
   //FS.degree---->we cant take own property of sub class
   
   
   
	}

}
