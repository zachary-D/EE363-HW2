public class BasicNum
{
	//@ requires: ! (x==0 && y == 0)
	//@ signals_only: ZeroException (a user-defined, checked exception)
	//@ ensures: throws ZeroException if both x and y are zero,
	//@ otherwise returns the gcd of x and y.
	public static int gcd(int x, int y)// throws ZeroException
	{
		if(x == 0 && y == 0) throw new ZeroException();
		
		if(x == 0) return y;
		if(y == 0) return x;
		
		int min = x;
		if(y < min) min = y;
		
		int __gcd = -1;
		
		for(int i = 1; i <= min; i++)
		{
			if(x % i == 0 && y % i == 0) __gcd = i;
		}
		
		return __gcd;
	}
}