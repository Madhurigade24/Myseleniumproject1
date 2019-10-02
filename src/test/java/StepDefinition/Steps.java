package StepDefinition;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.qa.base.BaseClass;
import com.qa.pages.SimpleFormDemoPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps extends BaseClass {
	WebDriver driver;
	SimpleFormDemoPage objSimpleFormDemoPage;

	@Before
	public void setup() {
		driver = initializeDriver("Chrome");
		objSimpleFormDemoPage = new SimpleFormDemoPage(driver);
		System.out.println("Driver URL==========" + driver.getCurrentUrl());

	}

	@Given("^Launch the Page$")
	public void launch_the_Page()
	{
		//String actualpageTitle =
		//objSimpleFormDemoPage.launchSimpleFormDemoPage();
		//oSystem.out.println(actualpageTitle);
	}

	@When("^I EnterbMy Message \"(.*?)\"in the Text box$")
	public void i_EnterbMy_Message_in_the_Text_box(String pMyMessage) {
		objSimpleFormDemoPage.enterMessage(pMyMessage);
	}

	@When("^I Click on Show Message Button$")
	public void i_Click_on_Show_Message_Button() {
		objSimpleFormDemoPage.ClickShowMessageButton();
	}

	@Then("^I Verify that the displayed messageis same as\"(.*?)\"$")
	public void i_Verify_that_the_displayed_messageis_same_as(String Msg) {

		Assert.assertEquals(Msg, objSimpleFormDemoPage.getmessage());

	}

}