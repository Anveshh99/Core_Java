package libraryManagementSystem;

public class Admin {
	
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Admin(String username) {
		
		this.username = username;
		
	}
	
//   public Admin(String password) {
//		
//	   this.password = password;
//		
//	}
	
	
	
	

	
	
}
