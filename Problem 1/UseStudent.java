// import Student

public class UseStudent{

	public static void main(String [ ] args)
	{
		System.out.println("Executing.");
		
		Student ms1 = new Student("Jimbles");
		Student ms2 = new Student("Notronbo", new double[]{10.0, 5, 3.5, 6, 4});
		
		ms1.updateCourseGrades(new double[]{10.5, 40});
		
		//The -6.5 in this line causes an exception.
		//ms2.updateCourseGrades(new double[]{8, -6.5, 20.0});
		
		System.out.println(Student.getNumStudents());
		
		System.out.println(ms1.listGrades());
		
		System.out.println(ms2.listGrades());
		
		
		
	}
}