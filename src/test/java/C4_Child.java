import org.testng.annotations.Test;

public class C4_Child {
	C4_Parent obj = new C4_Parent(3);
	@Test
	public void TestCh1() {
		System.out.println(obj.TestIncr());
		System.out.println(obj.TestDec());
		System.out.println(obj.TestMul());
	}
}
