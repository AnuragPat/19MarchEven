package FinakKeywordUse;

public class Sample extends test{//error shows we can not create superclass of final class i.e we can not inherited final class

	public static void main(String[] args) {
		// no need but taken to check see final class method override or not
		
       // Sample S=new Sample();
       // S.demo();
        
	}
public void demo() {
	System.out.println("hi I'm method from sample class");
}
}
