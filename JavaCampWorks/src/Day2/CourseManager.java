package Day2;

public class CourseManager {
	public void Add(Course course){
		System.out.println(course.courseName+" kursu eklendi!");
	}
	public void Update(Course course){
		System.out.println(course.courseName+" kursu güncellendi!");
	}
	public void Delete(Course course) {
		
		System.out.println(course.courseName+" kursu silindi!");
	}
	public void getAll(Course[] courses) {
		System.out.println("-------KURSLAR-------");
		for (Course course : courses) {
			
			System.out.println(course.courseName); 
		}
		
	}
}
