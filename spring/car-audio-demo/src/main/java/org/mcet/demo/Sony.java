package org.mcet.demo;

import org.springframework.stereotype.Component;

@Component("sony")
//@Component
public class Sony implements Audio
{

	@Override
	public void play() {
		System.out.println("Sony plays good music");
	}

}
