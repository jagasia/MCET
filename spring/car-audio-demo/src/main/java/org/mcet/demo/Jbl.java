package org.mcet.demo;

import org.springframework.stereotype.Component;

@Component("jbl")
//@Component
public class Jbl implements Audio
{

	@Override
	public void play() {
		System.out.println("Jbl is very popular");
	}

}
