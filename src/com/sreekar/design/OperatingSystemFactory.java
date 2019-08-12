package com.sreekar.design;

public class OperatingSystemFactory {

	public OS getInstance(String str) {

		if (str.equals("ubantu")) {
			return new Ubantu();
		} else {
			return new Windows();
		}

	}

}
