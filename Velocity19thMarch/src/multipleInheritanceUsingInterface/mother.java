package multipleInheritanceUsingInterface;

public interface mother {
    void reciepe();
    void care();
    default void money() {
    	System.out.println("Mother's money");
    }
    static void test() {
    	System.out.println("Mother's test");
    }
}
