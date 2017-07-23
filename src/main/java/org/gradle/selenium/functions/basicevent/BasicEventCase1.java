package org.gradle.selenium.functions.basicevent;

import org.apache.log4j.Logger;
import org.gradle.selenium.FuctionTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * 이번에 테스트해보는 액션은 화면의 어떤 이벤트를 취하기보다는
 * 태그의 값,상태등을 확인 할 수 있는 액션으로 모아 정리하였습니다.
 * 
 * 
 */


public class BasicEventCase1 implements FuctionTestCase {
	private final Logger log = Logger.getLogger(BasicEventCase1.class); 
	
	@Override
	public void callme(WebDriver driver, String url) {
		// TODO Auto-generated method stub
		
		driver.get(url); // url에  페이지로 이동
		
		// getAttribute를 사용하여 태그안에  name,class,id 등등 값을 가져올수 있음
		WebElement menu = driver.findElement(By.linkText("Work Project"));
		log.info(menu.getAttribute("href"));
		// http://whdms705.github.io/project.html
		
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/a")).click();
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		
		//getCssValue를 사용하면 지정한 엘레멘트에 적용된  css값을 확인 할때 유용하게 사용할 수 있습니다.
		WebElement image = driver.findElement(By.xpath("html/body/div[1]/p[1]/img"));
		log.info("css value : "+image.getCssValue("width"));
		// img태그안에 걸려져 있는 css값을 확인할 수 있습니다.
		//css value : 700px
		
		
		
		// getLocation를 사용하면  엘리먼트의 상대 위치를 (x,y)좌표로 가져올 수 있습니다.
		log.info("image tag location value : "+image.getLocation());
		// image tag location value : (273, 200)
		
		
		
		// getSize() 는 웹 페이지에 렌더링된 웹엘리멘트의 높이와 너비를 반환한다.
		log.info(" image tag의 높이와 너비값 : "+image.getSize());
		//image tag의 높이와 너비값 : (700, 439)
		
		
		
		//getTagName()를 사용하여 태그의 이름을 리턴해준다.
		log.info(" tag name value: "+image.getTagName());
		//tag name value: img
		
		
		//isEnabled() 엘리멘트의 활성화 여부를 확인 할 수있습니다.
		log.info("tag 활성화 여부 : "+image.isEnabled());
		// true
		
		
		//isSelected()는 셀렉트 ,체크박스등의 선택상태를 확인할 때 사용합니다.
		// 선택태그를 대상으로 한 것 이 아니기때문에 false를 리턴합니다.
		log.info(image.isSelected());
		// false
		
		
		
		

	}

}
