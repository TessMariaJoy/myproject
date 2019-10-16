package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class LoginPage {

	@FindBy(id="userName") private WebElement unTB;
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	@FindBy(id="passWord") private WebElement pwTB;
	public void setPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
//	//(xpath="//div[.='Login ']")
	@FindBy(xpath="//input[@title='Sign In']") private WebElement loginBtn;
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void login(String un,String pwd)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
	}
//	public WebElement getUnTB() {
//		return unTB;
//	}
//	public void setUnTB(WebElement unTB) {
//		this.unTB = unTB;
//	}
//	public WebElement getPwTB() {
//		return pwTB;
//	}
//	public void setPwTB(WebElement pwTB) {
//		this.pwTB = pwTB;
//	}
//	public WebElement getLoginBtn() {
//		return loginBtn;
//	}
//	public void setLoginBtn(WebElement loginBtn) {
//		this.loginBtn = loginBtn;
//	}
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
}
