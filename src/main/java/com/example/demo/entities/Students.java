package com.example.demo.entities;


import javax.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer studId;
    @Column(length=40, nullable = false)
    String studFName;
    @Column(length=40, nullable = false)
    String studLName;
    @Column(length=8, nullable = false)
    String studPass;
    @Column(length=40, nullable = false, unique = true)
    String studEmail;

    public Students() {
    }

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getStudFName() {
        return studFName;
    }

    public void setStudFName(String studFName) {
        this.studFName = studFName;
    }

    public String getStudLName() {
        return studLName;
    }

    public void setStudLName(String studLName) {
        this.studLName = studLName;
    }

    public String getStudPass() {
        return studPass;
    }

    public void setStudPass(String studPass) {
        this.studPass = studPass;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }
}
