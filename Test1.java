package accessModifiers;

class class1{
	public void method1() {
		System.out.println("This is a public method");
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
}

	public class Test1 extends  class1{
		public static void main(String[] args) {
			Test1 obj = new Test1();
			obj.method1();      // Public method
			obj.method2();      // Protected method
			obj.method3();		// Default method
	// method 4 cannot be called since it is a private method			
		}
	}
