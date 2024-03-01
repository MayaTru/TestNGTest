import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C2_Test1 {
	@Test
	public void MobileLogin() {
		System.out.println("Mobile Login");
	}
	@Test(groups = {"Smoke"})
	public void WebLogin() {
		System.out.println("Web Login");
	}
	@Test
	public void AppLogin() {
		System.out.println("App Login");
	}
	@Test
	public void MobileLogout() {
		System.out.println("Mobile Logout");
	}
	@BeforeTest
	public void Prerequisite() {
		Prereq();
	}
	@Test
	public void MobileCheck() {
		System.out.println("Mobile Check");
	}
	@BeforeMethod
	public void Be() {
		System.out.println("Before Method 1");
	}
	@BeforeSuite
	public void Test4() {
		System.out.println("--> First in Suite 1");
	}
	@BeforeClass
	public void Test5() {
		System.out.println("Before Class 1");
	}
	public void Prereq() {
		System.out.println("Pre Check");
	}
	@Parameters({"test123"})
	@Test(groups = {"Smoke"})
	public void Test10(String check12345) {
		System.out.println("Check3");
		System.out.println(check12345);
	}
}
