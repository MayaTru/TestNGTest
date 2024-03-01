import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C1_Test2 {
	@Test
	public void Test1() {
		System.out.println("--> C1_Test2_Test1");
	}
	@Test
	public void Test2() {
		System.out.println("--> C1_Test2_Test2");
	}
	@Test
	public void Test3() {
		System.out.println("--> C1_Test2_Test3");
	}
	@BeforeSuite
	public void Test4() {
		System.out.println("--> First in Suite");
	}
	@AfterClass
	public void ClassCheck() {
		System.out.println("After Class");
	}
}
