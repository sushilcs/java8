package com.sk.java8.optional;

import java.util.Optional;

public class Computer {
	private Optional<SoundCard>soundcard;
	
	public Optional<SoundCard> getSoundCard(){
		SoundCard sc = new SoundCard();
		Optional<SoundCard>optionaSoundcard = Optional.ofNullable(null);
		return optionaSoundcard;
		
	}
	

}
