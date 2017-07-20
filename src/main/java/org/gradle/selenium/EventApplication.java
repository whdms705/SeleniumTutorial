package org.gradle.selenium;

import java.util.ArrayList;
import java.util.List;

import org.gradle.selenium.chrome.ChromeDriverSet;
import org.gradle.selenium.functions.element.FindElementCase;
import org.gradle.selenium.ie.IeDriverSet;


public interface EventApplication {
	
	// �������� ���� ����Ʈ
	static List<CallbackEvent> drivers = new ArrayList<CallbackEvent>(){ {
		    add(new ChromeDriverSet());
			add(new IeDriverSet());
		
		
	} };
    // ��ɺ� ���ø���Ʈ
	static List<FuctionTestCase> testCases = new ArrayList<FuctionTestCase> () {{
			add(new FindElementCase());
	}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String url="http://sw.skhu.ac.kr/";
		//String url="https://devdogs.kr/";
		String url="http://whdms705.github.io/";
		
	    for(CallbackEvent driver:drivers){
	    	
		    for(FuctionTestCase testCase: testCases){
			    
		    	testCase.callme(driver.init(),url);
		    	
		    }
	   
	    }
	

	}

}
