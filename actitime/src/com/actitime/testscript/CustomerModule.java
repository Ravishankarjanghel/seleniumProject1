package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer",1, 3);
		String custDescp = f.getExcelData("CreateCustomer", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.setAddNew();
		t.setNewCustomer();
		t.setEnterCustomerName(custName);
		t.setEnterCustomerDescription(custDescp);
		t.setSelectCustomerDDCC();
		t.setOurCompanyCC();
		t.setCreateCustomer();
		Thread.sleep(4000);
		String actualText = t.setActualCustomerCreated();
		Assert.assertEquals(actualText,custName );
	}
	
}
