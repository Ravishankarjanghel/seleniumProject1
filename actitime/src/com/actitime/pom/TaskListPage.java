package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;
	
	@FindBy(css=".projectNameField.inputFieldWithPlaceholder.inputNameField")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescription;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerDDCC;
	
	@FindBy(xpath="//div[@id='createProjectPopup_content']//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomerDDCP;
	
	@FindBy(xpath="//div[@id='customerLightBox']//div[text()='Our company']")
	private WebElement ourCompanyCC;
	
	@FindBy(xpath="//*[@id=\"createProjectPopup_content\"]//div[text()='Our company']")
	private WebElement ourCompanyCP;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProject;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	@FindBy(css = ".titleEditButtonContainer .title")
	private WebElement actualProjectCreated;
	
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setAddNew() {
	addNew.click();
}

public void setNewCustomer() {
	newCustomer.click();
}

public void setNewProject() {
	newProject.click();
	
}

public void setEnterCustomerName(String custName) {
	enterCustomerName.sendKeys(custName);
}

public void setEnterProjectName(String proName) {
	enterProjectName.sendKeys(proName);
}

public void setEnterCustomerDescription(String custDescp) {
	enterCustomerDescription.sendKeys(custDescp);
}

public void setEnterProjectDescription(String proDescp) {
	enterProjectDescription.sendKeys(proDescp);
}

public void setSelectCustomerDDCC() {
	selectCustomerDDCC.click();
}

public void setSelectCustomerDDCP() {
	selectCustomerDDCP.click();
}

public void setOurCompanyCC() {
	ourCompanyCC.click();
}

public void setOurCompanyCP() {
	ourCompanyCP.click();
}

public void setCreateCustomer() {
	createCustomer.click();
}

public void setCreateProject() {
	createProject.click();
}

public String setActualCustomerCreated() {
	return actualCustomerCreated.getText();
}

public String setActualProjectCreated() {
	return actualProjectCreated.getText();
}

}










