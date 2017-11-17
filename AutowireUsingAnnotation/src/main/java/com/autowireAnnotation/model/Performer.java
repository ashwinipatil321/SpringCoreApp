package com.autowireAnnotation.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Performer {

private Instrument instrument;
	
	@Autowired
	public Performer(Instrument instrument){
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}

}
