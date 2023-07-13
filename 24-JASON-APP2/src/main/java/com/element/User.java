package com.element;

public class User {
	
	private Integer userId;
	
	private String userName;
	
	private Integer userAge;
	
	private Address address;
	
	private InsurancePolicy policy;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public InsurancePolicy getPolicy() {
		return policy;
	}

	public void setPolicy(InsurancePolicy policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", address=" + address
				+ ", policy=" + policy + "]";
	}

	public User(Integer userId, String userName, Integer userAge, Address address, InsurancePolicy policy) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.address = address;
		this.policy = policy;
	}
	
	
	
	
	
	
	

}
