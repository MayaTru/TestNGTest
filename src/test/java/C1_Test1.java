import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C1_Test1 {
	@Test
	public void Test1() {
		System.out.println("--> C1_Test1_Test1");
	}
	@Test
	public void Test2() {
		System.out.println("--> C1_Test1_Test2");
	}
	@Test
	public void Test3() {
		System.out.println("--> C1_Test1_Test3");
	}
	@AfterTest
	public void EndCheck() {
		System.out.println("Last");
	}
	@BeforeClass
	public void ClassCheck() {
		System.out.println("Before Class");
	}
	
}
