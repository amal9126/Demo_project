package test_script;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
@Test(groups= {"regression"}, retryAnalyzer=retry.Retry.class)
public void logintest() throws IOException
{
	//String name="admin";
	//String password="admin";
	String name=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isdashboarddisplay();
	Assert.assertTrue(ishomepageavailable);
}
@Test
public void logintest1()
{
	String name="admin";
	String password="abcd";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed);
}
@Test
public void logintest2()
{
	String name="user";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed);
}
@Test
public void logintest3()
{
	String name="user";
	String password="abcd";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed);
}

}

