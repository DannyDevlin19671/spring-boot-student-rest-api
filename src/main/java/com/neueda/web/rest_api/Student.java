package com.neueda.web.rest_api;

/**
 * @author danieldevlin
 * @date 16/12/2024
 * @project rest-api
 */

public class Student {
    private int id; // Unique identifier
    private String firstname;
    private String lastname;
    private String dob; // Format: YYYY-MM-DD
    private String address;
    private String email;
    private String mobile;

    // Constructor
    public Student(int id, String firstname, String lastname, String dob, String address, String email, String mobile) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
