package courseWeek2;

public class Assigment {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Engin Demirog","C# + Angular",95);
		Course course2 = new Course(2,"Engin Demirog","Java + React",32);
		Course course3 = new Course(3,"Engin Demirog","Jquery",15);
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		
	}

}
