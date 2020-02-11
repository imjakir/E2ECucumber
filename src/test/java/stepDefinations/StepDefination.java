package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PortalHomePage;
import resources.Base;

public class StepDefination extends Base {
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp = new LandingPage(driver);
		System.out.println(lp.getPopupSise().size());
		if(lp.getPopupSise().size()>0) {
			lp.getPopup().click();
		}
		lp.clickOnLogin().click();
	}
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		    LoginPage log = new LoginPage(driver);
			log.enterUserEmail().sendKeys(username);
			log.enterUserPassword().sendKeys(password);
			log.clickOnLoginButton().click();
	    }
	

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomePage ph = new PortalHomePage(driver);
	    Assert.assertTrue(ph.getSearchBox().isDisplayed());
	}
	
	 @Then("^Close browser$")
	    public void close_browser() throws Throwable {
	        driver.quit();
	    }
}
