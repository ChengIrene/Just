package debug;

public class DebugDemo {
	
	public static void main(String[] args) throws Exception {
		
		int intputA = 40;
		int intputB = 50;
		
		DebugDemo debugDemo = new DebugDemo();
		TestCat cat = debugDemo.invokeCat();
		System.out.println("Cat name is: " + cat.getName());
		intputA = debugDemo.multiplyByTwo(intputA);
		int addResult = debugDemo.addTwoNumbers(intputA, intputB);
		
		System.out.println("Add result is: " + addResult);
		
		if (addResult > 100) {
			System.out.println("Add result is grater than 100.");
		} else {
			System.out.println("Add result is not grater than 100.");
		}
		
		System.out.println("Finished.");
		// debugDemo.makeException();
		
	}
	
	// 駝峰命名法(lower camel case)
	private int addTwoNumbers(int a, int b) {
		return a + b;
	}
	
	private int multiplyByTwo(int a) {
		return a * 2;
	}
	
	private TestCat invokeCat() {
		TestCat cat = new TestCat();
		cat.setName("maomao");
		return cat;
	}
	
	// Throw exception means there is something wrong in the program.
	private void makeException() throws Exception {
		throw new Exception("我故意噴錯的");
	}
	
}
