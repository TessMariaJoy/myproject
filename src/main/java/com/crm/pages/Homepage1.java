package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class Homepage1 {
	@FindBy(xpath = "//a[.='Purchase Orders'") private WebElement newPOBtn;
	
		public void clickPOBtn() throws Throwable
		{
			newPOBtn.click();
		}
		public Homepage1()
		{
			PageFactory.initElements(BaseTest.driver, this);
		}
}


