package courseWeek3;

public class Student extends User {
	
	private String studentNumber;
	private String courses;
	
	public Student(int id, String firstName, String lastName, String email, String password, String studentNumber,
			String courses) {
		super(id, firstName, lastName, email, password);
		this.studentNumber = studentNumber;
		this.courses = courses;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
}
