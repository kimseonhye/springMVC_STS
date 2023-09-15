package ch04_pjt_exercise.dao;

public class MemberDO {
	private String id;
	private String password;
	private String contact;
	private String email;
	private String registeredDate;
	private String modifiedDate;
	
	public MemberDO(String id, String password, String contact, String email, String registeredDate,
			String modifiedDate) {
		this.id = id;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.registeredDate = registeredDate;
		this.modifiedDate = modifiedDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}
