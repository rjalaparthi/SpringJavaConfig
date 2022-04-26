package com.jalaparthi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(Appconfig.class);
		
		Foo f1 = config.getBean("f1", Foo.class);
		System.out.println(f1);
		
		Foo foo2 = config.getBean("foo2", Foo.class);
		
		System.out.println(foo2);
		
		Foo foo5= config.getBean("f005", Foo.class);
		
		System.out.println(foo5);
	}

}
