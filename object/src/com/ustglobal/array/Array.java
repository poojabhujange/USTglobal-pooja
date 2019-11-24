package com.ustglobal.array;

public class Array {
	public static void main(String[] args) {
		int[] nums = new int[7];
		nums[0]=10;
		nums[1]=20;
		nums[3]=30;
		nums[4]=40;
		nums[5]=50;
		nums[6]=60;
		
		for(int i=0;i<nums.length;i++){
		System.out.println(nums[i]);

		
	}
		System.out.println("---------------");
for(int num :nums){
	System.out.println(num);
}
char[] ch ={'a','b','c','d'};
for(int i=0;i<ch.length;i++){
	System.out.println(ch[i]);
}

System.out.println("---------------");
for(int c:ch){
	System.out.println(c);
}
System.out.println("--------------");
boolean[] b={true,false,true,false};
for(int i=0;i<b.length;i++){
	System.out.println(b[i]);
}
System.out.println("---------------");
for(boolean b1:b){
	System.out.println(b1);
}
System.out.println("===========");

byte[] byt = {1,2,3,4,5};
for(int i=0;i<byt.length;i++){
	System.out.println(byt[i]);
}
System.out.println("---------------");
for(byte b3:byt){
	System.out.println(b3);
}
System.out.println("=============");
double[] db={20.0,30.45,57.78,574.8};
for(int i=0;i<db.length;i++){
	System.out.println(db[i]);
}
System.out.println("---------------");
for(double b2:db){
	System.out.println(b2);
}


String[] s ={"pooja","pari","swapnial","avinash"};
for(int i=0;i<s.length;i++){
	System.out.println(s[i]);
}
System.out.println("---------------");
for(String s1:s){
	System.out.println(s1);
}

}
	
}
