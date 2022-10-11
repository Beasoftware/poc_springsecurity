package com.dev.springboot.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sp_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	private String username;
	private long usermobno;
	private String useremail;
	private String useraddress;

	// setter and method methods
	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getUsermobno() {
		return usermobno;
	}

	public void setUsermobno(long usermobno) {
		this.usermobno = usermobno;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", usermobno=" + usermobno + ", useremail="
				+ useremail + ", useraddress=" + useraddress + "]";
	}

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
