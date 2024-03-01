import org.testng.annotations.Test;

public class C4_Parent extends C4_Child2{
	int a;
	public C4_Parent(int a) {
		super(a);
		this.a = a;
	}
	public int TestIncr() {
		a += 1;
		return a;
	}
	public int TestDec() {
		a -= 1;
		return a;
	}
}
