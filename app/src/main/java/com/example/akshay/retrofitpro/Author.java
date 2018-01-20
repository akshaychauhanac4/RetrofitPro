package com.example.akshay.retrofitpro;

/**
 * Created by Akshay on 20-01-2018.
 */

class Author {

    String firstName;
    String lastName;
    int mobileNumber;

    public String getFullName() {
        return firstName + lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String fullName;

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

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
