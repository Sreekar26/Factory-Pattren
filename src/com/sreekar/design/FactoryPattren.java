package com.sreekar.design;

public class FactoryPattren {

	public static void main(String[] args) {

		// OS ubantu=new Ubantu();
		// ubantu.getOperatingSystem();

		OperatingSystemFactory obj = new OperatingSystemFactory();
		OS ops = obj.getInstance("sdsdsd");
		ops.getOperatingSystem();

	}

}
