package com.jalaparthi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean(name="f1")
	public Foo f1() {
		Foo f1 = new Foo();
		return f1;
	}
	
	//customize the bean name
	//@Bean(name = "foo2")
	//@Bean(value ="foo2")
	@Bean("foo2")
	public Foo f2() {
	
		Foo f2 = new Foo();
		return f2;
		
	}
	
	@Bean
	public Bar b1() {
		return new Bar();
	}
	
	@Bean("f005")
	public Foo f5(Bar b1) {
		Foo f5 = new Foo(b1);
		return f5;
	}

}
