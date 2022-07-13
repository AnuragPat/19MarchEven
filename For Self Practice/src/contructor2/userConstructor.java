package contructor2;

public class userConstructor {
	float a=66f;
	float b=50f;
	
	public userConstructor() {
		
		float c=a/b;
		System.out.println("value of c is "+c);
	}
	
	
	public static void main(String[] args) {
		userConstructor MM=new userConstructor();
		MM.check();
        MM.check3();
	}
     
	public void check() {
		System.out.println("value of a is "+a);
	}
	public void check3() {
		System.out.println("value of b is "+b);
	}
}

