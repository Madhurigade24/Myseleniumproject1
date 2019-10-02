package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemoPage 
{
WebDriver driver;
@FindBy(linkText="Simple Form Demo")
WebElement SimpleFormDemoMenu;

@FindBy(id="user-message")
WebElement usermessagetextbox;

@FindBy(xpath="//*{@id='get-input']/button")
WebElement checkmessageButton;

@FindBy(xpath="//*{@id='display']")
WebElement outputmsg;

public SimpleFormDemoPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public String launchSimpleFormDemoPage()
{
	SimpleFormDemoMenu.click();
	return driver.getTitle();
}
public void enterMessage(String Msg)
{
usermessagetextbox.sendKeys(Msg);
}
public void ClickShowMessageButton() {
	// TODO Auto-generated method stub
	checkmessageButton.click();
}

public String getmessage()
{
	return outputmsg.getText();
}

}
