public class CheckGCD
{
	static public int check(int a, int b, int expected)
	{
		int ret = BasicNum.gcd(a, b);
		System.out.println("gcd(" + a + ", " + b + ") = " + BasicNum.gcd(a, b));
		if(ret != expected) System.out.println("ERROR: Expected GCD of " + expected + ", got " + ret + "!!");
		return ret;
	}
	
	static public void runChecks()
	{
		System.out.println("Starting autochecks.");
		check(2, 4, 2);
		check(2, 7, 1);
		check(75, 50, 25);
		check(8, 1, 1);
		check(3, 0, 3);
		check(0, 8, 8);
		
		check(10, 100, 10);
		check(5, 100, 5);
		check(100, 2, 2);
		check(5 * 7, 5 * 8, 5);
	}	
}