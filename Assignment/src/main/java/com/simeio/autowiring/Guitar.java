package com.simeio.autowiring;

import org.springframework.stereotype.Component;

@Component("instrument")
public class Guitar implements Instrument {

	@Override
	public void play(String song) {
		System.out.println("Popular Guitar Song: " + song);
	}

}
