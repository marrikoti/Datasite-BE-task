package com.app.pojo;

import java.util.List;

public class UnRegisteredUsers {
	private int id;
	private String emailAddress;
	private String languageCode;
	private String registrationId;
	private String registrationIdGeneratedTime;
	private List projectIds;
	
	@Override
	public String toString() {
		return "UnRegisteredUsers [id=" + id + ", emailAddress=" + emailAddress + ", languageCode=" + languageCode
				+ ", registrationId=" + registrationId + ", registrationIdGeneratedTime=" + registrationIdGeneratedTime
				+ ", projectIds=" + projectIds + "]";
	}
	public List getProjectIds() {
		return projectIds;
	}
	public void setProjectIds(List projectIds) {
		this.projectIds = projectIds;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getRegistrationIdGeneratedTime() {
		return registrationIdGeneratedTime;
	}
	public void setRegistrationIdGeneratedTime(String registrationIdGeneratedTime) {
		this.registrationIdGeneratedTime = registrationIdGeneratedTime;
	}
	
}
