
package com.infinity.spring.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sex")
public class Sex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "averageValue")
    private int averageValue;

    public Sex() {
    }

    public Sex(int id, String sex, int averageValue) {
        this.id = id;
        this.sex = sex;
        this.averageValue = averageValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(int averageValue) {
        this.averageValue = averageValue;
    }
    
    
    
    
    
}
