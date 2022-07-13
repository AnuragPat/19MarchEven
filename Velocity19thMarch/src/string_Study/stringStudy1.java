package string_Study;

public class stringStudy1 {

	public static void main(String[] args) {
		
//***  1.length method  *** 
   System.out.println("=======================");
   String name="ANURAG PATIL";
   System.out.println(name.length());
   
   int testing=name.length();//------- storing value for its use
   System.out.println(testing);
   
   String city="Pune";
   int test=city.length();//----->return type is int---->we can use anywhere 
   System.out.println(test);
   System.out.println(city.length());
   System.out.println("=========================");
   
   
//***  2.toUpperCase   ***
   System.out.println("=========================");
   String Country="India";
   System.out.println(Country.toUpperCase());
   String m=Country.toUpperCase();//------- storing value for its use
   System.out.println(m);
   System.out.println("=========================");
   
   
//***  3.toLowerCase   ***
   System.out.println("=========================");
   String n="Velocity";
   System.out.println(n.toLowerCase());
   String o="VELOCITY";
   String p=o.toLowerCase();//------- storing value for its use
   System.out.println(p);
   System.out.println("=========================");
   
   
//***   4.equals method  ***   
   System.out.println("=========================");
   String a="India";
   String c=new String("India");
   String b=new String("India");//------- storing value for its use
   System.out.println(a.equals(b));//--->true becoz of equals check only sequence
   System.out.println(a==b);//false----->becoz == sign check memory location
   System.out.println(a==c);
   System.out.println("==========================");
   
   
 //***    5.equalsIgnoreCase()method  ***
   String city1="pune";
   String locality="Pune";
   String dist="Pune";
   System.out.println(city1.equals(dist));//---->use of equals method
   System.out.println(city1.equalsIgnoreCase(dist));
   System.out.println(dist.equals(locality));
   
	}

}
