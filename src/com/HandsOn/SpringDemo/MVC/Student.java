package com.HandsOn.SpringDemo.MVC;

import java.util.LinkedHashMap;

public class Student {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String firstName;
    private String lastName;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    private String favoriteLanguage;

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();
        countryOptions.put("IN", "India");
        countryOptions.put("USA", "United States");
        countryOptions.put("DE", "Germany");
        countryOptions.put("FR", "France");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }


}
