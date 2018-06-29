import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ComparatorWithCustom {

	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,75));
		studs.add(new Student(2,55));
		studs.add(new Student(2,45));
		studs.add(new Student(3,40));
		
		Collections.sort(studs,(s1,s2) -> {
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;//return 1 else 0
		});
		
		for(Student s:  studs) {
			System.out.println(s);
		
		}
			
		}
		}


 class Student
{
	int rollno;
	int marks;
	public Student(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	// if we do not declare this tostring it returns class anme with hashcode
	
	}
 
 
 
 
 
