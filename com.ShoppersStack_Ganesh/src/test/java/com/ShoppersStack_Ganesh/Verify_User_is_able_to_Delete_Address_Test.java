package com.ShoppersStack_Ganesh;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShoppersStack_genericUtility.Base_Test;
import com.ShoppersStack_pom.MyAddress_Page;
import com.ShoppersStack_pom.Myprofile_Page;
import com.aventstack.extentreports.Status;

@Listeners(com.ShoppersStack_genericUtility.Listeners.class)
public class Verify_User_is_able_to_Delete_Address_Test extends Base_Test {
	
	@Test
	
	public void deleteAddress() throws InterruptedException {
	
		home.getSetting().click();
		home.getMyProfile().click();
		
		
		Myprofile_Page profile=new Myprofile_Page(driver);
		profile.getMyAddressBtn().click();
		
		
		MyAddress_Page address=new MyAddress_Page(driver);
		Thread.sleep(1000);
		address.getDeleteBtn().click();
	
		Thread.sleep(2000);
		address.getYesBtn().click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
