
package com.infinity.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Visitor {
    private String name;
    private String surname;
    private String sex;
    private String country;
    private String title;
    private Map<String,String> countries;
            

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    private int age;

    public Visitor() {
        countries = new HashMap<>();
        countries.put("UKR", "Ukraine");
        countries.put("DE", "Deutschland");
        countries.put("PL", "Poland");
        countries.put("USA", "Unated States Of Amerika");
                            
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Visitor{" + "name=" + name + ", surname=" + surname + ", sex=" + sex + ", country=" + country + ", title=" + title + ", age=" + age + '}';
    }


    
}
