package org.mcet.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	@Autowired
	@Qualifier("jbl")
	private Audio audio;
	
	public Car() {}

	public Car(String name, Audio audio) {
		super();
		this.name = name;
		this.audio = audio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Audio getsony() {
		return audio;
	}

	public void setsony(Audio audio) {
		this.audio = audio;
	}

	public void playMusic()
	{
		audio.play();
	}
}
