
package com.infinity.spring.mvc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


public class Visitor {
    
    
    private String name;
    
    private String surname;
    private String sex;
    private String country;
    private Map<String,String> countries;
    private String title;
    private String[] retirementType;
    private Map<String,String> retirementTypeList;
    @Min(value = 0, message = "Age must be from 0 to 120")
    @Max(value = 120, message = "Age must be from 0 to 120")
    private int age;   

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   

    public Visitor() {
        countries = new HashMap<>();
        countries.put("UKR", "Ukraine");
        countries.put("DE", "Deutschland");
        countries.put("PL", "Poland");
        countries.put("USA", "Unated States Of Amerika");
        
        
        retirementTypeList = new HashMap<>();
        retirementTypeList.put("Privat", "Private");
        retirementTypeList.put("State ", "State");
        retirementTypeList.put("Disability", "Disability");                    
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

    public String[] getRetirementType() {
        return retirementType;
    }

    public void setRetirementType(String[] retirementType) {
        this.retirementType = retirementType;
    }

    public Map<String, String> getRetirementTypeList() {
        return retirementTypeList;
    }

    public void setRetirementTypeList(Map<String, String> retirementTypeList) {
        this.retirementTypeList = retirementTypeList;
    }

    @Override
    public String toString() {
        return "Visitor{" + "name=" + name + ", surname=" + surname + ", sex=" + sex + ", country=" + country + ", countries=" + countries + ", title=" + title + ", retirementType=" + Arrays.toString(retirementType) + ", retirementTypeList=" + retirementTypeList + ", age=" + age + '}';
    }

  

  

   

  


    
}
