package test;

import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void login()
	{
		
	
		lp.loginToApp();
	}
	

}
