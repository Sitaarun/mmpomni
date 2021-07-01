package org.iit.healthcare.omni.patientmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	
		
	}
public void navigationToModule(String modulename) {
	driver.findElement(By.xpath("//span[contains(text(),'" + modulename + "')] ")).click();
}

public HashMap<String,String> fetchPatientDetails() 
{
	HashMap<String, String> sMap = new HashMap<String, String>();
	String time = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[2]")).getText();
	String doctor = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[4]")).getText();
	String symptoms = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[3]")).getText();
	String date = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[1]")).getText();
	
	sMap.put("Doctor", doctor);
	sMap.put("Date", date);
	sMap.put("Time", time);
	sMap.put("Appointment", symptoms);
	return sMap;
	
}
}
