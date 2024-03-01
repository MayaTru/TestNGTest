import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C2_Test2 {
	@Test
	public void MobileLoan() {
		System.out.println("Mobile Loan");
	}
	@Test(groups = {"Smoke"})
	public void WebLoan() {
		System.out.println("Web Loan");
	}
	@Test
	public void AppLoan() {
		System.out.println("App Loan");
	}
	@AfterSuite
	public void Test4() {
		System.out.println("--> Last in Suite");
	}
	@AfterMethod
	public void Test5() {
		System.out.println("After Method");
	}
	@AfterClass
	public void Test6() {
		System.out.println("After Class");
	}
	@Test(dependsOnMethods = {"WebLoan"},groups = {"Smoke"})
	public void Test7() {
		System.out.println("Check1");
	}
	@Test(dependsOnMethods = {"WebLoan","Test7"},groups = {"Smoke"},enabled = true)
	public void Test8() {
		System.out.println("Check2");
	}
	@Test(groups = {"Smoke"},enabled = true,timeOut = 10000)
	public void Test9() {
		System.out.println("Check3");
	}
	@Parameters({"test321"})
	@Test(groups = {"Smoke"})
	public void Test10(String check12345) {
		System.out.println("Check3");
		System.out.println(check12345);
	}
	@DataProvider
	public Object[][] Test11() {
		Object[][] obj = new Object[3][2];
		obj[0][0]= "usr1";
		obj[0][1]= "pas1";
		obj[1][0]= "usr2";
		obj[1][1]= "pas2";
		obj[2][0]= "usr3";
		obj[2][1]= "pas3";
		return obj;
	}
	
	@Test(groups = {"Smoke"},dataProvider = "Test11")
	public void Test12(String u, String p) {
		System.out.println(u);
		System.out.println(p);
	}
}
