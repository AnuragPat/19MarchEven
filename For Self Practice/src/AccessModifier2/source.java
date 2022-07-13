package AccessModifier2;

import AccessModifier.SpecifierStudy;

public class source extends SpecifierStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpecifierStudy C=new SpecifierStudy();
      C.demo4();//calling public method
      source S=new source();//obj of child class
      S.demo3();//calling child class property
      S.demo4();//calling parent i.e public method class property
	}

}
