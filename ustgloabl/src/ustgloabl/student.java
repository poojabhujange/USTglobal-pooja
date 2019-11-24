package ustgloabl;

public class student {
	
	String name;
	int rollno;
	final String cname= "Qspider";
	final int cid;
	student(){
		this.cid=1234;
	
	}
	student(String name,int rollnoo,int cid)
	{
		this.name = name;
		this.rollno= rollno;
		this.cid = cid;
	}
	final void printDetails()
	{
		System.out.println("Hi " +name +" welcome to" +cname );
	}
	final void printDetails(String name )
	{
		System.out.println("Hi " +name+"welcome to "+ cname);
		
	}
}
