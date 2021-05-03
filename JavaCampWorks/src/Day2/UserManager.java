package Day2;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullanıcı eklendi:  "+user.userFullName);
	}
	public void Update(User user) {
		System.out.println("Kullanıcı güncellendi:  "+user.userFullName);
	}
	public void Delete(User user) {
		System.out.println("Kullanıcı silindi:  "+user.userFullName);
	}
	public void getAll(User[] users) {
		System.out.println("-------KULLANICILAR-------");
		for (User user : users) {
			
			System.out.println(user.userFullName); 
		}
		
	}
	

}
