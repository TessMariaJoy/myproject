package com.crm.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * This generic class contains reusable WebDriver controls
 * @author USER
 *
 */
public class WebDriverCommonLib extends BaseTest {
	
	public void mouseHover(WebElement element) 
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebElement source,WebElement target)
	{
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}
	
	public void select(WebElement element,int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void select(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public void select(String value,WebElement element)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void waitForElement(By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	public void verify(String actual,String expected,String message)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log("Verification passed",true);
	}
	public void verifyNagative(String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log("Verification failed",true);
	}
	public void waitForTitleContains(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void frameHandler(int index)
	{
		driver.switchTo().frame(index);
	}
	public void frameHandler(String value)
	{
		driver.switchTo().frame(value);
	}
	public void frameHandler(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
}
