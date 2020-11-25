package com.yedam.inheritance;

public class InheritExample {

	public static void main(String[] args) {
		Parent p1 = new Parent ("필드값1");
		System.out.println(p1.field1);
		p1.method1();
		
		Child c1  = new Child ("자식필드1", "자식필드2" );
		System.out.println(c1.field2);
		System.out.println(c1.field1);
		c1.method1();
		c1.method2();
		
		NewChild nc1 = new NewChild("또다른자식1","또다른자식2");
		System.out.println(nc1.field1);
		System.out.println(nc1.field3);
		nc1.method1();
		nc1.method3();
	
		GrandChild gc1 = new GrandChild ("또다른자식3", "또다른자식3" );
		System.out.println(gc1.field1);
		System.out.println(gc1.field4);
		gc1.method1();
		gc1.method4();
	
		Parent p = new Parent ();
		p = new Child() ;
		p = new GrandChild() ;
		
		child c = new Parent () ;
		
		
				

	}

}
