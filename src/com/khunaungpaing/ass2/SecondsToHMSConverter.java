package com.khunaungpaing.ass2;

public class SecondsToHMSConverter {

	public void converter (int seconds) {
		int hours = 0;
		int mins = 0;
		int secs = seconds;
		
		while(secs>=60) {
			mins +=1;
			secs -=60;
			
			while(mins>=60) {
				hours +=1;
				mins-=60;
			}
		}
		
		System.out.println(hours+" h : "+mins+" m : "+secs+" s");
	}
}
