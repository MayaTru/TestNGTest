import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class C3_Parent {
	int a;
	public void Test1() {
		System.out.println("Parent");
	}
	
	@BeforeTest
	public void Test2() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void Test3() {
		System.out.println("After Test");
	}
	
}
