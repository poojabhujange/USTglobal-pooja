
public class TestA {
	static int a;
	int b;
	static {
		a=10;
		System.out.println("static block 1");
	}
	public TestA() {
		System.out.println("testa() constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1  = new TestA();
		System.out.println("a value is "+a);
		// TODO Auto-generated method stub

	}	
	static {
		a=20;
		System.out.println("static block 2");
	}

	static {
		a=40;
		System.out.println("static block 3");
	}
}
