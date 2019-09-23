package com.udemy.springmvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
//	Adding Country using LinkedHashMap key/value pair in Java code 
	
//	private LinkedHashMap<String, String> countryList;
	
//	public Student() {
//		
//		countryList = new LinkedHashMap<String, String>();
//		
//		countryList.put("AUS", "Australia");
//		countryList.put("BR", "Brazil");
//		countryList.put("CAN", "Canada");
//		countryList.put("DEN", "Denmark");
//		countryList.put("EGY", "Egypt");
//		countryList.put("FRA", "France");
//		countryList.put("GER", "Germany");
//		countryList.put("HKD", "Hong Kong");
//		countryList.put("IND", "India");
//		countryList.put("JA", "Jamaica");
//		countryList.put("KY", "Kenya");
//		countryList.put("LT", "Lithuania");
//		countryList.put("MEX", "Mexico");
//		countryList.put("NL", "Netherlands");
//		countryList.put("OMR", "Oman");
//		countryList.put("POR", "Portugal");
//		countryList.put("QA", "Qatar");
//		countryList.put("RU", "Russia");
//		countryList.put("ESP", "Spain");
//		countryList.put("TR", "Turkey");
//		countryList.put("UK", "United Kingdom");
//		countryList.put("VZA", "Venezuela");
//		countryList.put("WAL", "Wales");
//		countryList.put("YE", "Yemen");
//		countryList.put("ZIM", "Zimbabwe");
//		
//	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the favoriteLanguage
	 */
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	/**
	 * @param favoriteLanguage the favoriteLanguage to set
	 */
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	


	/**
	 * @return the countryList
	 */
//	public LinkedHashMap<String, String> getCountryList() {
//		return countryList;
//	}
	
	

}
