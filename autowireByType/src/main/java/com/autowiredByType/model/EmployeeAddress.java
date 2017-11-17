package com.autowiredByType.model;

public class EmployeeAddress {

	private String city;
	private String Street;

	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [Street=" + Street + ", city=" + city + "]";
	}
}
