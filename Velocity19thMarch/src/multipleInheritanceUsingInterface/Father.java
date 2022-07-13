package multipleInheritanceUsingInterface;

public interface Father {
       void love();
       void nature();
       default void money() {
    	   System.out.println("father's money");
       }
       static void test() {
    	   System.out.println("father's test");
       }
}
