package string_Study;

public class stringStudy2 {

	public static void main(String[] args) {
//*** isEmpty() method  ***------>check only given string is empty or not
		String p="Test";
		String q="  ";
		String r="null";
		System.out.println(r.length());//---->to check length
		System.out.println(q.isEmpty());
		System.out.println(r.isEmpty());
		String s="";//------->no any space it gives **true**
		System.out.println(s.isEmpty());
		System.out.println("=====================================");
		
//*** 7.isBlank() method    ***
		String t="";
		String u=" ";
		String v="you";
		System.out.println(t.isBlank());
		System.out.println(u.isBlank());
		System.out.println(v.isBlank());//
		System.out.println("=====================================");

//*** 8.charAt() method     ***
		String country="India";
		System.out.println(country.charAt(0));
		System.out.println(country.charAt(4));
		char character=country.charAt(3);
		System.out.println(character);
		System.out.println("=====================================");
		
//*** 9.endsWith() method	***
		String b="India";
		System.out.println(b.endsWith("IA"));//------>case sensetive
		System.out.println(b.endsWith("ia"));
		boolean test=b.endsWith("a");//------->return type
		System.out.println(test); 
		System.out.println("=====================================");
		
//***  10.startsWith()	method  ***
		String country1="India";
		System.out.println(country1.startsWith("I"));
		System.out.println(country1.startsWith("IN"));//**false; becoz of case sensetive
		System.out.println(country1.startsWith("In"));
		System.out.println(country1.startsWith("d",2 )); 
		System.out.println(country.startsWith("a", 4));
	}

}
