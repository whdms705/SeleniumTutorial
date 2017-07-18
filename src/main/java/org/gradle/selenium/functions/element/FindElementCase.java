package org.gradle.selenium.functions.element;

import org.apache.log4j.Logger;
import org.gradle.selenium.FuctionTestCase;
import org.openqa.selenium.WebDriver;

public class FindElementCase implements FuctionTestCase {
	private final Logger log = Logger.getLogger(FindElementCase.class);
	
	@Override
	public void callme(WebDriver driver,String url){
		driver.get(url); // url에  페이지로 이동
	}
	
}
