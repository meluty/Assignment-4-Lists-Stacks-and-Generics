import java.util.Arrays;

public class A4Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;

	public static void main(String[] args) {
		/* Part 1: Using the List ADT */
		testHorseCount();
		testDistanceAway();
		testHorseNames();
		testDistanceToTallest();
		testTallestHorse();
		testNumberVisible();
		
		/* Part 2: Implementing the Generic Stack ADT */
		testStackOperations();
		testStackIsGeneric();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	
	public static void testHorseCount() {
		System.out.println("\nTesting horseCount...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
		
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.horseCount(stable0);
		expected = 0;
		displayResults(result==expected, "Number of horses in empty horse line");
		
		result = A4Exercises.horseCount(stable1);
		expected = 1;
		displayResults(result==expected, "Number of horses in stable1");
		
		result = A4Exercises.horseCount(stable2);
		expected = 3;
		displayResults(result==expected, "Number of rocks in stable2");
		
		result = A4Exercises.horseCount(stable3);
		expected = 7;
		displayResults(result==expected, "Number of rocks in stable3");
	}
	
	public static void testDistanceAway() {
		System.out.println("\nTesting distanceAway...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
		
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.distanceAway(stable0, h1);
		expected = -1;
		displayResults(result==expected, "h1's distance away from start of stable0");
		
		result = A4Exercises.distanceAway(stable1, h1);
		expected = 0;
		displayResults(result==expected, "h1's distance away from start of stable1");
				
		result = A4Exercises.distanceAway(stable2, h3);
		expected = 2;
		displayResults(result==expected, "h3's distance away from start of stable2");
		
		// Add tests until you are sure your implementation 
		// produces the correct result for all inputs

		result = A4Exercises.distanceAway(stable2, h4);
		expected = -1;
		displayResults(result==expected, "h4's distance away from start of stable2");
		
	}
	
	public static void testHorseNames() {
		System.out.println("\nTesting horseNames...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
			
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		String[] expected0 = new String[0];
		String[] expected1 = {"Spotty"};
		String[] expected2 = {"Spotty", "Minnie", "Bruno"};
		String[] expected3 = {"Spotty", "Minnie", "Bruno", "Cheerio", "Blondie", "Walnut", "Cuddles"};
		String[] result;
		
		result = A4Exercises.horseNames(stable0);
		displayResults(Arrays.equals(result,expected0), "Horse names in empty horse line");
		
		result = A4Exercises.horseNames(stable1);
		displayResults(Arrays.equals(result,expected1), "Horse names in stable1");
		
		result = A4Exercises.horseNames(stable2);
		displayResults(Arrays.equals(result,expected2), "Horse names in stable2");
		
		result = A4Exercises.horseNames(stable3);
		displayResults(Arrays.equals(result,expected3), "Horse names in stable3");
		
		// Write more of your own tests here
			
		Horse[] arr4 = {h1, h1};
		HorseLine stable4 = new HorseLine(arr4);

		String[] expected4 = {"Spotty", "Spotty"};

		result = A4Exercises.horseNames(stable4);
		displayResults(Arrays.equals(result,expected4), "Horse names in stable4");
		
	}
	
	public static void testDistanceToTallest() {
		System.out.println("\nTesting distanceToTallest...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
		
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.distanceToTallest(stable0);
		expected = -1;
		displayResults(result==expected, "distanceToTallest in stable0");
		
		result = A4Exercises.distanceToTallest(stable1);
		expected = 0;
		displayResults(result==expected, "distanceToTallest in stable1");
		
		result = A4Exercises.distanceToTallest(stable2);
		expected = 2;
		displayResults(result==expected, "distanceToTallest in stable2");
		
		result = A4Exercises.distanceToTallest(stable3);
		expected = 3;
		displayResults(result==expected, "distanceToTallest in stable3");
		
		// Write more of your own tests here

		Horse[] arr4 = {h1, h1, h1};
		HorseLine stable4 = new HorseLine(arr4);

		result = A4Exercises.distanceToTallest(stable4);
		expected = 0;
		displayResults(result==expected, "\"distanceToTallest in stable4");
	
	}
	
	public static void testTallestHorse() {
		System.out.println("\nTesting tallestHorse...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
		
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		String expected;
		String result;
		
		result = A4Exercises.tallestHorse(stable0);
		expected = "";
		displayResults(result.equals(expected), "tallest horse in stable0");
		
		result = A4Exercises.tallestHorse(stable1);
		expected = "Spotty";
		displayResults(result.equals(expected), "tallest horse in stable1");
		
		result = A4Exercises.tallestHorse(stable2);
		expected = "Bruno";
		displayResults(result.equals(expected), "tallest horse in stable2");
		
		result = A4Exercises.tallestHorse(stable3);
		expected = "Cheerio";
		displayResults(result.equals(expected), "tallest horse in stable3");
		
		// Write more of your own tests here

		Horse[] arr4 = {h1, h5, h7};
		HorseLine stable4 = new HorseLine(arr4);

		result = A4Exercises.tallestHorse(stable4);
		expected = "Spotty";
		displayResults(result.equals(expected), "tallest horse in stable4");
	}
	
	public static void testNumberVisible() {
		System.out.println("\nTesting numberVisible...");
		Horse h1 = new Horse("Spotty",  2); 
		Horse h2 = new Horse("Minnie",  1);
		Horse h3 = new Horse("Bruno",   3);
		Horse h4 = new Horse("Cheerio", 4);
		Horse h5 = new Horse("Blondie", 2);
		Horse h6 = new Horse("Walnut",  3);
		Horse h7 = new Horse("Cuddles", 2);
		
		Horse[] arr0 = {};
		Horse[] arr1 = {h1};
		Horse[] arr2 = {h1, h2, h3};
		Horse[] arr3 = {h1, h2, h3, h4, h5, h6, h7};
		HorseLine stable0 = new HorseLine(arr0);
		HorseLine stable1 = new HorseLine(arr1);
		HorseLine stable2 = new HorseLine(arr2);
		HorseLine stable3 = new HorseLine(arr3);
		
		int expected = 0;
		int result = 0;
		
		result = A4Exercises.numberVisible(stable0);
		expected = 0;
		displayResults(result==expected, "number visible in stable0");
		
		result = A4Exercises.numberVisible(stable1);
		expected = 1;
		displayResults(result==expected, "number visible in stable1");
		
		result = A4Exercises.numberVisible(stable2);
		expected = 2;
		displayResults(result==expected, "number visible in stable2");
		
		result = A4Exercises.numberVisible(stable3);
		System.out.println(result);
		expected = 3;
		displayResults(result==expected, "number visible in stable3");
		
		// Write more of your own tests here

		Horse[] arr4 = {h1, h5, h7};
		HorseLine stable4 = new HorseLine(arr4);
		result = A4Exercises.numberVisible(stable4);
		expected = 1;
		displayResults(result==expected, "number visible in stable4");

		Horse[] arr5 = {h1, h5, h7, h4};
		HorseLine stable5 = new HorseLine(arr5);
		result = A4Exercises.numberVisible(stable5);
		expected = 2;
		displayResults(result==expected, "number visible in stable5");

			
	}
	
	public static void testStackOperations() {
		System.out.println("\nTesting stack operations...");
		A4Stack<Integer> testStack = new A4Stack<Integer>();
		Integer result = 0;
		
		displayResults(testStack.isEmpty(), "stack initially empty");
				
		testStack.push(2);
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(2), "peek works after initial push");
		
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.popAll();
		displayResults(testStack.isEmpty(), "pop all works after adding values with push");

		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		result = testStack.peek();
		displayResults(result.equals(4), "peek works after multiple values pushed");
		
		testStack.pop();
		result = testStack.peek();
		displayResults(result.equals(3), "peek works after top is popped");

	}
	
	public static void testStackIsGeneric() {
		System.out.println("\nTesting generics...");
		A4Stack<Integer> s1 = new A4Stack<Integer>();
		A4Stack<String> s2 = new A4Stack<String>();
		A4Stack<Double> s3 = new A4Stack<Double>();
		
		Integer result1;
		String result2;
		Double result3;
		
		s1.push(3);
		s1.push(8);
		s2.push("CSC");
		s2.push("ENGR");
		s3.push(5.5);
		s3.push(9.1);
		
		result1 = s1.pop();
		result2 = s2.pop();
		result3 = s3.pop();
		
		displayResults(result1.equals(8), "Integer Stack");
		displayResults(result2.equals("ENGR"), "String Stack");
		displayResults(result3.equals(9.1), "Double Stack");		

		// Write more of your own tests here

		A4Stack<Boolean> s4 = new A4Stack<Boolean>();

		Boolean result4;

		s4.push(true);
		s4.push(false);
		s4.push(true);

		result4 = s4.pop();
		displayResults(result4.equals(true), "Boolean Stack");

		A4Stack<String[]> s5 = new A4Stack<String[]>();
		String[] a0 = {"hi", "hello"};

		String[] result5;

		s5.push(a0);
		result5 = s5.pop();
		displayResults(result5.equals(a0), "String[] Stack");

		A4Stack<Integer[]> s6 = new A4Stack<Integer[]>();
		Integer[] a1= {1, 2, 3, 4};

		Integer[] result6;

		s6.push(a1);
		result6 = s6.pop();
		displayResults(result6.equals(a1), "Integer[] Stack");
		
	}
	
	public static void displayResults (boolean passed, String testName) {
        testCount++;
        if (passed) {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        } else {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }
}