package com.sk.java8.optional;

import java.util.Optional;

public class SoundCard {
	private Optional<Usb> usb;

	public Optional<Usb> getUsb() {
		Usb usb = new Usb();
		Optional<Usb> optionalUsb = Optional.ofNullable(null);
		return optionalUsb;

	}

}
