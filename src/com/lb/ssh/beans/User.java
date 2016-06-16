package com.lb.ssh.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User implements Serializable {
	private static final long serialVersionUID = -542480987568109793L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", nullable = false, columnDefinition = "Integer")
	private Integer userId;
	@Column(name = "username", nullable = false, columnDefinition = "String")
	private String username;
	@Column(name = "password", nullable = false, columnDefinition = "String")
	private String password;
	@Column(name = "gender", nullable = false, columnDefinition = "Integer")
	private Integer gender;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ "]";
	}

}
