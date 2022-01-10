package com.app.pojo;
import java.util.List;

public class RegistredUsers {

		private int id;
		private String city;
	    private String company;
		private String country;
		private String firstName;
		private String lastName;
		private String organizationType;
		private String phone;
		private String state;
		private String zipCode;
		private String disclaimerAccepted;
		private String languageCode;
		private String emailAddress;
		private List projectIds;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getOrganizationType() {
			return organizationType;
		}
		public void setOrganizationType(String organizationType) {
			this.organizationType = organizationType;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		public String getDisclaimerAccepted() {
			return disclaimerAccepted;
		}
		public void setDisclaimerAccepted(String disclaimerAccepted) {
			this.disclaimerAccepted = disclaimerAccepted;
		}
		public String getLanguageCode() {
			return languageCode;
		}
		public void setLanguageCode(String languageCode) {
			this.languageCode = languageCode;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public List getProjectIds() {
			return projectIds;
		}
		public void setProjectIds(List projectIds) {
			this.projectIds = projectIds;
		}
		
		
		@Override
		public String toString() {
			return "RegistredUsers [id=" + id + ", city=" + city + ", company=" + company + ", country=" + country
					+ ", firstName=" + firstName + ", lastName=" + lastName + ", organizationType=" + organizationType
					+ ", phone=" + phone + ", state=" + state + ", zipCode=" + zipCode + ", disclaimerAccepted="
					+ disclaimerAccepted + ", languageCode=" + languageCode + ", emailAddress=" + emailAddress
					+ ", projectIds=" + projectIds + ", getId()=" + getId() + ", getCity()=" + getCity()
					+ ", getCompany()=" + getCompany() + ", getCountry()=" + getCountry() + ", getFirstName()="
					+ getFirstName() + ", getLastName()=" + getLastName() + ", getOrganizationType()="
					+ getOrganizationType() + ", getPhone()=" + getPhone() + ", getState()=" + getState()
					+ ", getZipCode()=" + getZipCode() + ", getDisclaimerAccepted()=" + getDisclaimerAccepted()
					+ ", getLanguageCode()=" + getLanguageCode() + ", getEmailAddress()=" + getEmailAddress()
					+ ", getProjectIds()=" + getProjectIds() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
}
