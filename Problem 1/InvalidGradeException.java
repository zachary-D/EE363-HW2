public class InvalidGradeException extends RuntimeException
{
	public InvalidGradeException()
	{
		super("WARNING: Grades must be >= 0!");
	}
}