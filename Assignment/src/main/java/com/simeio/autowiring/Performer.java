package com.simeio.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	@Qualifier("piano")
	Instrument piano;

	@Autowired
	Instrument instrument;

	@Autowired 
	Instrument violin;

	void playSong(String type, String song) {
		if (type.equals("piano")) {
			instrument = new Piano();
			piano.play(song);
		} else if (type.equals("guitar")) {
			instrument = new Guitar();
			instrument.play(song);
		} else if (type.equals("violin")) {
			instrument = new Violin();
			violin.play(song);
		}
	}
}
