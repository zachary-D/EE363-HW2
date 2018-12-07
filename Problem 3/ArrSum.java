public class ArrSum
{
	//@ requires: a is an array of integers
	//@ signals_only: none
	//@ Returns the sum of all elements in a
	public static int sum(int [] a)
	{
		int __sum = 0;
		for(int i : a)
		{
			__sum += i;
		}
		return __sum;
	}
}