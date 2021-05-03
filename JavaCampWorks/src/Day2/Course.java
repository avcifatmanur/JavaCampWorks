package Day2;

public class Course {
	int courseId;
	String courseName;
	String trainerOfCourse;
	int price;
	int completionRate;
	
	public Course(int courseId,String courseName,String trainerOfCourse,int price,int completionRate) {
		
		this.courseId=courseId;
		this.courseName=courseName;
		this.trainerOfCourse=trainerOfCourse;
		this.price=price;
		this.completionRate=completionRate;
	}

}
