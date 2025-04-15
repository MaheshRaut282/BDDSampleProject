package stepDeft;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {

	
	@Before("@SmokeTest")
	public void setupDataSmoke() {
		System.out.println("Before Each Smoke scenario....");
	}
	
	@After("@SmokeTest")
	public void closeDBSmoke() {
		System.out.println("After Each Smoke scenario...");
		
	}
	

//	@Before(@RegressionTest)
//	public void setupDataReg() {
//		System.out.println("Before Each Reg scenario....");
//	}
//	
//	@After(@RegressionTest)
//	public void closeDBReg() {
//		System.out.println("After Each Reg scenario...");
//		
//	}
	
//	@BeforeAll
//	public static void setupBrowser() {
//		System.out.println("Before All the scenarios.....");
//	}
//	
//	@AfterAll
//	public static void closeBrowser() {
//		System.out.println("After All the scenarios.....");
//	}
//	
//	@Before
//	public void setupData() {
//		System.out.println("Before Each scenario....");
//	}
//	
//	@After
//	public void closeDB() {
//		System.out.println("After Each scenario...");
//		
//	}
	

	@Before(order=2)
	public void setupDataReg() {
		System.out.println("Before Each Reg scenario....");
	}
	
	@Before(order=1)
	public void readFromProperty() {
		System.out.println("Read from PropertyFile.....");
		
	}
	
	@Before(order=3)
	public void initBrowser() {
		System.out.println("Init Browser....");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}
	
	@When("User delete a Contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a account");
	}
	
	@When("User views Deals details")
	public void user_view_deals_details() {
		System.out.println("User views Deals details");
	}
	
	@When("User create a new Contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new Contact");
	}
	
	@When("User views Contact details")
	public void user_views_contact_details() {
		System.out.println("User views Contact details");
	}
}
