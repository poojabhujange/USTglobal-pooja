package com.ustglobal.objectclass;

public class TestB {
public static void main(String[] args) {
     Pen p = new Pen();
     int pHashcode = p.hashCode();
     System.out.println("has code is"+pHashcode);
     
     
     Pen q = new Pen();
     int qHashcode = q.hashCode();
     System.out.println("has code is"+qHashcode);
   
     System.out.println(q);//inernal it call to string method
     String s =p.toString();//full name @hexadecimal value
     System.out.println(s);
     

}

}
