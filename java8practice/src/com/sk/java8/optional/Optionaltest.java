package com.sk.java8.optional;

public class Optionaltest {
	
	public static void main(String args[]) {
		Computer computer = new Computer();
		//Usb usb =computer.getSoundCard().get().getUsb().get();
		//System.out.println(usb);
		// if the resulting optional object is empty we can use orElse/OrElseThrow
		
		String usbVersion =computer.getSoundCard().orElseGet(SoundCard::new)
				.getUsb().orElseGet(Usb::new).getVersion();
		System.out.println(usbVersion);
		
	}

}
