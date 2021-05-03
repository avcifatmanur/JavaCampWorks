package Day2;

public class Main {

	public static void main(String[] args) {
		
User user1=new User(1,"Fatma Nur GÜNEY","ftmnuravc@gmail.com","123456");
		
		User[] users= {user1};
		
		UserManager userManager=new UserManager();
		userManager.Update(user1);
		
		
		
		Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
									"Engin Demiroğ",0,0);
		Course course2=new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
				"Engin Demiroğ",0,0);
		
		Course course3=new Course(3,"Programlamaya Giriş İçin Temel Kurs",
				"Engin Demiroğ",0,0);
		
		Course[] courses= {course1,course2,course3};
		
		CourseManager courseManager=new CourseManager();
		courseManager.Update(course2);
		courseManager.Add(course3);
		courseManager.getAll(courses);
		
		
		Category category1=new Category(1,"Programlama");
		
		Trainer trainer1=new Trainer(1,"Engin DEMİROĞ","Açıklama düzenlenecek");
		
		userManager.getAll(users);
		
		
						
	}

}
