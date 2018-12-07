//a typical user-defined type (see studentAPI.txt)
//observe the constructors, types of the data members, use of static and final
//ternary operator used in method courseCompleted
//observe that courseCompleted() is private
//this class has no main method, so needs a client/driver

import java.util.List;
import java.util.ArrayList;

//import InvalidGradeException;

public class Student{

    //student data is private and cannot be accessed directly by the client
    private  String name;
    private final int sID;
    private double currentTotalPointGrade;

    //the number of students is not a property of any particular student, but of the type as a whole
    //notice how this class field is used to assign new students a permanent ID number
    private static int numStudents = 0;

    private List<Double>  ptgrades;


    Student(String nm) {
		sID = ++numStudents;
		name = nm;
		currentTotalPointGrade = 0;
		ptgrades  = new ArrayList<Double>();
    }

    Student(String nm, double gr[]) {
		this(nm);
		for (double g: gr) {
			currentTotalPointGrade += g;
			ptgrades.add(g);
		}	
    }

    public static int getNumStudents() {
		return numStudents;
    }

    public void setName(String nn) {
		name = nn;
    }

    public void updateCourseGrades(double[] grades) {
		//Iterate over 'grades' using 'p', adding them to the total and the history array
		for (double p: grades)
		{
			if(p < 0) throw new InvalidGradeException();
			currentTotalPointGrade += p;
			ptgrades.add(p);
		}
    }

    
    private boolean courseCompleted() {
		return (currentTotalPointGrade >= 40);


	/*//ternary operator is more succinct than the conditional below
	//return (currentTotalPointGrade >= 40) ? true : false;

	
	// boolean cc;
	// if (currentTotalPointGrade >= 40)
	//     cc = true;
	// else
	//     cc = false;

	// return cc;*/
    }

    public String listGrades()  {
		return name +  ":" + ptgrades.toString();
    }



    public String toString() {
		return name + " (ID: " + sID + ")" + ((courseCompleted()? ", ee363 completed.":"."));
    }
}


