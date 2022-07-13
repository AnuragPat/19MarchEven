package contructor;

public class diff_Constructor {
	String Name;
    int RollNum;
    char Div;

	
	public diff_Constructor(String x,int y,char z) {
		Name=x;
		RollNum=y;
		Div=z;
	}
	
	
	public static void main(String[] args) {
	diff_Constructor BB=new diff_Constructor("Sanika", 51, 'A');
	BB.Information();
    diff_Constructor JJ=new diff_Constructor("Seema",65, 'B');
    JJ.Information();
	}
	
	
    public void Information() {
    	System.out.println("The name is "+Name);
    	System.out.println("The roll no is "+RollNum);
    	System.out.println("The div is "+Div);
    	System.out.println("================================");
    }
    
}
