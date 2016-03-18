package emag;

import exceptions.EmagException;

public abstract class User {
	private String name;
	private String email;
	private int passwordHash;
	

	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.passwordHash = password.hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws EmagException {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		else {
			throw new EmagException("Incorrect name - empty!");
		}
				
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
