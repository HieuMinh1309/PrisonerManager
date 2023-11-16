package entity;

import java.util.Objects;

public class Admin {
	private String username;
	private String password;
	private String email;
	private static int key;
	/**
	 * @param username
	 * @param password
	 * @param email
	 * @param key
	 */
	public Admin(String username, String password, String email, int key) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.key = key;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, key, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(email, other.email) && key == other.key && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	/**
	 * 
	 */
	public Admin() {
		super();
	}
	
}
