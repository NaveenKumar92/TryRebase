package accessModifiers;

class class11{
	public void method1() {
		System.out.println("This is a public method");
		System.out.println("Test rebsae - subBranch01");
	}
	protected void method2() {
		System.out.println("This is a protected mehtod");
	}
	void method3() {
		System.out.println("This is a default method");
	}
	private void method4() {
		System.out.println("This is a private method");
	}
	
	void method5() {
		method4();
	}
}

public class Test2 {
	public static void main(String[] args) {
		class11 obj = new class11();
		obj.method1();      // public method
		obj.method2();		// protected method
		obj.method3();		// private method
		obj.method5();		// Here, private method is called with another method. Encapsulation
	}
	

}
