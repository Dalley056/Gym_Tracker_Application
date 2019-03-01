package RepresentationClasses;

import java.util.Date;

public class User {
	private String userId;
	private String email;
	private String firstName;
	private String lastName;
	private String middleName;
	private char deleted;
	private Date created;
	private Date edited;
	private String editedBy;
	
	public User(String userId, String email, String firstName, String lastName, String middleName, char deleted, Date created,
			Date edited, String editedBy) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.deleted = deleted;
		this.created = created;
		this.edited = edited;
		this.editedBy = editedBy;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public char getDeleted() {
		return deleted;
	}

	public Date getCreated() {
		return created;
	}

	public Date getEdited() {
		return edited;
	}

	public String getEditedBy() {
		return editedBy;
	}
	
}
