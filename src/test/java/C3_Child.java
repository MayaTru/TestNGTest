import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C3_Child extends C3_Parent {
	
	@Test
	public void TestCh() {
		
		System.out.println("Child");
		Test1();
	}
	@BeforeTest
	public void TestCh2() {
		System.out.println("Before Test Child");
	}
	@AfterTest
	public void TestCh3() {
		System.out.println("After Test Child");
	}
	
}
