package com.bitedash.userinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
    
    
    
public UserDTO() {
    	
    }
    
    public UserDTO(String userName, String userPassword, String address, String city) {
    	this.userName = userName;
    	this.userPassword = userPassword;
    	this.address = address;
    	this.city = city;
    }

	public int getUserId() {
		return id;
	}

	public void setUserId(int userId) {
		this.id = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userId=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", address="
				+ address + ", city=" + city + "]";
	}
    
}
