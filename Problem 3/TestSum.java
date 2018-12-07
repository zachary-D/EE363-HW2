public class TestSum
{
	//@ requires: 'a' is an array of integers, 'expected' is the correct sum of the values in 'a'
	//@ signals_only: none
	//@ ensures: 'expected' is the sum of all elements in 'a' (returns true)
	//@ otherwise returns false, and writes an error to the console (sum(a) != expected)
	public static boolean test(int[] a, int expected)
	{
		int ret = ArrSum.sum(a);
		
		if(ret != expected)
		{
			System.out.println("ERROR: ArrSum.sum() for " + a.toString() + " returned " + ret + ", expected + " + expected + "!!");
			return false;
		};
		
		return true;
	}
	
	//@ Runs automated tests of arrSum.sum()
	public static void runTests()
	{
		boolean failed = false;
		if(!test(new int[]{5, 10, 15}, 30)) failed = true;
		if(!test(new int[]{3}, 3)) failed = true;
		if(!test(new int[]{50, 20, 30}, 100)) failed = true;
		if(!test(new int[]{}, 0)) failed = true;
		
		if(failed) System.out.println("Tests failed!");
		else System.out.println("All tests passed.");
	}
}