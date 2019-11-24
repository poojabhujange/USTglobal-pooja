
public class TestB {
	static int b;
	int a;
    {
    	 b=20;
		a=10;
		System.out.println(" non static block 1");
	}
    public static void main(String[] args) {
    	System.out.println("main start");
		TestB t = new TestB();
		TestB t1  = new TestB();
		
		System.out.println("main ended");
    }
    {
    	System.out.println(" non static block 2");
    }

}
