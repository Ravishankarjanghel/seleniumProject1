package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

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
public class ProjectModule extends BaseClass{
	@Test
	public void testCreateNewProject() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateProject",true);
		FileLib f = new FileLib();
		String proName = f.getExcelData("CreateProject", 1, 3);
		String proDesc = f.getExcelData("CreateProject", 1, 4);
		HomePage h = new HomePage(driver);
		h.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.setAddNew();
		t.setNewProject();
		t.setEnterProjectName(proName);
		t.setSelectCustomerDDCP();
		Thread.sleep(2000);
		t.setOurCompanyCP();
		t.setEnterProjectDescription(proDesc);
		t.setCreateProject();
		Thread.sleep(4000);
		String actualProjectName = t.setActualProjectCreated();
		Assert.assertEquals(actualProjectName, proName);
	}
}
