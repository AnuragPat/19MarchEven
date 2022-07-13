package multipleInheritanceUsingInterface;

public class Son implements Father,mother {

	public static void main(String[] args) {
		// 
		Son S=new Son();
		S.love();
		S.nature();
		S.care();
		S.reciepe();
		S.money();
     mother.test();
     Father.test();
	}

	@Override
	public void love() {
		System.out.println("Father's method completed in son class");
		
	}

	@Override
	public void nature() {
		System.out.println("Father's method completed in son class");
		
	}

	@Override
	public void money() {
		System.out.println("son's money");
		Father.super.money();
		mother.super.money();
	}

	@Override
	public void reciepe() {
		System.out.println("mother's method completed in son class");
		
	}

	@Override
	public void care() {
		System.out.println("mother's method completed in son class");
		
	}

}
