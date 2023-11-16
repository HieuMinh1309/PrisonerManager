package entity;

import java.util.Objects;

public class Account {
	private int account_id;
	private int warden_id;
	private String username;
	private String password;
	private int active;
	/**
	 * @param account_id
	 * @param warden_id
	 * @param username
	 * @param password
	 */
	public Account(int account_id, int warden_id, String username, String password,int active) {
		super();
		this.account_id = account_id;
		this.warden_id = warden_id;
		this.username = username;
		this.password = password;
		this.active=active;
	}
	/**
	 * 
	 */
	public Account() {
		super();
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getWarden_id() {
		return warden_id;
	}
	public void setWarden_id(int warden_id) {
		this.warden_id = warden_id;
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
	
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public int hashCode() {
		return Objects.hash(account_id, active, password, username, warden_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return account_id == other.account_id && Objects.equals(active, other.active)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username)
				&& warden_id == other.warden_id;
	}

	
	
}
