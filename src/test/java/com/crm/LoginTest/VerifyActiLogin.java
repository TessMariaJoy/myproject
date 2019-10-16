package com.crm.LoginTest;

import org.testng.annotations.Test;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.genericLib.WebDriverCommonLib;
import com.crm.pages.Homepage1;
import com.crm.pages.LoginPage;

public class VerifyActiLogin extends BaseTest{
	LoginPage lp;
	FileLib flib;
	WebDriverCommonLib wlib;
	Homepage1 hp1;
	@Test(priority=1)
	public void actiValidLoginTest() throws Throwable
	{
		flib=new FileLib();
		wlib=new WebDriverCommonLib();
		lp=new LoginPage();
		String un=flib.getPropKeyValue(PROP_PATH, "username");
		String pd=flib.getPropKeyValue(PROP_PATH, "password");
		
		//wlib.verify(wlib.getTitle(), "ActiTIME - Login", "Login page is displayed");
		lp.login(un, pd);
		//wlib.verify(wlib.getTitle(), "ActiTIME - Enter Time-Track", "Home page displayed");
	}
//	@Test(priority=2)
//	public void actiInvalidLoginTest() throws Throwable
//	{
//		lp=new LoginPage();
//		flib=new FileLib();
//		int rc=flib.getRowCount(EXCEL_PATH, "invalid");
//		for(int i=0;i<=rc;i++)
//		{
//			String un=flib.readExcelData(EXCEL_PATH, "invalid", i, 0);
//			String pwd=flib.readExcelData(EXCEL_PATH, "invalid", i, 1);
//			lp.login(un, pwd);
//			lp.getUnTB().clear();
//		}
//	}
	@Test(priority=2)
	public void purchaseOrder() {
		//abc
		//hp.clickPOBtn();
		
	}
	

}
