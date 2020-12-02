package com.khunaungpaing.ass2;
package com.khunaungpaing.ass2;

public class SecondsToHMSConverter {

	public void converter (int seconds) {
		int mins = seconds/60;
		int secs = seconds-(mins*60);
		
		int hours = mins/60;
		mins -= (hours*60);

		
		System.out.println(hours+" h : "+mins+" m : "+secs+" s");
	}
}
