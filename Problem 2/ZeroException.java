public class ZeroException extends RuntimeException
{
	public ZeroException()
	{
		super("Both values cannot be 0");
	}	
}