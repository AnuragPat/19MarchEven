package interfaceStudy;

public interface MyInterface {
    int a=10;//by default variable is final and static
    void test();//by default method is public and abstract no need to use keywords
    void test1();//by default method is public and abstract no need to use keywords
    void demo();
   static void sum() {
	   System.out.println("sum is static method in interface");
   }  // we cant take static incomplete method becoz we dont ovrride it******
}// but java modify version takes complete method
