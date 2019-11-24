package typecasting.jsp1;

public class mainclass {
	public static void main(String[]args)
	{
		demo1 d1=(demo1)new demo3();
		System.out.println(""+d1.x);
		demo1 d2=(demo1)new demo2();
		System.out.println(""+d2.x);
		d2.m1();
		demo2 d3=(demo2)new demo3();
		System.out.println(""+d3.x);
		d3.m1();
		System.out.println(""+d3.y);
		d3.m2();
		System.out.println("*********************************");
		demo2 d4=(demo2)d2;
		demo3 d5=(demo3)d3;
		demo3 d6=(demo3)d1;
		System.out.println(d4.x);
		System.out.println(d4.y);
	//	System.out.println(d4.z);//error
		System.out.println(d5.x);
		System.out.println(d5.y);
		System.out.println(d5.z);
		System.out.println(d6.x);
		System.out.println(d6.y);
	    System.out.println(d6.z);
			
		
		
	}

}
