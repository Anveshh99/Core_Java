package libraryManagementSystem;

public class Reader {
	
	private String userName;
	private String password;
	private int issuedBookNo;
	

	@Override
	public String toString() {
		return "Reader [userName=" + userName + ", password=" + password + "]";
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Reader(String userName, String password, int issuedBookNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.issuedBookNo=issuedBookNo;
	}


	public int getIssuedBookNo() {
		return issuedBookNo;
	}


	public void setIssuedBookNo(int issuedBookNo) {
		this.issuedBookNo = issuedBookNo;
	}
	
	
	
	
	
	
	

}
