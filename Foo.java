package com.jalaparthi;

public class Foo {
	
	private Bar bar;
	
	public Foo() {
		
		System.out.println("Inside Foo Class Constructor");
	}
	
	public Foo(Bar bar) {
		this.bar= bar;
		System.out.println("Inside Bar Dependent COnstructor Constructor");
	}

	@Override
	public String toString() {
		return "Foo [bar=" + bar + " - "
				+ super.toString() + "]";
	}

}
