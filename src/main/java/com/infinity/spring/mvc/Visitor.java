
package com.infinity.spring.mvc;

public class Visitor {
    private String name;
    private String surname;
    private String sex;
    private String country;
    private int age;

    public Visitor() {
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

    @Override
    public String toString() {
        return "Visitor{" + "name=" + name + ", surname=" + surname + ", sex=" + sex + ", country=" + country + ", age=" + age + '}';
    }
    
}
