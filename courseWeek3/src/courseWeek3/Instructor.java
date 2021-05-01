package courseWeek3;

public class Instructor extends User {
	private String contactNumber;

	public Instructor(int id, String firstName, String lastName, String email, String password, String contactNumber) {
		super(id, firstName, lastName, email, password);
		this.contactNumber = contactNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	
	
}

